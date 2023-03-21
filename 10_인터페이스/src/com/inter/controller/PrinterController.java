package com.inter.controller;

import com.inter.common.PrinterDriver;
import com.inter.model.vo.LGPrinter;
import com.inter.model.vo.SamsunPrinter;

public class PrinterController {
	
//	private SamsunPrinter printer;
	private PrinterDriver printer;
	
//	public PrinterController(SamsunPrinter printer) {
//		this.printer=printer;
//	}
	public PrinterController(PrinterDriver printer) {
		super();
		this.printer = printer;
	}
	
	
	public void print() {
		//this.printer.samPrint();
		this.printer.print();
	}

	
	
	
}
