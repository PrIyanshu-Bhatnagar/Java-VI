
//Coercion
public class DTAT extends Object
{
    public static void main (String [] args)
    {
        Object o= new Object();//declared type 
        function(o);
        o=new JustBorn();//actual type
        JustBorn x= new KGStudent(); //implicit casting
        o=x;// o now points to Just Born
        JustBorn y;
        y=(JustBorn) o;//explicit casting
        function(o);
        o=new KGStudent();
        function(o);
        o=new SchoolStudent();
        function(o);
        o= new CollegeStudent();
        function(o);
    }

    public static void function (Object o)
    {
        System.out.println(o.toString());
    }
}
class JustBorn extends DTAT
{
    public String toString()
    {
        return "Just Born";
    }
}
class KGStudent extends JustBorn
{
    public String toString()
    {
        return "In KG";
    }
}
class SchoolStudent extends KGStudent
{
    public String toString()
    {
        return "In School";
    }
}
class CollegeStudent extends SchoolStudent
{
    public String toString()
    {
        return "In College";
    }
}