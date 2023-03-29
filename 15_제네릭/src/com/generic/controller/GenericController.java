package com.generic.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.generic.model.vo.Animal;
import com.generic.model.vo.Food;
import com.generic.model.vo.Fruit;
import com.generic.model.vo.GenericBasic;
import com.generic.model.vo.GenericInterface;

public class GenericController {

	public static void main(String[] args) {
		//제네릭에 대해 알아보자.
		//자바에서 동적타입을 선언하는 구문
		//<자료형>으로 제네릭으로 선언된 자료형을 결정
		
		//제네릭으로 선언된 클래스 이용하기
		GenericBasic<String,Date> gb=new GenericBasic();
		gb.setData("유병승");
		System.out.println(gb.getData());
		//gb.setData(19); String 로 선언햇기때문에 문자열만가능
		GenericBasic<Integer,Math> gb1=new GenericBasic();
		gb1.setData(19);
		System.out.println(gb1.getData());
		
		//밑부분 다시듣기 이게뭔소리임?
		GenericInterface<String, String> stringFilter = (e,v)->e.equals(v);
		stringFilter.check("dfds","Dfd");
		GenericInterface<GenericBasic<String[] ,Date>,String> filter = (e,v)->e.equals(v);
		filter.check(new GenericBasic<>(),"sada");
		
		//ArrayList에 제네릭타입선언 후 이용하기
		ArrayList<String> names = new ArrayList();
//		names.add(10);
//		names.add(true);
		names.add("유병승");
		names.add("강민기");
		for(String s : names) {
			System.out.println(s);
		}
		
		ArrayList<Fruit> fruits =  new ArrayList();
		fruits.add(new Fruit("딸기","논산",10,10000));
		//fruits.add(new Animal()); Fruit로 제네릭을 선언햇기에 다른건안된다.
		fruits.add(new Fruit("포도","송산",10,20000));
		fruits.add(new Fruit("사과","예산",20,35000));
		
		for(int  i = 0;i<fruits.size();i++) {
			//원래는 ((Fruit)fruits.get(i).getName(); 이렇게 Object를 Fruit로 형변환후 가져와야햇지만
			//제네릭으로 Fruit를 선언햇으니 형변환을 할필요가없다.
			
			fruits.get(i).getName();
			
		}
		
//		for (Fruit f : fruits) {
//			f.getName();
//			
//		}
		System.out.println();
		System.out.println("==== 제네릭이용 Iterator ==== ");
		Set<Animal> animals = new HashSet();
		animals.add(new Animal("바둑이",8.3,4,"강아지"));
		animals.add(new Animal("꽤꽥이",4.6,3,"오리"));
		//animals.add(new Fruit()); 똑같이 제네릭을 Animal을 저장햇기에 Fruit는 저장이안된다.
		Iterator<Animal> it = animals.iterator();
		
		while(it.hasNext()) {
			Animal a =it.next();
			System.out.println(a.getName());
		}
		
		System.out.println();
		System.out.println("====== Map =====");
		Map<String,Food> foods = new HashMap();
		foods.put("1", new Food("윤쉐프",7000,"급식",new Date()));
		foods.put("2", new Food("족발",35000,"한식",new Date()));
		foods.put("1", new Food("초밥",12000,"일식",new Date()));
		//foods.put(10, null); key를 String로 고정했기떄문에 인트가들어갈수가없다. 타입이공정됫다.
		
		Set<String> keys = foods.keySet();//키 들만가져와서 셋에저장 그키들은 모두String다.
		Iterator<String> it2 = keys.iterator();
		while(it2.hasNext()) {
			String key = it2.next();
			System.out.println(foods.get(key).getName());
		}
		
		System.out.println();
		System.out.println("==== Map.Entry ====");
		Set<Map.Entry<String,Food>> entry = foods.entrySet();
		Iterator<Map.Entry<String, Food>> entryit = entry.iterator();
		while(entryit.hasNext()) {
			Map.Entry<String, Food> t = entryit.next();
			System.out.println(t.getKey());
			System.out.println(t.getValue().getName()+ " "+t.getValue().getPrice());
		}		
		System.out.println();
		for (Entry<String, Food> e : entry) {
			System.out.println(e.getKey());
			System.out.println(e.getValue().getName()+ " "+e.getValue().getPrice());
			
		}
		System.out.println();
		entry.forEach(food->System.out.println(food.getKey()+" "+food.getValue().getName()+" "+food.getValue().getPrice()));
		
		//테이블당 음식주문을 관리하는 저장소
		System.out.println();
		System.out.println("=== Map 벨류에 List 넣기 ===");
		Map<String,List<Food>> foodTable = new HashMap();
		
		foodTable.put("a",new ArrayList<Food>()) ; //List<Food> foods=new ArrayList(); 이거랑 같다
		//짜장면 ,짬뽕, 탕수육 -> a
		foodTable.get("a").add(new Food("짜장면",8500,"중식",new Date()));//
		foodTable.get("a").add(new Food("짬뽕",9000,"중식",new Date()));//
		foodTable.get("a").add(new Food("탕수육",15000,"중식",new Date()));//
		List<Food> orderList = foodTable.get("a");
		orderList.forEach(food-> System.out.println(food));
		
	}

}
