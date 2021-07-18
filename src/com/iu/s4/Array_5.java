package com.iu.s4;

import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
	
		//1. 정보출력,
		//2. 정보추가, 3->4
		//3. 정보삭제, 삭제할 데이터가 없으면 더 이상 지울 데이터가 없습니다
		//4. 종   료
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int [] ar = {45, 52, 76};
//		int [] ar = new int[3];  위와 동일
//		ar[0]=45;
//		ar[1]=52;
//		ar[2]=76;
		
		
		
		while(flag) {
			System.out.println("1. 정보출력");
			System.out.println("2. 정보추가");
			System.out.println("3. 정보삭제");//맨 끝 데이터 삭제
			System.out.println("4. 검색삭제");//입력한 데이터 삭제
			System.out.println("5. 종   료");
			int select = sc.nextInt();
				
			switch(select) {
			case 1://정보출력
				
				if(ar.length>0) {
				
				System.out.println("정보를 출력합니다.");
				for(int i=0; i<ar.length; i++) {
					System.out.println(ar[i]);
				}
				}else {
					System.out.println("data가 없어요");
				}
				break;
				
			case 2:
				System.out.println("추가할 정보 입력");
				int num = sc.nextInt();
				
				int [] ar2 = new int[ar.length+1];
				for(int i=0; i<ar.length;i++) {			
					ar2[i]=ar[i]; 		
				}
				ar2[ar.length]=num;
				ar = ar2;
				break;
				
			case 3://추가의 반대로, 같은 배열은 스위치문에선 중복문으로 인식.
				System.out.println("정보를 삭제합니다.");
				
				if(ar.length==0) {
					System.out.println("더 이상 삭제할 데이터가 없음");
					continue;
				}
				
				int [] ar3 = new int[ar.length-1]; //ar사이즈보다 1작게 선언하는 이유?
				for(int i=0; i<ar3.length; i++) { //ar3.length 쓰는 이유?
					ar3[i]=ar[i]; //ar의 인덱스 값을 ar3에 대입
				}
				ar = ar3; //ar3의 주소값을 ar에 대입
				break;
				
			case 4:
				
				
				if(ar.length==0){
					System.out.println("data 없음");
					continue;
				}
				
				System.out.println("삭제할 인덱스 번호 입력");
				int idx = sc.nextInt();
				
				if(idx >= ar.length||idx<0) {
					System.out.println("배열 범위 이탈");
					continue;
				}
				
				int [] ar4 = new int[ar.length-1];
				int index=0; //새 변수를 선언하는 이유?
				for(int i=0; i<ar.length; i++) { //ar.length쓰는 이유?
					if(idx==i) {  //비교하는 이유?
						continue;
					}
					ar4[index] = ar[i]; //ar4[i]를 쓰지 않는 이유?
					index++;  //더하는 이유?
				}
				
				
				ar = ar4;
				
				break;
				
			case 5:
				System.out.println("프로그램 종료");
				flag=!flag;
				break;
			default:
				System.out.println("잘못 누르셨습니다.");
				break;
			}
			
/*			
			if(select == 1) {
				System.out.println("정보를 출력합니다.");
			}else if(select == 2) {
				System.out.println("정보를 추가합니다.");
			}else if(select == 3) {
				System.out.println("정보를 삭제합니다.");
			}else if(select == 4) {
				System.out.println("종료");
				flag=!flag;
			}
*/			
			
		}
		
	}

}
