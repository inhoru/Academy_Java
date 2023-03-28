package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.collection.model.vo.Student;

public class SetController {
	public static void main(String[] args) {
		// Set에 대해 알아보자 -> 인터페이스
		// 다수의 객체를 보관할 수 있는 클래스다.
		// HashSet,LinkedHashSet,TreeSet
		// 데이터를 중복해서 저장하지 않는다, 데이터를 지정할 수 있는 구분자가없음
		HashSet set = new HashSet();
		// 데이터저장하기
		set.add("유병승");
		set.add("최주영");
		set.add("최솔");
		set.add("이다영");
		System.out.println(set);

		// set저장된 데이터를 한개씩 출력하기
		// Iterator인터페이스 이용해서 출력
		System.out.println();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			String value = (String) it.next();
			System.out.println(value);

		}
		// forEach문 이용하기
		System.out.println();
		System.out.println("forEach문으로 출력하기");
		for (Object o : set) {
			System.out.println(o);
		}

		// forEach() 메소드 도 사용가능
		System.out.println();
		set.forEach((o) -> System.out.println(o));
		
		
		
		//set메소드 이용하기
		//1. set에 저장된 데이터 갯수확인
		//size() 메소드 제공
		System.out.println();
		System.out.println(set.size());
		
		//2. set에 저장된 데이터가 저장되어있는지 확인하는 메소드
		// isEmpty()
		//비어있니? 비어있으면 true 안비어있으면 false
		System.out.println();
		System.out.println(set.isEmpty());
		
		//3.set에 특정값이 있는지 확인하는 메소드
		//contains(Object) equals,hasCode 가 오버라이딩 되어있어야한다 
		System.out.println();
		System.out.println(set.contains("최솔"));
		System.out.println(set.contains("김중근"));
		
		//4.set에 저장되어있는 객체를 삭제하는 메소드
		//remover(Object)
		System.out.println();
		set.remove("유병승");
		
		set.forEach((o)-> System.out.println(o));
		
		
		//Set은 중복되는데이터는 저장하지않는다.
		System.out.println();
		set.add("최주영");
		set.add("최주영");
		set.add("최주영");
		set.add("최주영");
		set.add("최주영");
		set.add("최주영");
		set.add("최주영");
		set.add("최주영");
		set.add("최주영");
		set.forEach((o)->System.out.println(o));
		
		//로또번호도 가능 중복값이안나옴
		//set.add((int)(Math.random()*45)+1);
		
		
		HashSet students = new HashSet();
		
		students.add(new Student("유병승",1,3,'남'));
		students.add(new Student("최주영",3,2,'남'));
		students.add(new Student("김예린",2,1,'여'));
		students.add(new Student("윤나라",2,2,'여'));
		
		students.forEach((s)-> System.out.println(s));
		
		//전체출력이아닌 해당데이터를 찾아낼때 사용한다.
		System.out.println();
		for(Object o : students) {
			//Object로 받으니 형변환해줌
			Student s=(Student)o;
			if(s.getGender()=='여')
			System.out.println(s.getName()+" "+s.getGender());
		}
		
		//중복값은 안들어간다. equals, hashCode 가 오버라이드 되어있어야한다.
		students.add(new Student("유병승",1,3,'남'));
		students.add(new Student("유병승",1,3,'남'));
		students.add(new Student("유병승",1,3,'남'));
		students.add(new Student("유병승",1,3,'남'));
		System.out.println();
		
		//코드가 길어지면(if나 그런게잇으면 출력에 중괄호를 붙여야한다.)
		students.forEach((e)->{
			System.out.println(e);
		});
		
		//set과 list의 호환하기
		System.out.println();
		List studentList = new ArrayList(students);
		System.out.println("리스트로 변환 후 출력하기");
		System.out.println(studentList.get(0));
		System.out.println(studentList.get(1));
		
		System.out.println();
		List testData = List.of(1,2,3,4,5,6,6,7,7,8,8,10,10);
		for(Object o : testData) {
			System.out.print(o+",");
		}
		System.out.println();
		//리스트에잇는값을 중복값제거할려면 이렇게할수가있다.
		Set temp = new HashSet(testData);
		testData=new ArrayList(temp);
		for(Object o : testData) {
			System.out.print(o+",");
		}
		System.out.println();
		System.out.println("students데이터추가후 출력");
		testData.addAll(students);
		testData.forEach((e)->System.out.println(e));
		
		//저장순서를 유지하는 set
		LinkedHashSet liSet = new LinkedHashSet();
		liSet.add(1);
		liSet.add(3);
		liSet.add(2);
		liSet.add(2);
		liSet.add(2);
		liSet.add(8);
		liSet.add(4);
		System.out.println();
		System.out.println("linkedHashSet출력");
		for(Object i : liSet) {
			System.out.println(i);
		}
		
		//Tree구조에 객체를 대입할때는 그 클래스에 compareTo()메소드가 재정의 되어 있어야한다.
		//Comparable인터페이스 구현하기
		//tree구조에서는 중복값을 기준으로 선언하면안됨.
		System.out.println();
		TreeSet studentTree = new TreeSet();
		studentTree.add(new Student("유병승",1,1,'남'));
		studentTree.add(new Student("최주영",2,1,'남'));
		studentTree.add(new Student("김현영",2,2,'여'));
		studentTree.add(new Student("최하리",1,2,'여'));
		
//		for(Object o : studentTree) {
//			System.out.println(o);
//		}
		System.out.println("studentTree 출력");
		studentTree.forEach((e)-> System.out.println(e));
	}
	

}
