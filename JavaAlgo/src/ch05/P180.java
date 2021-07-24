package ch05;

import java.util.Scanner;

public class P180 {

	public static Scanner scanner = new Scanner(System.in);
	
	
	public static void main (String [] args) {

		int retry;
		

			do {

				System.out.print("원반의 갯수를 입력하세요. ");

				int number = scanner.nextInt();

				hanoi(number, 1, 2, 3);
				

				System.out.print("1. 계속 0. 종료");
				retry = scanner.nextInt();

				if (retry == 0) {

					System.out.println("종료");

				}

			} while(retry == 1);

	}

	public static void hanoi(int i, int from, int mid, int to){
		

		if(i == 1) {
			System.out.println(i + "을 " + from + "에서 " + to + "로 옮깁니다.");
		} else {
			hanoi(i-1, from, to, mid);
			System.out.println(i + "을(를) " + from + "에서 " + to + "로 옮깁니다.");
			hanoi(i-1, mid, from, to);
			
		}


	}



}
