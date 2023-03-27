package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Food;

public class FoodTypeAscending implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Food prev = (Food)o1;
		Food next = (Food)o2;
		if(prev.getType().compareTo(next.getType())==0) {
//			if(prev.getPrice()<next.getPrice()) return +1;
//			else if(prev.getPrice()>next.getPrice()) return -1;
//			else return 0;
			
			//오름차순정렬
			return prev.getPrice()-next.getPrice();
			//내림차순정렬
			//return next.getPrice()-prev.getPrice();
		}
		
		return prev.getType().compareTo(next.getType());
		
	}

}
