package com.iu.s4;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목의 수를 입력");
		int count = sc.nextInt();
		int [] nums = new int[count];
		System.out.println("과목의 수 : " + count);
		for(int i=0;i<count;i++) {
			System.out.println(i+1+"번 점수 입력");
			nums[i] = sc.nextInt();
		}
		
		//index 0으로 시작, 1씩 증가 반복문 for와 가장 어울림
		for(int i=0; i<nums.length;i++) {
			System.out.println(i+1+"번째 과목 점수 : "+nums[i]);	
		}
		
		//총점과 평균 출력
		int total = 0;
		double avg = 0.0;
		for(int i=0; i<count;i++) {
			total = total + nums[i];
		}
			System.out.println("총점 : " + total);
			avg=(double)total / nums.length;
			System.out.println("평균 : " + avg);
	}

}
