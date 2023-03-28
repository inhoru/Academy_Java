package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Food;

public class FoodNameAscending implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		Food prev=(Food)o1;
		Food next=(Food)o2;
		return prev.getName().compareTo(next.getName());
	}
}
