package com.iu.s2;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		System.out.println("ForTest6 Start");
		//회원가입시 입력한 ID
		int id = 1234;
		//회원가입시 입력한 PW
		int pw = 5678;
		Scanner sc = new Scanner(System.in);
	//최대 5번 기회
	//1. 최대 5번 로그인 시도 - 5번 초과시 프로그램 종료	
/** =================== 내가 작성한 코드 =====================
		System.out.println("ID를 입력하세요.");
		int yid = sc.nextInt();
		System.out.println("PW를 입력하세요.");
		int ypw = sc.nextInt();
		
		if(id==yid && pw == ypw) {
			System.out.println("로그인 성공");
		}else {
			for(int i=1;i<=5;i++) {
				System.out.println(i+"회 로그인 실패! ID를 입력하세요.");
				yid = sc.nextInt();
				System.out.println("PW를 입력하세요.");
				ypw = sc.nextInt();
				if(id==yid && pw==ypw) {
					System.out.println("로그인 성공");
					i=5;
				}
			}
		}
================================================ **/
		boolean flag = false;
		for(int i=0;i<5;i++) {
			System.out.println("ID를 입력하세요.");
			int yid = sc.nextInt();
			System.out.println("PW를 입력하세요.");
			int ypw = sc.nextInt();
			
			if(yid == id && ypw == pw) {
				flag = !flag;
				//flag = true;
				break;
   // break 밑에는 코드 못씀. System.out.println("asdsa"); <- 죽은 코드 (실행불가)
			}
			System.out.println(i+1+"회 로그인 실패");
			
		} //for 끝
		
		 //2. for 종료 조건: 로그인성공과 5번 모두 실패
		//flag가 true면 로그인 성공, false면 모두 실패
		if(flag) {
			System.out.println("로그인 성공");
			
		}else {
			System.out.println("로그인 실패 은행에 방문");
		}
		
		
		System.out.println("ForTest6 Finish");
	}
}
