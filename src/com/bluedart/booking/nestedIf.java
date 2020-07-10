package com.bluedart.booking;

public class nestedIf {

	public static void main(String[] args) {
		int a=110;
		int b=200;
		if(a<b) {
			int c=a+b;
			if(c%2==0) {
				System.out.println("C is even number "+c);
			}
			else {
				System.out.println("c is odd number"+c);
			}
		}
	}

}
