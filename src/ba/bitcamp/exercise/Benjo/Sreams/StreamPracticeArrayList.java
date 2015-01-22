package ba.bitcamp.exercise.Benjo.Sreams;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class StreamPracticeArrayList {

	public static void main(String[] args) {
		System.out.println("Unesi recenicu: ");
		InputStream is = new DataInputStream(System.in);
		byte[] buffer = new byte[10];
		OutputStream os = new DataOutputStream(System.out);

		ArrayList<Byte> bufferInput = new ArrayList<Byte>();
		int numBuffer = 0;

//		try {
//			while ((numBuffer = is.read(buffer)) >= 0) {
//				os.write(buffer);
//				os.write("Ob\n".getBytes());
//				for (int i = 0; i < buffer.length; i++) {
//
//					if (buffer[i] == (byte) '\n') {
//
//						byte[] temp = new byte[bufferInput.size()];
//						int index = 0;
//						for (Byte o : bufferInput)
//							temp[index++] = (byte) o;
//						os.write("Buffered\n".getBytes());
//						os.write(temp);
//						os.flush();
//					} else
//						bufferInput.add(buffer[i]);
//				}
//
//				buffer = new byte[10];
//
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		BitBuffer bitBuffer =  new BitBuffer(is);
		System.out.println(bitBuffer.returnLine());

	}

}
