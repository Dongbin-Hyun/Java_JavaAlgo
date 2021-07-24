package ch05;

import java.util.Scanner;

public class P170 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int retry;

		do {

			System.out.println("최대 공약수 문제");

			System.out.print("a : ");
			int a = scanner.nextInt();

			System.out.print("b : ");
			int b = scanner.nextInt();


			System.out.println("정답 : " + solution(a, b));

			System.out.print("1.계속 0.종료 ");

			retry = scanner.nextInt();

			if(retry == 0) {

				System.out.println("종료");

			}


		} while(retry == 1);




	}

	public static int solution(int a, int b) {

		int answer = 1;

		if(a >= b) {

			for(int i = 1; i<= b; i ++) {

				if(a % i == 0 && b % i == 0) {

					answer = i;

				}

			}

		} else {

			for(int i = 1; i<= a; i ++) {

				if(a % i == 0 && b % i == 0) {

					answer = i;

				}

			}

		}

		return answer;

	}

}
