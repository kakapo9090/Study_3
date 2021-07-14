package com.iu.s2;

import java.util.Scanner;

public class ForTest8 {
	
	public static void main(String[] args) {
		System.out.println("ForTest8 Start");
		//시계 분 초 출력
		//0분0초
		//0분1초
		//0분2초
		//.....
		//0분59초
		//1분0초
		//1분1초
		//59분59초
		//분, 초를 입력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("분 입력");
		int boon = sc.nextInt();
		System.out.println("초 입력");
		int cho = sc.nextInt();
		boolean flag = false;
		for(int min=0;min<60;min++) {
			for(int sec=0;sec<60;sec++) {
				System.out.println(min+ "분 : "+sec+"초");
				if(min==boon && sec==cho) {
					System.out.println("종료");
					flag=true;
					break;
					
				}
			}//안쪽 for
			
			if(flag) {
				break;
			}
		}//바깥쪽 for
		
		System.out.println("ForTest8 Finish");
	}

}
