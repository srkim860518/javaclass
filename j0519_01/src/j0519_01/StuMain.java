package j0519_01;

import java.util.Scanner;

public class StuMain {
//myBatis, jpa == 개인 공부해야해요
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Student[] s = new Student[10]; // 객체선언(=객체 배열 선언)
		String[] title = { "kor", "math", "eng", "total", "avg", "rank" }; // 객체 배열 선언

		int count = 0; // 원하는 번호 입력하는 변수
		int choice = 0; // 입력된 학생 수
		while (true) {
			// 성적 입력
			System.out.println("[성적처리프로그램]");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("4.등수처리");
			System.out.println("5.학생성적검색");
			System.out.println("0.프로그램 종료");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt(); // 입력 대기

//===========설명============	========================	
			// 반복문 : while: 조건 , for: 횟수
			// 조건문 : switch 무한 반복 , if
			// 조건이 맞으면 실행: 무한 반복 100%

//		 switch문, if문 반복 속도 , 파이썬에는 if만 있음
//		if(choice==1) { // 실행 속도 : 1초
//		}else if(choice==2) {// 실행 속도 : 1초
//			
//		}else if(choice==3) {// 실행 속도 : 2초
//			
//		}else if(choice==4) {// 실행 속도 : 3초
//			
//		}else if(choice==5) {// 실행 속도 : 4초
//			
//		}else {//5초 
//			
      //switch 실행 속도는 뭘해도 : 1초, if문 보다 switch문 속도가 빠름	
			switch (choice) {// switch 실행 속도는 뭘해도 : 1초, if문 보다 switch문 속도가 빠름
//=================================================		

			case 1: // Student class에 입력받은 s[i]= new student 학생선언
				// 10명 성적을 입력하는 반복문 = (초기식;조건식;증감식)
				for (int i = 0; i < s.length; i++) {//s.length는 배열선언의 s 변수///나왔다가 다시 들어올 경우 입력된 학생수 다음부터 진행

					s[i] = new Student(); // 객체선언-공간할당을 해줌.

					
					System.out.println("이름을 입력하세요.(0.이전페이지 이동");
					s[i].name = scan.next();//이름입력 또는 이전페이지 이동입력
					//이전 페이지 이동입력이 되었는지 확인-equals,==
					if(s[i].name.equals("0")) {
						System.out.println("이전 페이지로 이동합니다.");
					break; // for // break;는 반복문만 빠져 나올 수있다.,for,case, switch
					}//if
						
					
					
				// 참조변수.변수명 
					System.out.println("국어 점수를 입력하세요");
					s[i].kor = scan.nextInt();
					System.out.println("영어 점수를 입력하세요");
					s[i].eng = scan.nextInt();
					System.out.println("수학 점수를 입력해주세요");
					s[i].math = scan.nextInt();

					s[i].sum();  // 합계 처리
					s[i].avg();  // 평균 처리
					
					count++; //입력이 완료되면 입력된 학생수 1증가
				
				}//for
				break; //switch빠져나올때 사용되는 구문
			case 2:

				break;

			default: // if의 else란 형태임 (

				break;
				
System.out.println("[ 학생성적 ]");
				
				//String[] title = Student.title;
				//클래스변수사용방법 : 클래스명.변수명
				//상단타이틀 출력
				for(int i=0;i<Student.title.length;i++) {
					System.out.print(Student.title[i]+"\t");
				}
				System.out.println();
				System.out.println("---------------------------------------------------");
				//입력된 성적출력
				for(int i=0;i<count;i++) {
					System.out.print(s[i].name+"\t");
					System.out.print(s[i].kor+"\t");
					System.out.print(s[i].eng+"\t");
					System.out.print(s[i].math+"\t");
					System.out.print(s[i].total+"\t");
					System.out.printf("%.2f \t",s[i].avg);
					System.out.print(s[i].rank+"\n");
				}
				System.out.println();
				
				
				
				
				
				break;
				
			case 3://
				System.out.println("[ 학생성적 수정 ]");
				
				
				System.out.println("수정 할 학생의 이름을 입력하세요.(0.이전페이지 이동)");
				searchName = scan.next();
				
				//0번 이전페이지 이동인지 비교
				if(searchName.equals("0")) {
					System.out.println("이전페이지로 이동합니다.");
					System.out.println();
					break; //switch
				}
				
				
				
				// 수정할 학생의 이름을 비교하기 위해 반복문
				for(int i=0;i<count;i++) {
					chk = 0; //초기화
					if(s[i].name.equals(searchName)) {
						System.out.printf("[ %s 학생이 검색되었습니다. ] \n",searchName);
						System.out.println("1. 국어점수");
						System.out.println("2. 영어점수");
						System.out.println("3. 수학점수");
						System.out.println("-------------------------");
						System.out.println("수정할 과목을 선택하세요.>>");
					    choice = scan.nextInt();
					    
					    switch(choice) {
					    
					    case 1:
					    	System.out.printf("[ 이전 국어점수 : %d ]\n",s[i].kor);
					    	System.out.println("수정할 점수를 입력하세요.>>");
					    	s[i].kor = scan.nextInt();
					    	s[i].sum();
					    	s[i].average();
					    	System.out.println("[ 국어점수 수정완료 ]");
					    	System.out.println();
					    	break;
					    
					    case 2:
					    	System.out.printf("[ 이전 영어점수 : %d ]\n",s[i].eng);
					    	System.out.println("수정할 점수를 입력하세요.>>");
					    	s[i].eng = scan.nextInt();
					    	s[i].sum();
					    	s[i].average();
					    	System.out.println("[ 영어점수 수정완료 ]");
					    	System.out.println();
					    	break;
					    	
					    case 3:
					    	System.out.printf("[ 이전 수학점수 : %d ]\n",s[i].math);
					    	System.out.println("수정할 점수를 입력하세요.>>");
					    	s[i].math = scan.nextInt();
					    	s[i].sum();
					    	s[i].average();
					    	System.out.println("[ 수학점수 수정완료 ]");
					    	System.out.println();
					    	break;
					    
					    }//switch
					    chk = 1; //학생이 존재시 1로 변경
					}//if
				}//for
				
				//학생이 존재하지 않을때 출력
				if(chk==0) {
					System.out.printf("[ %s 학생은 존재하지 않습니다. ] \n",searchName);
					System.out.println();
				}
				
				break;//switch
				
			case 4://등수처리
				System.out.println("[ 등수처리 ]");
				//등수처리 for문
				for(int i=0;i<count;i++) { //등록된 학생수 만큼 비교
					int rankCount = 1; //등수 1부터 시작하기 때문에
					for(int j=0;j<count;j++) {
						if(s[i].total<s[j].total) { // 다른학생성적이 더 높으면
							rankCount++;
						}
					}//for
					s[i].rank = rankCount;  //변수를 등수변수에 저장
				}//for
				
				System.out.println("등수처리가 완료되었습니다.!!");
				System.out.println();
				break;
				
			case 5:
				System.out.println("[ 학생성적 검색 ]");
				
				System.out.println("학생이름을 입력하세요.(0.이전페이지로 이동)");
				searchName = scan.next();
				
				//0번 이전페이지 이동인지 비교
				if(searchName.equals("0")) {
					System.out.println("이전페이지로 이동합니다.");
					System.out.println();
					break; //switch
				}
				chk = 0;
				for(int i=0;i<count;i++) {
					if(s[i].name.contains(searchName)) {
						
						chk = 1;
					}
				}//for
				
				//학생이 존재하지 않을때 출력
				if(chk==0) {
					System.out.printf("[ %s 학생은 존재하지 않습니다. ] \n",searchName);
					System.out.println();
				}
				break;
				
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop; //switch  //switch break;// 스위치를 빠져나오기 위해 사용되는 구문
			}//switch
		}//while
	}//main

	//성적출력 메소드
	//recordTitle
	
	
}//class

				
//				break;
		      }// swithch
		  } // while

	}// main

}// class


      
	
	// 나왔다가 다시 들어올 경우 입력된 학생 수 부터 count 자리부터 // 0부터 시작하면 안됨, count부터 시작해야함. 













