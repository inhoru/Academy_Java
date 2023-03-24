package com.io.run;

import com.io.controller.IoController;
import com.io.controller.SubStreamController;

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
		new SubStreamController().changeStream();
	}

}
