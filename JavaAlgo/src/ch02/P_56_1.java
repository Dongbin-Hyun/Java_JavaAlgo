package ch02;


import java.util.Scanner;

public class P_56_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		int people = (int) (Math.random()*100) + 1;
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수 : " + people);
		
		int[] height = new int[people];
		
		System.out.println("키 값은 아래와 같습니다.");
		
		for(int i = 0; i < height.length; i ++) {
			height[i] = 100 + (int)(Math.random()*100);
			System.out.println("height[" + i +"] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxHeight(height));
		
		

	}
	
	public static int maxHeight(int[] height) {
		
		int max = 0;
		
		for(int i = 0; i < height.length; i ++) {
			if(height[i] > max) {
				max = height[i];
			}
		}
		return max;
		
	}

}
