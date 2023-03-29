package com.collection.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Fruit;

public class Test {
	public static void main(String[] args) {
		HashMap mp = new HashMap();
		mp.put("1", new Fruit("귤", "제주도", 10, 15000));
		mp.put("2", new Fruit("사과", "예산", 5, 25000));
		mp.put("3", new Fruit("포도", "영동", 10, 35000));
		mp.put("4", new Fruit("배", "나주", 10, 50000));
		
		for (Object i : mp.entrySet()) {
			Map.Entry  is = (Map.Entry) i; 
			System.out.println(is.getKey()+" "+is.getValue());
			
		}
		
		Set <Map.Entry> entrymp = mp.entrySet();
		entrymp.forEach((e)->System.out.println(e.getKey()));
		
	
	}
	
}
