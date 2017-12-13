package outputs;

public class Dog {
	
	String name;
	
	public void setName(String s){
		this.name = s;
	}
	public Dog(String n){
		this.name = n;
	}
	
	public static void main(String[] args){
		Dog d = new Dog("Rover");
		System.out.println(d.name);
		foo(d);
		System.out.println("After foo");
		System.out.println(d.name);
	}
	public static void foo(Dog someDog) {
	    someDog.setName("Max");     // AAA
	    someDog = new Dog("Fifi");  // BBB
	    someDog.setName("Rowlf");   // CCC
	}
}
