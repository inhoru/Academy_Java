package com.stream.controller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.stream.common.Gender;
import com.stream.vo.Student;

public class ReflectionController {

	public static void main(String[] args) {
		//선언되어있는 클래스에 대한 정보를 가져오는 기능
		//필드, 메소드
		//Class클래스이용
		Student s = new Student(1, "유병승", 19, 180.5, Gender.M, "경기도 시흥시");
		
		Class studentClass = s.getClass();
		Method[] methods = studentClass.getDeclaredMethods();
		for(Method m : methods) {
//			System.out.println(m);
//			System.out.println(m.getName());
			if(m.getName().contains("get")) {
				try{
					Object o = m.invoke(s);
					System.out.println(o);
				} catch(Exception e) {
					
				}
			}
		}
		
		//필드 다루기
		Field[] fields = studentClass.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f);
			System.out.println(f.getName());
			f.setAccessible(true); //필드에 접근해서 수정할 수 있는 설정
			try{
				if(f.getName().equals("name")) {
				f.set(s, "최주영");
				}			
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(s.getName());
		
		
	}

}
