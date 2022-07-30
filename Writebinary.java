package FileIo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writebinary {

	public static void main(String[] args) {

		FileWriter out = null;

		try {
			File file = new File("C:\\Users\\swetha.valambath\\f1\\f2");

			if (!file.exists()) {
				file.mkdirs();
				System.out.println("Dir created");
			}
			out = new FileWriter(file.getAbsolutePath()+"\\test.txt");

			out.write("test file");
			System.out.println("Success...");
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}



