package com.iu.s2;

import java.util.Scanner;

public class ForTest3 {
	
	public static void main(String[] args) {
		System.out.println("ForTest3 Start");
		
		//종료 시간을 입력 받기
		//12초 입력
		// 0초, 1초 .....12초 끝
		//단 60 상수는 변경 불가능
		
		Scanner sc = new Scanner(System.in);
		System.out.println("종료 시간 초 입력");
		int cho = sc.nextInt(); // 희망 종료 시간
		
		for(int sec=0; sec<60; sec++) {
			System.out.println(sec+"초"); //sec값 반복출력
			if(sec == cho) { //희망 종료 시간과 일치하는지 확인
				//sec = 60;
				break; // 값이 true면 sec을 60으로 대입 후 위로 보냄
			} //다시 한번 반복문을 거치면서 최종적으로 sec값은 61이 되고, 			
		} // sec<60 값이 false이므로 빠져나와 for문 종료.
		
		System.out.println("ForTest3 Finish");
	}

}
