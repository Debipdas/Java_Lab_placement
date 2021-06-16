package com.java.lab;

public class TestStatic_Nonstatic {

	static int x=10;//static
	       int y=20;//non-static
	
	public static void main(String[] args) {
		int p=30;
 	//static int q=30;//CE:Illegal modifier
		System.out.println("Static:"+x);
	//System.out.println(y);//NOTALLOW: static reference to the non-static field
		System.out.println("local :"+p);
	//System.out.println(q);
		
		TestStatic_Nonstatic sn=new TestStatic_Nonstatic();
		System.out.println("Nonstatic:"+sn.y);//For nonStatic variable, direct not access.we                
		                                      //need to create object.
		
		
	}

}
