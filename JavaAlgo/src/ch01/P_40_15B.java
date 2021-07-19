package ch01;

import java.util.Scanner;

public class P_40_15B {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자 : ");
		int number = scanner.nextInt();
		
		for(int i = number; i > 0; i --) {
			for(int j = 1; j <= i; j ++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
