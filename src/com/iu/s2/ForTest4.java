package com.iu.s2;

public class ForTest4 {

	public static void main(String[] args) {
		System.out.println("ForTest4 Start");
		// 1+2+3+.......+100000000=?
		//1+2+3+4+5=15
//		int hap=0; //누적 함수
//		hap = hap + 1; //1
//		hap = hap + 2; //3
//		hap = hap + 3; //6
//		hap = hap + 4; //10
//		hap = hap + 5; //15
		
//		System.out.println("hap : "+hap);
		System.out.println("========초기화=========");
		//반복문 5번
//		hap=0;
		int hap=0;
		for(int i=1;i<=5;i++) {			
			hap=hap+i;
		System.out.println("hap : "+hap);
		}
		System.out.println("총합 : "+hap);
		
		System.out.println("ForTest4 Finish");
	}
	
}
