package main.java.group.GFG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Parent {
	public final int v1 = 0;
	int p1;
	int p2;
	
	private void m1(){
		System.out.println("in m");
	}
	
	public void risky() throws IOException{
		System.out.println("in parent");
	}
	
	
	
}
class Child extends Parent{
	int p3;
	int p4;
	

	@Override
	public void risky() throws IOException{
		File f = new File("asdf");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = br.readLine();
		while(line != null){
			System.out.println(line);
			line = br.readLine(); 
		}
	}
	
	public static void main(String[] args){
		Child c = new Child();
		c.p1 = 1;
		Parent p = new Child();
	}
	
	
}

interface I{
	public static final int a = 12;
	int b = 2;
	public int c = 0;
}

class C implements I{
	
	public static void main(String[] args){
		C c = new C();
	}
}
