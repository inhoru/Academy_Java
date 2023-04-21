package com.bs.view;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.bs.controller.EmployeeController;
import com.bs.model.dto.Employee;

public class MainView {
	private Scanner sc = new Scanner(System.in);

	public void mainMnue() {
		EmployeeController controller = new EmployeeController();
		while (true) {
			System.out.println("==== 전체사원 조회 ====");
			System.out.println("1. 전체 사원조회");
			System.out.println("2. 사원조회(1.부서 2. 직책 3. 이름 4. 급여(크고작고)");
			System.out.println("3. 사원등록");
			System.out.println("4. 사원수정(직책, 부서, 급여, 전화번호, 이메일");
			System.out.println("5. 사원삭제");
			System.out.println("6. 부서관리 (1.등록 2.수정 3.삭제");
			System.out.println("7. 직책관리 (1.등록 2.부서수정 3. 삭제");
			System.out.println("8. 프로그램종료");
			System.out.print("메뉴 입력 : ");
			int cho = sc.nextInt();
			switch(cho) {
			case 1 : controller.selectAllEmployee();break;
			case 2 : controller.selectSearchEmployee();break;
			case 3 : 
			case 4 :
			case 5 :
			case 6 :
			case 7 :
			case 8 :System.out.println("프로그램을 종료합니다.");return;
				default : 
					System.out.println("잘못입력하셧습니다 다시입력해주세요.");
				
			}
			
		}

	}
	public void printMembers(List<Employee> employee) {
		System.out.println("==== 조회된 결과 ====");
		employee.forEach(e->System.out.println(e));
		System.out.println("=================");
	}
	
	public Map inputSearch() {
		System.out.println("==== 사원 항목별검색 ====");
		System.out.println("항목 1.부서 2.직책 3.이름 4.급여(크고작고)");
		int cho = sc.nextInt();
		String col = "";
		switch(cho) {
		case 1 : col = "dept_title";break;
		case 2 : col = "job_name";break;
		case 3 : col = "emp_name";break;
		case 4 : col = "salary";
		System.out.print("1. 입력한 급여보다 작은 사원조회");
		System.out.print("2. 입력한 급여보다 큰 사원조회");
		int ch = sc.nextInt();
		switch(ch) {
		case 1 :
		case 2 :
		}
		System.out.print("검색어 : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		return Map.of("col",col,"keyword",keyword);
		}
		System.out.print("검색어 : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		return Map.of("col",col,"keyword",keyword);
	}

}
