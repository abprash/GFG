package outputs;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/*public class Test
{
    private int data = 5;
 
    public int getData()
    {
        return this.data;
    }
    public int getData(int value)
    {
        return (data+1);
    }
    public int getData(int... value)
    {
    	System.out.println(value.length);
        return  (data+2);
    }
 
    public static void main(String[] args)
    {
        Test temp = new Test();
        System.out.println(temp.getData(7,2));
        System.out.println(temp.getData(new int[]{7,8,9}));
        System.out.println(temp.getData(new int[]{7,8,9}));
    }
}*/

/*public class Test
{
    public void display() throws IOException
    {
        System.out.println("Test");
    }

    public static void main(String[] args) throws IOException
    {
        Derived object = new Derived();
        object.display();
    }
    
}
 
class Derived
{
    public void display() throws IOException
    {
        System.out.println("Derived");
    }
    
   
    
}*/

/*public class Test extends Thread
{
	public void run(){
		System.out.println("ok");
	}
    public static void main(String[] args)
    {
       Test t = new Test();
       
       t.run();
       t.run();
       t.start();
       //t.start();
    }
}*/
/*abstract interface Test
{
    public int calculate();
    protected interface NestedInterface
    {
        public void nested();
    }
    private interface NestedInterface
    {
        public void nested();
    }
    public interface NestedInterface
    {
        public void nested();
    }
}*/
/*class Temp
{
    private Temp(int data)
    {
        System.out.printf(" Constructor called ");
    }
    protected static Temp create(int data)
    {
        Temp obj = new Temp(data);
        return obj;
    }
    public void myMethod()
    {
        System.out.printf(" Method called ");
    }
}
 
public class Test
{
    public static void main(String[] args)
    {
        Temp obj = Temp.create(20);
        obj.myMethod();
    }
}*/
/*class myThread implements Runnable
{
    public void run()
    {
        Test.obj.notify();
    }
}*/
 
/*public class Test implements Runnable
{
    public static Test obj;
    private int data;
    public Test()
    {
        data = 10;
    }
    public void run()
    {
        obj = new Test();
        try {
			obj.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        obj.data += 20;
         
        System.out.println(obj.data);
    }
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread1 = new Thread(new Test());
        Thread thread2 = new Thread(new myThread());
         
        thread1.start();
        thread2.start();
     
        System.out.printf(" GFG - ");   
    }
}*/

/*public class Test
{
	
    private static float temp()
    {
    	float sum = 21;
        return((sum)--);
        
    }
    public static void main(String[] args)
    {
        Test test = new Test();
        System.out.println(test.temp());
        //System.out.println(sum);
        int value = 3, sum = 6 + -- value;
        
        int data = --value + ++value / sum++ * value++ + ++sum  % value--;
        //              3        4         8      2        10      3
        System.out.println(data);
    }
}  */

/*class Derived1 
{
    public void getDetails()
    {
        System.out.printf("Derived class1 ");
    }
}
class Derived2 extends Derived1 
{
    public void getDetails()
    {
        System.out.printf("Derived class2 ");
    }
}
 
public class Test extends Derived2
{
    public void getDetails()
    {
    	
        System.out.printf("Test class ");
        super.getDetails();
    }
    public static void main(String[] args)
    {
        Derived1 obj = new Test();
        obj.getDetails();
    }
}*/
/*public class Test extends Thread implements Runnable
{
    public void run()
    {
        System.out.printf("GFG ");
    }
    public static void main(String[] args) throws InterruptedException
    {
        Test obj = new Test();
        obj.run();
        obj.start();
    }
}*/
class Test2 implements Runnable
{
    public static CyclicBarrier barrier = new CyclicBarrier(3);
    public void run()
    {
        System.out.printf(" GFG ");
        try
        {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread1 = new Thread(new Test2());
        Thread thread2 = new Thread(new Test2());
         
        thread1.start();
        thread2.start();
        System.out.printf(" GeeksforGeeks ");
        try
        {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) 
        {
            e.printStackTrace();
        }
        System.out.printf(" End ");
         
    }
}

//**********************

class Test3
{
	public static float sum = 21;
    private static float temp()
    {
        
        return(--(sum));
    }
    public static void main(String[] args)
    {
        Test3 test = new Test3();
        System.out.println(test.temp());
    }
}

class Derived 
{
    public void getDetails()
    {
        System.out.printf("Derived class ");
    }
}
 
public class Test extends Derived
{
    public void getDetails()
    {
        System.out.printf("Test class ");
        super.getDetails();
    }
    public static void main(String[] args)
    {
        Derived obj = new Test();
        obj.getDetails();
    }
}