package com.iu.s4;

public class Array_7 {

	public static void main(String[] args) {
//한 학생의 정보는 : 이름, 번호, 국어, 영어, 수학, 총점, 평균으로 이루어져 있다 N명
//3명 이름을 담는 배열 names 선언
		String [] names = new String[3];
		names[0] = "iu";
		names[1] = "choa";
		names[2] = "suji";
		
		int [] nums = new int[3];
		nums[0]=5;  //아이유
		nums[1]=29; //초아
		nums[2]=2; //수지
		
		// 이름하고 번호들을 출력
		// 번호 순서대로 출력:  수지->아이유->초아 순서로
		for(int idx=0; idx<nums.length-1; idx++ ) {
			for(int i=idx+1; i<nums.length; i++) {
				if(nums[idx]>nums[i]) {
					int tmp =  nums[i];
					nums[i] = nums[idx];
					nums[idx] = tmp;
					
					
					//이름 자리 바꾸기: * 안썼을때하고 비교해보기
					String t = names[i];
					names[i] = names[idx];
					names[idx] = t;
					
				}
				
			}
		}
			for(int i=0; i<names.length; i++) {
				System.out.println("=================");
				System.out.println(nums[i]);
				System.out.println(names[i]);
				System.out.println("=================");
			}
	
		
		
		
		
		
		
//		String name = "iu";
//		int num=1;
//		int kor = 20;
//		int eng = 30;
//		int math = 30;
//		int total = kor+eng+math;
//		double avg = (double)total / 3.0;
//
//		String name2 = "choa";
//		int num2=1;
//		int kor2 = 20;
//		int eng2 = 30;
//		int math2 = 30;
//		int total2 = kor+eng+math;
//		double avg2 = (double)total / 3.0;
	}

}
