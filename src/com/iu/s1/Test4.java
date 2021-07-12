package com.iu.s1;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		System.out.println("Test4 Start");
		//10대 유무 판별
		//나이가 10 보다 크고, 20 미만
		//나이를 입력
		//10대 청소년 출력하고 종료
		//아니면 그냥 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
/*		
		if(age>=10) {
			if(age<20){
			System.out.println("청소년");
			}
		}
*/			
	
		
		if(age>=10 && age<20) {
			System.out.println("10대 입니다");
		}
		
		
		
		System.out.println("Test4 Finish");
		
	}
}
