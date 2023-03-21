package com.inter.run;

import com.inter.common.PrinterDriver;
import com.inter.controller.PrinterController;
import com.inter.model.vo.Cannon;
import com.inter.model.vo.LGPrinter;
import com.inter.model.vo.SamsunPrinter;

public class PrintMain {
	public static void main(String[] args) {
		//SamsunPrinter printer=new SamsunPrinter();
		//LGPrinter printer=new LGPrinter();
		//new PrinterController(printer).print();
		PrinterDriver printer = new SamsunPrinter();
		printer = new LGPrinter();
		printer = new Cannon();
		new PrinterController(printer).print();
		
	}
}
