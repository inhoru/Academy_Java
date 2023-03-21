package com.inter.model.vo;

import com.inter.common.PrinterDriver;

public class SamsunPrinter implements PrinterDriver {
	
	public void samPrint() {
		System.out.println("삼성프린터 인쇄중.....");
		
	}
	@Override
	public void print() {
		samPrint();
	}
}
