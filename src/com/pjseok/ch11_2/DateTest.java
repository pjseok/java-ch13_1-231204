package com.pjseok.ch11_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		System.out.println(now);
		String nowTime = now.toString();
		
		SimpleDateFormat sip = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 ss초");
		System.out.println(sip.format(now));
		
		
		
		
		
	}

}
