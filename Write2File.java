import java.io.*;

public class Write2File
{
    public static void main(String [] args) throws IOException
    {
        File file = new File("LatticePoints.txt");
        PrintWriter pw = new PrintWriter(file);
       /* if(file.exists())
        {
            System.out.println("File will be overwritten!");
            System.exit(0);
        }
        else
        {*/
            //pw.println("Hello World");
        //}
            int radius = 100, nPoints = 0, x = 0, y = 0;
            for(x = 0; x<= radius; x++)
                for(y = 0; y <= radius; y++)
                    if(x * x + y * y <= radius * radius) nPoints++;
            nPoints *= 4;
            nPoints = nPoints - 3 - (4 * radius);
            pw.println(nPoints);
            pw.close();

    }
}
