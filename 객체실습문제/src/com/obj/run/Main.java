package com.obj.run;

import java.util.Scanner;

import com.obj.model.vo.Employee;
import com.obj.model.vo.Membership;
import com.obj.model.vo.Post;

public class Main {
	public static void main(String[] args) {
		
		Membership m1= new Membership("admin","1234","admin@admin.com",55,"운동,코딩");
		Membership m2= new Membership("user01","1111","user01@user.com",33,"코딩");
		System.out.println(m1.id+" "+m1.pw+" "+m1.email+" "+m1.age+" "+m1.hobby);
		System.out.println(m2.id+" "+m2.pw+" "+m2.email+" "+m2.age+" "+m2.hobby);
//---------------------------------------------------------------------------------------------------------	
		Post p1 = new Post("첫번째 글","나야나","첫번째 글쓰다","23/03/10");
		Post p2 = new Post("두번째 글","너야나","두번째 글쓰다","23/03/20");
		System.out.println(p1.title+" "+p1.writer+" "+p1.content+" "+p1.day);
		System.out.println(p2.title+" "+p2.writer+" "+p2.content+" "+p2.day);
//---------------------------------------------------------------------------------------------------------	
		Scanner sc = new Scanner(System.in);
		String sum = "";
		for(int i =0;i<5;i++) {
		System.out.print((i+1)+"번회사원");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("부서명 : ");
		String departmetn = sc.next();
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.print("전화번호 : ");
		String number = sc.nextLine();
		System.out.print("인센티브(0.00) : ");
		double bonus = sc.nextDouble();
		sum+=(i+1+"번회사원 : "+name+" "+departmetn+" "+salary+" "+number+" "+bonus+" "+"\n");
		Employee e = new Employee("name","departmetn",salary,"number",bonus);	
		}
		System.out.println(sum);
//---------------------------------------------------------------------------------------------------------		
		
		
	
	
	}
	
}
