package com.newlecture.app.util;

public class IntList {
	
	private int[] nums;
	//  현재 리스트에 추가할 위치 
	private int current; 
	
	public IntList() {
		nums = new int[3]; 
		current = 0; 
	}
	
	public void add(int num) {
		nums[current++] = num; 
	}

	public void clear() {
		// current 변수를 0으로 설정하여 리스트가 비어 있음을 나타냄
		// 현재 위치를 초기화
		current=0; 
	}

	public int size() {
		return current;
	}

	public int get(int index) {
		// <= 인 이유
		// 현재 데이터가 3개라면 current는 3이지만 인덱스는 2까지 있기때문
		if(current <= index)
			throw new IndexOutOfBoundsException();
		return nums[index]; 
	}

}
