package j0519_01;

import java.util.Scanner;

public class C0519_02 {
	
	public static void main(String[] args) {
		System.out.println("[ 학생성적처리 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 등수처리");
		System.out.println("5. 학생검색");
		System.out.println("0. 프로그램종료");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.");
	}

	}
//		Scanner scan = new Scanner(System.in);
//
//		Student[] s = new Student[10]; //객체선언
////		String[] title = {"이름","국어","영어","수학","합계","평균"}; // 과목 입력
//		
//		//1. 변수선언
//		int count = 0;
//		int choice = 0;
//		String searchName=" ";
//		int chk = 0; // 학생이 있는지 확인하는 변수
//		
//		loop:while(true) {
//		
//		// 2. 성적입력
//			);
//				System.out.println("[학생처리 프로그램");
//				System.out.println("1. 성적입력");
//			    System.out.println("2. 성적출력");
//			    System.out.println("3. 성적수정");
//			    System.out.println("4. 등수처리");
//			    System.out.println("5. 학생검색");
//			    System.out.println("0. 종료프로그램");
//			    System.out.println("==========================");
//			    System.out.println("원하는 번호를 입력하세요.");
//			    choice = scan.nextInt();		
//    
//			switch(choice) {   
//			    case 1:			    	
//			
//			    // 학생 선언			    
//			    for(int i=0;i<s.length;i++) {
//			    	s[i]= new Student(); 
//			    	System.out.println("이름을 입력하세요(0.이전프로그램 이동)");
//			    	s[i].name = scan.next();
//			    	
//			    	// if문 프로그램 종료 
//			    	if(s[i].name.equals("0")){
//			    		break;
//			    	}
//			  
//			    	System.out.println("국어 점수를 입력하세요");
//			    s[i].kor = scan.nextInt();
//			    System.out.println("영어점수를 입력하세요.");
//			    s[i].eng =scan.nextInt();
//			    System.out.println("수학점수를 입력하세요.");
//			    s[i].math =scan.nextInt();
//			    
//			    s[i].sum(); // sum()함수는 괄호 필수 입력 
//			    s[i].avg();
//			    }// for
//			    break;
//			    
//			    case 2:
//			    	// 학생성적
//			    	System.out.println("[학생성적]");
//			    	//학생성적출력 메소드 호출
//			    	 recordTitle(count, s); // 원래는 메인 메소드 안에 있는 지역 변수
//			    	break;
//			    
//			    case 3: // 성적수정
//			    	
//			    	chk=0;
//			    	System.out.println("[학생성적 수정]");
//			    	System.out.println("수정할 학생의 이름을 입력하세요(0.이전페이지 이동");
//			    	searchName = scan.next();
//			  		    	
//			    
//			    //0번 이전 페이지 이동인지 비교--> a메소드로 활용할 예정
//			    if(searchName.equals("0")) {
//			    	System.out.println("이전페이지로 이동합니다.");
//			    	System.out.println();
//			    	break;
//			    }
//			    	
//			    // 수정할 학생의 이름을 비교하기 위해 반복문
//			    for(int i=0;i<count;i++) {
//			    	if(s[i].name.equals(searchName)) {
//			    		System.out.printf("[%s 학생이 검색되었습니다.]",searchName);
//			    		System.out.println("1. 국어점수");
//			    		System.out.println("2. 영어점수");
//			    		System.out.println("3. 수학점수");
//			    		System.out.println("=========================================");
//			    		System.out.println("수정할 과목을 선택하세요>>");
//			    		choice = scan.nextInt();
//			    		chk=1; // 학생이 존재시 1로 변경
//			    		
//			    		switch(choice) {
//			    		case 1:
//			    		
//				    		//성적수정
//				    		System.out.println("[이전 국어 점수 : % ]\n,s[i].kor");
//				    		System.out.println("국어점수를 입력하세요");
//				    		searchName = scan.next();
//				    		s[i].kor = scan.nextInt();
//				    		s[i].sum();
//				    		s[i].avg();
//				    		System.out.println("[국어점수 수정완료");
//				    		System.out.println();
//				    		break;
//				    		
//			    		case 2:
//			    			
//			    			System.out.println("[이전 영어ㅕ점수 : % ]\n,s[i].eng");
//				    		System.out.println("영어점수를 입력하세요");
//				    		searchName = scan.next();
//				    		s[i].kor = scan.nextInt();
//				    		s[i].sum();
//				    		s[i].avg();
//				    		System.out.println("[영어점수 수정완료");
//				    		System.out.println();
//				    		break;
//				    		
//				    		
//			    		case 3:
//			    			System.out.println("[이전 수학 점수 : % ]\n,s[i].math");
//				    		System.out.println("수학점수를 입력하세요");
//				    		searchName = scan.next();
//				    		s[i].kor = scan.nextInt();
//				    		s[i].sum();
//				    		s[i].avg();
//				    		System.out.println("[수학점수 수정완료");
//				    		System.out.println();
//				    		break;
//				    		  		
//			    		
//			    		}//switch
//			    		
//			    	}// if
//			    } //for
//			    
//			    	//학생이 존재하지 않을 때 출력
//			    	if(chk==0) {
//			    		
////			    	 }else {
//			    		 System.out.printf("%s 학생은 존재하지 않습니다.\n",searchName);
//			    		
//			    	}
//			    	  break; // switch
//			    
//			    case 4: 
//			    	System.out.println("[등수 처리");
//			    	
//			    	// 등수 처리 for문 
//					for (int i = 0; i < count; i++) {// 등록된 학생수 만큼 비교
//						int rankCount = 1;// 등수 1부터 시작하기 때문에
//						for (int j = 0; j < count; j++) {
//							if (s[i].total < s[j].total) {// 다른 학생성적이 더 높으면
//								rankCount++;
//							}
//						} // for
//						s[i].rank = rankCount; // 변수를 등수에 저장
//					} // for
//			    	
//			    case 5:
//			    	 	System.out.println("수정할 학생의 이름을 입력하세요(0.이전페이지이동) ");
//					searchName = scan.next();
//			    	
//			    	 //0번 이전 페이지 이동인지 비교--> a메소드로 활용할 예정
//				    if(searchName.equals("0")) {
//				    	System.out.println("이전페이지로 이동합니다.");
//				    	System.out.println();
//				    	break; // 
//				    }
//				    chk = 0;
//				    for(int i=0;i<count;i++) {
//				    	if(s[i].name.contains(searchName))
//				    }
//				    chk=1;// 검색이 이있으면
//			}//for
//	
//				if(chk==0) {
//					System.out.printf("[%s 학생은은 존재하지 않습니다.");
//			    	System.out.println();
//				}
//				break;
//			    	
//			    	
//			    	  
//			    case 0:			    	
//		    		System.out.println("[프로그램을 종료.]");
//		    		System.out.println();
//		    		break loop; //switch
//			    	
//			    default:
//			    	System.out.println("잘못입력하였습니다. 다시입력해주세요");
//			  
//			    }//switch
//	
//		
//		} // while
//} // main
//
//
//}
//
//
//
//
//}// class
