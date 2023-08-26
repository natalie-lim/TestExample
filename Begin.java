import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Begin {
	//One that writes a String to a file
    //One that reads from a file to a String
    private String str;
    private String fileName;
    
    public Begin (String str, String fileName) throws IOException {
        this.str = str;
        this.fileName = fileName;
    }
    
    public void StringToFile () throws FileNotFoundException {
        PrintWriter pw  = new PrintWriter(this.fileName);
        pw.print(str);
        pw.close();
    }
    
    public void FileToString () throws IOException {
        BufferedReader br = new BufferedReader (new FileReader(fileName));
        while (br.ready()) {
            str = str + (char) br.read();
        }
        br.close();
    }
    
    public static void main (String [] args) throws IOException {
        System.out.println ("my name is");
        String random = "there was was a girl in Timbuktoo\nwho really liked to go to the loo.";
        Begin bebe = new Begin(random, "output.txt");
        bebe.StringToFile();
        String output = "";
        bebe = new Begin (output, "output.txt");
        bebe.FileToString();
        System.out.println (output);
    }
}