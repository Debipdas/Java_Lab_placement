package com.java.lab;
//wap to print 1 to 10 by using ineer loop.
public class PrintNumber {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
			for (int k=10;k<=i;k--) {
				System.out.println(k);
			}
		}
		
	}

}
