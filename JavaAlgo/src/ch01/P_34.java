package ch01;

import java.util.Scanner;

public class P_34 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int number = scanner.nextInt();
		
		if (number < 10 || number > 99) {
			System.out.println("잘못된 값을 입력했습니다.");
			
		}
		else {
			System.out.println(number + "을 입력하셨습니다.");
		}
		
		

	}

}
