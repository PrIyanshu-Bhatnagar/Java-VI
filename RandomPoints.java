import java.util.Random;
public class RandomPoints
{
    public static void main(String args[])
    {
        double x,y;
        int countOfPointsInCircle = 0;
        Random generator = new Random();
        for(int i =0; i<10000; i++)
        {
            x = generator.nextDouble();
            y = generator.nextDouble();

            if( x*x + y*y <= 1) countOfPointsInCircle++;
        }
        double PI = 4.0 * countOfPointsInCircle/10000;
        System.out.println(PI);
    }
}