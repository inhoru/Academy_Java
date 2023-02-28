package com.bs.varlable;

public class PrintTest {

	public static void main(String[] args) {
		// console창에 데이타 출력하기
		// 개행없이 같은 라인에 출력하기
		System.out.print(" 안녕");
		System.out.print(" 점심은 맛있게 먹었나요");
		System.out.print(" 점심 먹고 졸면안돼요!!!");
		// 개항하여 출력하기
		System.out.println("안녕");// 바로위에 프린트로했기때문에개항이 안됏다.
		System.out.println("점심은 맛잇게 먹엇나요");
		System.out.println("점심 먹고 졸면안돼요!!!");

		int age = 19;
		String name = "유병승";
		System.out.print(age + "\n");
		System.out.print(name);

		// 정해진 양식대로 출력하기
//		System.out.println();기능 이용
		System.out.printf("나의 이름은 %s이고, 나이는 %d이다", name, age);
		// 문자패턴
		// %s : 문자열
		// %d : 숫자
		// %f : 실수
		// %c : 문자
		System.out.println();
		System.out.printf("이름 %5s 나이 %-3d 키%.1f 성별%c", "최인호", 19, 180.5, '남');
		// %.1f소수점 한자리까지만 출력해라 라는뜻 .2->두자리까지표시해라
		// +는 오른쪽정렬 -는 왼쪽정렬
		
		//문자열을 표시할때 escape문을 이용하여 출력  문자열안에서만가능
		//개행처리, tab(일정간격 띄어쓰기), 역슬러쉬표시, "",''표시
		System.out.println();
		String msg = "그는 말했다. \"하이\"";
		System.out.println(msg);
		msg = "나는 자바 선생님입니다. \n 나는 코딩을 \t좋아한다.";
		System.out.println(msg);
		String path ="c:\\Users\\gdj"; //  문자열에 역슬래쉬를 표현하고싶으면 역슬래쉬를 두번사용한다.
		System.out.println(path);

		String html = "<p onclick=\"alter('test');\">클릭해봐</p>";//이렇게쓴다html에서
		
		

	}
}
