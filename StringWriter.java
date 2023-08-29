import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class StringWriter {
	//One that writes a String to a file
    //One that reads from a file to a String
    
    public StringWriter () throws IOException {
    }
    
    public static void StringToFile (String str, String fileName) throws FileNotFoundException {
        PrintWriter pw  = new PrintWriter(fileName);
        pw.print(str);
        pw.close();
    }
    
    public static String FileToString (String fileName) throws IOException {
        String str = "";
        BufferedReader br = new BufferedReader (new FileReader(fileName));
        while (br.ready()) {
            str = str + (char) br.read();
        }
        br.close();
        return str;
    }
    public static void main (String [] args) throws IOException {
        System.out.println ("my name is");
        String random = "there once  a girl named";
        StringWriter.StringToFile(random, "output.txt");
        System.out.println (StringWriter.FileToString("output.txt"));
    }
}