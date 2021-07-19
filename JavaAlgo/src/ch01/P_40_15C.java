package ch01;

import java.util.Scanner;

public class P_40_15C {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자 : ");
		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {								
			for (int j = 1; j <= i - 1; j++) {			
				System.out.print(" ");
			}
			for (int j = 1; j <= number - i + 1; j++) {		
				System.out.print("*"); 				
			}
			System.out.println();
		}

	}

}
