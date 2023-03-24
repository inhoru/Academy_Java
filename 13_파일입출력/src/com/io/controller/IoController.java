package com.io.controller;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.swing.filechooser.FileFilter;

public class IoController {
	public void filetest() {
		// java코드로 file을 다룰 수 있는 File클래스에 대해 알아보자.
		// file은 하드에저장되어 있다 그file과 연동해서 사용할수가 있다.
		// 1. file클래스 생성하기
		// 항상 매게변수잇는 생성자로 생성해야한다.
		// 경로를 입력하지않는다면 사용하고있는 프로젝트 안에 만들어진다.
		// File f = new File("test.txt");
		// 절대경로에 입력하면 절대경로에 만들어진다.
		File f = new File("c:/Users/GDJ/data.txt");

		// 2. 지정된 파일 생성하기
		// createNewFile() 메소드를 이용
		// 예외처리를해줘야한다.
		// 생성후 자바프로젝트에 보이게할려면
		// represh(f5)를눌러줘야한다.
		try {

			f.createNewFile();
			System.out.println("파일생성완료");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일생성실패");
		}

		// 3. 내가 원하는 폴더 생성하기
		// mkdir(), mkdirs() 메소드가 있음.
		// mkdir() : 한개폴더만 생성할수가 있다.
		// mkdirs() : 하위폴더까지 여러개의 폴더를 생성 할수 있음.
		File dir = new File("./myfolder");
//		// 요곳도 자바프로젝트안들어간다 f5를눌러서 확인할수있다.
//		boolean result1 = dir.mkdir();

		// File dirs = new File("./myfolder/a/b");
		// 이런식으로 여러개를 만들고싶어도 불가능하다.
		// 저위를 예시를 들자면 myfolder 폴더안에 a폴더안에 b폴더를 만들라는건데
		// a폴더가 없으니깐 만들어지지않는다 반대로a폴더가잇으면 만들어진다.

		File dirs = new File("../myfolder/a/b");
		boolean result = dirs.mkdirs();
		System.out.println(result);

		// (./) 는현재경로를 표현한다.예를들면 c:/test/ 가있다면 ./test를 쓴다면 test에 만들어진다.
		// - 현재경로, 현재파일이 있는 위치와 동일한 위치
		// (../) 는상위경로를 표현한다 예를들면 c:/test/ 가있다면 ../test를 쓴다면 c에 만들어진다.
		// - 상뒤폴더(바로위에)

		// 절대경로 : root부터 전부 작성하는 것

		// 사용자에게 폴더와 파일명을 입력받아 생성해주는 기능 구현
		Scanner sc = new Scanner(System.in);

		System.out.println("생성할 파일명 : ");
		//String fileName = sc.nextLine();
		System.out.println("생성할 폴더명 : ");
		//String path = sc.nextLine();
		//makeFile(path,fileName);
		
		//file삭제하기
		//File클래스에서 제공하는 delete()메소드를 이용함
		//이런식으로 파일과 폴더를 삭제할수가있다.
		// 파일삭제
		File delFile = new File("mymyfolder/mytest.txt");
		delFile.delete();
		//폴더삭제
		File delDir = new File("mymyfolder");
		delDir.delete();
		
		//이미 있는파일에 대한 정보 확인하기
		File info = new File("../myfolder/a/b");
		//1. 파일명확인
		//getName() 으로 저장정보를 가져올수있다.
		System.out.println("파일명 : "+ info.getName());
		//출력결과
		//파일명 : test.txt
		
		//2. 부모파일확인하기
		System.out.println("부모전체 파일명 : "+ info.getParent());
		//출력결과
		//부모파일명 : .\myfolder\a\b
		//2-1 부모파일을 File로 가져오기
		File parent = info.getParentFile();
		System.out.println("부모파일명 : "+ parent.getName());
		//출력결과
		//b
		
		//3. 경로 가져오기
		System.out.println("경로가져오기 : "+ info.getPath());
		//출력결과
		//경로가져오기 : .\myfolder\a\b\test.txt
		
		//4. 불러온파일 폴더인지, 파일인지 확인
		System.out.println("폴더니 ? "+info.isDirectory());
		System.out.println("파일이니 ? "+info.isFile());
		System.out.println("폴더이니 ? "+parent.isDirectory());
		System.out.println("파일이니 ? "+parent.isFile());
		//출력결과
		//폴더니 ? false
		//파일이니 ? false
		//폴더이니 ? true
		//파일이니 ? false
		
		//5. 각종 정보 확인
		//파일크기, 숨긴파일여부, 수정한날짜, 절대경로
		//파일크기
		System.out.println(info.length());
		//숨김파일여부
		System.out.println(info.isHidden());
		//수정한 날짜
		System.out.println(new Date (info.lastModified()));
		//절대경로
		System.out.println(info.getAbsolutePath());
		//읽을권한이 있니?
		System.out.println(info.canRead());
		//실행가능한지?
		System.out.println(info.canExecute());
		//파일수정이가능한지?
		System.out.println(info.canWrite());
		
		//출력결과
		//0
		//false
		//Thu Jan 01 09:00:00 KST 1970
		//C:\Users\GDJ\eclipse-workspace\13_파일입출력\.\myfolder\a\b\test.txt
		//false
		//false
		//false
		
		
		
		
		
	}
	public void makeFile(String path, String fileName) {
		File dir = new File(path); //폴더객체 생성
		File file = new  File(path+"/"+fileName);//파일 객체 생성
		try {
			dir.mkdirs();
			file.createNewFile();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void fileManage() {
		File f = new File("c:/Windows/System32");
		// 폴더에 있는 전체파일목록을 가져오기
		// 문자열로 파일명을 가져오기
		String[] files = f.list();
		System.out.println(files.length);
		for(String fileName : files) {
			if(fileName.substring(fileName.indexOf(".")+1).equals("exe")){
				
				System.out.println(fileName);
			}
		
			
		}
		
		// 여기서부터 강의 다시들어보자
		// 집중못함 ㄷㄷ;
		
		// File클래스로 가져오기
		File[] filesObj= f.listFiles();
		int count = 0;
		for(File temp : filesObj) {
			//System.out.println(temp);
			//실행용파일이 몇개인지출력하기
			if(!temp.canWrite()) {
				count++;
			}
		}
		System.out.println("실행용파일 : "+ count);
		
//		filesObj = f.listFiles(new java.io.FileFilter() {
//			
//			@Override
//			public boolean accept(File pathname) {
//				return !pathname.canWrite();
//			}
//			
//		});
		//람다식표현
		filesObj = f.listFiles((name)->!name.canWrite());

	
		
		
		for(File temp : filesObj) {
			System.out.println(temp);
		}
		files = f.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.contains("exe");
				
			}
		});
		//람다식표
		files = f.list((dir,name)->name.contains("exe"));
	
	}
	
	
}
