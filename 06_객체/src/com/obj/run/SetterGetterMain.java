package com.obj.run;

import com.obj.basiccontroller.MyMethod;
import com.obj.model.vo.Employee;

public class SetterGetterMain {

	public static void main(String[] args) {
		// Employee
//		Employee e = new Employee("유병승", "강사부", 500, 0.5);
//		System.out.println(e.inforEmp());
		// e.name="최주영";private라서 변경불가
		// System.out.println(e.name); private라서 접근자체가불가능

		// 필드를 수정,출력하기 위한 메소드를 선언한다.!
		// 수정 : setter()
		// 출력 : getter()
		// setter/getter메소드는 public으로 선언하고
		// 각필드당 한개씩 선언
		// setter/getter은 명명규칙이 있음
		// set필드명/ get필드명 -> camelcase를준수
		// 예) setName/ getName
		// setter메소드는 대입할 데이터가 필요하기 때문에 메개변수로 필드에 대입할값을 받는다.
		// getter메소드는 데이터를 출력하는것으로 반환형이 있다.
//		System.out.println(e.getName());
//		e.setName("홍길동");
//		System.out.println(e.inforEmp());
//		System.out.println(e.getName());
//		// Employee클래스에 empNo필드를 제외한 모든 필드에
//		// setter getter메소드를 추가하고
//		// 기본생성자로 사원 5명을 생성하고 setter로 값을 대입 후 getter출력하기
//		// 유병승 강사부 500 0.5
//		// 홍길동 강사부 200 0.2
//		// 이순신 인사부 300 0.3
//		// 최주영 인턴 10 0
		// 김중근 인턴 10 0.2
		MyMethod mmt = new MyMethod();
		Employee m = new Employee();
		mmt.makeEmployee(m, "유병승", "강사부", 500, 0.5);//MyMethod 클래스파일에서 메소드를만들어서 가져와서썻다람쥐
//		m.setName("유병승");
//		m.setDepartment("강사부");
//		m.setSalary(500);
//		m.setBonus(0.5);
		
		Employee g = new Employee();
		mmt.makeEmployee(g, "홍길동", "강사부",200, 0.2);
//		g.setName("홍길동");
//		g.setDepartment("강사부");
//		g.setSalary(200);
//		g.setBonus(0.2);
		
		Employee s = new Employee();
		mmt.makeEmployee(s, "이순신", "인사부",300, 0.3);
//		s.setName("이순신");
//		s.setDepartment("인사부");
//		s.setSalary(300);
//		s.setBonus(0.3);
		
		Employee j; //= new Employee();
		j=mmt.makeEmployee2("최주영", "인턴", 10, 0);//<-여기서도 뉴를써서 증가함
//		j.setName("최주영");
//		j.setDepartment("인턴");
//		j.setSalary(10);
//		j.setBonus(0);
		
		Employee joogn; //= new Employee();
		joogn=mmt.makeEmployee2("김중근", "인턴", 10, 0.2);
//		joogn.setName("김중근");
//		joogn.setDepartment("인턴");
//		joogn.setSalary(10);
//		joogn.setBonus(0.2);
		
		System.out.print(m.getEmpNo()+" "+m.getName()+" "+m.getDepartment()+" "+
		m.getSalary()+" "+m.getBonus()+" "+m.getBonus());
		System.out.println();
		System.out.print(g.getEmpNo()+" "+g.getName()+" "+g.getDepartment()+" "+
				g.getSalary()+" "+g.getBonus()+" "+g.getBonus());;
		System.out.println();
		System.out.print(s.getEmpNo()+" "+s.getName()+" "+s.getDepartment()+" "+
				s.getSalary()+" "+s.getBonus()+" "+s.getBonus());
		System.out.println();
		System.out.print(j.getEmpNo()+" "+j.getName()+" "+j.getDepartment()+" "+
				j.getSalary()+" "+j.getBonus()+" "+j.getBonus());
		System.out.println();
		System.out.print(joogn.getEmpNo()+" "+joogn.getName()+" "+joogn.getDepartment()+" "+
				joogn.getSalary()+" "+joogn.getBonus()+" "+joogn.getBonus());		System.out.println();
		
		
		
		
	}
	
		
	
		
	
	

}
