package main.java.group.GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface I
{
	//the methods are public abstract by default
	public abstract void A();
	void B();
	void C();
	void D();
	
}

class Implementer implements I{
	public void A(){
		System.out.println("A method");
	}
	public void B(){
		System.out.println("B method");
	}
	public void C(){
		System.out.println("C method");
	}
	public void D(){
		System.out.println("D method");
	}
}


interface I2{
	default void A2(){
		System.out.println("a2");
	}
	static void B2(){
		System.out.println("b2");
	}
}

class C2 implements I2
{
	
}

interface I3{
	//for anonymous demo
	public void A3();
	public void B3();
	
}

interface I4{
	//for lambda demo
	void A4();
	//public void B3();
	
}

public class ForEachDemo {
	public static void main(String[] args){
		//
		new ForEachDemo().forEachDemo();
		//usual way of using implementing methods in interface
		//new Implementer().A();
		I objI;
		//objI = new I();
		//method 2.1
		//using anonymous classes
		I3 i3 = new I3(){
			public void A3(){
				System.out.println("in a3");
			}
			
			public void B3(){
				System.out.println(" in b3");
			}
		};
		//method 2.2
		//using default methods - java 8 feature
		//for static methods in an interface you do not even need an instance, just the reference will do
		I2 i2Obj;
		I2.B2();
		//but for a default method, you do need an instance of a class to invoke that method
		i2Obj = new C2();
		i2Obj.A2();
		//method 3
		//using lambda expressions
		//eliminating boilerplate code and making a clean implementation
		//we are basically implementing this interface i4 in a cleaner way, in a way where there is no generation of anonymous inner classes
		I4 i4_1;
		//we are like making an anonymous lightweight class, but not an entire class
		i4_1 = ()-> System.out.println("inside a4");
		i4_1.A4();
	}
	
	public void forEachDemo(){
		List<Integer> l;
		Integer[] a = {5,4,3,2,1,0};
		l = Arrays.asList(a);
		//lambda expressions and foreach looping
		l.forEach(i -> System.out.println(i));
		//l.subList(fromIndex, toIndex)
	}
	//we will see how lambda expressions help eliminating boiler-plate code
	
	
	

}
