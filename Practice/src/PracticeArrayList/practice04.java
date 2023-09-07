package PracticeArrayList;

public class practice04 {
/**

	3-4)	문자열 배열을 사용해서 향상된 for문으로 문자열 배열의 요소 중에 가장긴 문자열을 찾아 출력 -> if 문써서 length보다 크면 출력하기
			String[] ss = {"apple", "banan", "cherry", "elderberry"}
			for (String str : ss) {
				if () {

				}
			}
 */
	
	public static void main(String[] args) {
		// String 배열
		String[] strList = {"apple", "banan", "cherry", "elderberry"};
	
				
		for (String str : strList) {
			
			if (str.length() >= 10) {
				System.out.println("출력 : " + str);
			}
		}
	}
}
