package com.newlecture.app.util;

public class ObjectList {
	
	private Object[] nums;
	private int current; 
	
	public ObjectList() {
		nums = new Object[3]; 
		current = 0; 
	}
	
	public void add(Object num) {
		nums[current++] = num; 
	}

	public void clear() {
		current=0; 
	}

	public int size() {
		return current;
	}

	public Object get(int index) {
		if(current <= index)
			throw new IndexOutOfBoundsException();
		return nums[index]; 
	}

}
