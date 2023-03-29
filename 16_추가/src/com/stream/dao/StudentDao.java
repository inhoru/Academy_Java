package com.stream.dao;

import java.util.ArrayList;
import java.util.List;

import com.stream.common.Gender;
import com.stream.vo.Student;

public class StudentDao {
	private static List<Student> students = new ArrayList();
	
	public StudentDao() {}
	
	static {
		//static 초기화블럭
		for(int i = 0; i < 100; i++) {
			//빌더패턴을 이용해서 객체를 생성해보자
			students.add(Student.builder().stdNo(i + 1).name("test" + i).age((int) (Math.random() * 50) + 10)
					.height(Math.random() * (190 - 150) + 150).gender(i % 2 == 0 ? Gender.M : Gender.F)
					.address("test" + i).build());
		}
	}
	
	public static List<Student> getStudents() {
		return StudentDao.students;
	}
	
	
}
