package outputs;

/*
public class RuntimePolymorphism
{
    public static void main(String[] args)
    {
        A a = new B();
        B b = new B();
         
        System.out.println(a.c + " " + a.getValue() 
            + " " + b.getValue() + " " + b.getSuperValue());
        System.out.println(a.c);
        System.out.println(b.c);
        System.out.println(a.);
    }
}
 
class A
{
	protected  char c = 'a';//= 'A';
    char getValue()
    {
        return c;
    }
}
 
class B extends A
{
    protected char c = 'B';
    char getValue()
    {
        return c;
    }
    char getSuperValue()
    {
        return super.c;
    }
}*/

public class RuntimePolymorphism
{
    public static void main(String[] args)
    {
        A a = new B();
        B b = new B();
        System.out.println(a.c + " " + a.getValue() + 
            " " + b.getValue() + " " + b.getSuperValue());
    }
}
 
class A
{
    protected char c = 'A';
    char getValue()
    {
        return c;
    }
}
class B extends A
{
    protected char c = 'B';
    char getSuperValue()
    {
        return super.c;
    }
}