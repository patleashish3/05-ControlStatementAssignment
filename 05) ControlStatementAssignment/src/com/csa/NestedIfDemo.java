package com.csa;

public class NestedIfDemo {
	public static void main(String[] args) {
		int i = 20;
		if (true) {
			// first if statement
			if (i < 15)
				System.out.println("i is smaller than 15");
			// Nested if statement
			// will only be executed if ststement above
			// it is true
			if (i < 12)
				System.out.println("i is smaller than 12 too");
			else {
				System.out.println("i is greater than15");
			}
		}
	}

}
