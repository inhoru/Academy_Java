package com.collection.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import com.collection.model.vo.Animal;
import com.collection.model.vo.Food;

public class ListController {

	public static void main(String[] args) {
		//시험에나온데
		//List인터페이스
				//List인터페이스는 Collection인터페이스를 상속받은 인터페이스
				//클래스를 다수 저장/관리하는 기능을 정의한 인터페이스
				//List를 구현한 클래스
				//ArrayList, LinkedList, Vector
				//선형자료구조를 갖는 클래스로 배열과 유사함.
				//인덱스번호, 순서가 있음.
				//삽입, 삭제 메소드가 구현이 되어있음
				//클래스가 제공하는 메소드를 이용해서 데이터를 관리함.
				
				//ArrayList클래스 이용하기
				ArrayList list=new ArrayList();
				
				//생성된 list저장소에 데이터 저장하기
				//ArrayList객체에 저장가능한 데이터는 자바에서 사용하는 모든데이터
				//저장하려면 add(저장할데이터)메소드를 이용한다.
				list.add(true);
				list.add(19);
				list.add("유병승");
				list.add('남');
				list.add(180.5);
				list.add(new Date());
				
				//저장된 데이터 가져오기(호출하기)
				//get(index번호)메소드를 이용함.
				System.out.println(list.get(0));
				System.out.println(list.get(1));
				System.out.println(list.get(2));
				System.out.println(list.get(3));
				System.out.println(list.get(4));
				System.out.println(list.get(5));
				//System.out.println(list.get(6));
				
				//기본적으로 ArrayList에 저장되는 데이터는
				//Object자료형으로 저장이된다.
				//대입된 실제 데이터를 사용하려면 형변환을 해야한다.
				//list.add
				//list.get(0);
				
				//전체 데이터에 접근(순회)할때는 반복문을 사용하면 편리하다.
				//List자료형의 길이는 size()메소드를 이용한다.
				//length는 없음!!
				System.out.println();
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i));
				}
				//실제 vo객체를 저장하고 관리하는 역할함.
				ArrayList foods=new ArrayList();
				
				foods.add(new Food("돈까스",10000,"일식",new Date()));
				foods.add(new Food("초밥",1500,"일식",new Date()));
				foods.add(new Food("컵라면",1400,"한식",new Date()));
				foods.add(new Food("샐러드",12000,"건강식",new Date()));
				
				//foods.get()이 오브젝트로해서 받는거기때문에
				//저장할려면 형변환을해준다.
				Food f=(Food)foods.get(1);
				System.out.println(f.getName()+" "+f.getPrice());
				//출력결과
				//초밥 1500
				System.out.println();
				
				//전체 음식의 타입, 이름, 가격을 출력
				for(int i = 0;i<foods.size();i++) {
					//똑같이 오브젝트로 반환을받기때문에 Food로 형변환을해준다.
					Food f1 = (Food)foods.get(i);
					System.out.println(f1.getType()+" "+f1.getPrice());
					//출력결과
					//일식 10000
					//일식 1500
					//한식 1400
					//건강식 12000
				}
				System.out.println();
				//전체음식중 가격이 5000원이하인 음식의
				//타입, 이름, 가격을 출력하기
				for(int i =0;i<foods.size();i++) {
					Food f1 = (Food)foods.get(i);
					if(f1.getPrice()<=5000) {
						System.out.println(f1.getType()+" "+f1.getName()+" "+f1.getPrice());
					}
				}
				//출력결과
				//일식 초밥 1500
				//한식 컵라면 1400
				
				//Animal클래스를 선언하고
				//이름, 몸무게, 나이, 종류
				//뽀삐, 5.3,10, 강아지
				//야옹이, 4.2, 5, 고양이
				//킥킥이, 15.3, 3, 원숭이
				//하하, 200.2,9, 하마
				//ArrayList에 저장하고
				//1. 전체 데이터 출력
				//2. 이름, 나이, 몸무게만 출력(전체)
				//3. 몸무게가 10kg이상인 동물의 이름, 종류, 몸무게 출력
				//4. 나이가 5살이상인 동물의 이름, 나이 출력
				//5. 저장된 동물들의 나이를 한살씩 증가시키고 저장된 전체동물출력
				
				ArrayList animal = new ArrayList();
				
				animal.add(new Animal("뽀삐",5.3,10,"강아지"));
				animal.add(new Animal("야옹이",4.2,5,"고양이"));
				animal.add(new Animal("킥킥이",15.3,3,"원숭이"));
				animal.add(new Animal("하하",200.2,9,"하마"));
				
				//전체출력
				for(int i = 0;i<animal.size();i++) {
					System.out.println(animal.get(i));
				}
				//이름 나이 몸무게만 출력
				//foreach문 사용
				for(Object o : animal) {
					Animal a = (Animal)o;
					System.out.println(a.getName()+" "+a.getAge()+" "+a.getWeight());
				}
				
				//몸무게가 10kg이상인 동물의 이름, 종류, 몸무게 출력
				for(int i =0;i<animal.size();i++) {
					Animal a = (Animal)animal.get(i);
					if(a.getWeight()>=10) {
						System.out.println(a.getName()+" "+a.getKind()+" "+a.getWeight());
					}
				}
				//나이가 5살이상인 동물의 이름, 나이출력
				for(int i = 0;i<animal.size();i++) {
					Animal a = (Animal)animal.get(i);
					if(a.getAge()>=5) {
						System.out.println(a.getName()+" "+a.getAge());
					}

				}
				//저장된 동물들의 나이를 한살씩 증가시키고 저장된 전체동물출력
				//1. 인덱스에 있는 동물의 나이를 수정해보자
				//((Animal)animal.get(0)).setAge(20);
				
				//전체 증가
				for(int i =0 ;i<animal.size();i++) {
					Animal a = (Animal)animal.get(i);
					int age = a.getAge();
					a.setAge(age + 1);
					//밑에방식도 가능하다.
				//	a.setAge(a.getAge()+1);
					
				//포이치로 출력
				}for(Object o : animal) {
					System.out.println(o);
				}
				
				//ArrayList에 데이터가 있는지 없는지 확인하기
				//isEmpty()메소드, size()를 이용
				ArrayList test = new ArrayList();
				//리스트가 비어있니? 물어봄
				//비어잇으면 true
				//비어있지않으면 false
				System.out.println(test.isEmpty());
				
				//animal엔 값이들어가있으니 false
				System.out.println(animal.isEmpty());
				
				//비어잇지않으면 포문을써서 값을출력
				if(!animal.isEmpty()) {
					for(Object a : animal) {
						System.out.println(a);
					}
				}
				//animal.size()==0 이거랑 똑같은말이다 isEmpty()
				
				//ArrayList에 저장되어있는 전체 데이터를 순회하는 방법
				//원래는 지금까지 for문이나 forEach를 사용햇지만
				//iterator() 메소드를 사용해서도가능하다. -> Iterator객체를 이용하는것이다.
				
				//데이터전체를 가져와서 하나씩빼서 쓴다 그리고 삭제한다 전부다썻다면 ex오류가뜬다.
				//set에서 무조건쓴다?
				System.out.println("=== iterator방식으로 출력하기 ===");
				animal.add(new Animal("음메에",30.5,3,"양"));
				
				Iterator it = animal.iterator();
				while(it.hasNext()) {
					//it.next를 사용하면 지워지니간 
					//그값을사용할려면 변수에저장해서 사용하자.
					Animal a= (Animal)it.next();
					
					//System.out.println(a);
					//System.out.println(it.next());
				}
				System.out.println();
				//원하는 인덱스 위치에 값 추가하기
				//add(index, element);
				//덮어씌우는게아니라 그자리로간후 그자리에잇는녀석을 뒤로밀어버린다.
				animal.add(1,new Animal("부엉",4.3,3,"부엉이"));
				for(int i = 0;i<animal.size();i++){
					System.out.println(i+" "+animal.get(i));
				}
				System.out.println();
				//원하는 인덱스의 값을 수정하기
				//set(index, element);
				animal.set(1, new Animal("고라",20.2,1,"고라니"));
				for(int i = 0;i<animal.size();i++){
					System.out.println(i+" "+animal.get(i));
				}
				System.out.println();
				//원하는 인덱스의 값 삭제하기
				//원하는 인덱스를 지우고 순서대로 재정렬해준다.
				animal.remove(1);
				for(int i = 0;i<animal.size();i++){
					System.out.println(i+" "+animal.get(i));
				}
				System.out.println();
				
				//매개변수와 일치하는 값 삭제하기
				//remove(Object o ) -> 대상 클래스에 equals, hasCode가 오버라이딩 되어 있어야한다.
				System.out.println("==== 객체로 삭제 ====");
				animal.remove(new Animal("음메에",30.5,3,"양"));
				for(int i = 0;i<animal.size();i++){
					System.out.println(i+" "+animal.get(i));
				}
				System.out.println();
				//ArrayList의 데이터들을 관리할수있는 메소드
				//1. 특정 객체가 리스트에 포함되어 있는지 확인하는 메소드
				// contains(Object) : boolean
				boolean result = animal.contains(new Animal("야옹이",4.2,6,"고양이"));
				System.out.println(result);
//				System.out.println();
//				List personList = List.of(new Person(), new Person(), new Person(), new Person(), new Person());
//
//				Scanner sc = new Scanner(System.in);
//				int indexs = 0;
//				for (int i = 0; i < personList.size(); i++) {
//					System.out.println(i+1+"번째 등록");
//					System.out.print("이름 : ");
//					String names = sc.next();
//					System.out.print("나이 : ");
//					int age = sc.nextInt();
//					System.out.print("성별 : ");
//					char gender = sc.next().charAt(0);
//					System.out.print("키 : ");
//					double height = sc.nextDouble();
//					System.out.print("몸무게 : ");
//					double weight = sc.nextDouble();
//					
//					((Person) personList.get(indexs)).setNaem(names);
//					((Person) personList.get(indexs)).setAge(age);
//					((Person) personList.get(indexs)).setGender(gender);
//					((Person) personList.get(indexs)).setHeight(height);
//					((Person) personList.get(indexs)).setWeight(weight);
//					
//					indexs++;
//
//				}
//				for (Object o : personList) {
//
//					System.out.println(o);
//				}
				
				//LinkedList클래스 이용하기
				//List인터페이스 구현한 클래스
				//사용법 ArrayList클래스와 유사함.
				System.out.println();
				LinkedList linkList = new LinkedList();
				//LinkedList에 값을 대입, 출력, 순회 방법은 ArrayList와 동일함.
				linkList.add("최주영");
				linkList.add("이동제");
				linkList.add("최인호");
				System.out.println(linkList.get(0));
				linkList.forEach((e)->System.out.println(e));
				
				System.out.println();
				//첫번째가 누구인지
				System.out.println(linkList.getFirst());
				//마지막 누구인지
				System.out.println(linkList.getLast());
				
				//기본적으로 데이터를 저장, 출력 : ArrayList사용
				//저장된 데이터를 조작(수정,삭제)이 많을때 :  LinkedList사용
				
				
				
	}

}
