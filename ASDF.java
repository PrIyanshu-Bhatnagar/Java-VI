import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ASDF
{
    public static void main(String [] args) throws Exception
    {
        File asdf = new File("asdf.txt");
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(asdf, true))) ) // True for appending mode)
        {
            pw.println("Hello World");
            //pw.close(); //With the try block we don't need to close the file.
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}