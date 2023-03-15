package com.obj.run;

import com.obj.model.vo.Member;

public class MemberMain {

	public static void main(String[] args) {
		
		Member m =new Member();
		m.setId("admin");
		m.setPw("admin");
		m.setName("admin");
		m.setAge(20);
		m.setMail("admin@naver");
		Member m1 = new Member();
		m1.setId("1admin");
		m1.setPw("1admin");
		m1.setName("1admin");
		m1.setAge(21);
		m1.setMail("1admin@naver");
		
		Member m2 = new Member();
		m2.setId("2admin");
		m2.setPw("2admin");
		m2.setName("2admin");
		m2.setAge(22);
		m2.setMail("2admin@naver");
		
		System.out.println(m.infoMember());
		System.out.println(m1.infoMember());
		System.out.println(m2.infoMember());
		
		//배열로도 가능한지 이따만들어보기
		

	}

}
