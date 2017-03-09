import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.net.URL;

public class ASDFScanner
{
    public static void main(String [] args) throws Exception
    {
        /*String x = "12 13 14 15 85 18 17 Akash fucker";
        Scanner sc = new Scanner(x);
        while(sc.hasNext()) System.out.println(sc.nextLine());*/

        File f = new File("asdf.txt");
        Scanner sc = new Scanner(f);
        URL url = new URL("http://www.gitamritan.org/index.html");
        Scanner urlReader = new Scanner(url.openFile());
    }
}