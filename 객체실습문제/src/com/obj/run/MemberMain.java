package com.obj.run;

import com.obj.model.vo.Member;

public class MemberMain {

	public static void main(String[] args) {
		
		Member m =new Member();
		m.setId("admin1");
		m.setPw("admin123");
		m.setName("강태풍");
		m.setAge(20);
		m.setMail("admin@naver.com");
		Member m1 = new Member();
		m1.setId("admin2");
		m1.setPw("admin456");
		m1.setName("강바람");
		m1.setAge(22);
		m1.setMail("admin2@naver.com");
		
		Member m2 = new Member();
		m2.setId("admin3");
		m2.setPw("admin789");
		m2.setName("강백호");
		m2.setAge(22);
		m2.setMail("admin3@naver.com");
		
		System.out.println(m.infoMember());
		System.out.println(m1.infoMember());
		System.out.println(m2.infoMember());
		
		//배열로도 가능한지 이따만들어보기
		

	}

}
