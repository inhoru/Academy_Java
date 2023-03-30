package com.collection.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Animal;
import com.collection.model.vo.Fruit;
import com.collection.model.vo.Person;

public class Test {
	public static void main(String[] args) {
		HashMap mp = new HashMap();
		mp.put("1", new Fruit("귤", "제주도", 10, 15000));
		mp.put("2", new Fruit("사과", "예산", 5, 25000));
		mp.put("3", new Fruit("포도", "영동", 10, 35000));
		mp.put("4", new Fruit("배", "나주", 10, 50000));

		Set<Map.Entry> entry = mp.entrySet();

		for (Map.Entry<String, Fruit> i : entry) {
			System.out.println(i.getKey() + " " + i.getValue());

		}

		Set<Map.Entry> entrymp = mp.entrySet();
		entrymp.forEach((e) -> System.out.println(e.getKey()));

		// 저장한 데이터 중 키가 180이상인 사람의 나이를 1씩 증가 시킨 후 모든 데이터 출력하기
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("유병승", 19, '남', 180.5, 65.5));
		list.add(new Person("홍길동", 44, '여', 155.5, 45.5));
		list.add(new Person("고길동", 20, '남', 175.5, 70.5));
		list.add(new Person("선덕여왕", 35, '여', 150.2, 50.5));
		list.add(new Person("김두환", 42, '남', 188.2, 95.5));

		list.forEach((e) -> {
			if (e.getHeight() >= 180.0) {
				e.setAge(e.getAge() + 1);
			}
		});
		list.forEach((e) -> System.out.println(e));

		// 나이가 40세 이상인 사람만 출력하기
		System.out.println();
		list.forEach((e) -> {
			if (e.getAge() >= 40) {
				System.out.println(e);
			}

		});
		// 사원을 이름(내림차순)순으로 정렬하기
		System.out.println();
		list.sort((e, e1) -> e1.getNaem().compareTo(e.getNaem()));
		list.forEach((e) -> System.out.println(e));

		// 사원을 키(오름차순)순으로 정렬하기
		System.out.println();
		list.sort((e, e1) -> (int) (e.getHeight() - e1.getHeight()));
		list.forEach((e) -> System.out.println(e));

		// 2번 인덱스에 최주영,26,남,177.3,70.5 저장하기(추가)
		System.out.println();
		list.add(2, new Person("최주영", 26, '남', 177.3, 70.5));
		list.forEach((e) -> System.out.println(e));

		System.out.println();
		// 3번 인덱스 값을 이동제,25,175.3,68.3 으로 변경하기
		list.set(3, new Person("이동제", 25, '남', 175.3, 68.3));
		list.forEach((e) -> System.out.println(e));

		System.out.println();
		// 고길동, 20, 남, 175.5, 70.5이 리스트에 있는지 확인하고 없으면 추가하기
		int index = list.indexOf((new Person("고길동", 20, '남', 175.5, 70.5)));
		if (index == -1) {
			list.add((new Person("고길동", 20, '남', 175.5, 70.5)));
		}
		list.forEach((e) -> System.out.println(e));

		// 이름이 선덕여왕인 사람의 위치를 찾아서 그 위치에 주몽,58,남,189.4,90.3을 대입하기
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNaem().contains("선덕여왕")) {
				list.set(i, new Person("주몽", 58, '남', 189.4, 90.3));
			}
		}
		list.forEach((e) -> System.out.println(e));

		{
		}
		
		//4번 인덱스의 사람 삭제하기
		System.out.println();
		list.remove(4);
		list.forEach((e)->System.out.println(e));
		
		//김두환, 42, 남, 188.2, 95.5 사람 삭제하기
		System.out.println();
		list.remove(new Person("김두환",43,'남',188.2,95.5));
		list.forEach((e)-> System.out.println(e));
		
		//리스트에 값이 있는지 없는지 확인하고 값이 있으면 사람있어요~~ 출력 없으면 사람없어요~~ 출력
		System.out.println();
		boolean flag = list.isEmpty();
		if(flag) {
			System.out.println("사람없어요~~");
			
		}else {
			System.out.println("사람있어요~");
		}
		
		//리스트에 있는 모든데이터 삭제하기
		System.out.println();
		list.clear();
		System.out.println(list.size());
	}

}
