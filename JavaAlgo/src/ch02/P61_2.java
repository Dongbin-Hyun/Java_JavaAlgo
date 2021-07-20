package ch02;

import java.util.Scanner;

public class P61_2 {

	public static void main(String[] args) {

		System.out.println("합계 : " + sumOf());



	}

	static int sumOf() {
		
		int sum = 0;

		int size = (int)(Math.random()*10 + 1);

		int[] numbers = new int[size];
		
		for(int i = 0; i < numbers.length;  i ++) {
			numbers[i] = (int)(Math.random()*100);
			System.out.print(numbers[i] + " ");
			sum += numbers[i];
			}
		System.out.println();

		return sum;
	}

}
