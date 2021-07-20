package ch02;

import java.util.Scanner;

public class P_60 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요솟값 : ");
		int input = scanner.nextInt();
		
		int[] elements = new int[input];
		
		for(int i = 0; i < elements.length; i ++) {
			System.out.print("x[" + i + "] : ");
			elements[i]= scanner.nextInt();
		}
		
		reverseNumber(elements);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		
		for (int i = 0; i < elements.length; i ++) {
			System.out.println("x{" + i +"] : " + elements[i]);
		}

	}
	
	public static void changeNumber(int[] elements, int x, int y) {
		
		int number = elements[x];
		elements[x] = elements[y];
		elements[y] = number;
		
	}
	
	public static void reverseNumber(int[] elements) {
		
		for(int i = 0; i < elements.length / 2; i ++) {
			changeNumber(elements, i, elements.length - 1 - i);
		}
		
	}

}
