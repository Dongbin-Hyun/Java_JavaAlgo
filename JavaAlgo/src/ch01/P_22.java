package ch01;

import java.util.Scanner;

public class P_22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int number = scanner.nextInt();
		
		if (number > 0) {
			System.out.println(number + "은 양수입니다.");
		}
		else if (number == 0) {
			System.out.println(number + "은 0입니다.");
		}
		else {
			System.out.println(number + "은 음수입니다.");
		}

	}

}
