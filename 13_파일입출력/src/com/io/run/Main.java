package com.io.run;

import com.io.controller.SubStreamController;
import com.io.model.vo.Person;

public class Main {

	public static void main(String[] args) {
		//new IoController().filetest();
		//new IoController().fileManage();
		//new FileStreamController().fileSave();
		//new FileStreamController().fileOpen();
		//new FileStreamController().strSave();
		//new FileStreamController().loadStr();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력할 파일명 : ");
//		String fileName = sc.nextLine();
//		System.out.println("저장할 데이터 : ");
//		String path = sc.nextLine();
//		new FileStreamController().Save(fileName,path);
//		new FileStreamController().load(fileName);
		//new SubStreamController().changeStream();
		//new SubStreamController().bufferedSave();
		//new SubStreamController().bufferedLoad();
		//new SubStreamController().savePerson("유병승",19,'남',180.5,"경기도시흥시");
		//new SubStreamController().dataLoad();
		Person[] persons = new Person[10];
		persons[0]=new Person("유병승",19,'남',180.5,"경기도 시흥시");
		persons[1]=new Person("강민기",32,'남',180.2,"경기도 안산시");
		persons[2]=new Person("최솔",29,'여',164.3,"경기도 안양시");
		persons[3]=new Person("윤지환",25,'남',180.1,"경기도 시흥시");
		/*
				new Person[] {
				new Person("유병승",19,'남',180.5,"경기도 시흥시"),
				new Person("강민기",32,'남',180.2,"경기도 안산시"),
				new Person("최솔",29,'여',164.3,"경기도 안양시"),
				new Person("윤지환",25,'남',180.1,"경기도 시흥시")
//		*/
//		new SubStreamController().savePersons(persons);
//		Person[] result = new SubStreamController().loadPerson();
//		for(Person p : result) {
//			System.out.println(p); 
//		}
//		new SubStreamController().objectSave();
//		Person p =new SubStreamController().onjectLoad();
//		System.out.println(p);
		
		new SubStreamController().svae(persons);
		Person[] result = new SubStreamController().load();
		for(Person p : result) {
			System.out.println(p);
		}
		
	}

}
