package com.kh.finalSample;

import java.util.ArrayList;

public class MyMusic {
	
	public static void main(String[] ergs) {
		
		MyMusic MM = new MyMusic();
		MM.runFruit();
	}

	public void runFruit() {
		ArrayList<music> list = new ArrayList<music>();
		list.add(new music("¹ß¶óµå", "½½ÇÄ"));
		list.add(new music("´í½º" , "½Å³²"));
		list.add(new music("À½¾Ç" , "H"));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getType() + list.get(i).getEmotion());
		}
	}
}
