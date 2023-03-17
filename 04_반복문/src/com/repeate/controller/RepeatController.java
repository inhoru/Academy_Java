package com.repeate.controller;

import java.util.Scanner;
import java.security.DrbgParameters.NextBytes;
import java.util.Random;

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
		System.out.println("안녕하세요");
		// 반갑습니다. 100개
		for (int i = 1; i <= 100; i++) {
			System.out.println("반갑습니다!");
		}
//
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
//		String msg="";
//		for(;!msg.equals("exit");) {
//			System.out.print("메세지입력 : ");
//			msg=sc.next();
//			System.out.println(msg);
//		}

		// 사용자에게 메세지를 입력받고 출력하는 기능
		// 사용자가 "끝" 이라는 메세지를 입력할때까지 입력을 받고
		// 입력받은 내용 모두 출력하기 단,끝메세지는 포함하지않기!!
		String totalMsg = "";
//		sc.nextLine();
		String m = "";
		for (; !m.equals("끝");) {
			System.out.print("메세지입력 : ");
			m = sc.nextLine();
			if (!m.equals("끝")) {
				totalMsg += m;
			}
		}
		;
		System.out.println(totalMsg);
	}

	// for문 응용해보기
	public void forApplication() {
		// 1부터 사용자가 입력한 수까지 출력하기
		// 입력값 : 4 -> 1 2 3 4 -> for(int i=1;i<=4;i++)
		// 입력값 : 10 -> 1 2 3 4 5 6 7 8 9 10 -> for(int i=1;i<=10;i++)
		// 입력값 : 3 -> 1 2 3 -> for(int i=1;i<=3;i++)

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int su = sc.nextInt();
		for (int i = 1; i <= su; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 사원정보를 입력받는 기능을 구현하자
		// 3명의 사원정보를 입력받고 출력하는 기능
		// 입력정보 : 이름, 나이, 성별, 급여, 보너스(소수점)
		// 입력한 정보를 한번에 출력
		// public void empInputData();
		// 버전업 입력전에 입력할 사원수를 입력받고 그 수만큼 입력 후 출력하기
	}

	public void empInputData() {
		Scanner sc = new Scanner(System.in);
		String empInfo = "";
		System.out.print("몇명 : ");
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println("===== " + (i + 1) + "번 사원정보등록 =====");
			System.out.print("이름 : ");
			sc.nextLine();
			// if(i!=0) {sc.nextLine();}
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("성별(M/F) : ");
			char gender = sc.next().charAt(0);
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			System.out.print("보너스 : ");
			double bonus = sc.nextDouble();
			// sc.nextLine();
			empInfo += name + " " + age + " " + gender + " " + salary + " " + bonus + "\n";
		}
		System.out.println("=== 입력한 사원 정보 ===");
		System.out.println(empInfo);
	}

	public void forApplication2() {
		// 숫자에 규칙이 있는 경우에 for문의 초기값을 활용할 수 있다.
		String msg = "안녕하세요 화요일이에요";
//		System.out.println(msg.charAt(0));
//		System.out.println(msg.charAt(1));
//		System.out.println(msg.charAt(2));
//		System.out.println(msg.charAt(3));

		for (int i = 0; i < msg.length(); i++) {
//			System.out.println(i);
			System.out.println(msg.charAt(i));
		}
		// 입력받은 문자에 알파벳 대문자가 포함되어있는지 확인하는 기능
		// abCDE ->
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 : ");
		String data = sc.next();
		boolean flag = false;
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			if ('A' <= c && c <= 'Z') {
				// 대문자임
//				System.out.println("대문자 다!");
				flag = true;
			}
			// else {
//				flag=false;
//			}
			// System.out.println(data.charAt(i));
		}
		System.out.println(flag ? "대문자있어!" : "대문자없어!");
	}
	// 입력받은 문자열에 대문자와 소문자의 수를 구하는 기능
	// 문자열, 문자를 입력받아 문자열에 문자가 몇개 포함되어있는지 확인하는 기능

	public void forInfor() {
		// 중첩반복문 for문내부에 for문이 있는 로직
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			for (int j = 0; j < 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// 구구단 출력하기
		// 2단 부터 9단 구구단 출력하기
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " X " + j + "=" + (i * j) + " ");
			}
			System.out.println();
		}

		String test = "apple";
		// test변수에 저장된 문자열에 중복값이 있는지 확인하는 로직
		for (int i = 0; i < test.length(); i++) {
			int count = 0;
			System.out.println(test.charAt(i));
			for (int j = 0; j < test.length(); j++) {
				if (i != j && test.charAt(i) == test.charAt(j)) {
					count++;
				}
				// System.out.print(test.charAt(j));
			}
			System.out.println(test.charAt(i) + "는 " + count + "개 반복");
		}

		// 별찍기!!!!
		// ****
		// ****
		// ****
		// ****

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void whileTest() {
		// while활용하기
		// 반복문을 구현하는 방법 중 하나
		// while(조건문){ 반복실행 코드 }
		// 특정조건에서 반복문을 실행할때 많이 사용
		// 의도적인 무한루프를 실행할때 사용

		// 1부터 10까지 출력하기
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		int j = 1;
		while (j <= 10) {
			System.out.println(j);
			j++;
		}

		// 사용자가 끝이라고 입력할때까지 입력받는 기능
		Scanner sc = new Scanner(System.in);
		String m = "";
		String total = "";
//		for(;!m.equals("끝");) {}
		while (!m.equals("끝")) {
			System.out.print("메세지입력 : ");
			m = sc.nextLine();
			if (!m.equals("끝"))
				total += m;
		}
		System.out.println(total);

		// 메뉴기능을 구현할때
		int menu = 0;
		while (menu != 9) {
			System.out.println("===== BS Lunch =====");
			System.out.println("1. 햄버거");
			System.out.println("2. 피자");
			System.out.println("3. 치킨");
			System.out.println("4. 갈비탕");
			System.out.println("5. 순대국");
			System.out.println("9. 주문종료");
			System.out.print("입력 : ");
			menu = sc.nextInt();
		}

		while (true) {
			System.out.println("무한");
		}

		// 계속 계산할 수 있는 계산기 프로그램 만들기
		// public void whileCalculator()
		// 두개의 정수, 연산자를 입력받아 계산해주는 기능
		// 계산이 끝나면 계속하시겠습니까? 문구 출력 후
		// Y를 선택하면 한번더 실행, N선택하면 프로그램을 종료합니다 출력 후 종료
	}

	public void whileCalculator() {
		System.out.println("==== my 계산기 ====");
		Scanner sc = new Scanner(System.in);
		char choice;
		// while(choice=='Y') {
		do {
			choice = ' ';
			System.out.print("정수입력 : ");
			int su = sc.nextInt();
			System.out.print("정수입력 : ");
			int su2 = sc.nextInt();
			System.out.print("연산자(+,-,*,/) : ");
			char op = sc.next().charAt(0);
			switch (op) {
			case '+':
				System.out.println("" + su + op + su2 + "=" + (su + su2));
				break;
			case '-':
				System.out.println("" + su + op + su2 + "=" + (su - su2));
				break;
			case '*':
				System.out.println("" + su + op + su2 + "=" + (su * su2));
				break;
			case '/':
				System.out.println("" + su + op + su2 + "=" + ((double) su / su2));
				break;
			}
			while (choice != 'N' && choice != 'Y') {
				System.out.print("계속하시겠습니까?(Y/N) : ");
				choice = sc.next().charAt(0);
				if (choice != 'N' && choice != 'Y')
					System.out.println("입력값은 Y,N만 가능합니다.!");
			}

		} while (choice == 'Y');
		// }
		System.out.println("프로그램을 종료하겠습니다!");

	}

	public void continueBreakTest() {
		// 분기문 활용하기
		// continue : 반복문에서 continue문을 만나면 아래코드를 생략하고 증감식으로 넘어감.
		// break : 반목문에서 break문을 만나면 끝나요! 끝!
		// 특정조건에서 반복문의 실행을 통제하기 위해 사용
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String target = sc.nextLine();
		boolean flag = false;
		for (int i = 0; i < target.length(); i++) {
			char c = target.charAt(i);
			System.out.println(c);
			if ('A' <= c && c <= 'Z') {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "있다" : "없다");

		// 중첩반복문에서 이용하기
		t: for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i % 2 == 0)
					break t;
				System.out.print(i + "X" + j + "=" + (i * j));
			}
			System.out.println();
		}

		// continue
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j % 2 == 0)
					continue;
				System.out.print(i + "X" + j + "=" + (i * j));
			}
			System.out.println();
		}

	}

	// 자바에서 랜덤값을 출력하기
	// 숫자로 출력 -> 임의의 실수(0~1)
	public void randomTest() {
		// 임의의 난수출력하기
		// 1. Math.random()기능이용
		// 2. Random클래스를 이용하는 방법
//		for(int i=0;i<3;i++) {
//			System.out.println((int)(Math.random()*10));
//		}
		// 랜덤값을 정수형으로 출력하기
		// Math.random()*10 -> 0 ~ 9
		// Math.random()*20 -> 0 ~ 19
		// 1~10 -> Math.random()*10+1
		// 1~10까지의 무작위 수 5개출력하기
		for (int i = 0; i < 5; i++) {
			System.out.println((int) (Math.random() * 10) + 1);
		}

		// Random클래스이용하기
		// java.util.Random클래스
		System.out.println("Random클래스이용");
		Random r = new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(10));// 0~9
		System.out.println(r.nextInt(20));// 0~19
		System.out.println(r.nextInt(20) + 1);// 0~19
	}
//	1. 가위바위보게임
//	 설명 
//	 - 사용자에게 가위, 바위, 보 중 한개를 입력하도록하고(입력방식은 숫자)
//	 - 컴퓨터가 랜덤값으로 세개중 하나의 데이터를 대입
//	 - 컴퓨터의 값과 사용자의 값을 비교하여 다음의 결과출력
//	   같으면 비겼습니다. 출력 후 다시 사용자와 컴퓨터가 선택할 수 있도록 로직구성
//	   컴퓨터가 사용자에게 이기면 컴퓨터가 이겼습니다. 출력
//	   사용자가 컴퓨터에게 이기면 사용자가 있겼습니다. 출력   
//
//	-  승자가 나왔으면 다시 하겠습니다 출력 
//	    다시하면 위에 로직 다시 실행
//	    종료하면 프로그램 종료
//	- 추가 : 만일 위내용을 쉽게 처리 했으면 프로그램 종료시 지금까지 전적을 출력
//	       컴퓨터 승 00번, 사용자 승 00번

	public void rockpaperscissors() {
		Scanner sc = new Scanner(System.in);
		int rad = 0;
		int su;
		char choice = ' ';
		int win = 0;
		int lose = 0;
		int draw = 0;
		do {
			System.out.println("===가위바위보게임===");
			System.out.println("1. 가위");
			System.out.println("2. 바위");
			System.out.println("3. 보");
			System.out.println("숫자를 입력하세요 : ");
			su = sc.nextInt();
			Random r = new Random();
			rad = 0;
			rad = r.nextInt(3) + 1;
			switch (su) {
			case 1:
				if (su == rad) {
					System.out.println("비겼습니다.");
					draw++;
				} else if (2 == rad) {
					System.out.println("컴퓨터가 이겼습니다.");
					lose++;
					choice = ' ';
				} else if (3 == rad) {
					System.out.println("사용자가 이겼습니다.");
					win++;
					choice = ' ';
				}
				break;

			case 2:
				if (su == rad) {
					System.out.println("비겼습니다.");
					draw++;
				} else if (1 == rad) {
					System.out.println("사용자가 이겼습니다.");
					win++;
					choice = ' ';
				} else if (3 == rad) {
					System.out.println("컴퓨터가 이겼습니다.");
					lose++;
					choice = ' ';
					
				}
				break;

			case 3:
				if (su == rad) {
					System.out.println("비겼습니다.");
					draw++;
				} else if (1 == rad) {
					System.out.println("컴퓨터가 이겼습니다.");
					win++;
					choice = ' ';
				} else if (2 == rad) {
					System.out.println("사용자가 이겼습니다.");
					lose++;
					choice = ' ';
				}
				break;

			}
			while (choice != 'N' && choice != 'Y') {
				System.out.println("다시 하시겠습니까?(Y/N)");
				choice = sc.next().charAt(0);
				if (choice != 'N' && choice != 'Y')
					System.out.println("입력값은 Y,N만 가능합니다.!");
			}
		} while (su == rad || (choice == 'Y'));

		System.out.println("프로그램을 종료하겠습니다! 전적은 : " + win + "승 " + lose + "패 "
				+ draw + "무 입니다.");
	}
	

}
