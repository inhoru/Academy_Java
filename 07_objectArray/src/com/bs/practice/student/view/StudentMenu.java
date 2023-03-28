package com.bs.practice.student.view;

import com.bs.practice.studnet.controller.StudentController;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	public StudentMenu() {
		
		System.out.println("===== 학생 정보 출력 =====");
		for(int  i =0;i<ssm.printStudent().length;i++) {
			System.out.println(ssm.printStudent()[i].inform());
			
		}
			System.out.println();
			System.out.println("===== 학생 성적 출력 =====");
			System.out.println("학생 점수 합계 : "+(int)ssm.avgScore()[0] );
			System.out.println("학생 점수 평균 : "+ssm.avgScore()[1] );
			System.out.println();
			
			System.out.println("===== 성적 결과 출력 =====");
			for(int j=0;j<ssm.printStudent().length;j++) {
				if(ssm.CUT_LINE<=ssm.printStudent()[j].getScore()) {
					System.out.println(ssm.printStudent()[j].getName()+"학생은 통과입니다." );
					
				}else if(ssm.CUT_LINE>ssm.printStudent()[j].getScore()) {
					System.out.println(ssm.printStudent()[j].getName()+"학생은 재시험 대상입니다.");
					
					
					
				
				
				
			}
			
		}
		
	}
}
