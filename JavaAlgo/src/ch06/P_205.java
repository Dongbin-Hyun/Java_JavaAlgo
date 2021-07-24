package ch06;

import java.util.Scanner;

public class P_205 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int retry;

		do {

			System.out.println("버전 2");

			System.out.print("요솟수 : ");
			int number = scanner.nextInt();

			int[] arr = new int[number];

			for(int i = 0; i < arr.length; i ++) {

				System.out.print("arr[" + i + "] = ");
				arr[i] = scanner.nextInt();

			}

			sort(arr);

			System.out.println("오름차순 정렬");

			for(int i = 0; i < arr.length; i ++) {

				System.out.println("arr[" + i + "] = " + arr[i]);


			}
			
			System.out.println("1.계속 0.종료");
			retry = scanner.nextInt();
			
			if(retry == 0) {
				
				System.out.println("종료");
				
			}

		} while(retry == 1);

	}

	public static void change(int[] arr, int a, int b) {

		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;

	}

	public static void sort(int[] arr) {

		for(int i = 0; i < arr.length - 1; i ++) {

			int exchg = 0;

			for(int j = arr.length - 1; j > i; j --) {

				if(arr[j - 1] > arr[j]) {

					change(arr, j - 1, j);

					exchg ++;

				}

			}

			if (exchg == 0) {

				break;

			}

		}

	}

}
