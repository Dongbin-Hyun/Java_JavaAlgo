package ch01;

import java.util.Scanner;

public class P_19_1 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a, b, c, d;
		
		int e, f, g;
		
		int w, x, y, z;
		
		System.out.println("숫자를 입력하세요.");

		System.out.print("a : ");
		a = scanner.nextInt();

		System.out.print("b : ");
		b = scanner.nextInt();

		System.out.print("c : ");
		c = scanner.nextInt();

		System.out.print("d : ");
		d = scanner.nextInt();
		
		System.out.println("최댓값 : " + max4(a, b, c, d));
		
		System.out.println("숫자를 입력하세요.");

		System.out.print("e : ");
		e = scanner.nextInt();

		System.out.print("f : ");
		f = scanner.nextInt();

		System.out.print("g : ");
		g = scanner.nextInt();

		System.out.println("최솟값 : " + min3(e, f, g));
		
		System.out.println("숫자를 입력하세요.");

		System.out.print("w : ");
		w = scanner.nextInt();
		
		System.out.print("x : ");
		x = scanner.nextInt();

		System.out.print("y : ");
		y = scanner.nextInt();

		System.out.print("z : ");
		z = scanner.nextInt();
		
		System.out.println("최솟값 : " + min4(w, x, y, z));

		
		
		

	}

	public static int max4(int a, int b, int c, int d) {

		int maxFirst = 0;
		int maxSecond = 0;
		int maxResult = 0;

		if(a >= b) {
			maxFirst = a;
		} else {
			maxFirst = b;
		}

		if(c >= d) {
			maxSecond = c;
		} else {
			maxSecond = d;
		}

		if (maxFirst >= maxSecond) {
			maxResult = maxFirst;
		} else {
			maxResult = maxSecond;
		}

		return maxResult;

	}
	
	public static int min3(int a, int b, int c) {
		
		int minResult = 0;
		
		if(a >= b) {
			minResult = b;
		} else {
			minResult = a;
		}
		
		if(minResult >= c) {
			minResult = c;
		}
		
		return minResult;
	}
	
	public static int min4(int a, int b, int c, int d) {
		
		int minA = 0;
		int minB = 0;
		int minResult = 0;
		
		if (a >= b) {
			minA = b;
		} else {
			minA = a;
		}
		
		if(c >= d) {
			minB = d;
		} else {
			minB = c;
		}
		
		if(minA >= minB) {
			minResult = minB;
		} else {
			minResult = minA;
		}
		
		return minResult;
	}

}
