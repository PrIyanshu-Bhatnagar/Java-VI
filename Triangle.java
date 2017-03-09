import java.lang.*;

public class Triangle
{
    double sideAB, sideBC, sideCA, area, perimeter;

   public static void main(String [] args)
   {
       Triangle a = new Triangle(10, 20 , 30);
       a.display(a);
       // add two Triangle
       //congruent Triangle
       //to String
       //equals
   } 
   Triangle()
   {
       sideAB = sideBC = sideCA = 10;
       setArea(sideAB,sideBC,sideCA);
   }
   Triangle(double sideAB, double sideBC, double sideCA)
   {
       this ();
       setArea(sideAB,sideBC,sideCA);
   }

   public void setArea(double sideAB, double sideBC, double sideCA)
   {
       setPerimeter(sideAB, sideBC, sideCA);
       double p = getPerimeter()/2;
       area = Math.sqrt(p * (p - sideAB)* (p - sideBC) * (p - sideCA));
   }

   public void setPerimeter(double sideAB, double sideBC, double sideCA)
   {
       setSideAB(sideAB);
       setSideBC(sideBC);
       setSideCA(sideCA);
        perimeter = sideAB + sideBC + sideCA;
   }
   public void setSideAB(double a)
   {
       sideAB = a;
   }
   public void setSideBC(double a)
   {
       sideBC = a;
   }
   public void setSideCA(double a)
   {
       sideCA = a;
   }
   public void display(Triangle x)
   {
       System.out.println("Side AB = " + x.getsideAB());
       System.out.println("Side BC = " + x.getsideBC());
       System.out.println("Side CA = " + x.getsideCA());
       System.out.println("Area = " + x.getArea());
       System.out.println("Perimeter = " + x.getPerimeter());       
   }

   public double getArea()
   {
       return area;
   }
   public double getPerimeter()
   {
       return perimeter;
   }
   public double getsideAB()
   {
       return sideAB;
   }
   public double getsideBC()
   {
       return sideBC;
   }
   public double getsideCA()
   {
       return sideCA;
   }
}
