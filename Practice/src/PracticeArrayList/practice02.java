package PracticeArrayList;

public class practice02 {
/**
	3-2)	향상된 for문을 이용해서 숫자 출력하기 
			int[] numbers = 1.2.3.4.5
 */
	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5};
				
//		ArrayList<Object> numArray = new ArrayList<>();
	
		// 일반 for문
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print(" " + numbers[i]);
			
		}

		System.out.println("");
		
		// 향상된 for문
		for (int num : numbers) {
			System.out.print(" " + num);
		}
	}
}
