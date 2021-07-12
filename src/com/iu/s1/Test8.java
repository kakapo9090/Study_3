package com.iu.s1;

import java.util.Scanner;

public class Test8 {
	
	public static void main(String[] args) {
		System.out.println("Test8 Start");
Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		int math = sc.nextInt();
		
		
		int total = kor+eng+math;
		System.out.println("총점 : " + total);
		double avg = total / 3.0;
		System.out.println("평균 : " + avg);
		
		// 합격 기준
		// 평균이 60점 이상
		// 과목당 40점 이상
		String result = "불합격";
		
		if (avg>=60 && kor>=40 && eng>=40 && math>=40) {
			result = "합격";
		}
		
		System.out.println(result);
		
		System.out.println("Test8 Finish");
	}

}
