package ch01;

import java.util.Scanner;

public class P_40_16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자 : ");
		int number = scanner.nextInt();
		
		for(int i = 0; i < number; i ++) {
			for(int j = 0; j < number-1-i; j ++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
