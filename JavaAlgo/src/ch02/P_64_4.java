package ch02;

import java.util.Scanner;

public class P_64_4 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int sizeB = (int)(Math.random()*10 + 1);
				
		int[] b = new int[sizeB];
		
		int[] a = new int[sizeB];
		
		
		
		System.out.print("배열 b => ");
		
		for(int i = 0; i < b.length; i ++) {
			b[i] = (int)(Math.random()*100);
			System.out.print(b[i] + " ");
			
		}
		
		System.out.println();
		
		copy(a, b);
		
	}
	
	static void copy(int[] a, int[] b) {
		
		System.out.print("배열 a => ");
		
		for(int i = 0; i < b.length; i ++) {
			
			a[i] = b[i];
			
			System.out.print(a[i] + " ");
			
		}
		
	
		
		
	}

}
