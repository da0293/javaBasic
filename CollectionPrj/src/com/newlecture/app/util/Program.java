package com.newlecture.app.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// <> 안에는 Object형변환 가능한 클래스형식만 가능
		//GList<Integer> list = new GList<>();
		List<Integer> list = new ArrayList<>();
		// 값이 들어가면 별도의 식별자가 할당되는데 그것은 인덱스다.
		list.add(3); // 인덱스 0 
		list.add(5); // 인덱스 1
		list.add(6); // 인덱스 2
		list.add(7); // 인덱스 3
		list.add(7); // 인덱스 4
		list.add(7); // 인덱스 5
		System.out.println(list.get(2)); // 2번 인덱스 값 가져오기 
		System.out.println(list.size()); // 6 
		
		Set<Integer> set = new HashSet<>();
		// 값 자체가 키가 된다.
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(7);
		// 이미 들어간 값은 추가할 수 없다. 중복제거
		set.add(7); 
		set.add(7); 
		System.out.println(set.add(7)); // false
		System.out.println(set.size()); // 4 
		System.out.println(set.add(8)); // true
		System.out.println(set.size()); // 5 
		
		Map<String, Object> map = new HashMap<>();
		map.put("id", 3); 
		map.put("title", "Hello"); 
		map.put("hit", 12); 
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
	}
}
