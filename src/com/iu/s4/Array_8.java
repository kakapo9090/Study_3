package com.iu.s4;

import java.util.Scanner;

public class Array_8 {

	public static void main(String[] args) {

		int [] ids = {1234, 4567, 4356, 1258};
		int [] pws = {6789, 5437, 1235, 9874};
		Scanner sc = new Scanner(System.in);
		
		//1. 로그인 
		//2. 회원가입, id중복금지
		//3. 종료
		
		//1번 로그인 성공 후 메뉴 변경   flag가 false일때 구성하기
		//1. 로그아웃 2. 회원탈퇴
		
		//프로그램 시작
		boolean flag = true;	//while(flag)문을 제어하기 위한 스위치
		int login_id=0;		//로그인 한 아이디가 담길 변수
		int login_pw=0;		//로그인 한 pw가 담길 변수
		int case3end=0;		//프로그램을 완전히 종료하기 위해 만들어 놓은 변수
		
		//flag가 true일 때 실행
		while(flag && case3end==0) {
			System.out.println("=============================");
			System.out.println("          메인 화면           ");
			System.out.println();
			System.out.println("1. 로그인  2. 회원가입  3. 종료");		
			System.out.println("=============================");
			int select = sc.nextInt();
			
			switch(select) {
				case 1 :
					System.out.println("id 입력");
					int id = sc.nextInt();
					System.out.println("pw 입력");
					int pw = sc.nextInt();
					
					//로그인 단계
					int count=0;	//로그인 실패 사이클 수
					for(int i=0; i<ids.length; i++) {
						if(id==ids[i] && pw==pws[i]) {
							System.out.println("로그인 성공! " + id + " 님 환영합니다.");
							login_id = id;	//id값 정보를 login_id에 담기
							login_pw = pw;	//pw값 정보를 login_pw에 담기
							flag=!flag;		//while(flag)문 작동을 멈추기 위함
							break;
						}else if(i<ids.length){
							count++;
							continue;
							}	
					}
					//로그인 실패 사이클 수 == 배열변수의 길이인 경우 switch 빠져나와서 while문으로 돌아가기
					if(count == ids.length) {
						System.out.println("로그인 실패");
					}
					break; //while(flag)로 돌아감
						
					
//================================================================					
					
					
				case 2: //***회원가입 오류 수정 필요***
					boolean check= false;	//case 2를 작동하기 위한 스위치
					boolean check2 = false;	//F: id중복 확인 T: 비번만들기
					
					
					
					while(check == false) {
						int count2 = 0;		// 중복된 id(데이터) 값의 갯수를 알려주는 변수
						System.out.println("가입할 id 입력");
						int cid = sc.nextInt();	
						
						//id 중복 확인
						if(check2==false) {
							System.out.println("입력한 값 cid : " + cid);
							for(int i=0; i<ids.length; i++) {
								System.out.println("임시출력 인덱스 ids ["+ i +"] : " + ids[i]);
								if(ids[i]==cid) {	//중복된 id(데이터) 값 찾기
									count2++;		//중복된 id숫자만큼 갯수 1씩 증가							
									continue;		// for문으로 올리기 why? 인덱스변수 i값이 끝까지 나오게끔 해줘야함
								}
							}	
							
						if(count2>=1) {		//중복된 데이터의 갯수가 1개 이상 있는가?
							System.out.println("id 중복 갯수 : "+count2 + " 개 입니다. id를 다시 입력해주세요.");
							continue;		//while(check == false)로 이동
						}else {
							check2 = true;		//중복되는 갯수가 없다면 밑에 if(check)문으로 이동					
						}
						}
						
						//비번입력 단계 check2가 true일때 작동
						if(check2) {							
								System.out.println("가입할 pw 입력");
								int cpw = sc.nextInt();
			  //배열 변수 선언! stack 영역 저장▼      ▽ heap 영역 저장
								int [] ids2 = new int[ids.length+1];
								int [] pws2 = new int[pws.length+1];
					//변수 카피 단계
								for(int j=0; j<ids.length; j++) {
								ids2[j]=ids[j];		//기존ids pws의 데이터 값들을 전부 ids2 pws2로 덮어씌움
								pws2[j]=pws[j];		
								}
					//새로 선언한 배열변수들의 마지막 인덱스의 데이터 값은 아직 기본값(0)이므로...	
						// -> 입력변수 cid cpw 데이터 값을 새 배열 마지막 인덱스에 삽입
								ids2[ids.length] = cid;		
								pws2[pws.length] = cpw;
								
								ids = ids2;		//완성된 새 배열의 메모리 주소값을 기존 배열변수에 덮어씌움
								pws = pws2;		// -> 이제 기존 배열변수는 새 배열의 메모리 주소로 연결됨
												// 기존 배열변수를 계속 쓰는 이유? -> case 1코드랑 유기적으로 매치해야하기 때문!
								
								System.out.println("회원가입 성공! 메인으로 돌아갑니다");					
								break;	//check=true;도 가능. break를 안 걸면 while문으로 돌아가는 이유?
						}
						}//<- 여기까지가 while문이기 때문 (중괄호에 커서 올려보기) 따라서 break를 걸어주지 않으면 while문 있는 곳으로 쭉 올라감
						break;
		
				
				
				case 3 :				
					System.out.println(".");
					System.out.println(".");
					System.out.println(".");
					System.out.println(".");
					System.out.println(".");
					System.out.println("프로그램을 종료합니다");
					case3end=1;	//완전히 종료시키기 위한 변수로 값 1 대입 -> 아래 while 조건문 확인
					flag=!flag; //flag를 false로 바꿔줌
					break;
				
					
				//확인용
				default:
					for(int i=0; i<ids.length; i++) {
					System.out.println("현존 아이디들 : " + ids[i]);
					System.out.println("현존 비번들 : " + pws[i]);					
					}
					break;
					
			}//여기까지가 스위치문 
			
			
	//============================================================================		
			
			//flag가 false일 때 실행
			while(flag==false && case3end==0) {
				System.out.println("=============================");
				System.out.println("	 [ "+ login_id + " ] 님");
				System.out.println();
				System.out.println("1. 로그아웃  2. 회원 탈퇴");
				System.out.println("=============================");
				int select2 = sc.nextInt();
				
				switch(select2) {
				case 1:
					System.out.println("=============================");
					System.out.println("로그아웃 되어 메인화면으로 돌아갑니다.");
					System.out.println("=============================");					
					System.out.println();				
					System.out.println();
					login_id=0;
					login_pw=0;
					flag=true;
					break;
					
					
				case 2://회원 탈퇴: 인덱스에서 입력한 데이터와 같은 데이터 값 제거 id pw
					//로그인한 아이디 표시 -> 삭제할 pw 입력 -> id pw 데이터값 삭제
					//삭제할 id pw의 갯수가 없는경우 더 이상 삭제되지 않도록 하기.............. (보류)
					int count3 = 0;		//
					
					System.out.println("...");
					System.out.println("회원 탈퇴를 진행합니다.");
					
					
					System.out.println("아이디 " + login_id + " 의 비밀번호를 입력하세요.");
					int pw = sc.nextInt();
					System.out.println("입력한 비번값(확인용) : "+pw);
					
					for(int i=0; i<ids.length; i++) {
						System.out.println("임시출력 인덱스 ids ["+ i +"] : " + ids[i]+ "      임시출력 인덱스 pws ["+ i +"] : " + pws[i]);
						if(login_id==ids[i] && pws[i]==pw) {  //pw는 중복값이 가능하기 때문에 id와 같이 조건에 넣어야함
							count3++;
							System.out.println("id pw가 같은 인덱스에 있는지 확인 : " + count3);
							continue;
						}
					}
					
					int [] del_ids = new int[ids.length-1];
					int [] del_pws = new int[pws.length-1];	
					int index=0;	//새 배열변수에 삭제하지 않을 데이터를 넣기 위한 인덱스 변수 
					//조건 충족 시 같은 인덱스 ids pws값 삭제
					if(count3==1) {												
						for(int i=0;i<ids.length;i++) {
							if(ids[i]==login_id && pws[i]==login_pw) { //로그인id pw값이 인덱스 안에 있는 경우 이 값을 제외하려면?
								continue;	//로그인 id pw와 일치하는 조건문에 continue를 줘서 새 배열변수에 대입하지 못 하도록 함
							}
							//직접 삭제가 불가능 하기 때문에 새 배열변수를 만들고 특정 데이터 값을 제외한 나머지 데이터들을 넣는다
							del_ids[index] = ids[i];	//인덱스 변수를 다르게 설정하는 이유
							del_pws[index] = pws[i];	
							index++;	// index변수를 1 증가시켜서 for문으로 돌려보냄
						}//for문 끝	
						
						ids = del_ids;	//메모리주소 바꾸기
						pws = del_pws;
						System.out.println(".");
						System.out.println(".");
						System.out.println(".");	
						System.out.println(login_id + " 님의 회원 탈퇴가 정상적으로 처리되었습니다.");
						flag=true;
					}else {
						System.out.println("");
						System.out.println("입력한 비밀번호가 틀립니다.");
						System.out.println("이전 화면으로 돌아갑니다.");
					}
					
					break;
					
				default : 
					System.out.println("");
					System.out.println("");
					System.out.println("잘못 눌렀습니다. 다시 입력하세요.");
				}								
			}
			
			
			
			
		}//여기까지가 맨 위 while(flag)문 영역
		
		
		
		
		
		
		
	}//메인 메서드 영역
}//클래스 영역

