package com.iu.s3;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");
		//로그인 화면, 실패 제한없음, while문 사용
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		String menu = "1. 로그인    2. 종료";
		boolean check = true;
		//1. 로그인 -> id, pw 입력 -> 로그인 판단
		//	로그인 성공 -> 종료 , 로그인 실패 -> 메인매뉴로 돌아가기 
		//2. 종료
		while(check) {
		System.out.println(menu);
		int select = sc.nextInt();
		
			if(select==1) {
				System.out.println("===  [로그인]  ===");
				System.out.println("ID를 입력하세요.");
				int yid = sc.nextInt();
				System.out.println("PW를 입력하세요.");
				int ypw = sc.nextInt();
					if(yid==id && ypw==pw) {
						System.out.println("로그인 성공! 메뉴를 종료합니다");
						check=!check;
					}else {
						System.out.println("로그인 실패! 메인으로 돌아갑니다");
						System.out.println("=========================");
					}
			}else {
				System.out.println("메뉴를 종료합니다");
				check=!check;
			}
			}
				
		System.out.println("WhileTest2 Finish");
	}

}
