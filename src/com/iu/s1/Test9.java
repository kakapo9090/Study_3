package com.iu.s1;

public class Test9 {
	public static void main(String[] args) {
		System.out.println("Test9 Start");
		boolean check = true;
		
		check = !check;
		System.out.println(check);
		
		
		if(!check) {
			System.out.println("TEST");
		}
		
		System.out.println(check);
		
		int age = 30;
		//<삼항연산자>조건식 ? true일 때 실행 : false 일 때 실행
		String result = age > 19 ? "성년":"미성년";
		System.out.println("Result : "+result);			
		System.out.println(3+2);
		
		
		System.out.println(1+'1'+"1"); 
		//문자열이 먼저나온경우 문자+숫자, 아스키코드 참고
		//char='1'은 int로 환산했을 때 49
		System.out.println("Test9 Finish");
	}

}
