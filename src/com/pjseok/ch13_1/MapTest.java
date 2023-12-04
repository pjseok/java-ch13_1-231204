package com.pjseok.ch13_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<String, Integer>(); // < > 안에는 클래스만 들어올 수 있다. (wrapper 클래스 Integer)
		
		map1.put("나이", 21);
		map1.put("월급", 200);
		map1.put("연봉", 2400);
		
		System.out.println(map1.get("월급"));
		
		Set<String> keyset = map1.keySet(); // map은 key값이 중복이 되면 안딘다. (중복값 제거)
		
		Iterator<String> iterator = keyset.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(map1.get(key));	
		}
		
	
	
	}

}
