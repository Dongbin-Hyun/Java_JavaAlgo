package ch06;

import java.util.Scanner;

public class P_210 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("단순 선택 정렬");
		
		System.out.print("요솟수 : ");
		int number = scanner.nextInt();
		
		int[] arr = new int[number];
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print("arr[" + i + "] = ");
			arr[i] = scanner.nextInt();
			
		}
		
		//sort_asc(arr);
		
		sort_dsc(arr);
		
		System.out.println("정렬");
		
		for(int i = 0; i < arr.length; i ++) {
			
			System.out.println("arr[" + i + "] = " + arr[i]);
			
		}
		

	}
	
	public static void change(int[] arr, int a, int b) {
		
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
		

	}
	
	public static void sort_asc(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i ++) {
			
			int min = arr[i];
			
			for(int j = arr.length - 1; j > i; j --) {
				
				if(min > arr[j]) {
					
					min = arr[j];
					
					change(arr, i, j);
					
				}
				
			}
			
		}
		
	}
	
	public static void sort_dsc(int[] arr) {
		
		for(int i = 0; i < arr.length; i ++) {
			
			int max = arr[i];
			
			for(int j = arr.length - 1; j > i; j --) {
				
				if(max < arr[j]) {
					
					max = arr[j];
					
					change(arr, i, j);
					
				}
				
			}
			
		}
		
	}
	
	

}
