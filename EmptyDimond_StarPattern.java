package com.java.lab;

public class EmptyDimond_StarPattern {

	public static void main(String[] args) {

		 int rows = 7;
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
	                if( k == 1 || k == (i * 2) -1)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	        for (int i=rows-1; i>=1; i--)
	        {
	         // Print space in increasing order
	            for (int j=rows-1; j>=i; j--)
	            {
	                System.out.print(" ");
	            }
	            // Print star in decreasing order
	            for (int k=1; k<=(i * 2) -1; k++)
	            {
	                if( k == 1 || k == (i * 2) -1 )
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            
	            
	            System.out.println();
	        }
	}

}
