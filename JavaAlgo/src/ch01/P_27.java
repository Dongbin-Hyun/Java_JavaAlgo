package ch01;

import java.util.Scanner;

public class P_27 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int sum = 0;
		
		for (int i=0; i < number+1; i++) {
			sum = sum + i;
		}
		
		System.out.println("합계 : " + sum);

	}

}
