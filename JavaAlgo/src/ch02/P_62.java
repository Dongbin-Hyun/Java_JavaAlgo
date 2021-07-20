package ch02;

import java.util.Scanner;

public class P_62 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		

	}
	
	public static void equalsOrNot(int[] a, int[] b) {
		
		System.out.print("배열 a의 요솟수 : ");
		int sizeA = scanner.nextInt();
		
		a = new int[sizeA];
		
		for(int i = 0; i < a.length; i ++) {
			System.out.print("a[" + i + "]");
			a[i] = scanner.nextInt();
			
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int sizeB = scanner.nextInt();
		
		b = new int[sizeB];
		
		for(int i = 0; i < a.length; i ++) {
			System.out.print("b[" + i + "]");
			a[i] = scanner.nextInt();
			
		}
		
		
		
		
		
		
	}

}
