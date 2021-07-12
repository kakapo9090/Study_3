package com.iu.s1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		System.out.println("Test5 Start");
		
		Scanner sc = new Scanner(System.in);
		
		// 회원가입시 입력한 ID
		int id = 1234;
		// 회원가입시 입력한 PW
		int pw = 5678;
		
		System.out.println("ID를 입력하세요");
		// ID 입력 후 저장
		int yId = sc.nextInt();
		
		System.out.println("PW를 입력하세요");			
		// PW 입력 후 저장
		int yPw = sc.nextInt();	
		
		//로그인이 성공하면 - 로그인 성공 출력
		if(id==yId && pw==yPw) {
			System.out.println("로그인 성공");
		}
		
		
		System.out.println("Test5 Finish");
	}
}
