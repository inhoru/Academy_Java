package com.bs.varlable;

public class OverflowTest {
	public static void main(String[] args) {
		
		//overflaowtest 최대값에서
//		+1을해버리면 최소값이된다.
//		반대로최소값에-1을해버리면 최대값이된다.


		byte b = 100;
		for(int i=0; i<100000; i++) {
			b += 1;  //b=b+1
			System.out.println(b);
		}
		
		
	}
}
