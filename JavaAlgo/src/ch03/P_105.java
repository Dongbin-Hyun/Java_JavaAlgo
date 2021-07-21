package ch03;

import java.util.Scanner;

public class P_105 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		
		System.out.print("요솟수 : ");
		int size = scanner.nextInt();
		
		int[] x = new int[size + 1];
		
		for(int i = 0; i < x.length - 1; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scanner.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int searchValue = scanner.nextInt();
		
		int result = HowToCount(x, size, searchValue);
		
		if(result == -1) {
			
			System.out.println("검색에 실패했습니다.");
			
		} else {
			
			System.out.println(searchValue + "은(는) x[" + result +"]에 있습니다.");
			
		}
		
		System.out.println("계속하시겠습니까? 1.네 0.아니오");	
		retry = scanner.nextInt();
		
		if(retry == 0) {
			System.out.println("종료합니다.");
		}
		
		} while(retry == 1);

		

	}
	
	public static int HowToCount(int[] x, int n, int searchValue) {
		
		x[n] = searchValue;
		
		for(int i = 0; i < x.length; i ++) {
			
			if (x[i] == searchValue) {
				
				return i;
				
			}
			
		}
		
		return -1;
	}

}
