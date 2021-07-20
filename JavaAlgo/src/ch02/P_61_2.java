package ch02;

public class P_61_2 {

	public static void main(String[] args) {
		
		int size = (int)(Math.random()*10) + 1;
		
		int[] elements = new int[size];
		
		for (int i = 0; i < elements.length ; i ++) {
			elements[i] = (int)(Math.random()*100);
			System.out.print(elements[i] + " ");
		}
		
		System.out.println();
		
		reverseElement(elements);
		
		System.out.println("역순 정렬을 마쳤습니다.");
		
		System.out.println();

	}
	
	public static void changeElement(int[] elements, int x, int y) {
		
		int element = elements[x];
		elements[x] = elements[y];
		elements[y] = element;
		
	}
	
	public static void reverseElement(int[] elements) {
		
		for(int i = 0; i < elements.length / 2; i ++) {
			System.out.println("a[" + i + "]과(와) a[" + (elements.length-i-1) + "]를 교환합니다.");
			changeElement(elements, i, elements.length - i - 1);
			for(int j = 0; j < elements.length; j ++) {
				System.out.print(elements[j] + " ");
			}
			System.out.println();
		}	
		
	}

}
