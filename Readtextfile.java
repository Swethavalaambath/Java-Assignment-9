package FileIo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readtextfile {
	
	

		public static void main(String[] args) {
			FileReader in = null;
			FileWriter out = null;

			try {
				in = new FileReader("C:\\Users\\swetha.valambath\\Fileiopractice\\testchar.txt");
				out = new FileWriter("C:\\Users\\swetha.valambath\\Fileiopractice\\destination1.txt");

				int c = 0;
				while ((c = in.read()) != -1) {
					out.write(c);
				}
				System.out.println("Success...");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (in != null) {
						in.close();
					}
					if (out != null) {
						out.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

	}


