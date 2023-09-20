package com.kh.genericspractice;

import java.util.ArrayList;
import java.util.List;

public class items<T> {
	
	T content;
	public void put(T item, ArrayList<Object> list) {
		
		this.content = item;
		
		list.add(item);
	}
	
	public T get() {
		return content;
	}
	
}
