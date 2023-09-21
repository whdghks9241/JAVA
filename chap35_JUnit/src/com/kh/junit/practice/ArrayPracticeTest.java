package com.kh.junit.practice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayPracticeTest {

	private ArrayPractice ap = new ArrayPractice();
	
	@Before
	public void testBefor() {
		System.out.println("테스트 시작!");
	}
	
	@After
	public void tearDown() {
		System.out.println("테스트 종료!");
	}
	
	@Test
	public void arrayTestChap1() {
		int[] expected = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};

		assertEquals(expected, ap.getArray());
	}
	
	@Test
	public void arrayTestChap2() {
		String[] expected = {"사과", "귤", "포도", "복숭아", "참외"};
		
		assertArrayEquals(expected, ap.getArray2());
	}
	
	@Test
	public void StringTestChap1() {
		String str = "월";
		assertEquals (str , ap.getArray3());
		
	}
	
	@Test
	public void getIntTestChap1() {
		int i = 55;
		assertEquals (i , ap.getIntTest());
	}
}
