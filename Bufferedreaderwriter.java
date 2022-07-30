package FileIo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Bufferedreaderwriter {
	public static void main(String[] args) {

	BufferedReader br = null;
BufferedWriter bw = null;

try {
	Reader reader = new FileReader("C:\\Users\\swetha.valambath\\Fileiopractice\\source1.txt");
	br = new BufferedReader(reader);
	String line = null;

	File outFile = new File("C:\\Users\\swetha.valambath\\Fileiopractice\\destination1.txt");
	Writer writer = new FileWriter(outFile);
	bw = new BufferedWriter(writer);

	while ((line = br.readLine()) != null) {
		bw.write(line);
		bw.flush();
	}
	System.out.println("Success...");
} catch (IOException e) {
	e.printStackTrace();
} finally {
	try {
		br.close();
		bw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

}

}


