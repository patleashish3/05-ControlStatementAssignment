package com.csa;

public class BreakLabelDemo {
	public static void main(String[] args) {
		boolean t = true;
		// label first
		first: {
			// illegal statement here as label second is not
			// introduced yet break second
			second: {
				third: {
					// before break
					System.out.println("Before the Break Statement");
					// break will take control out of
					// second label
					if (t)
						break second;
					System.out.println("This won't execute");
				}
				System.out.println("This won't execute");
			}
			// Third block
			System.out.println("This is after second block");

		}

	}
}
