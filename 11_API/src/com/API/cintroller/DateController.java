package com.API.cintroller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {

	public static void main(String[] args) {
		// java 에서 날짜 처리하기
		// java.util패키지의 Date, Calendar, GregorianCalendar 클래스 이용
		// Data - > util.Data (자바프로그래밍)/ java.sql.date(DB연동날짜)
		// java 8버전
		// java.util.time패키지
		// LocalDate, LocalTime, LocalDateTime 클래스 추가

		// 오늘날짜 출력
		Date today = new Date();
		System.out.println(today);
		// long값을 대입해서 생성하기
		// 초기값이다.이때부터시작하자 정한 날짜
		today = new Date(0);
		System.out.println(today);
		// 숫자를넣어서 변경가능
		today = new Date(1234567890L);
		System.out.println(today);
		// 출력결과
		// Wed Mar 22 10:40:32 KST 2023
		// Thu Jan 01 09:00:00 KST 1970
		// Thu Jan 15 15:56:07 KST 1970

		// Calendar클래스 이용하기
		// Calendar클래스는 추상클래스임
		// Calendar c = new Calendar(); <- 직접생성이 불가능하다.
		Calendar c = Calendar.getInstance();
		// 캘린더가 가지고있는 필드들을 전부 출력해준다.
		System.out.println(c);
		// 내가원하는 데이터 출력하기
		// 년월일을 출력하려면 각 데이터를 따로 가져와야함.
		// get(필드값)
		System.out.println("년 : " + c.get(Calendar.YEAR));
		// 월 은 +1을해줘야한다 왜나면 0이 1이고 1이2이기때문이다 배열과비슷하다.
		System.out.println("월 : " + (c.get(Calendar.MONTH) + 1));
		System.out.println("일 : " + c.get(Calendar.DATE));
		System.out.println("시 : " + c.get(Calendar.HOUR));
		System.out.println("분 : " + c.get(Calendar.MINUTE));
		System.out.println("초 : " + c.get(Calendar.SECOND));
		// 출력결과
		// 년 : 2023
		// 월 : 3
		// 일 : 22
		// 시 : 10
		// 분 : 47
		// 초 : 9

		// 변수에 넣을수도있다.
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		System.out.println(year + "년 " + month + "월 " + date + "일");
		// 출력결과
		// 2023년 2월 22일

		// Calendar에 원하는 날짜 세팅하기
		// Calendar().set(항목,설정값) 메소드를 이용
		// 생성과동시에불가능 생성후가능
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(Calendar.YEAR, 1998);
		birthDay.set(Calendar.MONTH, 8 - 1);
		birthDay.set(Calendar.DATE, 3);
		year = birthDay.get(Calendar.YEAR);
		month = birthDay.get(Calendar.MONTH) + 1;
		date = birthDay.get(Calendar.DATE);
		System.out.println(year + "년 " + month + "월 " + date + "일");
		// 출력결과
		// 1998년 8월 3일

		// GregorianCalendar클래스 이용 향상된 캘린더
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		// 날짜값을 가져오려면 get메소드를 이용해야한다.
		System.out.println("년 : " + gc.get(Calendar.YEAR));
		gc.set(Calendar.YEAR, 1998);
		System.out.println("년 : " + gc.get(Calendar.YEAR));
		// 생성과동시에 날짜를 설정할수 있음
		gc = new GregorianCalendar(1998, 8 - 1, 16);
		System.out.println("년 : " + gc.get(Calendar.YEAR));
		System.out.println("월 : " + (gc.get(Calendar.MONTH) + 1));
		System.out.println("일 : " + gc.get(Calendar.DATE));

		// Date 클래스와 Calendar, GreorianCalendar 호환
		Date dday = new Date(c.getTimeInMillis());
		System.out.println(dday);
		dday = new Date(gc.getTimeInMillis());
		System.out.println(dday);
		// 출력결과
		// Wed Mar 22 11:22:10 KST 2023
		// Sun Aug 16 00:00:00 KST 1998

		// 날짜클래스를 원하는 패턴의 문자열로 변경해주는 클래스를 제공
		// SimpleDateFormat 클래스
		// 지정 기호
		// y : 년
		// M : 월
		// d : 일
		// E : 요일
		// h : 시간
		// m : 분
		// s : 초
		// SSS : 밀리세컨초

		// 생성할때 패턴 정해놓을수 있다.
		// Calendar c =Calendar.getInstance();
		// GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		// 매개변수로 Date클래스를 선언해놓음
		String dateStr = sdf.format(new Date(c.getTimeInMillis()));
		System.out.println(dateStr);
		// 이런식으로 매개변수에넣어서 출력가능
		dateStr = sdf.format(new Date(gc.getTimeInMillis()));
		System.out.println(dateStr);
		// 출력결과
		// 2023년 03월 22일 11:31:02
		// 1998년 08월 16일 12:00:00

		// Web에서는 날짜데이터가 문자열처리
		// 1997-12-21 -> Date로변환하기
		String birthStr = "1997-12-21";
		String[] birthArr = birthStr.split("-");
		GregorianCalendar inputDate = new GregorianCalendar(Integer.parseInt(birthArr[0]),
				Integer.parseInt(birthArr[1])-1, Integer.parseInt(birthArr[2]));
		dateStr =sdf.format (inputDate.getTime());
		System.out.println(dateStr);
		//출력결과
		//1997년 12월 21일 12:00:00

		
		
		//SimpleDateFormat클래스가 제공하는 메소드 이용하기
		//parse()
		SimpleDateFormat convert = new SimpleDateFormat("yyyy-MM-dd");
		try {
			dday=convert.parse(birthStr);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(dday);
		
		//java8버전부터 날짜처리하는 클래스를 추가함
		//java.time패키지에서 제공함
		LocalDate ld = LocalDate.now();//현재날짜
		System.out.println(ld);
		//원하는 날짜를 세팅하기
		ld = LocalDate.of(1999, 04, 16);
		System.out.println(ld);
		//출력결과
		//1999-04-16
		//년, 월, 일 출력하기
		year = ld.getYear();
		month = ld.getMonthValue();
		date = ld.getDayOfMonth();
		System.out.println(year+ "."+month+"."+date);
		//출력결과
		//1999.4.16
		
		//LocalTime : 시간에 대한 설정하는 클래스
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		//시간을 설정해서 출력하기
		lt = LocalTime.of(12, 50,00);
		System.out.println(lt);
		//시간 , 분, 초 따로 출력하기
		lt = LocalTime.now();
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		//출력결과
		//12:12:31.688726300
		
		//12:50
		
		//12
		//12
		//31
		
		//LocalDateTime클래스 : 날짜와 시간을 모두 저장하는 클래스
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ldt);
		ldt = LocalDateTime.of(2000,12,16,11,30);
		System.out.println(ldt);
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getHour());
		//출력결과
		//2000-11-16T11:30
		//2000
		//12
		//11
		
		
		//날짜사의 간격을 계산해주는 메소드 이용하기
		long result = ChronoUnit.DAYS.between(ldt, LocalDateTime.now());
		System.out.println("살아온 날 : "+result);
		result = ChronoUnit.MONTHS.between(ldt, LocalDateTime.now());
		System.out.println("살아온 개월 : "+result);
		//출력결과
		//살아온 날 : 8161
		//살아온 개월 : 268
		
		//DB연동해야함 java.sql.Date클래스를 이용함.
		
		//LocalDate -> Date 
		Date temp = java.sql.Date.valueOf(LocalDate.now());
		System.out.println(temp);
		//LoclaDateTime -> Date
		temp=java.sql.Timestamp.valueOf(ldt);
		System.out.println(temp);
		//출력결과
		//2023-03-22
		//2000-12-16 11:30:00.0
		
		//Date - > LocalDate
		LocalDate ld2 = new java.sql.Date(gc.getTimeInMillis()).toLocalDate();
		System.out.println(ld2);
		//Date - > LocalDateTime
		LocalDateTime ldt2 = 
				new java.sql.Timestamp(new Date().getTime()).toLocalDateTime();
		System.out.println(ld2);
		//출력결과
		//1998-08-16
		//1998-08-16
		
		
		

		
		

	}

}
