package com.obj.run;

import com.obj.model.vo.MaekgeVariable;
import com.obj.model.vo.Person;

public class ConstructorMain {

	public static void main(String[] args) {
		//클래스의 생성자 활용하기
		//클래스는 생성해서 이용을 해야한다.
		// 클래스를 생성할때 이용하는것이 생성자다!
		// 모든 클래스선언에는 반드시 생성자선언 코드가 있어야한다.!
		
		Person p =new Person();//기본생성자를 호출한 구문
		System.out.println(p.name+ " "+p.age+" "+p.height+" "+p.gender);
		//매개변수있는 생성자 호출하기
		Person p1 = new Person("최주영",26,178.4,'여');
		Person p2 = new Person("김중근",28,177.4,'여');
		System.out.println(p1.name+p1.age+p1.height+p1.gender);
		System.out.println(p2.name+p2.age+p2.height+p2.gender);
		
		
		MaekgeVariable m1 = new MaekgeVariable("개","뽀삐",5.0,50,"우리집");
		MaekgeVariable m2 = new MaekgeVariable("고양이","야옹이",3.0,40,"짬통");
		MaekgeVariable m3 = new MaekgeVariable("거북이","꼬북이",1.2,5,"어항속");
		
		System.out.println(m1.kind+" "+m1.name+" "+(int) m1.weight+"kg "+m1.length+"cm "+
		m1.home);
		
		System.out.println(m2.kind+" "+m2.name+" "+(int) m2.weight+"kg "+m2.length+"cm "+
		m2.home);

		System.out.println(m3.kind+" "+m3.name+" "+ m3.weight+"kg "+m3.length+"cm "+
		m3.home);

		
	}

}
