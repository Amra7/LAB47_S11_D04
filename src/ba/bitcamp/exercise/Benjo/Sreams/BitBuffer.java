package ba.bitcamp.exercise.Benjo.Sreams;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class BitBuffer {

	private InputStream stream;
//	private String nextLine;
	
	public BitBuffer(InputStream stream) {
		this.stream = stream;
	}
	
	public String returnLine(){
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String input = "";
	    byte[] buffer = new byte[10];
	    ArrayList<Byte> byteBuffer = new ArrayList<Byte>();
	    DataOutputStream dos = new DataOutputStream(System.out);
	    
	    while ( stream.read(buffer) >=0){
	    	
	    	for ( int i=0; i<buffer.length; i++){
	    		if ( buffer[i] == (byte) '\n'){
	    			byte[] temp = new byte [byteBuffer.size()];
	    			int j=0;
	    			for ( Byte b : byteBuffer){
	    				temp[j++] = b;
	    				dos.write(temp);
	    				dos.flush();
	    			}
	    		} else {
	    			byteBuffer.add(buffer[i]);
	    		}
	    	}
	    }
	    stream.read(buffer);
	    try{
	//        System.out.println("Enter: ");
	        input = br.readLine();

	    }catch(IOException e)
	    {
	        e.printStackTrace();
	    }
	    return input;
	}

}
