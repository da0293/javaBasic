package com.newlecture.app.util;

public class GList<T> {
	
	private Object[] nums;
	private int current; 
	private int capacity; // 용량
	private int amount; // 추가 증가량 
	
	public GList() {
		current = 0; 
		capacity = 3; 
		amount = 5; 
		nums = new Object[capacity]; 
	}
	
	public void add(T num) {
		/*
			if(공간이 부족한지) {
				공간을 늘림 
				1. amount개 확장한 새로운 배열 temp를 생성한다.
				2. list에 있는 데이터를 temp배열로 옮긴다.
				3. temp가 참조하는 객체를 list가 참조하게 한다.
				4. 현재 capacity의 값을 amount만큼 증가시킨다.
			}
		*/
		if(current >= capacity) {
			Object[] temp = new Object[capacity+amount]; 
			for( int i=0; i<current; i++) {
				temp[i]=nums[i]; 
			}
			nums=temp;
			capacity+=amount; 
		}
		nums[current++] = num; 
	}

	public void clear() {
		current=0; 
	}

	public int size() {
		return current;
	}

	public T get(int index) {
		if(current <= index)
			throw new IndexOutOfBoundsException();
		return (T)nums[index]; 
	}

}
