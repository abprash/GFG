package outputs;

interface GFG
{
    void myMethod();
    void getInfo();
}
 
/*abstract class Geeks implements GFG
{
    void getData()
    {
        System.out.println("GFG");
    }
}
 
public class Test4 extends Geeks
{
    public void myMethod()
    {
        System.out.println("GeeksforGeeks");
    }
    public void getInfo()
    {
        System.out.println("Geeks");
    }
     
    public static void main(String[] args)
    {
        Geeks obj = new Test4();
        obj.getInfo();
    }
}*/
public abstract class Test4 implements GFG{
	public static void main(String[] args){
		int String = 65;
        int Runnable = 97;
 
        System.out.print(String + " : " + Runnable);
	}
}

class TestChild extends Test4{

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		
	}
	
}