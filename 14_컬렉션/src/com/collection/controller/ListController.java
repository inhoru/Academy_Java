package com.collection.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import com.collection.common.FoodDecending;
import com.collection.common.FoodNameAscending;
import com.collection.common.FoodPriceAes;
import com.collection.common.FoodPriceDecending;
import com.collection.common.FoodTypeAscending;
import com.collection.model.vo.Animal;
import com.collection.model.vo.Food;

public class ListController {

	public static void main(String[] args) {
		//List인터페이스
		//List인터페이스는 Collection인터페이스를 상속받은 인터페이스
		//클래스를 다수 저장/관리하는 기능을 정의한 인터페이스
		//List를 구현한 클래스
		//ArrayList, LinkedList, Vector
		//선형자료구조를 갖는 클래스로 배열과 유사함.
		//인덱스번호, 순서가 있음.
		//삽입, 삭제 메소드가 구현이 되어있음
		//클래스가 제공하는 메소드를 이용해서 데이터를 관리함.
		
		//ArrayList클래스 이용하기
		ArrayList list=new ArrayList();
		
		//생성된 list저장소에 데이터 저장하기
		//ArrayList객체에 저장가능한 데이터는 자바에서 사용하는 모든데이터
		//저장하려면 add(저장할데이터)메소드를 이용한다.
		list.add(true);
		list.add(19);
		list.add("유병승");
		list.add('남');
		list.add(180.5);
		list.add(new Date());
		
		//저장된 데이터 가져오기(호출하기)
		//get(index번호)메소드를 이용함.
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		//System.out.println(list.get(6));
		
		//기본적으로 ArrayList에 저장되는 데이터는
		//Object자료형으로 저장이된다.
		//대입된 실제 데이터를 사용하려면 형변환을 해야한다.
		//list.add
		//list.get(0);
		
		//전체 데이터에 접근(순회)할때는 반복문을 사용하면 편리하다.
		//List자료형의 길이는 size()메소드를 이용한다.
		//length는 없음!!
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//실제 vo객체를 저장하고 관리하는 역할함.
		ArrayList foods=new ArrayList();
		
		foods.add(new Food("돈까스",10000,"일식",new Date()));
		foods.add(new Food("초밥",2000,"일식",new Date()));
		foods.add(new Food("컵라면",1400,"한식",new Date()));
		foods.add(new Food("샐러드",12000,"건강식",new Date()));
		
		Food f=(Food)foods.get(1);
		System.out.println(f.getName()+" "+f.getPrice());
		
		//전체 음식의 타입, 이름, 가격을 출력
		for(int i=0;i<foods.size();i++) {
			Food f1=(Food)foods.get(i);
			System.out.println(f1.getType()+" "
			+f1.getName()+" "+f1.getPrice());
		}
		
		//전체음식중 가격이 5000천원이하인 음식의
		//타입, 이름, 가격을 출력하기
		for(int i=0;i<foods.size();i++) {
			Food f1=(Food)foods.get(i);
			if(f1.getPrice()<=5000) {
				System.out.println(f1.getType()
						+" "+f1.getName()
						+" "+f1.getPrice());
			}
		}
		//Animal클래스를 선언하고
		//이름, 몸무게, 나이, 종류
		//뽀삐, 5.3,10,강아지
		//야옹이, 4.2,5,고양이
		//킥킥이, 15.3,3,원숭이
		//하하, 200.2,9,하마
		//ArrayList에 저장하고
		//1. 전체 데이터 출력
		//2. 이름, 나이, 몸무게만 출력(전체)
		//3. 몸무게 10kg이상인 동물의 이름, 종류, 몸무게 출력
		//4. 나이가 5살이상인 동물의 이름, 나이 출력
		//5. 저장된 동물들의 나이를 한살씩 증가시키고 저장되 전체동물출력
		ArrayList animals=new ArrayList();
		animals.add(new Animal("뽀삐", 5.3,10,"강아지"));
		animals.add(new Animal("야옹이", 4.2,5,"고양이"));
		animals.add(new Animal("킥킥이", 15.3,3,"원숭이"));
		animals.add(new Animal("하하", 200.2,9,"하마"));
		//1. 전체 데이터출력하기
		for(int i=0;i<animals.size();i++) {
			System.out.println(animals.get(i));
		}
		//2. 이름, 나이, 몸무게만 출력(전체)
		//foreach문
		for(Object o:animals) {
			Animal a=(Animal)o;
			System.out.println(a.getName()
					+" "+a.getAge()
					+" "+a.getWeight());
		}
		//3. 몸무게 10kg이상인 동물의 이름, 종류, 몸무게 출력
		for(int i=0;i<animals.size();i++) {
			Animal a=(Animal)animals.get(i);
			if(a.getWeight()>=10) {
				System.out.println(a.getName()
						+" "+a.getType()
						+" "+a.getWeight());
			}
		}
		
		//5. 저장된 동물들의 나이를 한살씩 증가시키고 저장된 전체동물출력
		//첫번째 인덱스에 있는 동물의 나이를 수정
		//((Animal)animals.get(0)).setAge(20);
		for(int i=0;i<animals.size();i++) {
			Animal a=(Animal)animals.get(i);
//			int age=a.getAge();
//			a.setAge(age+1);
			a.setAge(a.getAge()+1);
		}
		for(Object o : animals) {
			System.out.println(o);
		}
		
		//ArrayList에 데이터가 있는지 없는지 확인하기
		//isEmpty()메소드, size()를 이용
		ArrayList test=new ArrayList();
		
		System.out.println(test.isEmpty());
		System.out.println(animals.isEmpty());
		if(!animals.isEmpty()) {
			for(Object a : animals)
				System.out.println(a);
		}
		if(animals.size()>0) {
			
		}
		
		//ArrayList에 저장되어있는 전체 데이터를 순회하는 방법
		//for문, forEach문사용
		//iterator()메소드를 이용하는 방법. -> Iterator객체를 이용하는것임
		System.out.println("=== iterator방식으로 출력하기 ===");
		animals.add(new Animal("음메에",30.5,3,"양"));
		Iterator it=animals.iterator();
		while(it.hasNext()) {
			
			
			System.out.println(it.next());
			//System.out.println(it.next());
		}
		
		System.out.println("추가");
		//원하는 인덱스 위치에 값 추가하기
		//add(index, element);
		animals.add(1,new Animal("부엉",4.3,3,"부엉이"));
		for(int i=0;i<animals.size();i++) {
			System.out.println(i+" "+animals.get(i));
		}
		//원하는 인덱스의 값을 수정하기
		//set(index, element);
		System.out.println("수정");
		animals.set(1, new Animal("고라",20.2,1,"고라니"));
		for(int i=0;i<animals.size();i++) {
			System.out.println(i+" "+animals.get(i));
		}
		
		//원하는 인덱스의 값을 삭제하기
		//remove(index);
		System.out.println("==== 삭제하기 ====");
		animals.remove(1);
		for(int i=0;i<animals.size();i++) {
			System.out.println(i+" "+animals.get(i));
		}
		//매개변수와 일치하는 값 삭제하기
		//remove(Object o)
		// -> 대상 클래스에 equals, hasCode가 오버라이딩 되어있어야한다.
		System.out.println("==== 객체로 삭제하기 ====");
		animals.remove(new Animal("음메에",30.5,3,"양"));
		for(int i=0;i<animals.size();i++) {
			System.out.println(i+" "+animals.get(i));
		}
		
		
		//ArrayList의 데이터들을 관리할 수 있는 메소드
		//1. 특정 객체가 리스트에 포함되어있는지 확인하는 메소드
		// contains(Object) : boolean
		boolean result=animals.contains(new Animal("야옹이", 4.2,6,"고양이"));
		System.out.println(result);
		
		//2. 동일한 객체를 찾아서 그 인덱스를 반환해주는 메소드
		System.out.println("동일한 인덱스 반환");
		//indexOf(Object)/lastIndeOf(Object)
		int index=animals.indexOf(new Animal("야옹이1", 4.2,6,"고양이"));
		System.out.println(index);
		
		//3. ArrayList로 저장된 데이터를 배열로 변화해주는 메소드
		//toArray() : ArrayList -> []배열로 변경
		System.out.println("리스트데이터 배열로 변환하기");
		Object[] objArr=animals.toArray();
		for(Object o : objArr)
			System.out.println(o);
		System.out.println(objArr[0]);
		// Arrays클래스의 asList()메소드를 이용하면 배열을 List로 변경할 수 있음
		List animals2=Arrays.asList(objArr);
		for(Object o:animals2) {
			System.out.println(o);
		}
		
		//Collection, List인터페이스는 부모타입으로 
		//ArrayList객체를 저장할 수 있다.
		Collection c;//new Collection();
		c=new ArrayList();
		c=animals;
		List listData=animals;
		listData=new ArrayList();
		
		//ArrayList에 저장된 데이터를 한번에 전체데이터 삭제하기
		//clear()
		System.out.println(animals.isEmpty());
		animals.clear();
		System.out.println(animals.isEmpty()+" "+animals.size());
		
		
		//List를 생성할때 선언과 동시에 초기화해서 생성하기
		String[] names= {"유병승","정상준","조윤진","최하리","이은지"};
		names=new String[] {"1","2","3","4"};
		//ArrayList list2=new ArrayList() {"유병승"};
		//List.of(1,2,3,4,5);
		List intList=List.of(1,2,3,4,5);//final
		System.out.println(intList.size());
		System.out.println(intList.get(0));
		System.out.println(intList.get(1));
		System.out.println(intList.get(2));
		System.out.println(intList.get(3));
		//List.of로 생성한 list는 불변의 리스트
		//intList.add(6);
		//intList.set(0, 100);
		List animalList
			=List.of(new Animal(),new Animal(),new Animal());
		
		((Animal)animalList.get(0)).setName("햄찌");

		for(Object o : animalList) {
			System.out.println(o);
		}
		
		//리스트는 순서!!!
		//순서가 있으면 정렬!!!
		//정렬에 대한 메소드를 제공한다.
		//Collection클래스에서 제공하는 sort()
		//List인터페이스에서 제공하는 sort()
//		foods.sort();
		//Comparator인터페이스 알아보기
		//1. Comparator를 구현한 클래스 생성하기
		System.out.println("===== 정렬전 =====");
		for(Object o : foods) {
			System.out.println(o);
		}
		foods.sort(new FoodPriceAes());
		System.out.println("===== 정렬 후 =====");
		for(Object o : foods) {
			System.out.println(o);
		}
		System.out.println("내림차순으로 정렬하기");
		foods.sort(new FoodPriceDecending());
		for(Object o : foods) {
			System.out.println(o);
		}
		System.out.println("Collections sort이용하기");
		//Collections클래스가 제공하는 sort메소드 이용하기
		Collections.sort(foods,new FoodPriceDecending());
		for(Object o : foods) {
			System.out.println(o);
		}
		
		//클래스가 가지고 있는 기본정렬방식으로 정렬
		//Compareable인터페이스를 구현해줘야함.
		//compareTo()메소드를 재정해서 사용
		// 반환형이 +(바꿔), -(안바꿔), 0(안바꿔)
		
		Collections.sort(foods);
		System.out.println("Comparable로 정렬하기");
		for(Object o : foods) {
			System.out.println(o);
		}
		
		//음식을 이름순으로 정렬하기
		//a~z 사전순으로 정렬....
		//가~하
		System.out.println("이름순으로 정렬");
		foods.sort(new FoodNameAscending());
		for(Object o : foods) {
			System.out.println(o);
		}
		System.out.println("이름순 내림차순정렬");
		foods.sort(new FoodDecending());
		for(Object o : foods) {
			System.out.println(o);
		}
		System.out.println("타입으로 정렬하기");
		foods.sort(new FoodTypeAscending());
		for(Object o : foods) {
			System.out.println(o);
		}
		
		foods.sort(new Comparator() {
			@Override
			public int compare(Object o, Object o1) {
				Food f=(Food)o;
				Food f2=(Food)o1;
				return f.getPrice()-f2.getPrice();
			}
		});
		System.out.println("정렬 후 출력하기");
		//리스트에 있는 전체 데이터를 순회할때 forEach메소드를 이용할 수 있다.
		foods.forEach((o)->System.out.println(o));
		System.out.println("두번째 방식");
		foods.forEach(new Consumer() {
			@Override
			public void accept(Object o) {
				System.out.println(o);
			}
		});
		
		System.out.println("람다를 이용한 이름순으로 정렬");
		foods.sort((o,o2)
				->((Food)o).getName()
					.compareTo(((Food)o2).getName()));
		
		foods.forEach((o)->System.out.println(o));
		
		
		//ArrayList클래스는 중복값을 저장함.
		ArrayList names2=new ArrayList();
		names2.add("유병승");
		names2.add("유병승");
		names2.add("유병승");
		names2.add("유병승");
		names2.add("유병승");
		names2.add("유병승");
		names2.forEach((o)->System.out.println(o));
		
		//LinkedList클래스이용하기
		//List인터페이스를 구현한 클래스
		//사용법은 ArrayList클래스와 유사함.
		LinkedList linkList=new LinkedList();
		//LinkedList에 값을 대입, 출력, 순회 방법은 ArrayList와 동일함.
		linkList.add("최주영");
		linkList.add("이동제");
		linkList.add("최인호");
		System.out.println(linkList.get(0));
		linkList.forEach((e)->System.out.println(e));
		
		System.out.println(linkList.getFirst());
		System.out.println(linkList.getLast());
		
		//기본적으로 데이터를 저장, 출력 : ArrayList사용
		//저장된 데이터를 조작이 많을때 : LinkedList를 사용
		
		
		
	}

}