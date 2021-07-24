package ch06;

import java.util.Scanner;

public class P_202_203_207_min {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int retry;

		do {

			System.out.println("내림차순");

			System.out.print("요솟수 : ");
			int number = scanner.nextInt();

			int[] x = new int[number];

			for(int i = 0; i < x.length; i ++) {

				System.out.print("x[" + i + "] : ");
				x[i] = scanner.nextInt(); 

			}

			sort(x, number);

			System.out.println("내림차순으로 정렬했습니다.");


			for(int i = 0; i < x.length; i ++) {

				System.out.println("x[" + i + "] = " + x[i]);

			}

			System.out.println("1. 계속 0. 종료");
			retry = scanner.nextInt();

			if(retry == 0 ) {
				System.out.println("종료");
			}

		} while(retry == 1);



	}

	public static void change(int[] x, int a, int b) {

		int tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;


	}

	public static void sort(int[] x, int n) {

		for(int i = 0; i < n - 1; i ++) {

			for(int j = n - 1; j > i; j --) {

				if(x[j - 1] < x[j]) {

					change(x, j - 1, j);

				}

			}


		}

	}



}
