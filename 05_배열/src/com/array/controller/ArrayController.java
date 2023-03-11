package com.array.controller;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ArrayController {
	public void basicArray() {
		// 기본배열 활용하기
		// 배열은 기본으로 제공되는 저장공간으로 생성(new)해서 사용을 한다.
		// 배열의 저장구조는 선형구조임.
		// 저장순서가 있고 저장소을 지칭하는 번호(인덱스)를 가진다.
		// 배열 선언하기
		// 배열 자료형-> 기본자료형[]
		int[] intArr;// 배열을 저장할 수 있는 변수를 선언
		// intArr=10;안돼!!
		// 원하는 크기만큼의 배열을 생성해서 할당을 해야한다.
		// 배열생성하기 -> new연산자를 이용해서 생성!
		// new 자료형[원하는갯수(길이)]
		intArr = new int[3];
		// 기본으로 생성했을때 각 저장소는 자료형의 기본값으로 초기화된다.
		// 정수형(byte,short,int,long) : 0
		// 실수형(float,double) : 0.0
		// 문자열(String) : null
		// 문자(char) : ' '

		// int a=0;
		// 배열생성 후 각 저장공간활용하려면
		// 인덱스번호로 각 저장공간을 불러올 수 있다.
		// 인덱스번호는 선언한 길이에-1한 번호까지
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		// 초과한 인덱스번호를 호출하면????? 에러가 발생함.
		// System.out.println(intArr[3]);
		// String a=100;

		// System.out.println(a);
		// 배열에 값 저장하기
		intArr[0] = 1;
		intArr[1] = 200;
		intArr[2] = -5;

		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);

		// 친구이름 저장하기
		// 친구 3명의 이름을 저장하는 배열을 만들고
		// 자신의 스터디원을 저장 후 출력하기
		String[] names;
		names = new String[2];
		names[0] = "김재훈";
		names[1] = "외롭다..";
		// names[2]="인생은혼자지..은따인가...";
		System.out.println(names[0]);
		System.out.println(names[1]);
		// System.out.println(names[2]);
		names[0].length();
		names[0].charAt(0);
//		String name="유병승";
//		name.length();

		// for문과 같이 배열이용하기
		for (int i = 0; i < 3; i++) {
			System.out.println(intArr[i]);
		}
		// for문 이용해서 이름출력하기
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// 배열에서 저장소의 길이를 제공하는 변수가 있음.
		// 배열변수명.length;
		System.out.println(intArr.length);
		System.out.println(names.length);

		// 반복문을 이용해서 배열을 초기화하기
		// int 배열을 10개를 할당하고 각 저장공간에 1~10까지 수를 대입하기
		int[] number = new int[10];
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;// i++<-이녀석은 i값자체를 바꾼다 i+1은 연산결과만바꾼다

		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

		// 학생 5명의 키를 입력받아 저장하는 기능 구현하기
		// 저장 후 출력하기
//		Scanner sc = new Scanner(System.in);
//		double [] student = new double[5];//더블형공간5개생성 
//		for(int i =0;i<student.length;i++) {
//			System.out.print((i+1) +"번학생 키 입력 : ");
//			//double height = sc.nextDouble();
//			student[i]= sc.nextDouble();//이미 위에서 더블로선언햇기때문에 따로할필요가없다.
//		}
//		for(int i= 0;i<student.length;i++) {
//			System.out.println((i+1) +"번학생 키 :"+student[i]);
//			
//		}

		// 배열선언시에 대입할 값이 정해져있다면
		// 배열선언과 동시에 값을 초기화할 수 있다.
		char[] alpha = { 'a', 'b', 'c', 'd', 'e' };

		for (int i = 0; i < alpha.length; i++) {
			System.out.println(i + " " + alpha[i]);
		}
		char[] alpha2 = new char[] { 'A', 'B', 'C', 'D', };
		for (int i = 0; i < alpha2.length; i++) {
			System.out.println(i + " " + alpha2[i]);
		}
		// alpha = {'가','나','다}; <-이렇게되어있는 부분은 반드시선언과동시에 초기화 라인안에서 해야한다.
		alpha = new char[] { '가', '나', '다' };// 선언한구문은 다시 선언할려면 new를써야한다이렇게 써야 사용가능하다

		// 배열은 한번 선언된 길이는 변경되지 않는다.
		String[] names2 = new String[3];
		names2[0] = "유병승";
		names2[1] = "홍길동";
		names2[2] = "피카츄";
		// names2[3]="리자몽";//이미고정으로 3개짜리를만들엇끼떄문에 추가한다해서 자동으로 길이가 증가하지않는다.
		names2 = new String[4];// 이렇게 해버리면 이전에썻던 것들이 지워진다.

		// 배열은 저장된 데이터를 전체 순회해서 원하는 데이터를 찾을 수 있음;
		int[] numbers2 = { 10, 20, 30, 40, 50, 60, };
		// 30이상인 값의 개수를 구하는 기능
		int count = 0;
		for (int i = 0; i < numbers2.length; i++) {
			System.out.print(numbers2[i] + " ");
			if (numbers2[i] >= 30) {
				count++;
			}

		}
		System.out.println("\n30이상인 값 :" + count + "개");

		// 저장된 학생이름 중 김씨 학생의 수를 구하는 기능
		// 버전업 사용자가 요청한 성씨의 학생수를 구하는기능
//		int counts = 0;
//		String[] studentName = { "김현영", "김찬은", "김중근", "김재훈", "김예린", "강민기", "윤지환", "윤준호", "윤나라", "나빈", "이성진", "이동제",
//				"이다영", "조윤진", "정상준", "이은지" };
//		Scanner sc = new Scanner(System.in);
//		System.out.println("성씨 입력 : ");
//		char name = sc.next().charAt(0);
//		for (int i = 0; i < studentName.length; i++) {
//			if (studentName[i]==) {
//				counts++;
//			}
//			}
//		System.out.println(name + "씨는:" + counts + "명입니다.");

		// 정수 10개를 램덤으로 저장하는 기능 만들기.
		// 1~100수를 램덤하게 저장
		// [random.nextInt(100)+1]<-import로 램덤값 출력
		// Math.random()<-램덤값 출력 소수로나온다
		int[] randomNum = new int[10];
		for (int i = 0; i < randomNum.length; i++) {
			randomNum[i] = (int) (Math.random() * 100) + 1;// 소수로나오니 int변경
		}
		for (int i = 0; i < randomNum.length; i++) {
			System.out.print(randomNum[i] + " ");
		}
		System.out.println();
		// 최대값, 최소값 찾아내기
		// 나머진것들과 모두 비교해서 찾아내기
		// 최대값 : 값중에하나를 고르고
		// int maxNum = randomNum[0];
		int maxNum = randomNum[randomNum.length - 1];// 한번바뀌면고정이되야 for문밖에넣는다.
		// int minNum = randomNum[0];
		int minNum = randomNum[randomNum.length - 1];
		for (int i = 0; i < randomNum.length; i++) {
			if (randomNum[i] > maxNum) {
				maxNum = randomNum[i];
			}
			if (randomNum[i] < minNum) {
				minNum = randomNum[i];
			}
		}
		System.out.println("최대값 : " + maxNum);
		System.out.println("최소값 : " + minNum);

		// 배열은 성형구조로 순서가 있음.
		// 순서는 인덱스번호를 기준으로 순서를 정함.
		// 값을 정렬할 수 있다.
		// 배열의 저장값 위치변경하기 -> swrap
		int[] testArr = { 4, 3, 6, 2, 7, 5, 1, };
		for (int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i] + " ");

		}
		int temp = testArr[0];// 배열의 이전값을 저장시켜넣고 이전값을 넣어서 바꾼다.
		testArr[0] = testArr[1];
		testArr[1] = temp;

		System.out.println();
		for (int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i] + " ");

		}
		for (int i = 0; i < testArr.length; i++) {
			for (int j = 0; j < i; j++) {
//				int pre = testArr[j];
//				int next = testArr[i];
				if (testArr[i] < testArr[j]) {
					// if(testArr[i]>testArr[j]) { 내림차순 정리
					int t = testArr[i];
					testArr[i] = testArr[j];
					testArr[j] = t;

				}
			}
		}
		System.out.println();
		for (int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i] + " ");
		}

		// 배열 길이를 정하면 고정
		String[] oriName = { "유병승", "홍길동", "김유신" };
		oriName = new String[6];
		for (int i = 0; i < oriName.length; i++) {
			System.out.println(oriName[i]);// 안된다 초기화했기때문에
		}
	}

	public void arraysCopyTest() {
		// 배열의 복사를 알아보자.
		// 배열의 복사
		// 1. 얕은 복사 : 원본값을 공유하는 방식
		// 2. 깊은 복수 : 별도의 저장공간을 생성해서 데이터를 따로 관리하는 방식
		int[] num = { 1, 2, 3, 4, 5 };
		// 얕은 복사 -> 주소를 복사한다.
		int[] copynum = num;
		System.out.println(num);
		System.out.println("num" + Arrays.toString(num));// for문안쓰고 전체를 추력하는 기능
		System.out.println("copynum" + Arrays.toString(copynum));
		System.out.println("num[0] : " + num[0]);
		System.out.println("copynum[0] : " + copynum[0]);
		// 주소값을 공유하기때문에 저장소가 한개!
		num[0] = 100;// 위에서 주소값을 공유했기때문에 하나에만 넣어도 같아진다.
		System.out.println("num : " + num[0]);
		System.out.println("copynum : " + copynum[0]);

		// 깊은복사 -> 값자체를 복사해서 새로운 저장소에 저장
		int[] deepcopy = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			deepcopy[i] = num[i];
		}
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("deepcopy : " + Arrays.toString(deepcopy));
		num[1] = 200;// num에있는 주소를 수정한거지 deepcopy에있는 주소를 수정한게아니다.
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("deepcopy : " + Arrays.toString(deepcopy));

		// java에서 제공하는 기능을 이용해서 깊은복사하기
		// Arrays클래스에서 제공하는 copyof()기능 이용하기
		int[] copy2 = Arrays.copyOf(num, 2);// 엎애꺼를 뒤에꺼까지 복사하겟다
		System.out.println("copy2 : " + Arrays.toString(copy2));
//		copy2[3]= -100;
//		System.out.println("num : " +Arrays.toString(num));
//		System.out.println("deepcopy : " +Arrays.toString(copy2));

		// 배열전체를 깊은복사를 할때 clone() 이용해도된다.;
		copy2 = num.clone();
		System.out.println("copy2" + Arrays.toString(copy2));

		// System.arraycopy() 이용
		// 첫번째 : 원본배열
		// 두번째 : 원본배열 시작인덱스
		// 세번째 : 복사된 배열
		// 네번째 : 복사될 배열의 시작인덱스
		// 다섯번째 : 복사할 데이터 수(길이)
		String[] names = { "유병승", "홍길동", "김유신" };
		String[] extend = new String[names.length + 5];
		System.arraycopy(names, 1, extend, 3, 2);
		for (int i = 0; i < extend.length; i++) {
			System.out.print(extend[i] + " ");
		}
		System.out.println();

	}

	public void doubleArray() {
		// 2차원배열에 대해 알아보자
		// 배열저장소 두개가 연결되어있는 구조
		// 저장소는 바둑판처럼 저장구조를 가지고있음
		int[][] intArr;
		intArr = new int[3][3];
		System.out.println(intArr);
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[0][0]);
		System.out.println(intArr[0][1]);
		System.out.println(intArr[0][2]);
		System.out.println(intArr[1][0]);
		System.out.println(intArr[1][1]);
		System.out.println(intArr[1][2]);

		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr.length; j++) {
				System.out.print(intArr[i][j]);

			}
			System.out.println();
		}
		intArr[0][0] = 1;
		intArr[0][1] = 2;
		intArr[0][2] = 3;
		intArr[1][0] = 4;
		for (int i = 0; i < intArr.length; i++) {// [][] 중에 앞에인수를 반복
			for (int j = 0; j < intArr[i].length; j++) {// intArr[i].length는 뒤에꺼반복
				System.out.print(intArr[i][j]);

			}
			System.out.println();
		}
//		int[] arr=new int[10];
//		arr.length;
		// 3*3 2차원배열을 생성하고
		// 123
		// 123
		// 123 을 각 인덱스에 정하고 출력하기

		int[][] intArr1 = new int[3][3];
		for (int i = 0; i < intArr1.length; i++) {
			for (int j = 0; j < intArr1[i].length; j++) {
				intArr1[i][j] = j + 1;

			} // 입력기능 따로만들기

		}
		for (int i = 0; i < intArr1.length; i++) {
			for (int j = 0; j < intArr1[i].length; j++) {
				System.out.print(intArr1[i][j]);
			}
			System.out.println();// 출력기능 을 따로만들기
		}

		// 1234
		// 5678
		// 9 10 11 12

		int[][] intArr2 = new int[3][4];
		int count = 0;
		for (int i = 0; i < intArr2.length; i++) {
			for (int j = 0; j < intArr2[i].length; j++) {
				// intArr2[i][j]=(i*4)+(j+1);
				intArr2[i][j] = count++;

			}
		}

		for (int i = 0; i < intArr2.length; i++) {
			for (int j = 0; j < intArr2[i].length; j++) {
				System.out.print(intArr2[i][j] + " ");
			}
			System.out.println();
		}
		// 2차원배열의 선언과 동시에 초기화
		String[][] study = { { "김중근", "홍승우", "윤준호", "김현영" }, { "김찬은", "홍성현", "나빈", "이성진" }, { "김재훈", "이다영", "조장흠" },
				{ "김예린", "윤나라", "최인호", "최주영", "이동제" }, { "윤지환", "강민기", "최솔" }, { "조윤진", "정상준", "최하리", "이은지" } };
		for (int i = 0; i < study.length; i++) {
			for (int j = 0; j < study[i].length; j++) {
				System.out.print(study[i][j] + " ");
			}
			System.out.println();
		}
		// 최주영의 조를 찾기 인원수 출력
		// 최솔씨의 조를 찾고 인원수 출력
		// 나빈씨의 조를 찾고 인원수 출력
		// 이름을 입력받아서 찾으세요 없는 이름을 입력하면 없는 조원입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 :");
		String name = sc.next();
		String msg = "없는 조원입니다.";
		for (int i = 0; i < study.length; i++) {
			for (int j = 0; j < study[i].length; j++) {
				if (study[i][j].equals(name)) {
					System.out.println((i + 1) + "조 인원수 :" + study[j].length);
					// msg = (i + 1) + "조 인원수 :" + study[i].length;
					msg = Arrays.toString(study[i]);

					break;

				}

			}
		}
		System.out.println(msg);

	}

	// 배열에 대한 배열 데이트를 순회하기
	public void extraTest() {
		int[] intArr = { 1, 2, 3, 4, 5, 6, };
		// 기본 for문 이용해서 각 인덱스에 접근함.
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);

		}
		// forEach문을 이용해서 데이터 순회하기
		// for(자료형 변수명 : 배열명|| CollectionFramework){ }
		System.out.println("forEach문을 이용해서 출력하기");// for문대신 사용가능
		for (int d : intArr) {
			if (d % 2 == 0) {
				System.out.println(d);
			}
		}
		// forEach문은 배열에 있는 값을 수정할때는 사용할 수 없다.
		String[] hobby = { "농구", "자전거", "게임", "코딩" };
		for (String h : hobby) {
			if (h.equals("코딩"))
				h = "운동";// 지역변수를바꿧기때문에 안바뀐다.
			// hobby가 는 바뀌지않는다.

			System.out.println(h);

			// 배열에 중복값없이 저장하기
			// 임의의 정수 10개 저장하기
			// 1~50
			// (Math.random()
			// 중복값없이 출력
			int[] randomNum = new int[10];
			for (int i = 0; i < randomNum.length; i++) {
				randomNum[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (randomNum[i] == randomNum[j]) {
						i--;// 마이너스를해서 다시 외곽포문으로 돌아가서 중복값에새로운값을넣는다.
						break;

					}
				}

			}
			for (int i : randomNum) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		// 로또만들기!!
		// 1~45까지의 중복값없이 6자리로저장하기
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}

			}

		}
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		System.out.println();
		// up&down게임만들기
		// 램덤으로 1~50까지 수중 한개를 저장
		// 사용자에게 값을 입력받아 램덤값과 비교하고 램덤값이 크면 up출력
		// 작은면 Down출력 맞추면 정답입니다!! 짝짞짝! 출력 정답을 맞출때까지 진행
		Scanner sc = new Scanner(System.in);

		int[] random = new int[1];
		random[0] = (int) (Math.random() * 50) + 1;
		boolean falg = true;
		while (falg) {
			for (int i = 0; i < 1; i++) {
				System.out.println("입력 : ");
				int number = sc.nextInt();
				if (random[0] < number && number < 51) {
					System.out.println("Down");
				} else if (random[0] > number) {
					System.out.println("UP");

				} else if (random[0] == number) {
					System.out.println("정답입니다!! 짝짝짞");
					falg = false;
				} else if (number > 50) {
					System.out.println("50이하의숫자만입력해주세요.");
				}
			}

		}
	}

}
