package com.bs.varlable;

public class StringTest {
	public static void main(String[] args) {
		//문자열 자료형 이용하기
		String name = "유병승";//이런시긍로 많이쓴다.
		//String은 클래스다!! ->원래..new연산자를 이용해서 생성해서 써야함.
		//java에서 기본자료형처럼 사용하수있게 해줌...
		name = new String("김재훈");//원래는이렇게 써야하지만 자바에서 바꿔준
		System.out.println(name);
		
		//문자열 타입의 값에 + 연산하면 대상되는 값을 결합해줌
		String msg = "유병승" + "java 선생님";
		System.out.println(msg);
		//다른타입과 문자열타입에 + 연산을 하면?? -> 결합연산!
		msg = 19 + "살 유병승";
		System.out.println(msg);
		
		int age = 19;
		name = "유병승";
		msg = name+age;//"유병승" + 19
		System.out.println(msg);
		msg = 20 + age +name;//연산은왼쪽부터 오른쪽으로한다 그러므로 20int age int 인트들이더해지고 문자열이더해진다.
		System.out.println(msg);
		msg = 20 + (age +name);//괄호 안부터 우선처리한다 
		System.out.println(msg);
		
		//본인의 이름, 나이, 성별(M/F), 키, 주소, 전화번호를 각 변수에 저장하고
		//* 데이터에 맞는 자료형으로 선택
		//나의 이름은 000이고 나이는 00살이고 키는 000.00, 주소는 0000
		//성별은 0이다. 출력
		
		String myName = "최인호"; //이름
		String address = "시흥동 4-31"; //주소
		String phone = "010-9801-4290";//번호
		char gender = 'M';//성별
		int myAge = 19;//나이
		double height = 179.5;//키
		
		System.out.println("나의 이름은 " + myName + "이고 나이는 " + myAge + "살이고 " + "키는 " + height + "이고 " + "주소는 " + address + "이고 " + 
		"성별은 " + gender + "이고 " + "전화번호는 " + phone + "이다." );
		
		//String은 클래스로 유용한 기능을 가지고있음.
		//1. String변수에 지정된 문자열의 길이를 알려주는 기능(메소드)
		// - length();
		//"문자열".length();
		//문자열 변수명.length();
		System.out.println("유병승".length());
		System.out.println(address.length());//띄어쓰기도 하나의문자다 모두포함한다.
		int count = address.length();
		System.out.println(count);
		
		//2. 문자열 변수에 저장된 문자열이 특정문자만 가져오는 기능
		//charAt(번호) 
		//"이다영".charAt(0)->"이"를출력한다.
		//"myName".charAt(1)->"인"를출력한다.
		System.out.println("이다영".charAt(0));
		System.out.println(myName.charAt(1));
		char ch = "이다영".charAt(2);
		System.out.println(ch);
		//주의 없는 번호를 대입하면 에러가 발생함.
		//ch="윤지환".charAt(3);
		//System.out.println(ch);
		
		
		
		
		
	}

}
