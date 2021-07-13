package com.iu.s1;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		System.out.println("Test13 Start");
		
		//요금조회는 1번
		//상품가입은 2번
		//고장신고는 3번
		//상담원연결 0번
		//그 외: 잘못 누름 다시 선택
		Scanner sc = new Scanner(System.in);
		String help = "요금조회는 1번, 상품가입은 2번, 고장신고는 3번, 상담원연결은 0번을 눌러주세요";
		System.out.println(help);
		
		int select = sc.nextInt();
		
		switch(select) {
		case 1: 
			System.out.println("요금조회");
		break;
		case 2:
			System.out.println("상품가입");
		break;
		case 3:
			System.out.println("고장신고");
		break;
		case 0:
			System.out.println("상담원연결");
		break;
		default:
			int num =10; //switch의 지역변수 선언
			System.out.println("잘못 선택");
		break;
		}
		int num2=20; //main메서드의 지역변수 선언
		if(select>0) {
			num2=30;
			System.out.println(num2);
		}
		
		System.out.println(select);
//		System.out.println(num);
//		System.out.println(num2);
		System.out.println("Test13 Finish");
	}
}
