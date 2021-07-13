package com.iu.s2;

public class ForTest2 {
	
	public static void main(String[] args) {
		System.out.println("증감연산자");
		int num=0;
		
		++num;
		System.out.println(num); //1
		
		num++;
		System.out.println(num); //2
		
		int check1 = ++num;
		System.out.println("Num : "+num); //3
		System.out.println("Check1 : " +check1); //3
		
		check1 = num++;
		System.out.println("Num : "+num); //4
		System.out.println("Check1 : " +check1); //3
		
		System.out.println(++num); //5
		System.out.println(num++); //출력은 5, 단 num은 6이 된 상태.
		System.out.println(num);
		
		
		System.out.println("ForTest2 Finish");
	}

}
