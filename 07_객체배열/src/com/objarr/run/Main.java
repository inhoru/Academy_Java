package com.objarr.run;

import java.util.Scanner;

import com.objarr.contriller.Animal;
import com.objarr.contriller.Fruit;
import com.objarr.contriller.Person;

public class Main {
	public static void main(String[] args) {
		// 객체 배열 이용하기
		// 객체 배열 생성하기
		// Animal a,a1,a2,a3; 이렇게저장하면 관리하기빡침
		Animal[] animals;// 클래스배열에 객체배열 변수를 선언
		animals = new Animal[5];// 객체배열변수안에 배열 저장공간을 생성해서 대입
		animals[0] = new Animal();// 0인덱스에 디폴트로생성한 애니몰이 저장된다.
		animals[1] = new Animal("고양이", "베리", 3, 6, '여');

		// 배열에 저장된 객체데이터 활용하기
		// 0번 인덱스에 저장된 동물의 이름 가져오기
		System.out.println(animals[0]);
		String name = animals[0].getName();
		System.out.println(name);// 이렇게 getName이 스트링값이기때문에 스트링변수에넣어서사용도 가능하다.
		animals[0].setName("햄찌");
		System.out.println(animals[0].getName());// 스트링값이기에 바로 프린트도가능하다.
		System.out.println(animals[1].getName());

		// Animal을 3개 저장할 수 있는 저장소를 만들고
		// 원숭이 몽키 3 9 남
		// 돼지 꿀꿀이 1 30 여
		// 토끼 깡총이 2 2 여
		Animal[] animals2 = new Animal[3];
		animals2[0] = new Animal();
		animals2[1] = new Animal();
		animals2[2] = new Animal();

		animals2[0].setName("원숭이");
		animals2[0].setType("몽키");
		animals2[0].setAge(3);
		animals2[0].setWhight(9);
		animals2[0].setGender('남');

		animals2[1].setName("돼지");
		animals2[1].setType("꿀꿀이");
		animals2[1].setAge(1);
		animals2[1].setWhight(30);
		animals2[1].setGender('여');

		animals2[2].setName("토끼");
		animals2[2].setType("깡총이");
		animals2[2].setAge(2);
		animals2[2].setWhight(2);
		animals2[2].setGender('여');

//		System.out.println(animals2[0].getName()+" "+animals2[0].getType()+" "+
//				animals2[0].getAge()+ " "+animals2[0].getWhight()+ " "+animals2[0].getGender());
//		System.out.println(animals[1].getName()+" "+animals[1].getType()+" "+
//				animals2[1].getAge()+ " "+animals2[1].getWhight()+ " "+animals2[1].getGender());
//		System.out.println(animals2[2].getName()+" "+animals2[2].getType()+" "+
//				animals2[2].getAge()+ " "+animals2[2].getWhight()+ " "+animals2[2].getGender());

		for (int i = 0; i < animals2.length; i++) {
			System.out.println(animals2[i].infoAnimal());
		}
//		System.out.println(animals2[0].infoAnimal());
//		System.out.println(animals2[1].infoAnimal());
//		System.out.println(animals2[2].infoAnimal());
//		
		// com.objarr.controller.Person만들기
		// 이름, 나이, 주소, 전화번호
		// Person을 5명 저장할 수 있는 공간을 확보하고 -> 생성자는 기본생성자만 생성
		// 사용자가 입력한 값으로 Person을 생성 및 저장소에 저장 후
		// 저장된 사용자 모두를 출력하기
		// getter와settet이요앟ㄹ것
		Scanner sc = new Scanner(System.in);
		Person[] person = new Person[5];
		for (int i = 0; i < person.length; i++) {
			person[i] = new Person();
			System.out.println("이름 : ");
			person[i].setName(sc.next());
			System.out.println("나이 : ");
			person[i].setAge(sc.nextInt());
			sc.nextLine();
			System.out.println("주소 : ");
			person[i].setAddress(sc.nextLine());
			System.out.println("전화번호 : ");
			person[i].setNumber(sc.nextLine());
//			person[i].setName(names);
//			person[i].setAge(age);
//			person[i].setAddress(address);
//			person[i].setNumber(number);

		}
//		for(int i = 0;i<person.length;i++) {  <-이렇게도가능하구
//			System.out.println(person[i].infoPerson());
		for (Person p : person) {// for이치 문으로도가능하다.
			p.setName("유병승");
			System.out.println(p.getName() + " " + p.getAge() + " " + p.getAdderss() + " " + p.getNumber());
		}

		// 객체배열 선언과 동시에 초기화하기
		Person[] ps2 = { new Person("유병승", 19, "경기도 시흥시", "010444"), new Person("이성진", 25, "서울시 노원구", "010555"),
				new Person("이동제", 25, "경기도 군포시", "010666"), new Person("이다영", 25, "경기도 광명시", "010777"), };
		// 다수의 데이터를 저장하고 활용할때 객체배열
		// 저장된 사람중 25살인 사람 조회하기
//		System.out.println("조회 : ");
//		int search = sc.nextInt();
//		for(int i = 0;i<ps2.length;i++) {
//			if(person[i].getAge()==search) {
//				System.out.println(person[i].infoPerson());
//			}
		// }
		for (Person p : ps2) {
			if (p.getAge() == 25) {
				System.out.println(p.infoPerson());
			}
		}

		// 과일을 저장할 수 있는 클래스를 만들고
		// 이름, 무게, 색상, 가격
		// 과일을 5개 저장할 수 있는 저장소를 만들자
		// 과일 본이이 좋아하는 과일로 초기화하고
		// 1. 초기화한 과일들 전체 출력하기
		// 2.입력된 과일중 무게가 3kg이상인 과일 출력하기
		// 3. 가격이 3000이상인 과일 출력하기
		// 사과 5 빨강 1000
		// 바나나 3 노랑 8000
		// 딸기 1.5 빨강 2500
		// 키위 2 초록 2800
		// 샤인머스켓 1.3 초록 40000
		Fruit[] fruit = { new Fruit("사과", 5, "빨강", 1000), new Fruit("바나나", 3, "노랑", 8000),
				new Fruit("딸기",  1.5, "빨강", 2500), new Fruit("키위", 2, "초록", 2800),
				new Fruit("샤인머스켓",  1.3, "초록", 40000) };

//		fruit[0]=new Fruit("사과",(int) 5.0,"빨강",1000);
//		fruit[1]=new Fruit("바나나",(int) 3.0,"노랑",8000);
//		fruit[2]=new Fruit("딸기", 1.5,"빨강",2500);
//		fruit[3]=new Fruit("키위",(int) 2.0,"초록",2800);
//		fruit[4]=new Fruit("샤인머스켓", 1.3,"초록",40000);
//		
		for (Fruit f : fruit) {
			System.out.println(f.infoFruit());
		}
		
		for (Fruit f : fruit ) {
			if(f.getWeight()>=3) {
				System.out.println(f.infoFruit());
			}
		}
		for(Fruit f : fruit) {
			if(f.getPrice()>=3000) {
				System.out.println(f.infoFruit());
			}
		}

	}
}
