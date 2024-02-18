package com.newlecture.app.util;

public class Program {

	public static void main(String[] args) {
		IntList list = new IntList();
		list.add(3);
		list.add(5);
		int size = list.size();
		System.out.println("size : " + size);
		list.clear();
		size = list.size();
		System.out.println("size : " + size);
		list.add(7);
		int num = list.get(0); 
		System.out.println("num : " + num);
		num = list.get(1); // 데이터가 없음, 현재 0번째인덱스만 존재
	}
}
