package ch02;

import java.util.Scanner;

public class P_62 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		equalsOrNot();
		
	}

	public static void equalsOrNot() {
		
		boolean result = true;

		System.out.print("배열 a의 요솟수 : ");
		int[] a;
		int[] b;


		int sizeA = scanner.nextInt();

		a = new int[sizeA];

		for(int i = 0; i < a.length; i ++) {
			System.out.print("a[" + i + "] : ");
			a[i] = scanner.nextInt();

		}

		System.out.print("배열 b의 요솟수 : ");
		int sizeB = scanner.nextInt();

		b = new int[sizeB];

		for(int i = 0; i < b.length; i ++) {
			System.out.print("b[" + i + "] : ");
			b[i] = scanner.nextInt();

		}

		if(a.length != b.length) {

			result = false;

		}

		for(int i = 0; i < a.length; i ++) {

			if(a[i] != b[i]) {
				
				result = false;
				
			}

		}
		
		if(result == true) {
			System.out.println("배열 a와 b는 같습니다.");
		} else {
			System.out.println("배열 a와 b는 같지 않습니다.");
		}

	}

}
