import java.util.Scanner;
public class PrimeNumbers
{
    static int primesArray[];
    public static void main(String args[])
    {
        Scanner kbdReader = new Scanner(System.in);
        System.out.print("How many primes? ");
        int numPrimes = kbdReader.nextInt();
        primesArray = new int [numPrimes];
        primesArray[0] = 2;
        primesArray[1] = 3;
        primesArray[2] = 5;
        primesArray[3] = 7;
        int number = 9;
        for(int i= 4; ;)
        {
            if(isPrime(number)) 
            {
                primesArray[i] = number;
                i++;
                if(i == primesArray.length) break;
            }
            number += 2;
        }
       // display();
       System.out.println("--------------------------------------------------------");
       int totalDecomp = decomp();
       System.out.println("Total number of decomposition = " + totalDecomp);
    }

    public static void display()
    {
        for(int i =0;i <primesArray.length;i++) System.out.println(primesArray[i]);
    }
    public static boolean isPrime(int number)
    {
        int divisor = 3;
        for( ; divisor * divisor < number; divisor += 2)
        {
            if(number % divisor == 0) return false;
            if(divisor * divisor == number) return false;
        } 
        return true;
    }
    public static int decomp()
    {
        System.out.println("Enter even number: ");
        Scanner kbdReader = new Scanner(System.in);
        int sum = kbdReader.nextInt();
        int temp, numOfDecomp = 0;
        for(int i =0 ; primesArray[i]<sum/2; i++)
        {
            temp = sum - primesArray[i];
            if(isPrime(temp))
            {
                System.out.println(sum + " = " + temp + " + " + primesArray[i]);
                numOfDecomp++;
            }
        }
        return numOfDecomp;
    }
}