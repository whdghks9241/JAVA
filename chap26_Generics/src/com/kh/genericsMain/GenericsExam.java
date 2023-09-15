package com.kh.genericsMain;

public class GenericsExam {

	public static void main(String[] args) {
		// Á¤¼öÇü µ¥ÀÌÅÍ¸¦ ÀúÀåÇÏ´Â Box ÀÎ½ºÅÏ½º »ı¼º
		Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(16478);
		
		int intValue =intBook.get(); // Çüº¯È¯ÀÌ ÇÊ¿ä ¾ø´Ù.
		
		// ¹®ÀÚ¿­ µ¥ÀÌÅÍ¸¦ ÀúÀåÇÏ´Â Book ÀÎ½ºÅÏ½º »ı¼º
		Book<String> strBook = new Book<>();
		strBook.put("¿¡Âm");
		strBook.put("¿¡ÇìÇìÇì");
		strBook.put("À¸È÷È÷ÆRÈ÷ÆR");
		strBook.put("¿¡Èå¿¡Çì¿¨");
		strBook.put("¿¡Âm´ëÀ");
		
		String strValue = strBook.get(); // Çüº¯È¯ ÇÒ ÇÊ¿ä ¾øÀ½
		
		// Á¦³Ê¸¯ Å¬·¡½º¸¦ »ç¿ëÇØ¼­ ´Ù¾çÇÑ µ¥ÀÌÅÍ À¯ÇüÀ» Ã³¸®ÇÒ ¼ö ÀÖ°í Ãâ·ÂÇÒ¼ö ÀÖÀ½
		System.out.println("Int Value  :  " + intValue);
		System.out.println("String Value  :  " + strValue);
	}
}
