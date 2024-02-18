package com.newlecture.app.util;

public class Program {

	public static void main(String[] args) {
		ObjectList list = new ObjectList();
		list.add(3);
		list.add(5);
		int size = list.size();
		System.out.println("size : " + size);
		list.clear();
		size = list.size();
		System.out.println("size : " + size);
		list.add(7);
		// Object -> Integer
		int num = (Integer)list.get(0); 
		System.out.println("num : " + num);
		num = (Integer)list.get(1); 
	}
}
