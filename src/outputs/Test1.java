package outputs;

/*public class Test1 {
    int x = 10;
    
public
    static void main(String[] args)
    {
        System.out.println(new Test1().x);
    }
    static
    {
    	int x = 20;
        System.out.print(x + " ");
    }
}*/

interface I{
	public int doThis();
}

interface I2{
	public int doThis();
}


 class Test1 extends Test0 {
	 public void ins() throws RuntimeException{
		 System.out.println("child instance");
	 }
	 public static void stat(){
		 System.out.println("child static");
	 }
public static void main(String[] args)
    {
	
		Test1 t1 = new Test1();
		t1.ins();
		t1.stat();
		Test0 t0 = new Test1();
		t0.ins();
		t0.stat();
		/*System.out.println("Hello world");
        int arr[] = { 11, 22, 33 };
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
 
        System.out.println();
 
        //int arr2[] = new int[3];
        int arr2[] = new int[]{ 11, 22, 33 };
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");*/
		/*System.out.println("YO");
		System.out.println('+'*'-');
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);*/
		System.out.println(gcd(34,12));
		double p = -1;
		System.out.println(Math.sqrt(p));
        System.out.println(p/0);
    }

	public static int gcd(int a, int b){
		System.out.println(a);
		if(a == 0 || b == 0)
			return a+b;
		/*else if(a < b)
			return gcd(a,b%a);*/
		else
			return gcd(b,a%b);
	}

	
}
 
 class Test0 {
	 public static void stat(){
		 System.out.println("base static");
	 }
	 
	 public void ins(){
		 System.out.println("base instance ");
	 }
 }