package com.poly.controller;

import java.util.Scanner;

import com.poly.model.vo.AbstractChildClass;
import com.poly.model.vo.AbstractClassTest;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Chicken;
import com.poly.model.vo.Cow;
import com.poly.model.vo.Dog;
import com.poly.model.vo.DynamicBindTest;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.PolyTest;
import com.poly.model.vo.PolyTest2;
import com.poly.model.vo.PolyTestParent;
import com.poly.model.vo.Student;
import com.poly.model.vo.Teacher;

public class PolyController {
	public void basicTest() {
		// 다형성에 대해 알아보자
		// 상속관계에 있는 클래스의 부모 클래스타입으로 선언된 변수에는
		// 자식클래스 객체를 저장할 수 있게 하는 기술
		PolyTestParent ptp = new PolyTestParent();
		ptp = new PolyTest();// 상속관계일때 저장가능!
		ptp = new PolyTest2();// 하나의 객체의 다중 상속가능//즉변수하나로 2가지의정보를 저장 !단 상속일때

		Object o;// 이것도다형성 오브젝트는 모든클래스의 부모
		o = new PolyTestParent();
		o = new String("이것도저장되니?");
		o = new Scanner(System.in);

		// 자식클래스로 선언된 변수에는 부모클래스의 객체를 저장할 수 있을까?
		// 결론은 안된다 자식은 부모꺼를 허락하지않는다.
		// 반대의경우는 불가능
		PolyTest pt;
		//pt=new PolyTestParent();

		// 부모타입에 저장된 자식클래스는 업캐스팅되어 저장되기 때문에
		// 자식클래스가 선언한 내용(메소드,변수)을 읽을 수 없다.
		ptp = new PolyTest();

		ptp.setparentData("부모멤버에 저장");
		String temp = ptp.getParentData();
		System.out.println(temp);

		// 자식메소드에 접근하기 ->불가능하다.
		// ptp .setChildData("부모타입에서 저장시키기");

		// 이렇게 자식은 부모꺼에 접근가능
		// 하지만 부모는 자식꺼 불가능
		PolyTest pt2 = new PolyTest();
		pt2.setChildData("저장하기");
		pt2.setparentData("부모접근하기");

		// 부모타입에 저장된 자식클래스객체의 멤버메소드에 접근하려면
		// 형변환을 해야한다.
		// pt2는 자식 ptp는 부모
		// 부모를 자식으로 형변환
		// 자식 게터세터 사용가능
		pt2 = (PolyTest) ptp;
		System.out.println(pt2.getChildData());

	}

	public void testPerson() {
		// 형변환이 먼저 해야하기때문에 연산자우선위때문에 형변환에 갈호를넣고 (접근연산자). 을 찍어서 접근해야한다.
		Person p;
		p = new Student("유병승,", 19, 1, "실용음악과");
//		System.out.println(p.getName() + " " + p.getAge() 
//		+ ((Student) p).getGrade() + " " + ((Student) p).getMajor());
//		p = new Teacher("유병승", 19, "웹프로그래밍", 100);
//		System.out.println(p.getName() + " " + p.getAge() 
//		+ ((Teacher) p).getSubject() + " " + ((Teacher) p).getSalary());
//		
		printPerson(p);
		printPerson(new Student("최주영", 26, 2, "컴공"));
		printPerson(new Teacher("유병승", 19, "web", 100));
		// printPerson(new PolyTest());
		printPerson(new Employee("김아무",20,"wew","qwe"));
		
		PolyTestDao dao=new PolyTestDao(new Teacher());
		PolyTestDao dao2=new PolyTestDao(new Student());
		//동등성비교
		Teacher t = new Teacher("유병승",19,"wep",100);
		Teacher t2 = new Teacher("유병승",19,"wep",100);
		System.out.println(t.equals(t2));
		System.out.println(t.equals(dao));
		
	}

	public void printPerson(Person p) {
		//Person 을상속받은애는 사용가능
		// instanceof
		//앞에 잇는 변수에 스튜던트가 들어가있니 물어보는중
		if (p instanceof Student) {
			System.out.println(
					p.getName() + " " + p.getAge() + " " + ((Student) p).getGrade() + " " + ((Student) p).getMajor());
			//앞에 잇는 변수에 티쳐가 들어가있니? 물어보느중
		}else if (p instanceof Teacher) {
			System.out.println(
					p.getName() + " " + p.getAge() + " " + ((Teacher) p).getSubject() + " " + ((Teacher) p).getSalary());

		}else if (p instanceof Employee) {
			System.out.println(
					p.getName() + " " + p.getAge() + " " + ((Employee) p).getDepartment() + " " + ((Employee) p).getJob());
	}
	}
	
	public Person makePerson(int type) {
		Person p;
		switch(type) {
		case 1 : p=new Person();break;
		case 2 : p=new Student();break;
		case 3 : p=new Teacher();break;
		case 4 : p=new Employee();break;
		default : p=null;break;
		}
		return p;
	}
	public void objArrPolyTest() {
		//객체배열의 다형성 적용하기
		Person[] persons = new Person[9];
		persons=new Person[] {
				new Student("최주영",26,2,"컴공"),
				new Student("이동제",25,1,""),
				new Teacher("유병승",19,"web",100),
				new Teacher("이다영",25,"java",80),
				new Employee("김현영",26,"디자인","개발자"),
				new Employee("최솔",29,"연구팀","개발자")	
		};
		Teacher[] teacher=new Teacher[4];
		Student[] student=new Student[3];
		Employee[] employee=new Employee[2];
		//객체배열을 활용을안한다면 이렇게 일일히 티처랑 스투던트 엠플로이 전부다 만들어야한다.
		Teacher[] teachersAge = new Teacher[teacher.length];
		int index= 0;
		for(Teacher t : teacher) {
			if(t!=null&&t.getAge()>=20) {
				teachersAge[index++]=t;
			}
		
		}
		//변수를 하나가지고 묶어서 관리
		index= 0 ;
		Person[] ageSearch = new Person[persons.length];
		for(Person p : persons) {
			if(p!=null&&p.getAge()>=25) {
				ageSearch[index++]=p;
			}
		}
		for(Person p : ageSearch) {
			if(p!=null) {
			System.out.println(p.getName()+" "+p.getAge());
			} 
		}
		
		//persons에 저장된 student, teacher, employee의 수와 
		//전체 저장사람수를 구하시오.
		int countStudent=0,countTeacher=0,countEmployee=0,totalCount=0;
		for(int i =0;i<persons.length;i++) {
			if(persons[i]!=null) {
				if(persons[i] instanceof Student) {
					countStudent++;
				}else if(persons[i] instanceof Teacher) {
					countTeacher++;
				}else if(persons[i] instanceof Employee) {
					countEmployee++;
				}
				totalCount++;
			}
		}
		System.out.println("학생 : "+countStudent+ " 선생 : "+ countTeacher+" 사원 : "+countEmployee+" 총인원 : "+totalCount);
	}
	public  void dynamicBind() {
		DynamicBindTest dbt=new DynamicBindTest();
		System.out.println(dbt.toString());
		Object obj=new DynamicBindTest();
		//오버라이딩이되어있으면 실제들온 객체꺼를실행시킨다.
		System.out.println(obj.toString());
		Animal a = new Cat();
		a.bark();
		a=new Dog();
		a.bark();
		
		//저장된 동물의 울음소리 출력하는 기능
		Animal[] animals=new Animal[10];
		animals[0]=new Dog("뽀삐","강아지",6);
		animals[1]=new Cat("뽀송","고양이",3);
		animals[2]=new Dog("복실이","강아지",7);
		animals[3]=new Cat("뽀짝이","고양이",3);
		animals[4]=new Dog("바둑이","강아지",5);
		animals[5]=new Cow("워낭소리","소",13);
		animals[6]=new Chicken();
		
		for(int i = 0;i<animals.length;i++) {
			if(animals[i]!=null)animals[i].bark();
		}
		
		
	}
	public void abstractClasstest() {
		//추상클래스 이용하기
		//파이널과 상관 관계 
		//상속관계일때만 사용해 라는뜻
		//자료형으로 이용이가능하다.
		AbstractClassTest act;
		//act = new AbstractClassTest();
		act = new AbstractChildClass();
		act.testPrint();
		act.getTitle();
		act.getWriter();
		
	}
	

}
