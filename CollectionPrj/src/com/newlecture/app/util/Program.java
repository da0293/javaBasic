package com.newlecture.app.util;

public class Program {

	public static void main(String[] args) {
		// <> 안에는 Object형변환 가능한 클래스형식만 가능
		GList<Integer> list = new GList<>();
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		//num = (Integer)list.get(1); 
	}
}
