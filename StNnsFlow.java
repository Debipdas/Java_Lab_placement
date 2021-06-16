package com.java.lab;


public class StNnsFlow {
static int n=10;//static variable
int i = 20;//instance variable
void m1()//instance method
{
	int j=30;//local variable
	i++;
	n++;
	System.out.println("===instance method===");
	System.out.println("Value of n(static variable):"+n);
	System.out.println("Value of i(instance variable):"+i);
	System.out.println("Value of j(local variable:"+j);
}
static void m2()//static method
{
	int k=40;
	//j++;
	n++;
	//i++;//error
	System.out.println("===static method===");
	System.out.println("Value of K(local variable):"+k);
	System.out.println("value of n(static variable):"+n);
}
static//static block
{
	int k=40;
	//j++;
	n++;
	//i++;//error
	System.out.println("===static block===");
	System.out.println("Value of K(local variable):"+k);
	System.out.println("value of n(static variable):"+n);	
}
public static void main(String args[])
{
	m2();
	new StNnsFlow().m1();
	//m2();
}
}