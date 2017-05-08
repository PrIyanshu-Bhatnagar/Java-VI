import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;
public class GetPageFromWebsite
      {
          public static void main (String [] args) throws IOException
             {
                 final int HTTP_PORT_NUM = 80;
                 String host = "ibm.com";
                 String resource = "/"; //index.html
                 Socket socket = new Socket (host, HTTP_PORT_NUM);
                 InputStream is = socket.getInputStream ();
                 OutputStream os = socket.getOutputStream ();
                 PrintWriter pw = new PrintWriter (os);
                 String hTTPCommand = "GET " + resource + " HTTP/1.0\n";
                 pw.println (hTTPCommand);
                 pw.flush ();
                 Scanner sc = new Scanner (is);
                 while (sc.hasNextLine ())
                    System.out.println (sc.nextLine ());
                 socket.close ();
             }
      }