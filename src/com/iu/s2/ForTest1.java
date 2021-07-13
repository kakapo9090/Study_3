package com.iu.s2;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		System.out.println("ForTest1 Start");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력하세요");
		int count = sc.nextInt();
		int num=0;
		
		for(int i=0;i<count;i=i+1) {
			System.out.println("Hello"+i); //num대신 i넣어도 가능
			num=num+1; //
		}//for문이 종료되면 그 안에서 선언했던 지역변수 i도 종료됨.		
		// 따라서 int i=0;을 밖에 선언해도 중복선언이 아니다!
		// 0 ~ 20사이에 짝수만을 출력
		
		for(int i=0;i<=20;i=i++) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
		System.out.println("=======================");
		// 0 ~ 20미만 사이에 짝수만 출력, if문 사용x - *용어: 요구사항
		for(int i=0; i<20; i=i+2) {
			System.out.println(i);
		}
		
		
		
		System.out.println("ForTest1 Finish");
	}
}
