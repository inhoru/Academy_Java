package com.obj.run;

import com.obj.basiccontroller.BaseBallPlayer;
import com.obj.basiccontroller.BasicTestClass;
//import com.obj.basiccontroller.DefaultTestClass;
import com.obj.basiccontroller.FieldTestClass;
import com.obj.model.vo.Student;

public class Mian {
	public static void main(String[] args) {
		//프로젝트내부에 선언된 클래스는 반드시 생성해야지만 이용이 가능하다.
		//클래스를 생성하는 방법
		//new 연산자를 이용해서 생성한다.
		//new 클래스명() <- 기본클래스 생성하는 방법(default생성)
		
		//클래스선언부에 있는 접근제한자에 따라 생성해서 이용할 수 있는
		//범위가 달라진다.
		//basicTestClss 생성하기
		new BasicTestClass();
		//defaultTestClass생성하기
		//패키지가 다르면 import사용불가능하다.접근제한자의차이
		//new DefaultTestClass();
		
		//프로젝트내에 선언되 클래스명은 하나의 자료형으로 사용한다.
		//참조형자료형(Reference type)
		//클래스를 저장하는 변수를 만들 수도 있다.
		BasicTestClass btc;  //클래스로 생성한 객체를 저장한는 변수를 선언한거다.
		btc = new BasicTestClass();
		
		//클래스에 선언된 필드(멤버변수)이용하기
		//클래스에 선언된 필드를 이용하려면 클래스를 객체화(생성)해야한다.
		
		FieldTestClass ftc;
		//컨트롤+쉬프트+o 를하면 import 자동생성
		ftc= new FieldTestClass();
		
		//필드(멤버변수)에접근하기
		//.  <- 바로 접근해라
		System.out.println(ftc.age);
		//필드에 값 대입하기 
		ftc.age=19;
		System.out.println(ftc.age);
		//default 접근제한자를 사용한 필드접근
		//is not visible 파일은있는데 넌이걸 쓸권한이없다라느뜻.
		//직접접근이불가능하다.
		//System.out.println(ftc.name);
		
		//private접근자한자를 사용한 필드접근
		//System.out.println(ftc.gender);
		
		//final 필드 접근하기
		System.out.println(ftc.HEIGHT);
		//final 필드는 수정이불가능함
		//ftc.HEIGHT = 190.5;
		//베이스볼플레이어 만들기
		//선수 3명을 만들기
		BaseBallPlayer p1,p2,p3;
		
		p1 = new BaseBallPlayer();//선수 항명생성
		String result = "";
		p1.name="박찬호";
		p1.age=49;
		p1.mainHand="오른손";
		p1.number=61;
		p1.position="P";
		p1.accuracy=70;
		p1.power=100;
		
		result += p1.name+" " + p1.age+" " + p1.mainHand+" " + p1.number+" "+
				p1.position+" "+p1.accuracy+" "+p1.power;
		System.out.println(result);
		
		
		//p1 야구플레이어 -> 박찬호
		p2 = new BaseBallPlayer();
		p2.name = "이승엽";
		p2.age = 46;
		p2.mainHand="왼손";
		p2.number=36;
		p2.position="1B";
		p2.accuracy=90;
		p2.power=100;
		System.out.println(p2.name+" " + p2.age+" " + p2.mainHand+" " + p2.number+" "+
				p2.position+" "+p2.accuracy+" "+p2.power);	
		
		//학생정보를 저장하는 클래스를 선언하고 
		//->com.obj.model.vo.Student
		//이름,나이 학년 반 키 주소
		//모든필드는 어디서든 접근할 수 있게 설정
		//아래 학생을 등록 후 출력하기
		//유병승 19 1 3 180.5 경기도시흥시
		//홍길동 33 3 2 174.2 강원도 산골
		//이순신 54 3 3 167.3 전라남도
		//신사임당 45 2 1 152.3 강원도
		Student num1,num2,num3=new Student();
		
		num1 = new Student();
		num1.name = "유병승";
		num1.age = 19;
		num1.grade = '1';
		num1.group = 3;
		num1.height = 180.5;
		num1.addres = "경기도시흥시";
		
		System.out.println(num1.name +" "+num1.age+" "+num1.grade+" "+
		num1.group+" "+num1.height+" "+num1.addres);
		
		num2 = new Student();
		num2.name = "홍길동";
		num2.age = 33;
		num2.grade = 3;
		num2.group = 2;
		num2.height = 174.2;
		num2.addres = "강원도 산골";
		
		System.out.println(num2.name +" "+num2.age+" "+num2.grade+" "+
		num2.group+" "+num2.height+" "+num2.addres);
		
		num3 = new Student();
		num3.name = "이순신";
		num3.age = 54;
		num3.grade = 3;
		num3.group = 3;
		num3.height = 167.3;
		num3.addres = "전라남도";
		
		System.out.println(num3.name +" "+num3.age+" "+num3.grade+" "+
		num3.group+" "+num3.height+" "+num3.addres);
		
		//필드로 선언된 변수는 new연산자로 생성을 하면
		//기본값으로 초기화가 된다. 초기부터 값을 대입하려면???
		//1.필드에 대입연산자를 사용다.
		
		Student num = new Student();
		System.out.println(num.name +" "+num.age+" "+num.grade+" "+
		num.group+" "+num.height+" "+num.addres);
		
		//2.초기화블록을 이용해서 필드를 초기화 할 수 있다.
		//인스턴스 초기화블록 ->클래스를 생성(객체화)할때마다 실행
		//static 초기화블록 -> 최초 생성할때 한번만 실행!
		
	}
}
