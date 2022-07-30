
package FileIo;
import java.io.IOException;
import java.util.*;
import java.io.FileWriter;

public class Writetextfile {
public static void main(String[] args)
        throws IOException
    {
	String str = "ABC";
        try {
        	FileWriter fw= new FileWriter("C:\\Users\\swetha.valambath\\Fileiopractice\\testchar");
  
             for (int i = 0; i < str.length(); i++)
                fw.write(str.charAt(i));
  
            System.out.println("Successfully written");
           
            fw.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}


