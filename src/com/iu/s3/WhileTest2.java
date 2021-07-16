package com.iu.s3;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");
		//로그인 화면, 실패 제한없음, while문 사용
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean check = true;   //while문을 제어하기 위한 스위치
		//1. 로그인 -> id, pw 입력 -> 로그인 판단
		//	로그인 성공 -> 종료 , 로그인 실패 -> 메인매뉴로 돌아가기 
		//2. 종료
		
		// ===================7.14 과제=====================
		//로그인 성공, 로그인 안 됐거나
		//로그인이 성공했으면 게임을 시작
		//예) MMORPG게임
	//최초레벨: 1, 만렙: 15
	//최초gold: 0
		//레벨 5 달성 시 1000gold 지급
		//레벨 10 달성 시 2000gold 지급
		//레벨 15 달성 시 3000gold 지급
		
		//*모든 몬스터의 경험치 증가량은 동일
		//   Lv   : kills
		// 1 -> 2 : 3마리
		// "몬스터 1마리 사냥"
		// "몬스터 2마리 사냥"
		// "몬스터 3마리 사냥" -> "레벨업" 출력 및 kills 초기화
		// 2 -> 3 : 6마리
		// 3 -> 4 : 9마리
		// 4 -> 5 : 12마리
		// 5 -> 6 : 15마리
		// ...
		// 14 -> 15 : 42마리
		// 15레벨 달성시 최종 레벨 & 최종 gold 출력 후 종료
		
		//로그인 구간
		while(check) {
		System.out.println("1. 로그인    2. 종료");
		int select = sc.nextInt();
		
			if(select==1) {
				System.out.println("===  [로그인]  ===");
				System.out.println("ID를 입력하세요.");
				int yid = sc.nextInt();
				System.out.println("PW를 입력하세요.");
				int ypw = sc.nextInt();
					if(yid==id && ypw==pw) {
						System.out.println("로그인 성공!");
						break;
					}else {
						System.out.println("로그인 실패! 메인으로 돌아갑니다");
						System.out.println("=========================");
					}
			}else {
				System.out.println("프로그램을 종료합니다");
				check=!check;
			}
			}
				
		
//===============게임시작 코드 위치는 여기서 부터 작성!================
// 여태까지 배운것들을 이용해서 풀기
		int lv=1;
		int gold=0;
		int bonus=1;
		//게임 시작 구간
		if(check) { //check==true도 가능
		System.out.println("=================================");
		System.out.println("[          게임 시작         ]");
		System.out.println("계속하시려면 아무 키나 눌러주세요.");
		System.out.println("=================================");
		String go = sc.next();
		System.out.println("=================================");
		System.out.println("현재 레벨 : "+ lv);
		System.out.println("현재 골드 : "+ gold);
		
		//레벨 및 사냥시작 구간
		for(lv=1; lv<15; lv++) {
			System.out.println("=================================");
			System.out.println("사냥을 시작합니다.");
			System.out.println("계속하시려면 아무 키나 눌러주세요.");
			System.out.println("=================================");
			go = sc.next();
			//사냥 및 레벨업 메시지 구간
			for(int kill=1; kill<=lv*3; kill++ ) {
				System.out.println("몬스터 "+kill+"마리 사냥");
				if(kill==lv*3) {
					System.out.println("=================================");
					System.out.println("===== 레벨 업! 현재 레벨 : "+(lv+1)+ " =====");
					System.out.println("=================================");
					bonus = bonus + 1;
					//골드 지급 구간
					if(bonus%5==0) {
						gold = gold + ((1000)*(bonus/5));
						System.out.println("===== 레벨 "+bonus+" 달성 보너스 "+((1000)*(bonus/5))+" gold 지급 ");
						System.out.println("===== 현재 골드 : "+gold + " gold         ");
						System.out.println("=================================");
					}
				}
			}
		}
		//최종 레벨 달성 구간
		if(lv==15) {	
			System.out.println("===================================");
			System.out.println(" ");
			System.out.println("  최종 레벨을 달성하여 게임을 종료합니다.  ");
			System.out.println(" ");
			System.out.println(" ● 최종 레벨 : "+lv);
			System.out.println(" ● 최종 gold : "+gold);
			System.out.println(" ");
			System.out.println("===================================");
		}
		}
		System.out.println("WhileTest2 Finish");
	}

}