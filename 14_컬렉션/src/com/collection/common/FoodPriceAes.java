package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Food;

public class FoodPriceAes implements Comparator{
	
	
	@Override

	public int compare(Object o1, Object o2) {
		Food f = (Food)o1;
		Food f2 = (Food)o2;
		//가격기준으로 정렬
		// 반환값설정
		//+ : 두개의 객체 위치를 변경
		//-,0 : 변경하지않음
		//동일한값에 대한 설정
		//오름차순정렬
		if(f.getPrice()>f2.getPrice()) return 1;
		else if (f.getPrice()<f2.getPrice())return-1;
		else return 0;
				
		
	}
	
}
