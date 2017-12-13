package outputs;

public class Car {
	
	static Car temp;
	int model, no;
	 
    // Constructor
    Car(int model, int no)
    {
        this.model = model;
        this.no = no;
    }
 
    // Utility method to print Car
    void print()
    {
        System.out.println("no = " + no +
                           ", model = " + model);
    }
    // Driver method
    public static void main(String[] args)
    {
        Car c1 = new Car(101, 1);
        Car c2 = new Car(202, 2);
        c1.print();
        c2.print();
        Wrapper w1 = new Wrapper(c1);
        Wrapper w2 = new Wrapper(c2);
        swap(w1, w2);
        System.out.println("After swapping ------");
        w1.c.print();
        w2.c.print();
        int a = 2;
        int b = 5;
        System.out.println("a="+a+", b="+b);
        swap(a,b);
        System.out.println("After swapping ------");
        System.out.println("a="+a+", b="+b);
    }
    
 // swap() doesn't swap c1 and c2
    public static void swap(Car c1, Car c2)
    {
        temp = c1;
        c1 = c2;
        c2 = temp;
    }
    public static void swap(int a, int b){
    	int temp = a;
    	a = b;
    	b = temp;
    }
    public static void swap(Wrapper c1, Wrapper c2)
    {
    	Car temp = c1.c;
        c1.c = c2.c;
        c2.c = temp;
    }
}

class Wrapper{
	Car c;
	
	public Wrapper(Car c){
		this.c = c;
	}
}