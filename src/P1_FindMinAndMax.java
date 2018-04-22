
/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;

public class P1_FindMinAndMax {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		// YOUR CODE STARTS HERE
		int SENTINEL = -1;
		System.out.print("Type a number (or " + SENTINEL + " to stop): ");

		int input = console.nextInt();

		while (input != SENTINEL) {
			if (input < min) {
				min = input;
			} else if (input > max) {
				max = input;
			}

			System.out.print("Type a number (or " + SENTINEL + " to stop): ");
			input = console.nextInt();
		}
		// YOUR CODE ENDS HERE

		System.out.println("Maximum was " + max);
		System.out.println("Minimum was " + min);
	}

}
