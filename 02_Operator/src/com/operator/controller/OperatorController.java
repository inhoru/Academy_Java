package com.operator.controller;
// 기능을 제공하는 클래스
import java.util.Scanner;//스캐너를 사용하기위한 import
public class OperatorController {
	
	// 1. 단항연산자 알아보기
	public void singleOp() {
		// 1. 부정연산자 : boolean형의 값을 반전시키는 연산자
		// 표현 : !변수명 또는 !기능(메소드)호출구문 또는 비교연산
		System.out.println("==== 부정 연산자 활용하기 ====");
		boolean flag = true;
		System.out.println("flag : "+flag);
		System.out.println("!flag : " + !flag );
		System.out.println("!!flag : " + !!flag );
		//나이가 19이상이 아니지? 
		int age = 15;
		System.out.println(!(age>19));
		// 기능호출했을때 부정하기
		//Srting의 값을 동등비교할때는 equals()를 이용해야한다.
		// 이름이 김아무이니?
		String name = "김아무";
		System.out.println(name.equals("김아무"));
		//문자열의 같지 않음을 비교할때 사용한다.
		System.out.println(!name.equals("김아무"));// name이란 변수가 김아무랑 같지않지?
		
		//2. 증가, 감소 연산
		// 표현 : ++변수, 변수++
		//     : --변수, 변수--
		// 특정 수를 셀때 사용
		// 변수(정수)에 1을 더하고 다시 그 변수에 저장시키는 연산
		// ++변수 == 변수=변수+1;
		
		int count =0;
		++count;//count=count+1;
		count=count+1;
		System.out.println(count);
		count++;
		count++;
		System.out.println(count);
		
		count = 0;
		--count;//count=count-1;
		System.out.println(count);
		--count;
		count--;
		System.out.println(count);
		
		//++, -- 연산자의 위치에 따라 연산실행 순서가 변경
		//다른연산자와 같이 연산실행했을때 순서가 변경된다.
		//int testNum = ++count+10; // 전위연산 : 다른연산자와 같이 있을때 먼저 증가, 감소연산을 실행하고 다른 연산을 실행한다.
		int testNum = count+++10;   // 후위연산 : 다른연산과 같이 있을때 다른 연산을 먼저 실행하고 나중에 증가,감소연사을 실행한다.
		System.out.println(testNum);
		System.out.println("count : " + count);
		
		testNum = 0;
		count = 0;
		//testNum=--count;
		testNum=count--;
		System.out.println(testNum);
		
		//반복문을 사용할때 많이 사용
		//for(int i=;i<10;i++) {
		//특정로직의 실행횟수를 확인할때 많이 사용
		
		
		
		
		
		
	}//singleOp()
	public void calculatorOp() {
		//산술연산자 활용하기
		//+,-,*,/,%(나머지)
		int su=2;
		int su2=10;
		//더하기, 빼기
		System.out.println("+연산 :" +(su+su2));
		System.out.println("-연산 :" +(su-su2));
		//곱하기, 나누기
		System.out.println("*연산 :" +su*su2);
		System.out.println("/연산 :" +su/(double)su2);
		
		//산술연산결과를 계속 사용하려면? -> 결과를 변수에 저장하고 활용한다.
		int result = su+su2;
		double result2 = su/(double)su2;
		//나머지 연산
		//% 연산 짝수, 홀수 구분, 배수, 약수, 등을 구할 수 있는 연산자
		//입력받은 값이 짝수인지 홀수인지 판단하는기능
		//특정수의 배수가 맞는지 판단하는기능
		System.out.println(su%2);
		System.out.println(su2%3);
		

	
	
	
	}
	
	public void calc() {
		//계산기 만들기
		//사용자에게 두수를 입력받고 입력받은 수의
		//더한결과, 뺀결과, 곱한결과, 나눈결과를 출력하는 기능을 구현
		//더한결과 : 000
		//뺀 결과 : 000
		//곱한결과 : 000
		//나눈결과 : 000
		
		Scanner sc = new Scanner(System.in);
		System.out.print("num : ");
		int suu1 = sc.nextInt();
		System.out.println("입력받은수 :" +  suu1);
		
		System.out.print("num : ");
		int suu2 = sc.nextInt();
		System.out.println("입력받은수 :" + suu2);
		
		System.out.println("더한값 :" + (suu1+suu2));
		System.out.println("뺀값 :" + (suu1-suu2));
		System.out.println("곱한값 :" + suu1*suu2);
		System.out.println("나눈값 :" + suu1/(double)suu2);
		
	
	}
	public void compareOp() {
		//비교연산자 활용하기
		//동등비교
		// 표현 : ==, !=
		//대소비교
		// 표현 : >,<,<,=,>=
		//비교연산의 결과는 true/false(boolean)로 반환됨.
		
		//1. 동등비교
		//숫자형 동등비교
		int num=13;
		int num2=19;
		int num3=13;
		//일치부여 확인
		System.out.println(num==num2);
		System.out.println(num==num3);
		
		//불일치여부 확인
		//!=연산자 활용
		System.out.println("num! = num2 " + (num!=num2));
		System.out.println("num! = num3 " + (num!=num3));
		
		//실수형비교하기
		double dnum = 180.5;
		double dnum1 = 190.5;
		double dnum2 = 180.5;
		
		System.out.println(dnum==dnum1);
		System.out.println(dnum==dnum2);
		System.out.println(dnum!=dnum1);
		dnum=13;//int값은 double값에자동형변환으로들어갈수있다.
		System.out.println(dnum==num);//int 와 double여도 값만 같으면 동등비교가능
		
		//문자 동등비교
		char ch ='A';
		char ch1 ='a';
		char ch2 = 'A';
		System.out.println("A==a :" +(ch==ch1));
		System.out.println("A==a :" +(ch==ch2));
		System.out.println("A!=a :" +(ch!=ch1));
		int chInt =65;
		//System.out.println((int)ch);
		System.out.println(ch==chInt);//자동형변환으로 char타입은 인트로변경 유니코드동일
		
		//문자열에 대한 동등비교
		//String(클래스) 동등비교할때 == 연산을 사용할 수 없다.!
		//String이 제공하는 equals()기능을 이용해서 동등비교를 한다.
		//아래에 String는 0x11안에 값이저장된다.
		//ox11안에저장된 문자중에 문자열이같으면 ture가 나온다.
		String name="김아무";
		String name2= "김아무2";
		String name3= "김아무";
		//새로만든String는 0x21에저장된다.
		String name4= new String("김아무2"); 
		System.out.println("name==name2 :" +(name==name2));
		System.out.println("name==name3 :" + (name==name3));//리터럴값을 같게만들엇다 자바에서그래서 ==비교가능
		System.out.println("nam2==name4 :" + (name2==name4));//0x11과0x21이 저장된 상자가 다르기때문에 ==사용하더라고 다르다고나온다.
		
		//문자열의 동등비교는 equals를써야한다. 
//		Scanner sc=new Scanner(System.in);
//		System.out.print("이름 : ");
//		String inputName=sc.nextLine();
//		//System.out.println(inputName=="김아무");
//		System.out.println(inputName.equals("김아무"));
//		System.out.println("김아무".equals(inputName));
//		//불일치비교
//		System.out.println(!"김아무".equals(inputName));
		
		//대소비교하기
		//숫자값만 가능하다.
		//<, >, <=, >=
		num = 200;
		num2 = 300;
		num3 = 200;
		System.out.println(num<num2);
		System.out.println(num>num3);
		System.out.println(num>=num3);
		
		
		//문자타입은 대소비교가 가능할까??
		char ch4='Z';
		char ch5='E';
		System.out.println("Z>E :" + (ch4>ch5));
		//대문자(65~90), 소문자(97~122)를 확인할 수있음.
		System.out.println("A<Z : " + ('A'<'Z'));
		
//		//문자열도 대소비교 가능한가
//		String str = "30";
//		String str2 = "40";
//		System.out.println(str<str2);//불가능하다
		
		
		
		
		
		
	}	
	public void testStr() {
		//사용자에게 id를 입력받고 id가 admin이면 true를 출력하는 기능
		Scanner sc = new Scanner(System.in);
//		System.out.printf("ID : ");
//		String id = sc.nextLine();
//		System.out.println("입력한ID : " + id);
//		System.out.println("admin".equals(id));
		
		System.out.print("아이디 입력 :");
		String userId=sc.nextLine();
		System.out.println("userId : " + userId.equals("admin"));
		
		
	}
	public void check() {
		//사용자에게 나이를 입력받고 성년이면 true를 출력하는기능
		Scanner sc = new Scanner(System.in);
//		System.out.printf("나이 : ");
//		int age = sc.nextInt();
//		System.out.println("입력한나이 : " + age);
//		System.out.println(age>19);
		
		System.out.printf("나이 : ");
		int age = sc.nextInt();
		System.out.println( age + " : " + (age>19));
	
		
	}
		
	public void logicOp() {
		//논리연산하기
		//논리연산 : 2개이상의 진위형을 연결할때 사용하는 연산
		// && : and(그리고) 두개의 진위형이 모두 true일때 true반환
		// || : or(또는) 두개의 진위형 중 한개가 true일때 true반환
		// id admin이고, passowrd가 1234면 true 아니면 false
		String id = "admin";
		String password = "1234";
		System.out.println(id.equals("admin")&&password.equals("1234"));
		
		//입력받은 나이가 19살 이상이고 경기도에 살면 true출력 아니면 false;
		Scanner sc=new Scanner(System.in);
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("주소(광역시,도) : ");
		String address=sc.nextLine();
//		System.out.println(age>=19&&address.equals("경기도"));
//		
		// or 연산
		// 입력받은 주소가 경기도나 서울 일경우 true반환
		
		System.out.println(address.equals("경기도")|
		address.equals("서울"));
		
		//논리연산을 이용해서 숫자의 범위를 확인할 수 있음.
		System.out.println(10<=age&&age<=20);//10<=age<=20 이란뜻 
		//10<=age :10이거나 10보단큰수 계속 쭉
		//20<=age :20이거나 20보다아래 게속쭉
		//이두개가 교집합하는 수가 true다
		
		//입력받은 나이가 20대면 true아니면 false
		System.out.println(20<=age&&age<=29);
		
		//문자한개를 입력받고 입련한 문자가 대문자면 true 아니면false출력
		System.out.print("입력한 문자 : ");
		char alpha = sc.next().charAt(0);
		System.out.println('A'<=alpha&&alpha<='Z');
		
		//입력받은 나이가 20대 이면서 입력받은 성별이 여자인 사람
		System.out.print("입력한 성별(M/F) :");
		char gender = sc.next().charAt(0);
//		System.out.println("20대인가요? :" + (20<=age&&age<=29));
//		System.out.println("여자인가요? :" + (gender=='F'));
		System.out.println(20<=age&&age<=29&&gender=='F');
		//char타입은 equals를사용하지않고 ==을사용한다.
	
		//입력받은 문자가 알파벳이면 true 아니면 false
		System.out.print("입력한 문자 :");
		
		System.out.println('A'<=alpha&&alpha<='Z'||'a'<=alpha&&alpha<='z');
	
		//사는곳이 서울 또는 인천이면서 30대인 사람 구하기
	//	System.out.print("사는곳 :");
	//	System.out.println(address.equals("서울")||address.equals("인천")||30<=age&&<=39);
		
		boolean flag = address.equals("서울")||address.equals("인천")&&(30<=age&&age<39);
		System.out.println("결과 : " + flag);
		//연산자 우선순위로 인해 서울이 and부터 시작해서 인천은false지만 서울이true이기에true다
		//그래서 and를 앞으로 보내거나 괄호를붙인다.
			

		
	}
	public void complexOp() {
		//복합대입연산자  내가 원하는값을 더할수있다.
		//+=, -=, *=, /=
		//a+=10 == a=a+10;
		//a-=10 == a=a-10;
		//a*=10 == a=a*10;
		//값을 누적시키거나 차감시킬때 사용
		int total = 300000;
		total-=1000;
		System.out.println(total);
		total+=10000;
		System.out.println(total);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("현재 용돈 :");
		total =sc.nextInt();
		System.out.print("금액 : ");
		System.out.println("현재 잔액 :" + total);
		total +=sc.nextInt();
		System.out.print("금액 : ");
		System.out.println("현재 잔액 :" + total);
		total +=sc.nextInt();
		System.out.print("금액 : ");
		System.out.println("현재 잔액 :" + total);
		total +=sc.nextInt();
		System.out.print("금액 : ");
		System.out.println("현재 잔액 :" + total);
		
		//문자열에 대한 누적을 할 수 있을가??
		String msg = "";//공값을 대입할때 사용한다. 반드시초기화해줘야한다.
		msg+="안녕";
		msg+="하이";
		msg+="왓썹?";
		msg+="곰방와";
		//공백값에서 하나씩누적한다
		System.out.println(msg);
		
		
		
	}
	//수학,영어,국어 코딩점수를 입력받고
	//합계와 평균을 출력하는 기능 구현하기 *변수는 한개만 사용해서 구현할것!
	public void calcGrade() {
		Scanner sc=new Scanner(System.in);
		System.out.print("수학 :");
		//double score = sc.nextInt();
		int score = sc.nextInt();
		
		System.out.print("영어 :");
		score +=sc.nextInt();
		System.out.print("국어 :");
		score +=sc.nextInt();
		System.out.print("코딩점수 :");
		score +=sc.nextInt();
		System.out.println();
		System.out.println("합계 :" + score +" " + "평균 :" + (double)score/4);
		
		
		
	}
	//사용자에게 메세지를 4개 입력받고 입력받은 메세지를 한버에 출력하는 기능만들기
	public void inputMsg() {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 :");
		String msg = sc.nextLine()+"\n";//(/n)개행하고싶을때쓴다.
		System.out.print("두번째 :");
		 msg += sc.nextLine()+"\n";
		System.out.print("세번째 :");
		 msg += sc.nextLine()+"\n";
		System.out.print("네번째 :");
		 msg += sc.nextLine()+"\n";
		 
		 System.out.println("입력한 내용 :\n" + msg);
		
		 //웹페이지를 구성해서 응답할때 사용
		 String html = "<html>";
		 html+="<head>";
		 html+="<title>첫번째 페이지</title>";
		 html+="<head>";
		 html+="<body>";
		 html+="<h2>내마 만든 첫 페이지</h2>";
		 html+="<boby>";
		 html+="</html>";
		 
	
	
	
	}
	
	public void thirdOp() {
		//삼환연산자에 대해 알아보자.
		//조건식(true,false)나오는 연산, 기능(메소드)? 
		//조건식,기능이 true일때 실행할 로직:조건식,기능 false일때 실행할 로직
		
		//값이 180보다 크면 키가 크네요 출력 아니면 키가 작네요 출력
		double height = 175.5;
		String msg = height>=180?"키가 크네요":"키가 작네요";
		System.out.println(msg);
		
		//점수를 입력받아 점수가 60점이상이면 합격을 출력, 아니면 불합격출력
		
		Scanner sc=new Scanner(System.in);
		System.out.print("입력한 점수 :");
		int score = sc.nextInt();
		String result = score>=60?"합격":"불합격"; //문자열로 출력하기에 String의 자료형을쓴다.
		System.out.println("결과 :" + result);
		
		//아이디와 패스워드를 입력받고
		//아이디가 admin이고 패스워드가 1234면 로그인 성공 출력 아니면 로그인 실패 출력
		System.out.print("ID :");
		String id = sc.next();
		System.out.print("Password :");//패스워드는 문자열로많이한다.
		String password = sc.next();
		System.out.println(id.equals("admin")&&password.equals("1234")?"로그인 성공":"로그인 실패");
		
		
		String tag="<input type='checkbox' name= 'hobby'" +(id.equals("admin")?
		"checked":"")+">";
		//나이와 성별을 입력받아 
		//나이가 성년이고 남자면 멋진남자네요!
		//나이가 성년이고 여자면 예쁘시네요!
		//나이가 미성년이면 공부하세요!
		System.out.println("나이 : ");
		int age=sc.nextInt();
		System.out.println("성별(M/F) : ");
		char gender=sc.next().charAt(0);
		result =age>19?gender=='M'?"멋진남자네요":"이쁘시네요!":"공부하세요";
		System.out.println("결과 : " +result);
		
	}
}	
	
	
