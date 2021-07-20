package ch02;

public class P_44 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		//a[i] 따로 선언하지 않으면 0으로 초기화 0 -> a[0] & a[3] = 0
		
		for(int i = 0; i < a.length; i ++) {
			System.out.println("a[" + i + "]" + ":" + a[i]);
		}

	}

}
