package com.io.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.io.model.vo.Person;

public class SubStreamController {
	//보조스트림에 대해 알아보자
	// 기본스트림으로 처리하지 못하는 기능, 더효율적으로 처리하기 위해 사용
	// 하나의 자바 클래스 
	
	public void changeStream() {
		//1. InputStreamReader/OutputStreamWriter
		// : byte기반 스트림을 문자기반 스트림으로 변경
//		FileInputStream fis = null;
//		InputStreamReader isr =null;	
		//try width resource구문
		
		//1. InputStreamReader (문자 변환 보조 스트림: 바이트를 문자기반변경)
		try (FileInputStream fis =new FileInputStream("data");
				InputStreamReader isr = new InputStreamReader(fis);)
				{
			//fis = new FileInputStream("data");
			//isr = new InputStreamReader(fis);
			int data  =0;
			while((data=isr.read())!=-1){
				System.out.println(data);
			}
		}catch(IOException	e) {
			e.printStackTrace();
//		}finally {
//			try {
//				if(fis!=null)fis.close();
//			}catch (IOException e) {
//				e.printStackTrace();
//			}
		}
		
		//2. InputStreamReader : 문자변환
		//스트링으로 가져온걸 reader로처리를할수가있다.
		//InputStream 으로 받아온 문자열은 바이트로 받아오기때문에
		//글씨가 깨질수 있다.
		//그래서 InputStreamReader 로 변환을해서 문자열을 정상적으로 출력해준다.
		InputStream inputStream = null;
		InputStreamReader reader =null;
		try {
			URL url = new URL("https://www.gdu.co.kr/");
			HttpURLConnection connect = (HttpURLConnection)url.openConnection();
			inputStream = connect.getInputStream();
			reader = new InputStreamReader(inputStream);
			int data = 0;
			StringBuffer sb = new StringBuffer();
			while((data=reader.read())!=-1) {
				System.out.println((char)data);
				sb.append((char)data);
			}
			System.out.println(sb);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				
				if(inputStream!=null) inputStream.close();
				if(reader!=null) reader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		

	}
	//BufferedInputStream / BufferedOutputStream
	//입출력 속도를 향상 시켜주는 클래스 
	public void bufferedSave () {
		try(FileOutputStream fos = new FileOutputStream("myfile");
				BufferedOutputStream bos = new BufferedOutputStream(fos);){
					String data ="오늘 너무너무 고마워요 눈물이 날뻔했어요";
					bos.write(data.getBytes());
				}catch(IOException e){
					e.printStackTrace();
				}
					
				}
	public void bufferedLoad() {
		try(FileInputStream fis = new FileInputStream("myfile");
				BufferedInputStream bis = new BufferedInputStream(fis);
				InputStreamReader reader= new InputStreamReader(bis);){
			int data = 0;
			while((data = reader.read())!=-1) {
				System.out.println((char)data);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
			
	//자료형 기반으로 데이터를 저장하고 불러오기
	//DataInputStream/ DataOutpuStream
	//이름, 나이, 성별, 키 , 주소 를 저장하고 불러오고싶다.
	public void savePerson(String name,int age,char gender,double height,String address) {
		try(//FileWriter write = new FileWriter("person.bs")
				FileOutputStream fos = new FileOutputStream("person.bs");
				//메소드 내부에 각각의자료형이 들어가있다.
				DataOutputStream dos = new DataOutputStream(fos)){
			//String data = name+","+age+","+gender+","+height+ ","+address;
			//write.write(data);
//			write.write(name);
//			write.write(age);
//			write.write(gender);
//			write.write(height);
			//항목별로 자료형 별로 저장을한다.
			//
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeChar(gender);
			dos.writeDouble(height);
			dos.writeUTF(address);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
//	} 이따가 다시보자
//	public void dataLoad() {
//		try(FileReader reader = new FileReader("person.bs") {
//			
//			int data = 0;
//			
//			StringBuffer sb = new StringBuffer();
//			
//			while((data=reader.read())!=-1) {
//				System.out.println((char)data);
//				sb.append((char)data);
//				
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		}
//		
		public void dataLoad() {
		try(//FileReader reader=new FileReader("person.bs")
				FileInputStream fis = new FileInputStream("person.bs");
				DataInputStream dis = new DataInputStream(fis)){
			//주의할사항 : 저장할 순서대로 불어와야함.
			//java.io.EOFException 순서가다르면 에러가난다.
			String name = dis.readUTF();
			int age = dis.readInt();
			char gender = dis.readChar();
			double height = dis.readDouble();
			String address = dis.readUTF();
			//int data=0;
//			StringBuffer sb=new StringBuffer();
//			while((data=reader.read())!=-1) {
//				sb.append((char)data);
//			}
//			System.out.println(sb);
//			String[] datas=new String(sb).split(",");
//			String name=datas[0];
//			int age=Integer.parseInt(datas[1]);
//			char gender=datas[2].charAt(0);
//			double height=Double.parseDouble(datas[3]);
//			String address=datas[4];
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			System.out.println(height);
			System.out.println(address);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
		
		public void savePersons(Person[] persons) {
			
			try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("persons"))){
				for(Person p : persons) {
					if(p!=null) {
					dos.writeUTF(p.getName());
					dos.writeInt(p.getAge());
					dos.writeChar(p.getGender());
					dos.writeDouble(p.getHeight());
					dos.writeUTF(p.getAddress());
					}
				}
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		public Person[] loadPerson() {
			Person[] result = new Person[10];
			try(DataInputStream dis = new DataInputStream(new FileInputStream("persons"))){
				for(int  i = 0;i<result.length;i++) {
					String name = dis.readUTF();
					int age = dis.readInt();
					char gender = dis.readChar();
					double height = dis.readDouble();
					String address= dis.readUTF();
					Person p = new Person(name,age,gender,height,address);
					result[i]=p;
				}
				//저장된데이터를 모두불러오면 EOFException오류가 뜬다 
				//그래서 예외처리해줄수있다.
			}catch(EOFException e) {
				System.out.println("저장된데이터를 모두 불러왔습니다.");
		}catch(IOException e) {
				e.printStackTrace();
			}
			return result;
		}
		
		//ObjectInputStream/ObjectOutputStream
		//파일에 객체형식으로 저장하고 가져오는 방법
		//객체기반으로 파일에 저장할때 직렬화, 역직렬화를 해야한다.
		//직렬화, 역직렬화는 jvm이 알아서 처리 -> Serializerable인터페이스를 구현
		
		public void objectSave() {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objfile"))){
				oos.writeObject(new Person("유병승",19,'남',180.5,"경기도시흥시"));
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		public Person onjectLoad () {
			Person p = null;
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objfile"))){
				p = (Person)ois.readObject();
				
			}catch(ClassNotFoundException|IOException e) {
				e.printStackTrace();
			}
			return p;
		}
		
		//persons를 매개변수로 전달받고
		//persons.dat에 저장하는 기능 구현 -> Object스트림이용
		
		//persons.dat에 저장된 데이터를 불러와서 반환하는 기능 구현
		//-> Object스트림이용
		public void svae (Person[] persons) {
			try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persons.dat"))){
					oos.writeObject(persons);
			}catch(IOException e) {
				e.printStackTrace();
				
			}
			
		}
		public Person[] load() {
			Person[] p = null;
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persons.dat"))){
				p = (Person[])ois.readObject();
				
			}catch(ClassNotFoundException|IOException e) {
				e.printStackTrace();
			}
			return p;
		}
	

	
	
}
