package outputs;



/*class A
{
    public void Top(String s) 
    {
        System.out.print("A");
    }
}
 
public class B extends A 
{
    public B(String s) 
    {
        System.out.print("B");
    }
    public static void main(String[] args) 
    {
        new B("C");
        System.out.println(" ");
    }
}*/
class A 
{
    public static String sing() 
    {
        return "la";
    }
}
public class B extends A
{
    public static String sing() 
    {
        return "fa";
    }
    public static void main(String[] args) 
    {
        A a = new B();
        B b = new B();
    System.out.println(a.sing() + " " + b.sing());
    }
}
