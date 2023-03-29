package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Food;

public class FoodDecending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//내림차순정렬
		return ((Food)o2).getName().compareTo(((Food)o1).getName());
	}
	
}
