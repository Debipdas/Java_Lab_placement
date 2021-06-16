package com.java.lab;

public class MYNameStar {

	static int height = 5;
	static int width = (2 * height) - 1;

	static void printD() {//for d
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < height; j++) {
				if ((i == 0 || i == height - 1) && j < height - 1)
					System.out.printf("*");
				else if (j == height - 1 && i != 0 && i != height - 1)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.println("\n");
		}
	}

	static void printE() {//for E
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < height; j++) {
				if ((i == 0 || i == height - 1) || (i == height / 2 && j <= height / 2))
					System.out.printf("*");
				else
					continue;
			}
			System.out.printf("\n");
		}
	}

	static void printB() {//for B
		int i, j, half = (height / 2);
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < width; j++) {
				if ((i == 0 || i == height - 1 || i == half) && j < (width - 2))
					System.out.printf("*");
				else if (j == (width - 2) && !(i == 0 || i == height - 1 || i == half))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
	}

	static void printI() {//for i
		int i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j < height; j++) {
				if (i == 0 || i == height - 1)
					System.out.printf("*");
				else if (j == height / 2)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
	}

	public static void main(String[] args) {

		MYNameStar n = new MYNameStar();
		n.printD();
		System.out.println();
		n.printE();
		System.out.println();
		n.printB();
		System.out.println();
		n.printI();
	}

}
