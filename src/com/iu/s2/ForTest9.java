package com.iu.s2;

import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		System.out.println("ForTest9 Start");
		//FPS
		// 최초에 탄창 3개 주어지고 전부 사용해야함
		// 한 탄창에 총알 30개
		// 단발모드: 1발 , 점사모드: 3발
		//1:단발? 2~...:점사?
		// 1 - "탕" * 30번
		// 2 - "타타탕" * 10번
		Scanner sc = new Scanner(System.in);

		// t: 탄창 b: 총알		
		for(int t=3;t>0;t--) {
			System.out.println("1.단발 2.점사");
			int select = sc.nextInt();
			for(int b=30;b>0;b--) {
				if(select==1) {
					System.out.println("탕");
				}else if(select != 1){
					System.out.println("타타탕");
					b=b-2;
				}
			}
		}
		
		
		System.out.println("ForTest9 Finish");
	}
}