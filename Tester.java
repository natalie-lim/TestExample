import java.io.IOException;

public class Tester {
    public static void main(String[] args) throws IOException {
        System.out.println("my name is");
        String random = "there once was a girl named";
        Begin bebe = new Begin(random, "output.txt");
        bebe.StringToFile();
        String output = "";
        Begin bob = new Begin(output, "output.txt");
        bob.FileToString();
        System.out.println(bob.returnString());

        // testing countCharacters() function
        System.out.println(Begin.countCharacters("output.txt"));
    }
}
