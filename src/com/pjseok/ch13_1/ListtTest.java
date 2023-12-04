package com.pjseok.ch13_1;

import java.util.ArrayList;
import java.util.List;

public class ListtTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		List<String> list1 = new ArrayList<String>(); // 빈 리스트 생성
		
		list1.add("KOR");
		list1.add("JAP");
		list1.add("USA");
		
		list1.size(); // list1에 저장된 객체의 수 수
		// System.out.println(list1.size());
		
		// System.out.println(list1.get(1)); // 인덱스로 불러오기(출력하기)
		
		list1.remove(1);
		
		for (int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		
		
		
		
		
		

	}

}
