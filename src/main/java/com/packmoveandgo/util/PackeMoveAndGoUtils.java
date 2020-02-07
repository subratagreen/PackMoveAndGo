package com.packmoveandgo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class PackeMoveAndGoUtils implements PackeMoveAndGoConstants{
	private static final Logger logger = Logger.getLogger(PackeMoveAndGoUtils.class);

	public static String generatePassword() {
		String alphabet = new String(
				"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
		int n = alphabet.length();
		int length = 3;
		String result = new String();
		Random r = new Random();
		for (int i = 0; i < length; i++) {
			result = result + alphabet.charAt(r.nextInt(n));
		}
		logger.info("GeneratePassword "+result);
		return result;
	}

	/**** Method #1 - This Method Is Used To Retrieve The File Path From The Server ****/
	public static String getFilePath(HttpServletRequest req) throws FileNotFoundException {
		String appPath = "", fullPath = "", downloadPath = "downloads";

		/**** Retrieve The Absolute Path Of The Application ****/
		appPath = req.getSession().getServletContext().getRealPath("");	
		fullPath = appPath + File.separator + downloadPath;
		logger.info("Destination Location For The File Is?= " + fullPath);
		return fullPath;
	}

	/**** Method #2 - This Method Is Used To Get The No. Of Columns In The ResultSet ****/
	public static int getColumnCount(ResultSet res) throws SQLException {
		int totalColumns = res.getMetaData().getColumnCount();		
		return totalColumns;
	}

	/**** Method #3 - This Method Is Used To Set The Download File Properties ****/
	public static void downloadFileProperties(HttpServletRequest req,HttpServletResponse resp, String toBeDownloadedFile,
			File downloadFile) {
		try {

			/**** Get The Mime Type Of The File & Setting The Binary Type If The Mime Mapping Is Not Found ****/
			String mimeType = req.getSession().getServletContext().getMimeType(toBeDownloadedFile);
			if (mimeType == null) {
				mimeType = "application/octet-stream";
			}

			/**** Setting The Content Attributes For The Response Object ****/
			resp.setContentType(mimeType);
			resp.setContentLength((int) downloadFile.length());

			/**** Setting The Headers For The Response Object ****/
			String headerKey = "Content-Disposition";
			String headerValue = String.format("attachment; filename=\"%s\"", downloadFile.getName());
			resp.setHeader(headerKey, headerValue);

			/**** Get The Output Stream Of The Response ****/
			OutputStream outStream = resp.getOutputStream();
			FileInputStream inputStream = new FileInputStream(downloadFile);
			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead = -1;

			/**** Write Each Byte Of Data Read From The Input Stream Write Each Byte Of Data  Read From The Input Stream Into The Output Stream ****/
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outStream.write(buffer, 0, bytesRead);
			}

			
			inputStream.close();
			outStream.flush();
			outStream.close();
		} catch(IOException ioExObj) {
			System.err.println("Exception While Performing The I/O Operation?= " + ioExObj);
		}
	}

	/**** Method #3 - This Method Is Used To Set The Download File Properties 
	 * @throws FileNotFoundException ****/
	public static void downloadFilePropertiesNext(HttpServletRequest httpServletRequest,HttpServletResponse response, String toBeDownloadedFile,
			File downloadFile) throws FileNotFoundException {

		//			File file = new File(toBeDownloadedFile);
		String downloadFolder = PackeMoveAndGoUtils.getFilePath(httpServletRequest) + File.separator;

		Path file = Paths.get(downloadFolder, toBeDownloadedFile);
		// Check if file exists
		if (Files.exists(file)) {
			// set content type
			response.setContentType("application/pdf");
			// add response header
			response.addHeader("Content-Disposition", "attachment; filename=" + toBeDownloadedFile);
			try {
				// copies all bytes from a file to an output stream
				Files.copy(file, response.getOutputStream());
				// flushes output stream
				response.getOutputStream().flush();
			} catch (IOException e) {
				logger.info("Error :- " + e.getMessage());
			}
		} else {
			logger.info("Sorry File not found!!!!");
		}
	}
	public static int getMonthFromDate(Date date) {
		String pattern = "yyyy-MM-dd";
		DateFormat formatter = new SimpleDateFormat(pattern);
		String formattedDate = formatter.format(date);
		//default, ISO_LOCAL_DATE
		LocalDate localDate = LocalDate.parse(formattedDate);

		logger.info(localDate);
		logger.info("getMonthFromDate Month "+localDate.getMonth().getValue());
		//		logger.info("Year "+ localDate.getYear());
		return localDate.getMonth().getValue();
	}
	public static int getYearFromDate(Date date) {
		String pattern = "yyyy-MM-dd";
		DateFormat formatter = new SimpleDateFormat(pattern);
		String formattedDate = formatter.format(date);
		//default, ISO_LOCAL_DATE
		LocalDate localDate = LocalDate.parse(formattedDate);

		logger.info(localDate);
		//        logger.info("Month "+localDate.getMonth().getValue());
		logger.info("getMonthFromYear Year "+ localDate.getYear());
		return localDate.getYear();
	}

	public static String getStringDateFromDate(Date date) {
		String pattern = "yyyy-MM-dd";
		DateFormat formatter = new SimpleDateFormat(pattern);
		String formattedDate = formatter.format(date);
		//default, ISO_LOCAL_DATE
		LocalDate localDate = LocalDate.parse(formattedDate);

		logger.info(localDate);
		//        logger.info("Month "+localDate.getMonth().getValue());
		logger.info("getMonthFromYear Year "+ localDate.getYear());
		return localDate.toString();
	}



}
