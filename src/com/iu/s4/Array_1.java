package com.iu.s4;

import java.util.Scanner;

public class Array_1 {
	


	public static void main(String[] args) {
		
		//11, 20, 32
		//데이터 타입 변수명
		int num1 = 11;
		int num2 = 20;
		num2 = 30;
		
		int [] numbers = new int[3];
		
		//numbers의 데이터타입은 절대 int가 아님. 그럼? int [] 타입.
		// int[] 타입은 그럼 primitive? no => reference
		System.out.println(numbers);
	// 변수명주소[인덱스]=값;
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		
		System.out.println(numbers[2]);
		System.out.println("배열의 크기(length) : "+numbers.length);
		
		// 3.12, 2.3, 4.123, 5.0 배열 선언하고 데이터 대입
		double [] numbers2 = new double[4];
		numbers2[0]=3.12;
		
		System.out.println(numbers2[1]);
		System.out.println("배열의 크기(length) : "+numbers2.length);

		//System.out.println(numbers2[4]);  !!!에러!!!
		// ㄴ> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//		at com.iu.s4.Array_1.main(Array_1.java:31)

		//문자열을 담을 배열 3칸짜리 생성
		//모두 출력
		String [] names = new String[3];
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println("==================================");
		
		
		//스캐너를 담을 배열 2칸짜리 생성, 모두 출력
		Scanner [] sc = new Scanner[2];
		System.out.println(sc[0]);
		System.out.println(sc[1]);
		
	}

}
