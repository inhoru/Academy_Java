package com.io.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamController {
	public void fileSave() {
		//애플리케이션에서 관리하는 데이터를 지정한 파일에 저장하는 기능
		// 1 . OutputStream클래스를 이용 - > FileOutputSteam클래스
		//FileOutputStream클래스 생성
		//매개변수있는 생성자를 이용
		//1) new FileOutpuStream(File f);
		//2) new FileOutpuStream(String filename);
		
		//스트림열기 지정한파일에 내가가지고있은 데이터를 보내기위해서
		//바이트를 저장함
		FileOutputStream fos = null;
		try {

			fos = new FileOutputStream("test");
			//만일 지정한 파일이없으면 생성해서 연결한다.
			//지가알아서만듬;
			
			//생성한 스트림을 이용해서 데이터 저장하기
			//write()메소드를 이용 
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(9);
			fos.write(8);
			fos.write(7);
			
			
			//스트링타입은 넣을수가없지만
			//get.Bytes()를 이용해서 넣을수있다.
			String name = "유병승";
			fos.write(name.getBytes());
			name = "banana";
			fos.write(name.getBytes());
			
			
			
			//생성한 Stream을 **반드시** 닫아줘야한다.
			//close()
			
					
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			//반드시 해야하니간 finally로 닫는다.
			
		}finally {
			try {
				
				if(fos!=null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		}
		
	}
	// 파일데이터 불러오기
	//자동으로 만들어주지않는다 
	//파일이반드시 있어야한다.
	public void fileOpen() {
		FileInputStream fis = null;
		try {
			//fis=new FileInputStream(new File("test.txt"));
			fis=new FileInputStream("test");
			//연결된 파일에서 데이터를 읽어오기
			//read()메소드를 이용
			//1 byte 씩 읽어옴 -> int로 반환해줌.
			//파일의 내용을 끝까지 다 읽어오면 -1을 반환함.
			int value = 0;
			while((value = fis.read())!=-1)
			{
				//value = fis.read();
				System.out.println((char)value);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
			
			//반드시실행 닫기
		}finally {
			try {
				if(fis!=null) fis.close();
			}catch(IOException e) {
				e.printStackTrace();
				
			}
		}
	}
	//데이터를 문자열로 저장하기
	//Reader, Writer클래스 이용하기
	//FileReader, FileWriter클래스를 사용한다.
	
	public void strSave() {
		//FileWriter 은 문자열전용이다.
		FileWriter out = null;
		
		try {
			//out = new FileWriter(new File("strdata"));
			out = new FileWriter("strdata");
			out.write("여러분 힘내세요 이제 곧 끝나요!!");
			out.write("뻥이에요!");
			out.write(19);
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(out!=null) {
					out.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	//Reader을이용할려면 파일이반드시존재해야한다
	//알아서 자동으로 만들어주지않기 때문이다.
	public void loadStr() {
		FileReader fr = null;
		
		try {
			fr= new FileReader("strdata");
			//읽어올때는 read()메소드를 이용한다.
			int data = 0;
			StringBuffer sb= new StringBuffer();
			while((data = fr.read())!=-1) {
				
				//System.out.println((char)data);
				sb.append((char)data);
			}
			System.out.println(sb);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null) fr.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		//파일을 저장하고 읽는 메소드 구현하기 ->문자열
		//파일저장메소드 구현
		//매게변수로 저장할 데이터와 파일명을 받는 메소드
		
		//파일읽기메소드 구현
		//매개변수로 파일명을 입력받아 파일에 있는 데이터를 가져와 출력하는 메소드
		
		
		
		
	}
	public void Save(String fileName, String path) {
		FileWriter  f = null;
		
		try {
			//FileWriter 를 만들었을때 뒤에 true를 적어준다면 
			//기존에 값을지우지않고 더할수가있다.
			//안쓴다면 기본false로설정되있어서 계속 기존내용은 사라지고 덮어써진다.
			f = new FileWriter(fileName,true);
			f.write(path);
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(f!=null) {
					f.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
	}
	public void load (String fileName) {
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
			int data = 0;
			StringBuffer sb= new StringBuffer();
			while((data = fr.read())!=-1) {
				sb.append((char)data);
				
			}
			System.out.println(sb);
		}catch(IOException e){
			e.printStackTrace();
			
		}finally {
			try {
				if(fr!=null) {
					fr.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
