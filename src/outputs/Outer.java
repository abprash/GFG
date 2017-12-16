package outputs;



/*public class Outer 
{
    private static int data = 10;
    private static int LocalClass()
    {
        class Inner
        {
            public int data = 20;
            private int getData()
            {
                return data;
            }
        }
        Inner inner = new Inner();
        return inner.getData();
    }
     
    public static void main(String[] args)
    {
        System.out.println(data * LocalClass());
    }
}

*/
//*******************************

/*interface Anonymous
{
    public int getValue();
}
public class Outer 
{
    private int data = 15;
    public static void main(String[] args)
    {
    	//this is how an anonymous class gets instantiated
    	
        Anonymous inner = new Anonymous(){
                    int data = 5;
                    public int getValue()
                    {
                        return data;
                    }
                    public int getData()
                    {
                        return data;
                    }
                };
        Outer outer = new Outer();
        System.out.println(inner.getValue() + inner.getData() + outer.data);
    }
}*/

/*public class Outer extends Thread
{
    private int data = 10;
     
    class Inner
    {
        private int data = 20;
        private int getData()
        {
            return data;
        }
        public void main(String[] args)
        {
            Inner inner = new Inner();
            System.out.println(inner.getData());
             
        }
    }
    private int getData()
    {
        return data;
    }
    
    public void run(){
    	System.out.println("OKKKK");
    }
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.printf("%d", outer.getData());
        inner.main(args);
        outer.not
    }
}*/
public class Outer
{
    private int data = 10;
     
    class Inner
    {
        private int data = 20;
        private int getData()
        {
            return data;
        }
        public void main(String[] args)
        {
            Inner inner = new Inner();
            System.out.println(inner.getData());
             
        }
    }
    private int getData()
    {
        return data;
    }
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.printf("%d", outer.getData());
        inner.main(args);
    }
}