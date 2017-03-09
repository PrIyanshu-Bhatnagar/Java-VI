public class Reference
{
    static
    {
        int x[] = new int[20], y[] = new int[20];
    }
    public static void main(String args[])
    {

        for(int i =0 ; i<20; i++){
            x[i] = i;
            y[i] = 20 - i;
        }

        display(x,y);
        
        //int z[] =new int[20];
        
        //z = y;
        //y = x;
        //x = z;
        System.out.println("------------------------------------------------");
        display(x,y);
    }

    public static void display(int[] x, int[] y)
    {
        for(int i = 0; i<20;i++) 
        {
            System.out.println(x[i] + "\t" + y[i]);
        }
    }
}