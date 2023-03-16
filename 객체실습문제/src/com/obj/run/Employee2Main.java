package com.obj.run;

import com.obj.model.vo.Employee2;

public class Employee2Main {

	public static void main(String[] args) {
		Employee2 e =new Employee2("유병승","강사부");
		System.out.println(e.name+" "+e.department);
		
		Employee2 e1 =new Employee2("은세계","학생부");
		System.out.println(e1.name+" "+e1.department);

		
		
	}

}
