package com.collection.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.collection.common.FoodDecending;
import com.collection.common.FoodNameAscending;
import com.collection.common.FoodPriceAes;
import com.collection.common.FoodPriceDecending;
import com.collection.common.FoodTypeAscending;
import com.collection.model.vo.Animal;
import com.collection.model.vo.Food;
import com.collection.model.vo.person;

public class ListController {

	public static void main(String[] args) {
		// 시험에나온데
		// List인터페이스
		// List인터페이스는 Collection인터페이스를 상속받은 인터페이스
		// 클래스를 다수 저장/관리하는 기능을 정의한 인터페이스
		// List를 구현한 클래스
		// ArrayList, LinkedList, Vector
		// 선형자료구조를 갖는 클래스로 배열과 유사함.
		// 인덱스번호, 순서가 있음.
		// 삽입, 삭제 메소드가 구현이 되어있음
		// 클래스가 제공하는 메소드를 이용해서 데이터를 관리함.

		// ArrayList클래스 이용하기
		ArrayList list = new ArrayList();

		// 생성된 list저장소에 데이터 저장하기
		// ArrayList객체에 저장가능한 데이터는 자바에서 사용하는 모든데이터
		// 저장하려면 add(저장할데이터)메소드를 이용한다.
		list.add(true);
		list.add(19);
		list.add("유병승");
		list.add('남');
		list.add(180.5);
		list.add(new Date());

		// 저장된 데이터 가져오기(호출하기)
		// get(index번호)메소드를 이용함.
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		// System.out.println(list.get(6));

		// 기본적으로 ArrayList에 저장되는 데이터는
		// Object자료형으로 저장이된다.
		// 대입된 실제 데이터를 사용하려면 형변환을 해야한다.
		// list.add
		// list.get(0);

		// 전체 데이터에 접근(순회)할때는 반복문을 사용하면 편리하다.
		// List자료형의 길이는 size()메소드를 이용한다.
		// length는 없음!!
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 실제 vo객체를 저장하고 관리하는 역할함.
		ArrayList foods = new ArrayList();

		foods.add(new Food("돈까스", 10000, "일식", new Date()));
		foods.add(new Food("초밥", 1500, "일식", new Date()));
		foods.add(new Food("컵라면", 1400, "한식", new Date()));
		foods.add(new Food("샐러드", 12000, "건강식", new Date()));

		// foods.get()이 오브젝트로해서 받는거기때문에
		// 저장할려면 형변환을해준다.
		Food f = (Food) foods.get(1);
		System.out.println(f.getName() + " " + f.getPrice());
		// 출력결과
		// 초밥 1500
		System.out.println();

		// 전체 음식의 타입, 이름, 가격을 출력
		for (int i = 0; i < foods.size(); i++) {
			// 똑같이 오브젝트로 반환을받기때문에 Food로 형변환을해준다.
			Food f1 = (Food) foods.get(i);
			System.out.println(f1.getType() + " " + f1.getPrice());
			// 출력결과
			// 일식 10000
			// 일식 1500
			// 한식 1400
			// 건강식 12000
		}
		System.out.println();
		// 전체음식중 가격이 5000원이하인 음식의
		// 타입, 이름, 가격을 출력하기
		for (int i = 0; i < foods.size(); i++) {
			Food f1 = (Food) foods.get(i);
			if (f1.getPrice() <= 5000) {
				System.out.println(f1.getType() + " " + f1.getName() + " " + f1.getPrice());
			}
		}
		// 출력결과
		// 일식 초밥 1500
		// 한식 컵라면 1400

		// Animal클래스를 선언하고
		// 이름, 몸무게, 나이, 종류
		// 뽀삐, 5.3,10, 강아지
		// 야옹이, 4.2, 5, 고양이
		// 킥킥이, 15.3, 3, 원숭이
		// 하하, 200.2,9, 하마
		// ArrayList에 저장하고
		// 1. 전체 데이터 출력
		// 2. 이름, 나이, 몸무게만 출력(전체)
		// 3. 몸무게가 10kg이상인 동물의 이름, 종류, 몸무게 출력
		// 4. 나이가 5살이상인 동물의 이름, 나이 출력
		// 5. 저장된 동물들의 나이를 한살씩 증가시키고 저장된 전체동물출력

		ArrayList animal = new ArrayList();

		animal.add(new Animal("뽀삐", 5.3, 10, "강아지"));
		animal.add(new Animal("야옹이", 4.2, 5, "고양이"));
		animal.add(new Animal("킥킥이", 15.3, 3, "원숭이"));
		animal.add(new Animal("하하", 200.2, 9, "하마"));

		// 전체출력
		for (int i = 0; i < animal.size(); i++) {
			System.out.println(animal.get(i));
		}
		// 이름 나이 몸무게만 출력
		// foreach문 사용
		for (Object o : animal) {
			Animal a = (Animal) o;
			System.out.println(a.getName() + " " + a.getAge() + " " + a.getWeight());
		}

		// 몸무게가 10kg이상인 동물의 이름, 종류, 몸무게 출력
		for (int i = 0; i < animal.size(); i++) {
			Animal a = (Animal) animal.get(i);
			if (a.getWeight() >= 10) {
				System.out.println(a.getName() + " " + a.getKind() + " " + a.getWeight());
			}
		}
		// 나이가 5살이상인 동물의 이름, 나이출력
		for (int i = 0; i < animal.size(); i++) {
			Animal a = (Animal) animal.get(i);
			if (a.getAge() >= 5) {
				System.out.println(a.getName() + " " + a.getAge());
			}

		}
		// 저장된 동물들의 나이를 한살씩 증가시키고 저장된 전체동물출력
		// 1. 인덱스에 있는 동물의 나이를 수정해보자
		// ((Animal)animal.get(0)).setAge(20);

		// 전체 증가
		for (int i = 0; i < animal.size(); i++) {
			Animal a = (Animal) animal.get(i);
			int age = a.getAge();
			a.setAge(age + 1);
			// 밑에방식도 가능하다.
			// a.setAge(a.getAge()+1);

			// 포이치로 출력
		}
		for (Object o : animal) {
			System.out.println(o);
		}

		// ArrayList에 데이터가 있는지 없는지 확인하기
		// isEmpty()메소드, size()를 이용
		ArrayList test = new ArrayList();
		// 리스트가 비어있니? 물어봄
		// 비어잇으면 true
		// 비어있지않으면 false
		System.out.println(test.isEmpty());

		// animal엔 값이들어가있으니 false
		System.out.println(animal.isEmpty());

		// 비어잇지않으면 포문을써서 값을출력
		if (!animal.isEmpty()) {
			for (Object a : animal) {
				System.out.println(a);
			}
		}
		// animal.size()==0 이거랑 똑같은말이다 isEmpty()

		// ArrayList에 저장되어있는 전체 데이터를 순회하는 방법
		// 원래는 지금까지 for문이나 forEach를 사용햇지만
		// iterator() 메소드를 사용해서도가능하다. -> Iterator객체를 이용하는것이다.

		// 데이터전체를 가져와서 하나씩빼서 쓴다 그리고 삭제한다 전부다썻다면 ex오류가뜬다.
		// set에서 무조건쓴다?
		System.out.println("=== iterator방식으로 출력하기 ===");
		animal.add(new Animal("음메에", 30.5, 3, "양"));

		Iterator it = animal.iterator();
		while (it.hasNext()) {
			// it.next를 사용하면 지워지니간
			// 그값을사용할려면 변수에저장해서 사용하자.
			Animal a = (Animal) it.next();

			// System.out.println(a);
			// System.out.println(it.next());
		}
		System.out.println();
		// 원하는 인덱스 위치에 값 추가하기
		// add(index, element);
		// 덮어씌우는게아니라 그자리로간후 그자리에잇는녀석을 뒤로밀어버린다.
		animal.add(1, new Animal("부엉", 4.3, 3, "부엉이"));
		for (int i = 0; i < animal.size(); i++) {
			System.out.println(i + " " + animal.get(i));
		}
		System.out.println();
		// 원하는 인덱스의 값을 수정하기
		// set(index, element);
		animal.set(1, new Animal("고라", 20.2, 1, "고라니"));
		for (int i = 0; i < animal.size(); i++) {
			System.out.println(i + " " + animal.get(i));
		}
		System.out.println();
		// 원하는 인덱스의 값 삭제하기
		// 원하는 인덱스를 지우고 순서대로 재정렬해준다.
		animal.remove(1);
		for (int i = 0; i < animal.size(); i++) {
			System.out.println(i + " " + animal.get(i));
		}
		System.out.println();

		// 매개변수와 일치하는 값 삭제하기
		// remove(Object o ) -> 대상 클래스에 equals, hasCode가 오버라이딩 되어 있어야한다.
		System.out.println("==== 객체로 삭제 ====");
		animal.remove(new Animal("음메에", 30.5, 3, "양"));
		for (int i = 0; i < animal.size(); i++) {
			System.out.println(i + " " + animal.get(i));
		}
		System.out.println();
		// ArrayList의 데이터들을 관리할수있는 메소드
		// 1. 특정 객체가 리스트에 포함되어 있는지 확인하는 메소드
		// contains(Object) : boolean
		boolean result = animal.contains(new Animal("야옹이", 4.2, 6, "고양이"));
		System.out.println(result);

		// 2. 동일한 객체를 찾아서 그 인덱스를 반환해주는 메소드
		// indexOf() / lastIndexOf(Object)
		// -1 이나오면 없는값이다.
		System.out.println();
		int index = animal.indexOf(new Animal("야옹이", 4.2, 6, "고양이"));
		System.out.println(index);

		// 3. ArrayList로 저장된 데이터를 배열로 변환해주는 메소드
		// toArray() : ArrayList -> []배열로 변경
		System.out.println();
		System.out.println("리스트데이터 배열로 변환하기");
		Object[] objArr = animal.toArray();
		for (Object o : objArr) {
			// System.out.println(o);
			System.out.println(objArr[0]);
		}

		// Arrays클래스의 asList() 메소드를 이용하면 배열을 List로 변경할 수 있다.
		System.out.println();
		List animal2 = Arrays.asList(objArr);
		for (Object o : animal2) {
			System.out.println(o);
		}

		// 여기서부터 이해못햇음
		// Collection, List인터페이스는 부모타입으로
		// ArrayList객체를 저장할수 있다.
		Collection c;// = new Collection();
		c = new ArrayList();
		c = animal;
		List ListData = animal;
		ListData = new ArrayList();

		// ArrayList에 저장된 데이터를 한번에 전체데이터 삭제하기
		// clear()
		System.out.println();
		System.out.println(animal.isEmpty());
		// 지워주기
		animal.clear();
		System.out.println(animal.isEmpty());
		System.out.println(animal.size());

		// List 를 생성할때 선언과 동시에 초기화해서 생성하기
		System.out.println();
		String[] name = { "김아우", "안ㅇ", "ㅇ니ㅏㅓㅇㄴ", "dsa" };
		name = new String[] { "1", "2", "3", "4", "5" };
		// ArrayList list2 = new ArrayList() {"유병승"};
		// List.of(1,2,3,4,5);
		List intList = List.of(1, 2, 3, 4, 5);// 변하지않는 final이다.
		System.out.println(intList.size());// 길이
		System.out.println(intList.get(0));// 저장값
		System.out.println(intList.get(1));
		System.out.println(intList.get(2));
		System.out.println(intList.get(3));
		// 주의할점
		// List.of로 생성한 list는 불변의 리스트
		// add로추가해도 변하지않는다.
//				intList.add(6);
//				intList.set(0, 100);

		System.out.println();
		List animalList = List.of(new Animal(), new Animal(), new Animal());
		// 애니멀 배열의 갯수(주소값만이)불변이고 그안에잇는 내용들은 변경이가능하다.

		((Animal) animalList.get(0)).setName("햄찌");

		for (Object o : animalList) {
			System.out.println(o);
		}

		// 리스트는 순선!!
		// 순서가 있으면 정렬!!
		// 정렬에 대한 메소드를 제공한다.
		// Collection클래스에서 제공하는 sort()
		// List인터페이스에서 제공하는 sort()

		// Comparator인터페이스 알아보기.
		// 1. Comparator를 구현한 클래스 생성하기
		System.out.println();
		System.out.println("오름차순 정렬전");
		for (Object o : foods) {
			System.out.println(o);

		}
		foods.sort(new FoodPriceAes());

		System.out.println();
		System.out.println("오름차순 정렬후");
		for (Object o : foods) {
			System.out.println(o);

		}
		System.out.println();
		System.out.println("내림차순 정렬하기");

		foods.sort(new FoodPriceDecending());

		for (Object o : foods) {
			System.out.println(o);

		}

		// Collections클래스가 제공하는 sort메소드 이용하기
		System.out.println();
		System.out.println("Collections sort 이용하기");
		Collections.sort(foods, new FoodPriceDecending());
		for (Object o : foods) {
			System.out.println(o);

		}
		// 클래스가 가지고 있는 기본정렬방식으로 정렬
		// Compareable인터페이스를 구현해줘야함.
		// compareTo() 메소드를 재정의해서 사용
		// 반환형이 +, - ,0
		// + : 바꿈
		// -,0 : 안바뀜
		System.out.println();
		Collections.sort(foods);
		System.out.println("Collections 정렬하기");
		for (Object o : foods) {
			System.out.println(o);

		}
		// 음식을 이름순으로 정렬하기
		// a~z 사전순으로 정렬......
		// 가~하
		// compareTo로 이름순으로정렬해준다.
		System.out.println();
		System.out.println("이름순으로 정렬하기");
		foods.sort(new FoodNameAscending());
		for (Object o : foods) {
			System.out.println(o);

		}
		System.out.println();
		System.out.println("이름순으로 내림차순정렬");
		foods.sort(new FoodDecending());
		for (Object o : foods) {
			System.out.println(o);
		}

		System.out.println();
		System.out.println("타입으로 정렬하기");
		foods.sort(new FoodTypeAscending());
		for (Object o : foods) {
			System.out.println(o);
		}

		System.out.println();

		foods.sort(new Comparator() {
			@Override
			public int compare(Object o, Object o1) {
				Food f = (Food) o;
				Food f2 = (Food) o1;
				return f.getPrice() - f2.getPrice();

			}
		});

		System.out.println("정렬후 출력하기 ");

		// 리스트에 있는 전체 데이터를 순회할때 forEcah메소드를 이용할 수 있다.
		foods.forEach((o) -> System.out.println(o));

		// 위에 람다식을 풀어서 표현한것
//				foods.forEach(new Consumer() {
//					@Override
//					public void accept(Object o) {
//						System.out.println(o);
//					}
//				});
		System.out.println();
		System.out.println("람다를 이용한 이름순으로 정렬");
		foods.sort((o, o1) -> ((Food) o).getName().compareTo(((Food) o1).getName()));

		foods.forEach((o) -> System.out.println(o));

		// ArraysList클래스는 중복값을 저장함.
		System.out.println();
		ArrayList names2 = new ArrayList();
		names2.add("유병승");
		names2.add("유병승");
		names2.add("유병승");
		names2.add("유병승");
		names2.add("유병승");
		names2.add("유병승");
		names2.add("유병승");
		names2.forEach((o) -> System.out.println(o));

		System.out.println();
		
		// 다햇는데실수로삭제함 ㅋ

		List personList = List.of(new person(), new person(), new person(), new person(), new person());

		Scanner sc = new Scanner(System.in);
		int indexs = 0;
		for (int i = 0; i < personList.size(); i++) {
			System.out.println(i+1+"번째 등록");
			System.out.print("이름 : ");
			String names = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			System.out.print("키 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			((person) personList.get(indexs)).setNaem(names);
			((person) personList.get(indexs)).setAge(age);
			((person) personList.get(indexs)).setGender(gender);
			((person) personList.get(indexs)).setHeight(height);
			((person) personList.get(indexs)).setWeight(weight);
			
			indexs++;

		}
		for (Object o : personList) {

			System.out.println(o);
		}
	}

}
