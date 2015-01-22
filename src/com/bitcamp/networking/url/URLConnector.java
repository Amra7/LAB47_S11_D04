package com.bitcamp.networking.url;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnector {

	private static final String URL = "http://klix.ba";
	private InputStream in;
	private static final String file = "/tmp/";

	public static void getURL(String urlToVisit) throws MalformedURLException {
		URL urlVisiting = new URL(urlToVisit);
		try {
			URLConnection connection = urlVisiting.openConnection();
			InputStream in = connection.getInputStream();
			printOutput(in);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints IntputStream to String.
	 * @param in - InputStream that we forwarded.
	 * @return String of input streams.
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private static String printOutput(InputStream in) throws IOException {
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		StringBuilder sb = new StringBuilder();

		String line = "";

		while (true) {
			try {
				if (br.readLine() == null) {
					break;
				}
				sb.append(br.readLine() + "\n");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		line = sb.toString();
		// try {
		// while( (line = br.readLine() )!= null){
		// br = new BufferedReader(new InputStreamReader(in));
		// sb.append(line);
		// }
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }finally {
		// if ( br != null){
		// try {
		// br.close();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		//
		// System.out.println("Gotovo");
		// }
		writeOutputToFile(sb.toString());
		return null;
	}

	/**
	 * Writes String to file.
	 * @param inputString - String that we want to put in file.
	 * @throws IOException 
	 */
	private static void writeOutputToFile(String inputString) throws IOException {
		File newFile = new File(file + "bitcamp.txt");
		
		FileOutputStream fos =  new FileOutputStream(newFile);
		try {

			fos.write(inputString.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fos.close();
		}
		
	}

	public static void main(String[] args) {

		try {
			getURL(URL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// end of main method

}
