package com.inter.run;

import java.util.Arrays;

import com.inter.common.FilterFruit;
import com.inter.model.vo.Fruit;

public class FruitMain {
	public static void main(String[] args) {
		Fruit[] fruits=new Fruit[] {
				new Fruit("사과","빨강",15000,3.2),
				new Fruit("바나나","노랑",8000,2.1),
				new Fruit("키위","초록",10000,1.2),
				new Fruit("수박","초록",20000,5),
				new Fruit("딸기","빨강",15000,0.8),
				new Fruit("오렌지","주황",20000,1.5)
		};
		
		Fruit[] result=searchColor(fruits,"빨강");
		System.out.println(Arrays.toString(result));
		result=searchWeight(fruits,3);
		System.out.println(Arrays.toString(result));
		result=searchPrice(fruits,15000);
		System.out.println(Arrays.toString(result));
		
		result=searchFruit(fruits,"초록",new FilterFruit() {
			
			@Override
			public boolean check(Fruit f, Object data) {
				// TODO Auto-generated method stub
				return f.getColor().equals(data);
			}
		});
		System.out.println(Arrays.toString(result));
		
		result=searchFruit(fruits,3.0,new FilterFruit() {
			
			@Override
			public boolean check(Fruit f, Object data) {
				// TODO Auto-generated method stub
				return f.getWeight()>=(double)data;
			}
		});
		result=searchFruit(fruits,3.0,
				(Fruit f, Object data)-> 
					f.getWeight()<=(double)data);
		System.out.println(Arrays.toString(result));
		result=searchFruit(fruits,"사과",
				(f, data)->f.getName().equals(data));
		System.out.println(Arrays.toString(result));
	}
	public static Fruit[] searchFruit(Fruit[] ori, Object data, FilterFruit ff) {
		Fruit[] searchFruit=new Fruit[ori.length];
		int index=0;
		for(int i=0;i<ori.length;i++) {
			if(ff.check(ori[i], data)) {
				searchFruit[index++]=ori[i];
			}
		}
		Fruit[] result=new Fruit[index];
		System.arraycopy(searchFruit, 0, result, 0, index);
		return result;
	}
	
	
	
	
	
	//색상조회하기
	public static Fruit[] searchColor(Fruit[] ori, String color) {
		Fruit[] searchFruit=new Fruit[ori.length];
		int index=0;
		for(int i=0;i<ori.length;i++) {
			if(ori[i].getColor().equals(color)) {
				searchFruit[index++]=ori[i];
			}
		}
		Fruit[] result=new Fruit[index];
		System.arraycopy(searchFruit, 0, result, 0, index);
		return result;
	}
	//무게조회하기
	public static Fruit[] searchWeight(Fruit[] ori, double weight) {
		Fruit[] searchFruit=new Fruit[ori.length];
		int i=0;
		for(Fruit f : ori) {
			if(f.getWeight()>=weight)
				searchFruit[i++]=f;
		}
		Fruit[] result=new Fruit[i];
		System.arraycopy(searchFruit, 0, result, 0,i);
		return result;
	}
	//가격조회하기
	public static Fruit[] searchPrice(Fruit[] ori, int price) {
		Fruit[] searchFruit=new Fruit[ori.length];
		int i=0;
		for(Fruit f : ori) {
			if(f.getPrice()>=price)
				searchFruit[i++]=f;
		}
		Fruit[] result=new Fruit[i];
		System.arraycopy(searchFruit, 0, result, 0, i);
		return result;
	}
}
