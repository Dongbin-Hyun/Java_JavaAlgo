package ch02;

import java.util.Scanner;

public class P_81 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		int year;
		int month;
		int day;
		
		System.out.println("그 해 경과 일 수를 구합니다.");
		
		do {
		
		System.out.print("년 : ");
		year = scanner.nextInt();
		System.out.print("월 : ");
		month = scanner.nextInt();
		System.out.print("일 : ");
		day = scanner.nextInt();
		
		
		System.out.println("그 해 " + countDays(year, month, day) + "일 째 입니다.");
		
		System.out.print("한번 더 할까요? (1.예/0.아니오)");
		
		retry = scanner.nextInt();
		
		if (retry == 0) {
			System.out.println("종료합니다.");
		}
		
		} while (retry == 1);
		

	}
	
	public static int lunarCheck(int year) {
		
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return 1; // 윤년
		}
			
		return 0;//평
		
		
	}
	
	public static int countDays(int year, int month, int day) {
		
		int sumDay = 0;
		
		int lunarOrNot = lunarCheck(year);
		
		int[][] cal = {
						{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
						{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
						
		};
		
		for (int i = 0; i < month - 1; i ++) {
			
			sumDay += cal[lunarOrNot][i];
			
		}
		
		sumDay += day;
		
		
		
		return sumDay;
		
	}
		


}
