package com.java.lab;

public class Pattern_triangle {

	public static void main(String[] args) {

		 int rows = 5;
	        
	        for (int i=1; i<=rows; i++) 
	        { 
	            // Print space in decreasing order 
	            for (int j=rows; j>i; j--)
	            {
	                System.out.print(" ");
	            }
	            // Print star in increasing order
	            for (int k=1; k<=(i * 2) -1; k++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
