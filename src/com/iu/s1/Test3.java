package com.iu.s1;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		System.out.println("Test3 Start");
		//쇼핑몰의 총 주문 금액 입력
		//주문금액이 30000 이하면 배송비 3000이 추가 아니면 배송비 0
		
		//총 주문 금액 출력
		//ex) 주문 금액 : 25000 -> 28000 출력
		//ex) 주문 금액 : 35000 -> 35000 출력
		
	    //총 주문 금액을 담을 변수
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 금액을 입력하세요");
		int money = sc.nextInt();
			
		if (money<=30000) {
			money = money + 3000;
		}
		System.out.println("총 주문 금액 : " + money);
		System.out.println("Test3 Finish");
	}

}
