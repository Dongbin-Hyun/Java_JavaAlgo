package ch05;

import java.util.Scanner;

public class P166 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int retry;

		do {

			System.out.print("숫자를 입력하세요.");
			int number = scanner.nextInt();

			if(number < 0) {

				System.out.println("0이상의 정수를 입력해주세요.");

			} else {

				System.out.println(number + "! = " + factorial(number));

			}

			System.out.println("1.계속 0.종료");
			retry = scanner.nextInt();

			if(retry == 0) {

				System.out.println("종료");

			}

		} while(retry == 1);




	}

	public static int factorial(int number) {

		if(number == 0) {

			return 1;

		} else {

			return number * factorial(number - 1);

		}


	}





}
