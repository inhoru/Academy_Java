package com.obj.run;

import com.obj.model.vo.Product;

public class ProductMain {
	public static void main(String[] args) {

		Product p = new Product("컴퓨터", "maxbook", 200);

		Product p1 = new Product("핸드폰", "갤럭시노트", 120, 0.2);

		Product p2 = new Product("마스크", 10, 0.5, 100);

		System.out.println(p.empNo+" "+p.type+" "+p.name+" "+ p.pric);
		System.out.println(p1.empNo+" "+p1.type+" "+p1.name+" "+p1.pric+" "+p1.discount);
		System.out.println(p2.empNo+" "+p2.name+" "+p2.pric+" "+p2.discount+" "+p2.quantity);
	}

}
