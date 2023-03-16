package com.obj.run;

import com.obj.model.vo.Person;

public class PersonMain {

	public static void main(String[] args) {
			
	Person p = new Person("강태풍","경기도 시흥시","01036446259",180.5,65.5);
	Person p1 = new Person("강바람","경기도 안양시","01012345678",195.5,100.2);
	
	System.out.println(p.phoneNumber+" "+p.height+" "+p.weight);
	System.out.println(p1.phoneNumber+" "+p1.height+" "+p1.weight);
		
		
		
		
		
		
	}

}
