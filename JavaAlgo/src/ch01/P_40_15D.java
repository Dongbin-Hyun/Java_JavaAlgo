package ch01;

import java.util.Scanner;

public class P_40_15D {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자 : ");
		int number = scanner.nextInt();
		
		for (int i = 1; i <= number; i++) { 
			for (int j = number; j >= 0; j--) {
				if (i <= j) { 
					System.out.print(" ");
				}else {	
					System.out.print("*");
				}
			}
	        System.out.println();
		}

	}

}
