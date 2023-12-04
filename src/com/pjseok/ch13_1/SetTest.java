package com.pjseok.ch13_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("홍길동");		
		set.add("김유신");		
		set.add("홍길동"); // set은 index가 없다.
		set.add("이순신");
		
		
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext());
			String result = iterator.next(); // 1개씩 객체를 반환함
			System.out.println(result);
		
	}

}
