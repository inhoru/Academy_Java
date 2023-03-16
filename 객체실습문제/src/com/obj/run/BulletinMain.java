package com.obj.run;

import com.obj.model.vo.Bulletin;

public class BulletinMain {

	public static void main(String[] args) {
		Bulletin b =new Bulletin("첫번째 게시글","두번째 게시글");
		
		 	
		System.out.println(b.getG1());
		System.out.println(b.getG2());
		
	}

}
