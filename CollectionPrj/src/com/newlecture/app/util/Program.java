package com.newlecture.app.util;

public class Program {

	public static void main(String[] args) {
		// <> 안에는 Object형변환 가능한 클래스형식만 가능
		GList<Integer> list = new GList<>();
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
		//num = (Integer)list.get(1); 
	}
}
