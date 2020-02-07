package com.packmoveandgo.util;


import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.packmoveandgo.request.model.OrderDetails;

public class InvoiceGenerator {
	private static final Logger logger = Logger.getLogger(InvoiceGenerator.class);
	
	private BaseFont bfBold;
	private BaseFont bf;
	private int pageNumber = 0;
	 double total=0;
	String pdfFilename;
	OrderDetails orderDetails;
	public InvoiceGenerator(String pdfFilename,OrderDetails orderDetails) {
		this.pdfFilename=pdfFilename;
		this.orderDetails=orderDetails;
	}

	public void createPDF (HttpServletRequest httpServletRequest){

		Document doc = new Document();
		PdfWriter docWriter = null;
		initializeFonts();

		try {
			String path = pdfFilename;
			docWriter = PdfWriter.getInstance(doc , new FileOutputStream(path));
			doc.addAuthor("betterThanZero");
			doc.addCreationDate();
			doc.addProducer();
			doc.addCreator("MySampleCode.com");
			doc.addTitle("Invoice");
			doc.setPageSize(PageSize.LETTER);

			doc.open();
			PdfContentByte cb = docWriter.getDirectContent();
			DecimalFormat df = new DecimalFormat("0.00");

			boolean beginPage = true;
			int y = 0;
			for(int i=0; i < 1; i++ ){
				if(beginPage){
					beginPage = false;
					generateLayout(doc, cb,httpServletRequest); 
					generateHeader(doc, cb);
					y = 615; 
				}
				total+=generateDetail(doc, cb, i, y);
				y = y - 15;
				if(y < 50){
					printPageNumber(cb);
					doc.newPage();
					beginPage = true;
				}
			}
			logger.info("total "+total);
			createContent(cb,550,100, df.format(total),PdfContentByte.ALIGN_RIGHT);

			printPageNumber(cb);

		}
		catch (DocumentException dex)
		{
			dex.printStackTrace();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if (doc != null)
			{
				doc.close();
			}
			if (docWriter != null)
			{
				docWriter.close();
			}
		}
	}

	private void generateLayout(Document doc, PdfContentByte cb,HttpServletRequest httpServletRequest)  {
		try {
			cb.setLineWidth(1f);

			// Invoice Header box layout
			cb.rectangle(420,700,150,60);
			cb.moveTo(420,720);
			cb.lineTo(570,720);
			cb.moveTo(420,740);
			cb.lineTo(570,740);
			cb.moveTo(480,700);
			cb.lineTo(480,760);
			cb.stroke();

			// Invoice Header box Text Headings 
			createHeadings(cb,422,743,"Account No.",8);
			createHeadings(cb,422,723,"Invoice No.",8);
			createHeadings(cb,422,703,"Invoice Date",8);

			// Invoice Detail box layout 
			cb.rectangle(20,50,550,600);
			cb.moveTo(20,630);
			cb.lineTo(570,630);
			cb.moveTo(50,50);
			cb.lineTo(50,650);
			cb.moveTo(150,50);
			cb.lineTo(150,650);
			cb.moveTo(430,50);
			cb.lineTo(430,650);
			cb.moveTo(500,50);
			cb.lineTo(500,650);
			cb.stroke();

			// Invoice Detail box Text Headings 
			createHeadings(cb,22,633,"Qty",8);
			createHeadings(cb,52,633,"Item Number",8);
			createHeadings(cb,152,633,"Item Description",8);
			createHeadings(cb,432,633,"Price",8);
			createHeadings(cb,502,633,"Ext Price",8);
			createHeadings(cb,450,100,"Total",8);

			//add the images
			Image companyLogo = Image.getInstance(PackeMoveAndGoUtils.getFilePath(httpServletRequest)+"/services.png");
			companyLogo.setAbsolutePosition(25,700);
			companyLogo.scalePercent(25);
			doc.add(companyLogo);
		}
		catch (DocumentException dex){
			dex.printStackTrace();
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
	}

	private void generateHeader(Document doc, PdfContentByte cb)  {
		try {
			if(pdfFilename.contains("consignment")) {
				createHeadings(cb,200,770,"*** CONSIGNMENT  BILL ***",14);				
			}
			if(pdfFilename.contains("payment")) {
				createHeadings(cb,200,770,"*** PAYMENT  RECEIPT ***",14);				
			}
			if(pdfFilename.contains("way_bill")) {
				createHeadings(cb,200,770,"*** WAY  BILL ***",14);				
			}
			createHeadings(cb,200,750,"Company Name :Packers and Movers System",8);
			createHeadings(cb,200,735,"Address Line 1 :Lalbag Chowk Gurgaon",8);
			createHeadings(cb,200,720,"Address Line 2 :Haryana",8);
			createHeadings(cb,200,705,"City:Gurgaon, State:Haryana  - ZipCode:122451",8);
			createHeadings(cb,200,690,"Country:India",8);

			createHeadings(cb,482,743,"ABC0001",8);
			createHeadings(cb,482,723,"123456",8);
			createHeadings(cb,482,703,"09/26/2012",8);
		}

		catch (Exception ex){
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new InvoiceGenerator("xxxxxx", null);
		System.out.println("test");
	}

	private double generateDetail(Document doc, PdfContentByte cb, int index, int y)  {
		DecimalFormat df = new DecimalFormat("0.00");
		double extPrice = 0;
		try {
			createContent(cb,48,y,String.valueOf(index+1),PdfContentByte.ALIGN_RIGHT);

			createContent(cb,52,y, String.valueOf(orderDetails.getItem_id()),PdfContentByte.ALIGN_LEFT);
			createContent(cb,152,y, "Product Description " + orderDetails.getItem_name(),PdfContentByte.ALIGN_LEFT);

			extPrice = orderDetails.getRate() * orderDetails.getQty() ;
			createContent(cb,498,y, df.format(orderDetails.getRate()),PdfContentByte.ALIGN_RIGHT);
			createContent(cb,568,y, df.format(extPrice),PdfContentByte.ALIGN_RIGHT);
		}

		catch (Exception ex){
			ex.printStackTrace();
		}
		return extPrice;
	}

	private void createHeadings(PdfContentByte cb, float x, float y, String text, float fontSize){
		cb.beginText();
		cb.setFontAndSize(bfBold, fontSize);
		cb.setTextMatrix(x,y);
		cb.showText(text.trim());
		cb.endText(); 
	}

	private void printPageNumber(PdfContentByte cb){
		cb.beginText();
		cb.setFontAndSize(bfBold, 8);
		cb.showTextAligned(PdfContentByte.ALIGN_RIGHT, "Page No. " + (pageNumber+1), 570 , 25, 0);
		cb.endText(); 
		pageNumber++;
	}

	private void createContent(PdfContentByte cb, float x, float y, String text, int align){
		cb.beginText();
		cb.setFontAndSize(bf, 8);
		cb.showTextAligned(align, text.trim(), x , y, 0);
		cb.endText(); 
	}

	private void initializeFonts(){
		try {
			bfBold = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
			bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}