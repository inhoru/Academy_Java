package com.repeate.controller;

import java.util.Scanner;

public class RepeatController {
	public void basicRepeat() {
		// 기본 for문 이용하기
		// 특정코드는 원하는 만큼 반복실행하게 하는 명령어
		// for(초기식;조건식;증감식){ 반복할 코드를 작성 }
		// 초기식 : 변수선언, 반복한 횟수에 대해 저장하는 공간
		// 조건식 : 반복을 더 실행할지말지 결정하는 조건(true 실행, false 중단)
		// 증감식 : 초기식에 선언한 변수의 값을 수정하는 연산->조건식의 결과가 변경
		// 안녕하세요를 10번출력하기
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요.");
		// 반갑습니다. 100개
		for (int i = 1; i <= 100; i++) {
			System.out.println("반갑습니다!");
		}

		// 1~10까지 수를 출력하기
		// 1 2 3 4 5 6 7 8 9 10
		for (int i = 1; i <= 50; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// for문 {}내부에는 변수선언, 연산자, 조건문 다 사용이 가능
		// {}내부에서 선언한 것들은 내부에서만 사용이 가능함.
		// 5번 실행하는 for문 만들기
		for (int i = 1; i <= 5; i++) {
			int temp = 10 + i;
			if (temp % 2 == 0) {
				System.out.println(temp);
			}
		}
//		System.out.println(temp);

		// 1부터 100까지의 수를 출력하기
		// 1부터 100까지의 수에서 짝수만 출력하기
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 2; i <= 100; i += 2) {
			// if(i%2==0) {
			System.out.print(i + " ");
			// }
		}
		System.out.println();

		// 100~1까지 수 출력하기
		int count = 100;
		for (int i = 1; i <= 100; i++) {
			System.out.println(count--);
		}

		// 친구 5명의 이름을 입력받고 출력하기
		Scanner sc = new Scanner(System.in);
//		String friend="";
//		for(int i=1;i<=5;i++) {
//			System.out.print("친구이름 : ");
//			friend+=sc.nextLine()+" ";
//		}
//		System.out.println(friend);

//		System.out.print("친구이름 : ");
//		friend=sc.nextLine();
//		System.out.println(friend);
//		System.out.print("친구이름 : ");
//		friend=sc.nextLine();
//		System.out.println(friend);
//		System.out.print("친구이름 : ");
//		friend=sc.nextLine();
//		System.out.println(friend);
//		System.out.print("친구이름 : ");
//		friend=sc.nextLine();
//		System.out.println(friend);

		// 숫자 4개를 입력받아 총합을 구하는 기능 구현하기
//		for(int i=1;i<=4;i++) {
//			int total=0;
//			System.out.print("수입력 : ");
//			total+=sc.nextInt();
//			System.out.println(total);
//		}

		// for문은 초기식, 조건식, 증감식을 반드시 써야하나요?
		// 안써도 됩니다!;
		count = 0;
		for (; count < 10; count++) {
			System.out.println(count);
		}
//		for(;;count++) {
//			System.out.println(count);
//		}
		String msg = "";
		for (; !msg.equals("exit");) {
			System.out.print("메세지입력 : ");
			msg = sc.next();
			System.out.println(msg);
		}

		// 사용자에게 메세지를 입력받고 출력하는 기능
		// 사용자가 "끝" 이라는 메세지를 입력할때까지 입력을 받고
		// 입력받은 내용 모두 출력하기 단,끝메세지는 포함하지않기!!
		String totalMsg = "";
		sc.nextLine();
		String m = "";
		for (; !m.equals("끝");) {
			System.out.print("메세지입력 : ");
			m = sc.nextLine();
			if (!m.equals("끝")) {
				totalMsg += m;
			}
		}
		System.out.println(totalMsg);

	}

	// for문 응용해보기
	public void forApplication() {
		// 1부터 사용자가 입력한 수까지 출력하기
		// 입력값 : 4 -> 1 2 3 4 -> for(int i=1;i<=4;i++)
		// 입력값 : 10 -> 1 2 3 4 5 6 7 8 9 10 for(int i=1;i<=10;i++)
		// 입력값 : 3 -> 1 2 3 for(int i=1;i<=3;i++)
		// 위에 3가지의 차이점은 조건식만 다르다는거도 그러니 조건식에 변수를넣으면 입력한수에따라 결과가 달라진다.
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int su = sc.nextInt();
		for (int i = 1; i <= su; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public void empInputData() {
		// 사원정보를 입력받는 기능을 구현하자
		// 3명의 사원정보를 입력받고 출력하는 기능
		// 입력정보 : 이름, 나이, 성별, 급여, 보너스
		// 입력한 정보를 한번에 출력
		// 버전업 입력전에 입력한 사원수를 입력받고 그 수만큼 입력 후 출력하기
		Scanner sc = new Scanner(System.in);
		String empInfo = "";
		System.out.print("사원수 입력:");
		int su = sc.nextInt();
		for (int i = 0; i < su; i++) {
			sc.nextLine();
			// if(i!=0)sc.nextLine(); 이렇게도 가능하다 0은 첫번째 라는뜻 그러니 첫번째뺴고 두번째세번째에서만 실행하라뜻
			System.out.println("===" + (i + 1) + "번" + "사원정보입력===");
			System.out.print("이름 :");
			String name = sc.nextLine();
			System.out.print("나이 :");
			int age = sc.nextInt();
			System.out.print("성별(M/F) :");
			char gender = sc.next().charAt(0);
			System.out.print("급여 :");
			int pay = sc.nextInt();
			System.out.print("보너스 :");
			double bonner = sc.nextDouble();
			// sc.nextLine();//반복하기전 마지막 라인.이 nextDouble이였기에 버퍼를비워준다. 위에적었기때문에 위에께필요업성진다.
			empInfo += (name + " " + age + " " + gender + " " + pay + " " + bonner + "\n");

		}
		System.out.println("===입력한 사원 정보===");
		System.out.println(empInfo);

//		String total = "";
//		int su = sc.nextInt();
//		for(int i=1;i<=su;i++) {
//			System.out.print("이름 :" );
//			String name = sc.next();
//			System.out.print("나이 :");
//			int age = sc.nextInt();
//			System.out.print("성별(M/F) :");
//			char gender = sc.next().charAt(0);
//			System.out.print("급여 :");
//			int pay = sc.nextInt();
//			System.out.print("보너스 :");
//			int bonner = sc.nextInt();
//			
//			System.out.println(su);

	}

	public void forApplication2() {
		// 숫자에 규칙이 있는 경우에 for문의 초기값을 활용할 수 있다.
//		String msg = "안녕하세요 화요일이에요";
//		System.out.println(msg.charAt(0));
//		System.out.println(msg.charAt(1));
//		System.out.println(msg.charAt(2));
//		System.out.println(msg.charAt(3));
//		
//		for(int i=0;i<msg.length();i++) { //msg를 변경하더라도 렝쓰를 조건식을 안바꿔도된다.
//			//System.out.println(i);
//			System.out.print(msg.charAt(i));
//			
//	
//		}
		// 입력받은 문자에 알파벳 대문자가 포함되어잇는지 확인하는 기능
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 :");
		String ms = sc.nextLine();
		boolean flag = false;
		for (int i = 0; i < ms.length(); i++) {
			if ('A' <= ms.charAt(i) && ms.charAt(i) <= 'Z') {
				// 대문자임
				// System.out.println("대문자 다!");
				flag = true;
			}
			// else flag=false; 이것도 가능해보이지만 반복문은 계속 반복하는것이다 예를들어 adcdf라고했을떄
			// a를한번b를한번 c를한번 반복한다 그래서마지막f까지 반복하는데 마지막값이대문자가된다면 true로 인식하기에 실행하기에
			// 오류가 생긴다.
		}
		System.out.println(flag ? "대문자있어!" : "대문자없어!");
		// 그렇다면if문은왜가능할까

		// 이런식으로 이런기능들을 만들수 있다.
		// 입력받은 문자열에 대문자와 소문자의 수를 구하는 기능
		// 문자열,문자를 입력받아 문자열에 문자가 몇개 포함되어있는지 확인하는기능

	}

	public void forInfor() {
		// 중첩반복문 for문내뷍 for문이 있는 로직
		// 중첩반복문은 시게와 비슷하다 마치 시가움직이고 분이한바퀴돌고 초가한바퀴돌고 다시 시가움직이고 분이돌고 초가돈다
		// 이런식으로 중첩해서 반복하는걸 말한다,
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//			for(int j=0;j<5;j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		// 구구단 출력하기
		// 2단 부터 9단 구구단 출력하기
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " X " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		
	}
	public void baseball() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위/바위/보 중에 하나를 입력하세요");
		
	}

}
