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
			System.out.println("2. 사원조회(1.부서 2. 직책 3. 이름 4. 급여(크고작고))");
			System.out.println("3. 사원등록");
			System.out.println("4. 사원수정(직책, 부서, 급여, 전화번호, 이메일");
			System.out.println("5. 사원삭제");
			System.out.println("6. 부서관리 (1.등록 2.수정 3.삭제");
			System.out.println("7. 직책관리 (1.등록 2.부서수정 3. 삭제");
			System.out.println("8. 프로그램종료");
			System.out.print("메뉴 입력 : ");
			int cho = sc.nextInt();
			switch (cho) {
			case 1:
				controller.selectAllEmployee();
				break;
			case 2:
				controller.selectSearchEmployee();
				break;
			case 3:
				controller.insertEmployee();
				break;
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셧습니다 다시입력해주세요.");

			}

		}

	}

	public void printMembers(List<Employee> employee) {
		System.out.println("==== 조회된 결과 ====");
		// employee.sort((e,e1)->e.getEmpId().compareTo(e1.getEmpId()));
		employee.forEach(e -> System.out.println(e));

		System.out.println("=================");
	}

	public void printMsg(String msg) {
		System.out.println("==== 시스템 메세지 ====");
		System.out.println(msg);
		System.out.println("===================");
	}

	public Map inputSearch() {
		System.out.println("==== 사원 항목별검색 ====");
		System.out.println("항목 1.부서 2.직책 3.이름 4.급여(크고작고)");
		System.out.print("입력 : ");
		int cho = sc.nextInt();
		String col = "";
		int ch = 0;
		switch (cho) {
		case 1:
			col = "dept_title";
			break;
		case 2:
			col = "job_name";
			break;
		case 3:
			col = "emp_name";
			break;
		case 4:
			col = "salary";
			System.out.println("1. 입력한 급여보다 작은 사원조회");
			System.out.println("2. 입력한 급여보다 큰 사원조회");
			System.out.print("입력 : ");
			ch = sc.nextInt();
			if (ch == 1) {
				sc.nextLine();
				System.out.print("월급 입력 : ");
				int keyword = sc.nextInt();
				return Map.of("col", col, "keyword", keyword, "ch", ch);
			} else if (ch == 2) {
				sc.nextLine();
				System.out.print("월급 입력 : ");
				int keyword = sc.nextInt();
				return Map.of("col", col, "keyword", keyword, "ch", ch);

			}

		}
		System.out.print("검색어 : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		return Map.of("col", col, "keyword", keyword, "ch", ch);
	}

	public Employee addEmployee() {
		Employee e = new Employee();
		System.out.println("==== 회원등록 ====");
		System.out.print("이름 : ");
		e.setEmpName(sc.nextLine());
		System.out.print("주민번호(-)포함 : ");
		e.setEmpNo(sc.nextLine());
		System.out.print("이메일 : ");
		e.setEmail(sc.nextLine());
		System.out.print("폰번호 : ");
		e.setPhone(sc.nextLine());
		System.out.print("부서명 : ");
		String dept = sc.nextLine();
		while (true) {
			if (dept.equals("인사관리부")) {
				e.setDeptCode(dept);
				break;
			} else if (dept.equals("회계관리부")) {
				e.setDeptCode(dept);
				break;
			} else if (dept.equals("마케팅부")) {
				e.setDeptCode(dept);
				break;
			} else if (dept.equals("국내영업부")) {
				e.setDeptCode(dept);
				break;
			} else if (dept.equals("해외영업1부")) {
				e.setDeptCode(dept);
				break;
			} else if (dept.equals("해외영업2부")) {
				e.setDeptCode(dept);
				break;
			} else if (dept.equals("해외영업3부")) {
				e.setDeptCode(dept);
				break;
			} else if (dept.equals("기술지원부")) {
				e.setDeptCode(dept);
				break;
			} else if (dept.equals("총무부")) {
				e.setDeptCode(dept);
				break;
			} else {
				System.out.println("없는 부서입니다 다시입력해주세요");
				System.out.print("부서명 : ");
				dept = sc.nextLine();
			}
		}
		System.out.print("직급명 : ");
		String job = sc.nextLine();
		while (true) {
			if (job.equals("강사")) {
				e.setJobCode(job);
				break;
			} else if (job.equals("대표")) {
				e.setJobCode(job);
				break;
			} else if (job.equals("부사장")) {
				e.setJobCode(job);
				break;
			} else if (job.equals("부장")) {
				e.setJobCode(job);
				break;
			} else if (job.equals("차장")) {
				e.setJobCode(job);
				break;
			} else if (job.equals("과장")) {
				e.setJobCode(job);
				break;
			} else if (job.equals("대리")) {
				e.setJobCode(job);
				break;
			} else if (job.equals("사원")) {
				e.setJobCode(job);
				break;
			} else {
				System.out.println("없는 직급입니다 다시입력해주세요");
				System.out.print("직급명 : ");
				job = sc.nextLine();
			}
		}
		System.out.print("급여 : ");
		e.setSalary(sc.nextInt());
		System.out.print("보너스(없다면 0.0 입력) : ");
		e.setBonus(sc.nextDouble());
		System.out.print("매니저이름 : ");
		sc.nextLine();
		e.setManagerId(sc.nextLine());
		return e;

	}
	public Employee updateDate() {
		Employee e = new Employee();
		System.out.println("==== 회원정보 수정 ====");
		System.out.print("수정할 사원번호 : ");
		e.setEmpId(sc.nextLine());
		System.out.print("새 직책 : ");
		e.setDeptCode(sc.nextLine());
		System.out.print("새 부서 : ");
		e.setJobCode(sc.nextLine());
		System.out.print("새 급여 : ");
		e.setSalary(sc.nextInt());
		System.out.print("새 전화번호 : ");
		e.setPhone(sc.nextLine());
		System.out.print("새 이메일 : ");
		e.setEmail(sc.nextLine());
		return  e;
		
	}

}
