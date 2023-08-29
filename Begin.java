import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Begin {
    // One that writes a String to a file
    // One that reads from a file to a String
    private String str;
    private String fileName;

    public Begin(String str, String fileName) throws IOException {
        this.str = str;
        this.fileName = fileName;
    }

    public void StringToFile() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(this.fileName);
        pw.print(str);
        pw.close();
    }

    public void FileToString() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while (br.ready()) {
            str = str + (char) br.read();
        }
        br.close();
    }

    public String returnString() {
        return str;
    }

    public static int countCharacters(String filename) {
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            StringBuilder data = new StringBuilder();
            while (myReader.hasNextLine()) {
                data.append(myReader.nextLine());
                // System.out.println(data);
            }
            myReader.close();
            return data.length();

        } catch (FileNotFoundException e) {
            System.out.println("file does not exist");
        }
        return 0;

    }

}