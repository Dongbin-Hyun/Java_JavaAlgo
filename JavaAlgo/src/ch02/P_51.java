package ch02;

import java.util.Scanner;

public class P_51 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		
		System.out.print("사람 수 : ");
		int people = scanner.nextInt();
		
		int[] height = new int[people];
		
			for(int i = 0; i < height.length; i ++) {
				System.out.print("height[" + i + "] : ");
				height[i] = scanner.nextInt();
			}
			
		System.out.println("최댓값은 " + maxHeight(height) + "입니다.");
	
	}
	
	public static int maxHeight(int[] a) {
		
		int max = 0;
		
		for(int i = 0; i < a.length - 1; i ++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}

}
