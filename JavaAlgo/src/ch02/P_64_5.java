package ch02;

public class P_64_5 {

	public static void main(String[] args) {
		
		System.out.print("배열 b -> ");
		
		int sizeB = (int)(Math.random()*10 + 1);
		
		int[] b = new int[sizeB];
		
		for (int i = 0; i < b.length; i ++) {
			b[i] = (int)(Math.random()*100);	
			System.out.print(b[i] + " ");
		}
		System.out.println();

		int[] a = new int[sizeB];
		
		rcopy(a, b);
			

	}
	
	static void change(int[]b, int x, int y) {
		
		int firstNumber = b[x];
		b[x] = b[y];
		b[y] = firstNumber;
		
	}
	
	static void rcopy(int[] a, int[] b) {
		
		System.out.print("배열 a -> ");
		
		for(int i = 0; i < b.length / 2; i ++) {
			
			change(b, i, b.length - 1 - i);
			
		}
		
		for(int i = 0; i < b.length; i ++) {
			
			a[i] = b[i];
			
			System.out.print(a[i] + " ");
							
		}
		
	}
	


}
