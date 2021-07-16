package com.iu.s4;

public class Array_4 {

	public static void main(String[] args) {
		//데이터타입 변수명;
		int [] ar1 = new int[3];
		ar1[0]= 1;
		ar1[1]= 5;
		ar1[2]= 90;
		
		//4 추가하려면 -> 배열 복사
		int [] ar2 = new int[ar1.length+1];
		for(int i=0; i<ar1.length;i++) {			
			ar2[i]=ar1[i]; //ar1의 데이터를 ar2로 깊은 카피
		}
		ar2[ar1.length]=9999;
		
		ar1 = ar2; // 주소값 대입(얕은 카피)
		
		//ar1로 출력하는 이유: 클라이언트의 요구대로 해야하기 때문
		for(int i=0;i<ar1.length;i++) {
				System.out.println(ar1[i]);
			}
		
		
	}
}
