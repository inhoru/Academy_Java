package com.bs.example.practice6.run;

import com.bs.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b = new Book();
		Book b1 = new Book("강태풍의태풍교실","교보문고","강태풍");
		Book b2 = new Book("강바람의 바람풍","알라딘","강바람",5000,5.5);
		
		b1.inform();
		b2.inform();
		
	}

}
