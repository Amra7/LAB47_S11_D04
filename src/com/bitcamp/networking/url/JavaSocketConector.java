package com.bitcamp.networking.url;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class JavaSocketConector {

	public static final String SERVER_ADDRESS = "127.0.0.1";
	public static final int PORT = 1463;
	
	public static void  connectToServer() throws UnknownHostException, IOException{
		Socket client   = new Socket(SERVER_ADDRESS, PORT);
		InputStream cilentInt = client.getInputStream();
		OutputStream clientOut = client.getOutputStream();
		
	}
	
	public static void main(String[] args) {
		
		try {
			connectToServer();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
