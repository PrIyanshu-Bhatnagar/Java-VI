import java.util.Random;
import java.util.Scanner;
public class CoPrimes
{
    public static void main(String [] args)
    {
        int a [] = new int [10000],c,d, coprimes; // a is array but c and d are not;
        int [] b = new new [10000], e,f; // b, e, f are array;
        Random generator = new Random(100000); //0 <=  RandomNum < 100000
        double Pi;
        for(int i =0 ; i < a.length; i++)
        {
            a[i] = generator.nextInt();
            b[i] = generator.nextInt();
        }
        for(int i = 0; i<a.length; i++)
        {
            if(hcf (a[i],b[i]) == 1) coprimes++;
            Pi = Math.sqrt(6 * a.length / coprimes);
            System.out.println(Pi);
        }
    }

    public static int hcf(int a, int b)
    {
        int min  = Math.min(a,b), hcf;

        for(int i = min; i >= 1 ; i--)
        {
            if(a % i == 0 && b % i == 0)
            {
                hcf = i;
                break;
            }
        }
        return hcf; 
    }   
}