import java.util.Date;
public abstract GeometricShape
{
    private double length1, length2;
    public abstract double getArea(); 
    public abstract double getPerimeter();
    public GeometricShape()
    {
        Date d= new Date();
        System.out.println("Created on date: " + d);
    } 
    //As the variables are private so 
    public double getLength1()
    {
        return length1;
    }
    public double getLength2()
    {
        return length2;
    }
}
class Triangle extends GeometricShape
{
    public Triangle()
    {
        
    }
    public double getArea()
    {
        return (getLength1()*getLength2())/2;
    }
}
class Rectangle 