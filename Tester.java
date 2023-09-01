import java.io.IOException;

public class Tester {
    public static void main(String[] args) throws IOException {
        System.out.println("my name is");
        String random = "there once was a girl named";
        StringWriter bebe = new StringWriter(random, "output.txt");
        bebe.StringToFile();
        String output = "";
        StringWriter bob = new StringWriter(output, "output.txt");
        bob.FileToString();
        System.out.println(bob.returnString());

        // testing countCharacters() function
        System.out.println(StringWriter.countCharacters("output.txt"));
    }
}
