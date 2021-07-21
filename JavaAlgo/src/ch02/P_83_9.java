package ch02;

import java.util.Scanner;

public class P_83_9 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		int year;
		int month;
		int day;
		
		System.out.println("그 해 남은 일 수 구하기");
		
		do {
		System.out.print("연도 : ");
		year = scanner.nextInt();
		System.out.print("월 : ");
		month = scanner.nextInt();
		System.out.print("일 : ");
		day = scanner.nextInt();
		
		System.out.println(subtract(year, month, day) + "일 남았습니다.");
		
		System.out.print("다시 시도하시겠습니까?");
		retry = scanner.nextInt();
		
		if (retry == 0) {
			System.out.println("종료합니다.");
		}
		
		} while (retry == 1);

	}
	
	public static int lunarCheck(int year) {
		
		if(year % 4 == 0 && year != 100 || year % 400 ==0) {
			return  1;//윤년
		}
		
		return 0;//평년
		
	}
	
	public static int sumDay(int year, int month, int day) {
		
		int lunarOrNot = lunarCheck(year);
		
		//System.out.println(lunarOrNot);
		
		int sum = 0;
		
		
		int[][] calList = {
						{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},//0
						{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}//1				
		};
		
		for(int i = 0; i < month - 1; i ++) {
			
			sum += calList[lunarOrNot][i];
		}
		
		//System.out.println(sum);
		
		sum += day;

		return sum;
		
	}
	
	public static int subtract(int year, int month, int day) {
		
		int totalDay = 0;
		
		if (lunarCheck(year) == 0) {
			totalDay = 365;
		} else if (lunarCheck(year) == 1) {
			totalDay = 366;
		}
		
		int result = totalDay - sumDay(year, month, day);
		
		
		return result;
	}

}
