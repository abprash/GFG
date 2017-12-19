package outputs;


abstract class Vibrate 
{
    static String s = "-";
    Vibrate() 
    {
        s += "v";
        System.out.println(3);
    }
}
public class Echo extends Vibrate 
{
    Echo()  
    {
    	
        this(7);
        System.out.println(1);
        s += "e";
    }
    Echo(int x) 
    {
    	//first line of this calls the super class
        s += "e2";
        System.out.println(2);
    }
    public static void main(String[] args) 
    {
        System.out.print("made " + s + " ");
    }
    static
    {
        Echo e = new Echo();
        System.out.print("block " + s + " ");
    }
}