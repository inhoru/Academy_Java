package com.io.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
		
		try (FileInputStream fis =new FileInputStream("data");
				InputStreamReader isr = new InputStreamReader(fis);)
				{
			//fis = new FileInputStream("data");
			//isr = new InputStreamReader(fis);
			int data  =0;
			while((data=fis.read())!=-1){
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
		
		//InputStreamReader : 문자변환
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
	
	
}
