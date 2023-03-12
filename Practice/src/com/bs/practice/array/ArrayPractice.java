package com.bs.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {

		int[] Arr = new int[10];
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = i + 1;
		}
		for (int i : Arr) {
			System.out.print(i + " ");
		}
	}

	public void practice2() {
		int[] Arr = new int[10];
		for (int i = 1; i <= Arr.length; i++) {
			Arr[10 - i] = i;

		}
		for (int i : Arr) {
			System.out.print(i + " ");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] Arr = new int[num];
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = i + 1;
		}
		for (int i : Arr) {
			System.out.print(i + " ");
		}
	}

	public void practice4() {
		String[] Arr = { "사과", "귤", "포도", "복숭아", "참외" };
		String fruit = " ";
		for (int i = 0; i < Arr.length; i++) {

			if (Arr[i].equals("귤")) {
				System.out.println(Arr[i]);
				break;
			}
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String msg = sc.next();
		System.out.print("문자 : ");
		char ch1 = sc.next().charAt(0);
		int count = 0;
		String index = "";

		char[] Arr = new char[msg.length()];// 렝쓰를 써야 문자열에갯수가나온다
		for (int i = 0; i < Arr.length; i++) {

			Arr[i] = msg.charAt(i);
		}
		for (int i = 0; i < Arr.length; i++) {
			if (Arr[i] == ch1) {
				count++;
				index += i + " ";
			}

		}

		System.out.println(msg + "에 " + ch1 + "가 존재하는 위치(인덱스) : " + index + "\n" + ch1 + " 개수 : " + count);

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		String[] week = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		for (int i = 0; i < week.length; i++) {
			if (i == num) {
				System.out.println(week[i]);

			}
			if (num > 6 || num < 0) {
				System.out.println("잘못 입력하셨습니다.");
				break;

			}

		}

	}

	public void practice7() {
		/*
		 * 1. 배열의 길이 직접 작성 2.그 값만큼 정수형 배열 선언 및 할당 3.배열의 크기만큼 사용자가 직접 값을 입력하여 인덱스에 값을 초기화
		 * 4.배열 전체값을 나열하고 각 인덱스에 저장된 값들의 합을 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int length = sc.nextInt();
		int[] Arr = new int[length];
		String msg = "";
		int result = 0;
		for (int i = 0; i < Arr.length; i++) {
			if (Arr[i] == Arr[i]) {
				System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
				int num1 = sc.nextInt();
				msg += num1 + " ";
				Arr[i] += num1;
				result += Arr[i];
			}
		}
		System.out.println(msg + "\n" + "총합 : " + result);

	}

	public void practice8() {
//		1. 3이상인 홀수 자연수 입력받기
//		2. 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값넣기
//		3. 중간 이후부터는 끝까지 1씩감소하여 내림차순 값 넣기 
//		4. 그리고 출력
//		5.단 입력한 정수가 홀수가 아니거나 3미만일 경우 "다시 입력하세요"를 출려갛고
//		6. 다시정수받기
		Scanner sc = new Scanner(System.in);
		boolean falg = true;
		while (falg) {
			System.out.print("정수 : ");
			int number = sc.nextInt();
			int middle = number / 2;
			if (number < 3 || number % 2 == 0) {
				System.out.println("다시 입력하세요.");
				falg = true;
			} else {
				int[] Arr = new int[number];
				for (int i = 0; i <= middle; i++) {
					Arr[i] = i + 1;

				}

				for (int i = middle + 1; i < number; i++) {
					Arr[i] = number - i;
				}
				falg = false;
				for (int i = 0; i < number; i++) {
					System.out.print(Arr[i] + " ");
				}
			}

		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] chicken = { "양념", "후라이드", "파닭" };
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.next();
		String result = "";
		for (int i = 0; i < chicken.length; i++) {
			if (name.equals("후라이드") || name.equals("양념") || name.equals("파닭")) {
				result = name + "치킨 배달 가능";
			} else {
				result = name + "치킨은 없는 메뉴입니다.";
			}
		}
		System.out.println(result);
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String num = sc.nextLine();
		char[] ch = new char[num.length()];
		for (int i = 0; i < num.length(); i++) {
			ch[i] = num.charAt(i);
		}
		char[] deepcopy = new char[num.length()];
		for (int i = 0; i < num.length(); i++) {
			deepcopy[i] = ch[i];
		}
		deepcopy[8] = '*';
		deepcopy[9] = '*';
		deepcopy[10] = '*';
		deepcopy[11] = '*';
		deepcopy[12] = '*';
		deepcopy[13] = '*';

		for (int i = 0; i < num.length(); i++) {
			System.out.print(deepcopy[i]);
		}

	}

	public void practice11() {
		int[] Arr = new int[10];
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = (int) (Math.random() * 10) + 1;
		}
		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}

	}

	public void practice12() {
		int[] Arr = new int[10];
		// 먼저 배열안에 램덤값넣어두기
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = (int) (Math.random() * 10) + 1;
		}
		// 다음에 최소값 최대값 비교
		int maxNum = Arr[0];
		int minNum = Arr[0];
		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i] + " ");
			if (maxNum < Arr[i]) {
				maxNum = Arr[i];
			}
			if (minNum > Arr[i]) {
				minNum = Arr[i];
			}

		}
		System.out.println("\n최대값 : " + maxNum);
		System.out.println("최소값 : " + minNum);
	}

	public void practice13() {
		int[] Arr = new int[10];
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = (int) (Math.random() * 10) + 1;
			for (int j = 0; j < i; j++) {
				if (Arr[i] == Arr[j]) {
					i--;

				}
			}

		}
		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}
	}

	public void practice14() {
		int[] Arr = new int[6];
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (Arr[i] == Arr[j]) {
					i--;
				}
				if (Arr[i] < Arr[j]) {
					// if(testArr[i]>testArr[j]) <-내림차순정리
					int t = Arr[i]; // 이전값저장 시켜야한다.
					Arr[i] = Arr[j];
					Arr[j] = t;
				}
			}
		}
		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}
	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String msg = sc.next();
		int count = 0;
		char[] Arr = new char[msg.length()];
		for (int i = 0; i < msg.length(); i++) {
			Arr[i] = msg.charAt(i);
		}
		for (int i = 0; i < msg.length(); i++) {
			// 중복 여부발생확인
			boolean falg = true;
			for (int j = 0; j < i; j++) {
				if (Arr[i] == Arr[j]) {
					falg = false;
					break;
				}
			}
			if (falg) {
				System.out.print(Arr[i] + ", ");
				count++;
			}
		}
		System.out.print("\n문자 개수 : " + count);
	}

	public void practice16() {
//		사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int number = sc.nextInt();
		String msgcount = " ";
		int count = 0;
		boolean falg = true;
		String[] input = new String[number];
		int[] Arr = new int[number];
		sc.nextLine();
		for (int i = 0; i < number; i++) {
			System.out.print((count + 1) + "번째 문자열 : ");
			String msg = sc.nextLine();
			msgcount += msg + ", ";
			count++;
		}
		while (falg) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N)");
			char ch = sc.next().charAt(0);
			if (ch == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int number1 = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < number1; i++) {
					System.out.print((count + 1) + "번째 문자열 : ");
					String msg1 = sc.nextLine();
					msgcount += msg1 + ", ";
					count++;

				}
			} else {
				System.out.print("[" + msgcount + "]");
				falg = false;
			}
		}
	}

}
