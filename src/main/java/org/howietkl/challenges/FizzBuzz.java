package org.howietkl.challenges;

public class FizzBuzz {

	public FizzBuzz() {}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; ++i) {
			if (i % 3 == 0) {
				System.out.print("Fizz");
				if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println();
				}
			} else if (i % 5 == 0) {
					System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
