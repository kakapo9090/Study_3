package com.iu.s2;

import java.util.Scanner;

public class ForTest5 {
	
	public static void main(String[] args) {
		System.out.println("ForTest5 Strat");
		Scanner sc = new Scanner(System.in);
		//과목 수 입력
		System.out.println("과목 수 입력");
		int count = sc.nextInt();
		System.out.println("입력한 과목 수 : "+count);
		//과목 수 만큼 점수 입력
	//int score = 0;
		int total = 0;
		//double avg = 0.0;
		for(int i=1;i<=count;i++) {
			System.out.println(i+"번째 점수 입력 ");
			int score = sc.nextInt();
			total = total+score;
		}	//====임시로 쓰는 변수score는 for문에 선언하는게 깔끔하다====
		//총점 평균 계산 후 출력
		System.out.println("총점 : "+total);
		
		double avg = (double)total / count;
		System.out.println("평균 : "+avg);
		System.out.println("ForTest5 Finish");
	}

}
