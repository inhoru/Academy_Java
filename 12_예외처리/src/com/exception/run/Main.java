package com.exception.run;


import java.io.FileNotFoundException;
import java.io.IOException;

import com.exception.controller.ExceptionController;

public class Main {

	public static void main(String[] args) {
		//new ExceptionController().uncheckedException();
		//위임받아서 여기서 처리
		try {
			
			new ExceptionController().exceptionResolve();
		}catch(FileNotFoundException e ) {
			e.printStackTrace();
		}catch(IOException  e) {
			e.printStackTrace();
		}
		new ExceptionController().makemyException();

	}

}
