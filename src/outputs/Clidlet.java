package outputs;

//since the method in the parent is private, it is not technically overridden... so chill.. don't worry.


class Clidder 
{
    private final void flipper() 
    {
        System.out.println("Clidder");
    }
}
 
public class Clidlet extends Clidder 
{
    final void flipper() 
    {
        System.out.println("Clidlet");
    }
    public static void main(String[] args) 
    {
        new Clidlet().flipper();
    }
}
