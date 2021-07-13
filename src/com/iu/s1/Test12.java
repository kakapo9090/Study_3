package com.iu.s1;

public class Test12 {

	public static void main(String[] args) {
		System.out.println("Test12 Start");
		
		int num=15;
		
		switch(num) {
		case 1:
			System.out.println("case 1");
			break;
		default : 
			System.out.println("그 외 나머지");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 4:
			System.out.println("case 4");
			break;

		}
		//break를 만나거나 switch case문의 끝부분까지 계속됨.
		
		System.out.println("Test12 Finish");
	}
}
