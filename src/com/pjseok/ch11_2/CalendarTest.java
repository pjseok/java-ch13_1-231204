package com.pjseok.ch11_2;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		//Calendar now = new Calendar(); // -> 추상클래스이므로 new 연산자 사용 불가
		Calendar now = Calendar.getInstance(); // 싱글톤 패턴(getinstance)
		
		int nowYear = now.get(Calendar.YEAR);// 현재 연도를 반환
		
		int month = now.get(Calendar.MONTH);
		int Day = now.get(Calendar.DAY_OF_MONTH);
		
	
	
	
	
	
	
	
	
	}

}
