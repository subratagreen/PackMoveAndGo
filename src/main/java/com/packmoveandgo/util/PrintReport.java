package com.packmoveandgo.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import org.apache.log4j.Logger;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.packmoveandgo.request.model.MyJoinTableData;
import com.packmoveandgo.service.PackMoveAndGoServiceImpl;

public class PrintReport {
	private static final Logger logger = Logger.getLogger(PrintReport.class);

	private BaseFont bfBold;
	private BaseFont bf;
	private int pageNumber = 0;

	public void createPDF(String pdfFilename, String toStoreLocation, List<MyJoinTableData> myJoinTableDataList) {

		Document doc = new Document();
		PdfWriter docWriter = null;

		DecimalFormat df = new DecimalFormat("0.00");
		initializeFonts();

		try {

			// special font sizes
			Font bfBold12 = new Font(FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(0, 0, 0));
			Font bf12 = new Font(FontFamily.TIMES_ROMAN, 12);

			// file path
			String path = toStoreLocation + pdfFilename;
			logger.info("Create PDF PATH "+path);
			docWriter = PdfWriter.getInstance(doc, new FileOutputStream(path));

			// document header attributes
			doc.addAuthor("betterThanZero");
			doc.addCreationDate();
			doc.addProducer();
			doc.addCreator("MySampleCode.com");
			doc.addTitle("Report with Column Headings");
			doc.setPageSize(PageSize.LETTER);

			// open document
			doc.open();

			// create a paragraph
			Paragraph paragraph = new Paragraph("Packers and Movers in Delhi NCR ( Packers Movers) is engaged in "
					+ "offering highly dependable moving and packing services to its diverse clients all over India."
					+ " . Our services make it very clear that we will render all services that will make shifting no more a tedious job for you.");


			// specify column widths
			float[] columnWidths = { 1f, 2.5f, 2f,2f, 2f };
			// create PDF table with the given widths
			PdfPTable table = new PdfPTable(columnWidths);
			// set table width a percentage of the page width
			table.setWidthPercentage(90f);

			// insert column headings
			insertCell(table, "Order No", Element.ALIGN_RIGHT, 1, bfBold12);
			insertCell(table, "Customer Name", Element.ALIGN_LEFT, 1, bfBold12);
			insertCell(table, "Customer Mob.", Element.ALIGN_LEFT, 1, bfBold12);
			insertCell(table, "Customer Address", Element.ALIGN_LEFT, 1, bfBold12);
			insertCell(table, "Booking Date", Element.ALIGN_RIGHT, 1, bfBold12);
			table.setHeaderRows(1);

			// insert an empty row
			//insertCell(table, "", Element.ALIGN_LEFT, 4, bfBold12);
			// create section heading by cell merging
			//insertCell(table, "New York Orders ...", Element.ALIGN_LEFT, 4, bfBold12);
			//double orderTotal, total = 0;

			// just some random data to fill
			
			for (MyJoinTableData joinTableData : myJoinTableDataList) {
				insertCell(table, String.valueOf(joinTableData.getOrder().getOrder_id()), Element.ALIGN_RIGHT, 1, bf12);
				insertCell(table, joinTableData.getCustomerRegister().getCust_name(), Element.ALIGN_LEFT, 1, bf12);
				insertCell(table, joinTableData.getCustomerRegister().getCust_ph(), Element.ALIGN_LEFT, 1, bf12);
				insertCell(table, joinTableData.getCustomerRegister().getCust_address(), Element.ALIGN_LEFT, 1, bf12);
				insertCell(table, PackeMoveAndGoUtils.getStringDateFromDate(joinTableData.getBooking().getBooking_date()), Element.ALIGN_RIGHT, 1, bf12);

			}
			// merge the cells to create a footer for that section
			//insertCell(table, "New York Total...", Element.ALIGN_RIGHT, 3, bfBold12);
			//insertCell(table, df.format(total), Element.ALIGN_RIGHT, 1, bfBold12);

			// repeat the same as above to display another location
			//insertCell(table, "", Element.ALIGN_LEFT, 4, bfBold12);
			//insertCell(table, "California Orders ...", Element.ALIGN_LEFT, 4, bfBold12);
//			orderTotal = 0;

			// for(int x=1; x<7; x++){
			//
			// insertCell(table, "20020" + x, Element.ALIGN_RIGHT, 1, bf12);
			// insertCell(table, "XYZ00" + x, Element.ALIGN_LEFT, 1, bf12);
			// insertCell(table, "This is Customer Number XYZ00" + x, Element.ALIGN_LEFT, 1,
			// bf12);
			//
			// orderTotal = Double.valueOf(df.format(Math.random() * 1000));
			// total = total + orderTotal;
			// insertCell(table, df.format(orderTotal), Element.ALIGN_RIGHT, 1, bf12);
			//
			// }
			// insertCell(table, "California Total...", Element.ALIGN_RIGHT, 3, bfBold12);
			// insertCell(table, df.format(total), Element.ALIGN_RIGHT, 1, bfBold12);
			//
			// add the PDF table to the paragraph
			paragraph.add(table);
			// add the paragraph to the document
			doc.add(paragraph);

		} catch (DocumentException dex) {
			dex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (doc != null) {
				// close the document
				doc.close();
			}
			if (docWriter != null) {
				// close the writer
				docWriter.close();
			}
		}
	}


	private void initializeFonts() {

		try {
			bfBold = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
			bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);

		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void insertCell(PdfPTable table, String text, int align, int colspan, Font font) {

		// create a new cell with the specified Text and Font
		PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
		// set the cell alignment
		cell.setHorizontalAlignment(align);
		// set the cell column span in case you want to merge two or more cells
		cell.setColspan(colspan);
		// in case there is no text and you wan to create an empty row
		if (text.trim().equalsIgnoreCase("")) {
			cell.setMinimumHeight(10f);
		}
		// add the call to the table
		table.addCell(cell);

	}

}