package ba.bitcamp.exercise.Benjo.Sreams;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class StreamPractice {

	public static void main(String[] args) {
		System.out.println("Unesi recenicu: ");
		InputStream is = new DataInputStream(System.in);
		byte [] buffer = new byte [10];
		OutputStream  os = new DataOutputStream(System.out);

		int numBuffer = 0;
		
		try {
			while ((numBuffer = is.read(buffer)) >=0 ){
//			System.out.println("Uneseno: " + new String(buffer));
			os.write(buffer);
			buffer = new byte [10];
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
