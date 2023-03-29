package com.collection.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.collection.model.vo.Fruit;
import com.collection.model.vo.Student;

public class MapController {

	public static void main(String[] args) {
		// Map에 대해 알아보자
		// 저장구조가 key:value형식임. key,value쌍으로 이어져있음
		// Collection인터페이스하고 별개의 Collection프레임워크

		// Map인터페이스를 구현한 클래스
		// HashMap, TreeMap
		HashMap map = new HashMap();
		// 저장할때 key값과 value를 동시에 설정
		// put(key,value)메소드를 이용
		// key : Object(기본) -> String으로 많이 사용, Integer형
		// value : Object(기본) -> vo객체, String, Integer 등
		map.put("bs", new Student("유병승", 1, 1, '남'));
		map.put("jy", new Student("최주영", 2, 1, '남'));
		map.put("nb", new Student("나빈", 2, 2, '여'));
		map.put("sj", new Student("이성진", 3, 2, '여'));

		System.out.println(map);

		// map에 저장되어있는 데이터 가져오기
		// key값으로 value를 가져올 수 있다.
		// get(key) 메소드를 이용

		Object o = map.get("sj");
		System.out.println(o);
		o = map.get("nb");
		System.out.println(o);

		// 1.key값은 중복이 불가능하다.
		// 중복되는 키에 넣으면은 나중에온값으로 덮어쓰기를한다.
		System.out.println();
		map.put("bs", "바보~");
		System.out.println(map.get("bs"));

		// 2.value값은 중복이 가능하다.
		System.out.println();
		map.put("bs2", "바보~");
		System.out.println(map.get("bs2"));

		// map에 저장된 데이터수 확인하기
		// size()
		System.out.println();
		System.out.println(map.size());

		// map에 저장된 데이터 삭제하기
		// remove(key)
		System.out.println();
		map.remove("bs2");
		System.out.println(map.size());
		o = map.get("bs2");
		System.out.println(o);

		// map에 특정키값이 있는지 확인하는 메소드
		// containsKey(키값)
		// 키값이 있으면 : true
		// 키값이 없으면 : false
		System.out.println();
		System.out.println(map.containsKey("jy"));
		System.out.println(map.containsKey("js"));

		// map에 특정값이 있는지 확인하는 메소드
		// containsValue(값)
		System.out.println();
		System.out.println(map.containsValue(new Student("최주영", 2, 1, '남')));
		System.out.println(map.containsValue("유병승"));

		// Map과 List 호환하기
		// Map -> List반환하기
		// Map.values()
		System.out.println();
		List data = new ArrayList(map.values());

		data.forEach((e) -> System.out.println(e));

		// Map에 저장된 데이터 전체를 순회하기
		// get(key);
		// key전체를 가져오는 메소드를 이용
		// keySet()메소드 -> Set으로 반환
		System.out.println();
		Set keys = map.keySet();
//		Iterator it = keys.iterator();
//		while(it.hasNext()) {
//			Object key = it.next();
//			//System.out.println(it.next());
//			System.out.println(key+" "+map.get(key));
//		}
		// 포이치로도 출력이가능하다.
		for (Object key : keys) {
			System.out.println(key + " " + map.get(key));
		}

		// key와 value를 동시에 반환해주는 메소드는 제공
		// entrySet()메소드 Map.Entry내부클래스를 이용
		System.out.println("entryset");
		for (Object i : map.entrySet()) {
			Map.Entry  is = (Map.Entry) i; 
			System.out.println(is.getKey()+" "+is.getValue());
			
		}
//		Iterator it2 = entry.iterator();
//		while (it2.hasNext()) {
//			Map.Entry all = (Map.Entry) it2.next();
//			System.out.println(all.getKey());
//			System.out.println(all.getValue());
//		}

		// 과일을 저장하는 클래스를 생성
		// 이름, 원산지, 수량, 가격
		// 귤, 제주도, 10, 15000
		// 사과, 예산, 5, 25000,
		// 포도, 영동, 10, 35000,
		// 배, 나주, 10, 50000
		// Map방식으로 저장, key값 1~4로 저장

		// 1. 전체 데이터 조회
		// 2. 가격이 20000원이상인 과일만 key와 value출력
		// 3. 이름이 한글자인 과일의 key,value를 출력
		// 4. 포도의 가격을 40000원으로 수정하고 전체데이터 출력
		// 5. 배를 찾아 삭제하기

		HashMap mp = new HashMap();
		mp.put(1, new Fruit("귤", "제주도", 10, 15000));
		mp.put(2, new Fruit("사과", "예산", 5, 25000));
		mp.put(3, new Fruit("포도", "영동", 10, 35000));
		mp.put(4, new Fruit("배", "나주", 10, 50000));

		// 1. 전체 데이터 조회
		System.out.println();
		Set mps = mp.keySet();
		for (Object om : mps) {
			System.out.println(om + " " + mp.get(om));
		}

		// 2. 가격이 20000원이상인 과일만 key와 value출력
		System.out.println();
		Set entrymp = mp.entrySet();
		for (Object om : entrymp) {
			Map.Entry all = (Map.Entry) om;
			Fruit f = (Fruit) all.getValue();
			if (f.getPrice() >= 20000) {
				System.out.print(all.getKey()+" ");
				System.out.println(all.getValue());
			}

		}

		// 3.이름이 한글자인 과일의 key,value를 출력
		System.out.println();
		for (Object om : entrymp) {
			Map.Entry all = (Map.Entry) om;
			Fruit f = (Fruit) all.getValue();
			if (f.getName().length() <= 1) {
				System.out.print(all.getKey()+" ");
				System.out.println(all.getValue());
			}
		}
		// 4.포도의 가격을 40000원으로 수정하고 전체데이터 출력
		System.out.println();
		for(Object om : entrymp) {
			Map.Entry all = (Map.Entry) om;
			Fruit f = (Fruit)all.getValue();
			if(f.getName().equals("포도")) {
				f.setPrice(40000);
				
			}
		}
		for (Object om : mps) {
			System.out.println(om + " " + mp.get(om));
		}
		//5. 배를 찾아 삭제하기
		System.out.println();
		
		for(Object om : entrymp) {
			int index = 0;
			Map.Entry all = (Map.Entry) om;
			if(((Fruit)all.getValue()).getName().equals("배")) {
				index = (int) all.getKey();
				mp.remove(index);
			} mp.forEach((key, value) -> System.out.println(key + " " + value));
		}

		//Map도 of메소드를 이용해서 불변의 데이터를 생성할 수 있다.
		Map data1 = Map.of("name","유병승","age",19,"gender",'M');
		System.out.println(data1);
		//수정이불가능하다.
//		data1.put("name", "경기도 시흥시");
//		System.out.println(data1);
		System.out.println();
		
		List dataList = new ArrayList();
		dataList.add(Map.of("name","유병승","age",19));
		dataList.add(Map.of("name","정상준","age",26));
		dataList.add(Map.of("name","윤지환","age",25));
		dataList.add(Map.of("name","조장흠","age",26));
		
		
		for(Object o2 : dataList) {
			System.out.print(((Map)o2).get("name") + " ");
			System.out.println(((Map)o2).get("age"));
		}
	}

}
