package com.pjseok.ch13_1;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		Member member1 = new Member("홍길동", 27, "010-8888-1234", "경기도 성남시"); 
		Member member2 = new Member("이순신", 31, "010-9999-1234", "서울 용산구"); 
		Member member3 = new Member("김유신", 27, "010-7777-1234", "경기도 안양시"); 

		// 리스트 이름 memberList
		// List<Member> memberList = new ArrayList<Member>();
		
		ArrayList<Member> memberList = new ArrayList<Member>();
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		
		
		
		
		
		
		
	}

}
