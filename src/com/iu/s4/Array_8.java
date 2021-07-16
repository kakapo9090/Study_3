package com.iu.s4;

import java.util.Scanner;

public class Array_8 {

	public static void main(String[] args) {
		boolean flag = true;
		int [] ids = {1234, 4567, 4356, 1258};
		int [] pws = {6789, 5437, 1235, 9874};
		Scanner sc = new Scanner(System.in);
		
		
		
		//1. 로그인
		//2. 회원가입, id중복금지
		//3. 종료
		while(flag) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			int select = sc.nextInt();
			switch(select) {
				case 1 :
					System.out.println("id 입력");
					int id = sc.nextInt();
					System.out.println("pw 입력");
					int pw = sc.nextInt();
					
					//오류코드 수정필요
					for(int i=0; i<ids.length; i++) {
						if(id==ids[i] && pw==pws[i]) {
							System.out.println("로그인 성공");
							flag=!flag;
							break;
						}else if(i<ids.length){
							continue;
							}else if(i==ids.length && id!=ids[i] || pw!=pws[i]){	
								System.out.println("로그인 실패 메인으로 돌아갑니다");
							}
					
					}
					break;
						
				case 2:
					System.out.println("가입할 id 입력");
					int cid = sc.nextInt();
					System.out.println("가입할 pw 입력");
					int cpw = sc.nextInt();
					
					//id, pw 생성
					int [] ids2 = new int[ids.length+1];
					int [] pws2 = new int[pws.length+1];
					//id 중복 검증
					for(int i=0; i<ids.length; i++) {
						if(cid==ids[i]) {
							System.out.println("회원가입 실패 : id 중복");
							break;
						}
						//배열 복사
						ids2[i] = ids[i];
						pws2[i] = pws[i];
					}
					//복사한 배열의 마지막 인덱스값 삽입
					ids2[ids.length] = cid;
					pws2[pws.length] = cpw;
					//얕은 복사
					ids=ids2;
					pws=pws2;
					System.out.println("회원가입 성공! 메인으로 돌아갑니다");
					break;
				
				case 3:
					System.out.println("종료합니다");
					flag=!flag;
					break;
				
					
				//확인용
				default:
					for(int i=0; i<ids.length; i++) {
					System.out.println("현존 아이디들 : " + ids[i]);
					System.out.println("현존 비번들 : " + pws[i]);					
					}
					break;
			}
		}
		

	}

}
