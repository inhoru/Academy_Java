package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Food;

public class FoodPriceDecending implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Food prev = (Food)o1;//앞에있는갚
		Food next = (Food)o2;//뒤에있는갚
		if(prev.getPrice()<next.getPrice())return +1;
		else if(prev.getPrice()>next.getPrice())return -1;
		else return 0;
			
	}
	
}
