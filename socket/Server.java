package com.bitcamp.networking.socket;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	public static final int PORT = 1463;
	
	public static void startServer(){
	    try {
			ServerSocket server = new ServerSocket(PORT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		
		startServer();
	}

}
