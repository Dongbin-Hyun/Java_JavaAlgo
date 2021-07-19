package ch01;

import java.util.Scanner;

public class P_13 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		int max = a;
		
		if (max <= b) {	
			max = b;	
		}
		
		if (max <= c) {		
			max = c;		
		}
		
		System.out.println("max = " + max);
		
		System.out.println("Method max = " + maxValue(4, 5, 6));
		
		System.out.println("Mid : " + midValue(7, 8, 9));
		
		

	}
	
	public static int maxValue (int a, int b, int c) {
		
		int max = a;
		
		if (max <= b) {	
			max = b;	
		}
		
		if (max <= c) {	
			max = c;	
		}
		
		return max;
		
	}
	
	public static int midValue (int a, int b, int c) {	
		
		if (a >= b) {
			if (c >= a) {	
				return a;	
			} else if (b >= c) { 	
				return b;		
			} else {		
				return c;		
			}			
		} else if (a > c) {	
			return a;	
		} else if (b > c) {			
			return c;
		}		
		else {		
			return b;		
		}		
	}
	
	


}
