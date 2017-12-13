package outputs;

import java.util.ArrayList;
import java.util.LinkedList;

class Test2 
{
    // static block
    static
    {
        System.out.println("Hello from static block 1 ");
    }
    static
    {
        System.out.println("Hello from s block 2");
    }
    static
    {
        System.out.println("Hello from s block 3");
    }
    {
    	System.out.println("Hello from instance block 1");
    }
    {
    	System.out.println("Hello from instance block 2");
    }
    {
    	System.out.println("Hello from instance block 3");
    }
    
    /*{
    	System.out.println("Hello from instance block 4");
    	{
            System.out.println("5");
            {
                System.out.println("6");
                {
                    System.out.println("7");
                    {
                        System.out.println("8");
                        {
                            System.out.println("9");
                            {
                                System.out.println("10");
                                {
                                    System.out.println("11");
                                }
                            }
                        }
                    }
                }
            }
        }
    }*/
    public static void main(String[] args){
    	//System.out.println("Hello from main");
    	//Test2 t = new Test2();
    	//Test2 t1 = new Test2();
//    	Test2 t2 = new Test2();
    	
    	ArrayList<Integer> ar = new ArrayList<>();
        /*for (int i = 0; i < 1000000; i++)
        {
        	if((i % 1000) == 0)
        		System.out.println(i);
            ar.add(i);
        }*/
    	Integer a = 2;
    	Integer b = null;
    	System.out.println(a instanceof Integer);
    	System.out.println(b instanceof Integer);
        int num = 1_0_00;
        //System.out.println(num);
    }
}
