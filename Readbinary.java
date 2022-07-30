package FileIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Readbinary{

public static void main(String[] args) {

		FileInputStream source = null;
		FileOutputStream dest= null;
		int temp = 0;

		try {
			try {
				source = new FileInputStream("C:\\Users\\swetha.valambath\\Fileiopractice\\binaryio.png");
				dest = new FileOutputStream("C:\\Users\\swetha.valambath\\Fileiopractice\\binaryoutput.png");
				
				while ((temp = source.read()) != -1) {
					dest.write((byte) temp);
				}
				System.out.println("Success...");
			} catch (FileNotFoundException e) { 
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} finally {
			try {
				if (source != null) {
					source.close();
				}
				if (dest != null) {
					dest.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}




		
	


