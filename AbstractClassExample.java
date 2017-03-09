public abstract class AbstractClassExample //Mammal class
{
    abstract public void move();// Unavailability of abstract word poses error
    //instances cannot be created of abstract class but can have constructors.
    public AbstractClassExample()
    {
        
    }
}
public class Whale extends AbstractClassExample
{
    public void move()
    {
        System.out.println("Swim");
    }
}
public class Dog extends AbstractClassExample
{
    public void move()
    {
        System.out.println("Run");
    }
}
public class Bat extends AbstractClassExample
{
    public void move()
    {
        System.out.println("fly");
    }
}