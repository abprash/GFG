package outputs;


// Driver class
public class Test3
{
/*    public static void main(String args[])
    {
        AA a = new BB(); // object of type B

        BB b = new BB();

        // Data member of class A will be accessed
        System.out.println(a.x);
        System.out.println(b.x);
    }*/
	
	    // constructor
	    Test3()
	    {
	        System.out.println("Geeksforgeeks");
	    }
	     
	    static Test3 a = new Test3(); //line 8
	    static int count = 0;
	    
	    public static void main(String args[]) throws InterruptedException
	    {
//	    	Test3 b; //line 12
//	        b = new Test3();
	        
	        /*Long a = 128L, b = 128l;
	        System.out.println(a == b);
	 
	        Double c = 100.0, d = 100.0;
	        System.out.println(c == d);*/
	    	//m1();
	    	Test3 t1 = new Test3();
	        //t1 = null;
	        Test3 t2 = new Test3();
	    	System.gc();
	    	
	    	Thread.sleep(1000);
	    	
	    	System.out.println("Count = "+count);
	    }
	    
	    static void m1() 
	    {
	        //Test3 t1 = new Test3();
	        //t1 = null;
	        //Test3 t2 = new Test3();
	        //t2 = null;
	    }
	    
	    @Override
	    protected void finalize(){
	    	count++;
	    }
	
}


class AA
{
    int x = 10;
}

// class B
class BB extends AA
{
    int x = 20;
}