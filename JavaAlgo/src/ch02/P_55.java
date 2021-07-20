package ch02;

import java.util.Scanner;

public class P_55 {

	public static void main(String[] args) {
		//난수로 입력(Random)
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("사람 수 : ");
		int number = scanner.nextInt();
		
		System.out.println("키 값은 아래와 같습니다.");
		
		int[] height = new int[number];
		
		for (int i = 0; i < height.length; i ++) {
			height[i] = (int) (100 + Math.random()*100);
			System.out.println("height[" + i +"]:" + height[i]);
		}
		
		System.out.println("최댓값은 " + maxHeight(height) + "입니다.");
		
	
	}
	
	public static int maxHeight(int[] height) {
		
		int max = 0;
		
		for(int i = 0; i < height.length - 1; i ++) {
			if(height[i] > max) {
				max = height[i];
			}
		}
		
		return max;
		
	}

}
