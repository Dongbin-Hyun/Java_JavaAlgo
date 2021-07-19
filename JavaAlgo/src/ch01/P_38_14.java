package ch01;

import java.util.Scanner;

public class P_38_14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		System.out.print("Number : ");
		int number = scanner.nextInt();
		
		for(int i = 1; i <= number; i ++) {
			for (int j = 1; j <= number; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
