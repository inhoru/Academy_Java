package com.API.cintroller;

import java.util.StringTokenizer;

import com.aip.model.vo.Person;

public class StrignAPIController {
	// 자바에서 문자열에 대한 클래스는 3가지가 있음
	// String, StringBuffer, StringBuilder
	// String : 클래스지만 기본 자료형처럼 사용하게 설정되어 있다.
	// StringBuffer, StringBuilder : 클래스 사용방식으로 문자열을 다룰수있다.
	// String은 불변의 문자열 -> 수정이 불가능함
	// StringBuffer, StringBuilder : 가변의 문자열 -> 수정이 가능하다.
	public static void main(String[] args) {
		String str = "김아무";
		System.out.println(str);
		// 버퍼는 클래스로 만들어서사용
		StringBuffer sb = new StringBuffer("김무무");
		System.out.println(sb);
		// 저장소는 44481712
		System.out.println("수정 전: " + str.hashCode());
		// String 불변이다.
		str += " 선생님";
		System.out.println(str);
		// 저장소는 -151699....
		System.out.println("수정 후: " + str.hashCode());
		// 기본에저장공간을 바꾸는게아니라 새로운 저장소에 저장하는거다 그래서 불변이다.

		// StirngBuffer의 데이터를 수정하려면 제공하는 메소드를 이용해야한다.
		System.out.println("수정 전: " + sb.hashCode());
		// append = sd+= <- 와같은 말이다.
		sb.append(" 선생님");
		System.out.println(sb);
		System.out.println("수정 후: " + sb.hashCode());

		// String 클래스가 제공하는 유용한 메소드
		// 1. String.concat("문자열값") : 두개의 문자열을 합쳐주는 메소드
		String test = "GDJ64 ";
		test = test.concat("아자아자 화이팅!"); // +=연산과 동의하다.
		System.out.println(test);

		// 2. boolean String contains("문자열")
		// : 문자열에 매개변수로 전달된 문자열이 포함되어있는지 확인해주는 기능
		if (test.contains("64")) {
			System.out.println("응 64포함됨");
		}
		;

		// 3. int indexOf("문자열")
		// 문자열에 매개변수로 전달된 문자가 있는지 확인하고 그 자리수(인덱스번호)를 반환해줌
		System.out.println(test.indexOf("D"));
		System.out.println(test.indexOf("팅"));
		// 중복값이 있을때에는 문자가2개일때 맨처음꺼를 반환한다.
		// 단독으로 사용하는경우는 많이없다. 다른 메소드와 연결해서 많이 사용
		System.out.println(test.indexOf("아자"));
		// 문자에 포함되있지않으면 -1 이나온다
		System.out.println(test.indexOf("김아무"));
		// lastIndexOf("문자열");
		// ?
		System.out.println(test.lastIndexOf("아자"));
		// 파일명

		// date.txt, test.exe
		test = "date.test.exe";
		System.out.println(test.lastIndexOf("."));
		System.out.println(test.indexOf(".", test.indexOf(".") + 1));

		// 4. String[] split(String)
		// : 특정구분자(기호)로 구분할 수 있는 문자열을 구분할 수 있는 배열로 만드는것
		test = "유병승,19,경기도시흥시,남";
		String[] result = test.split(",");
		System.out.println(result[0]);
		System.out.println(result[1]);
		for (String d : result) {
			System.out.println(d);
		}
		test = "유병승,19,경기도시흥시,남\n최솔,29,경기도안양시,여\n김현영,26,서울시구로구,여";
		String[] persons = test.split("\n");
		Person[] personObj = new Person[persons.length];
		int i = 0;
		for (String p : persons) {
			String[] person = p.split(",");
			Person pobj = new Person(person[0], 
					Integer.parseInt(person[1]), 
									 person[2], 
									 person[3].charAt(0));
			personObj[i++] = pobj;
			System.out.println("이름 : " + person[0]);
			System.out.println("나이 : " + person[1]);
			System.out.println("주소 : " + person[2]);
			System.out.println("성별 : " + person[3]);
			
		}
		
		for(Person p : personObj) {
			System.out.println(p);
		}
		
		//5. String replace("찾을값","대체할값")  
		// : 특정문구를 대체문구로 교체하는 것
		test="나는 코딩을 정말 못해!";
		String testStr=test.replace("못해","잘해");
		System.out.println(test);
		System.out.println(testStr);
		
		//6. String String.join("구분자",배열) 
		//: 배열을 특정구분자로 문자열로 만들어준다.
		String [] testArr= {"유병승","윤지환","윤준호","윤나라","나빈"};
		test=String.join("->", testArr);
		System.out.println(test);

		//7.String subString(시작인덱스번호[,끝인덱스번호])
		// 시작인덱스부터 끝인덱스까지 문자열을 잘라내는 기능
		test="수업 좀 잘하세요";
		testStr=test.substring(4);
		System.out.println(testStr);
		//시작은 포함 끝나는건 불포함
		testStr=test.substring(2,4);
		System.out.println(testStr);
		testStr=test.substring(test.indexOf("잘"));
		System.out.println(testStr);
		test="test.png";
		testStr=test.substring(test.indexOf(".")+1);
		System.out.println(testStr);
		testStr=test.substring(0,test.indexOf("."));
		System.out.println(testStr);
		
		//8. toUppercase()/toLowerCase()
		test="AbdDefG";
		testStr=test.toUpperCase();
		System.out.println(testStr);
		testStr=test.toLowerCase();
		System.out.println(testStr);
		//예를들자 이런식으로 대문자를입력하던 소문자를입력하던 자동으로 변경해준다.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("계속하시겠습니까?(y/n)");
//		String cho = sc.next();
//		if(cho.toLowerCase().equals("y")) {
//			System.out.println("계속하자");
//		}else if(cho.toLowerCase().equals("n")) {
//			System.out.println("중단하자");
//		}
		
		//9. String trim() : 문자열의 양쪽 공백을 제거해주는 메소드
		test="          안녕하세요";
		System.out.println(test);
		testStr=test.trim();
		System.out.println(testStr);
		
		//valueOf() : 기본자료형을 String으로 변환해주는 기능
		int age = 19;
		//test=(String)age;
		test=String.valueOf(age);
		System.out.println(test);
		test=String.valueOf(180.5);
		System.out.println(test);
		

		//StringBuffer
		//데이터를 수정, 저장하기 * 원본값을 수정함.
		
		//1. append("문자열") : 문자열을 추가하는메소드
		StringBuffer testSb = new StringBuffer();
		System.out.println(testSb);
		System.out.println(testSb.length());
		testSb.append("여러분 한시간 남았어요!");
		System.out.println(testSb);
		System.out.println(testSb.length());
		testSb.append(" 우리 힘냅시다! 보강은 어떻게 할까요?");
		System.out.println(testSb);
		System.out.println(testSb.length());
		
		//2. insert(인덱스번호, 문구) : 특정위치에 문구를 추가하는것
		testSb.insert(3, "곧 ");
		System.out.println(testSb);
		testSb.insert(testSb.indexOf("!"),"????");
		System.out.println(testSb);
		
		//3. delete(시작인덱스, 끝인덱스) : 해당위치에 있는 값을 삭제
		testSb.delete(3, 5);
		//앞에꺼는 포함 뒤에있는건 포함이안됨
		System.out.println(testSb);
		testSb.delete(0, 3);
		System.out.println(testSb);
		
		// deleteCharAt(인덱스번호) : 한글자만 삭제하는 기능
		testSb.deleteCharAt(1);
		System.out.println(testSb);
		// 4. setCharAt(인덱스번호, "수정할문자") : 해당 인덱스번호에서 수정할 문자
		testSb.setCharAt(1, '공');
		System.out.println(testSb);
		
		// 5. length() 문자열의 길이를 출력
		System.out.println(testSb.length());
		
		//String에서 제공하는 유사한 유용한메소드를 제공
		//substring, indexOf, resplace 등등
		String result1 = testSb.substring(5);
		System.out.println(result1);
		
		//replace(시작번호,끝번호,"변경할문구")
		//원본값 수정
		testSb.replace(0, 3, "여러분 힘내요!");
		System.out.println(testSb);
		//반전시키는 것
		testSb.reverse();
		System.out.println(testSb);
		testSb.reverse();
		System.out.println(testSb);
		
		//StringBuffer==StrinfBuilder동일함. 스레드세이프티
		StringBuilder testSb2=new StringBuilder();
		testSb2.append("테스트");
		System.out.println(testSb2);
		
		//String과 StringBuffer의 호환성
		System.out.println(testSb);
		test=new String(testSb);
		System.out.println(test);
		testSb= new StringBuffer(test);
		System.out.println(testSb);
		
		//StringTokenizer클래스 이용하기
		//String에서 제공하는 split()메소드와 유사한 기능
		test="유병승,최주영,이동제,최인호";
		test="java,oracle,html/css/javascript/jquery,servlet/jsp";
		StringTokenizer st =new StringTokenizer(test,",");
//		System.out.println(st.nextElement());
//		System.out.println(st.nextElement());
//		System.out.println(st.nextElement());
//		System.out.println(st.nextElement());
		//엘리먼츠 있니 물어봄 있으면 트루 없으면 펄스
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}	
	
		
	
}
