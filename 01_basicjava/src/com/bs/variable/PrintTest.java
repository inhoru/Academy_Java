package com.bs.variable;

public class PrintTest {

	public static void main(String[] args) {
		//console창에 데이터 출력하기
		//개행없이 같은 라인에 출력하기
		System.out.print("안녕");
		System.out.print(" 점심은 맛있게 먹었나요");
		System.out.print(" 점심먹고 졸면안돼요!!!");
		//개항하여 출력하기
		System.out.println("안녕");
		System.out.println(" 점심은 맛있게 먹었나요");
		System.out.println(" 점심먹고 졸면안돼요!!!");
		
		int age=19;
		String name="유병승";
		System.out.print(age+"\n");
		System.out.print(name);
		
		//정해진 양식대로 출력하기
		//System.out.printf()기능 이용
		System.out.printf("나의 이름은 %s이고, 나이는 %d이다", name,age);
		//문자패턴
		//%s : 문자열
		//%d : 정수
		//%f : 실수
		//%c : 문자
		System.out.println();//개행처리
		System.out.printf("이름 %5s 나이 %-3d 키 %.2f 성별 %c", 
							"유병승",19,180.5,'남');
		
		
		System.out.println();
		//문자열을 출력할때  escape문을 이용하여 출력
		//개행처리, tab(일정간격 띄어쓰기), 역슬러쉬표시, "", '' 표시
		String msg="그는 말했다. \"하이\"";
		System.out.println(msg);
		msg="나는 자바 선생님입니다. \n 나는 코딩을 \t좋아한다.";
		System.out.println(msg);
		String path="c:\\Users\\gdj";
		System.out.println(path);
		String html="<p onclick=\"alter('test');\">클릭해봐</p>";
		
	}
}
