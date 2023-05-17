package j0510_01;

import java.util.Scanner;

public class Class0510_03 {

	public static void main(String[] args) {
		//Chapter 4. 조건문과 반복문
		// if문은 100개 이상을 써도 되나 속도가 느려짐
		
		//문) m,f문자로 입력 받다 m이면 남자입니다. f이면 여자입니다. 출력하시오.
		//풀이 String= 객체  // 1 변수선언
				String c = "f"; // String=객체, 기본형 타입 == (부등호)계산이 안됨--> 변수명.equals(")
				// 2. scan 선언 후 입력
				Scanner scan = new Scanner(System.in);
				System.out.println("성별을 입력하세요.");
				c = scan.next(); // 문자열을 입력받음 // 문자열은 next()만 써주세요	m,M을 제외한 모든 알파벳은 f로 인식함
				// 3.비교
				if (c.equals("m") || c.equals("M")) { 
					System.out.println("남자 입니다.");
				}else if(c.equals("f") || c.equals("F")) {
					System.out.println("여자 입니다.");
				} else {
					System.out.println("다른문자를 입력하셨습니다. 다시 입력하세요.");
					 // String은 객체임으로 equals로 비교 연산 할 수 있음
				}			
		// -----
		
			
//		//풀이// 1 변수선언
//		char c = 'f';
//		// 2. scan 선언 후 입력
//		Scanner scan = new Scanner(System.in);
//		System.out.println("성별을 입력하세요.");
//		c = scan.next().charAt(0); // charAt(0) char이기때문에 하나만 가져오겠다.	
//		// 3.비교
//		if (c=='m'||c=='M'){
//			System.out.println("남자 입니다.");
//		} else {
//			System.out.println("여자 입니다.");
//		}			
//// -----------------------------------------------------		
		//문 입력한 숫자가 1,6,9만 입력받아 1,6,9, 출력하시오.
		// if() else if() else
		
//-----------------------------------------------------------------		
//        // 1. 변수선언
//             int b = 1;
//        // 2. scan 선언 후 입력
//             Scanner scan = new Scanner(System.in);
//             System.out.println("숫자를 입력하세요.");
//             b = scan.nextInt();
//        // 3. 비교
//             if(b==1) {
//            	 System.out.println("1입니다.");
//             }else if(b==6) {
//            	 System.out.println("6입니다.");
//             }else {
//            	 System.out.println("9입니다.");
//             }
	
// --------------------------------------------------------------------				
//		// 문) 점수를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격을 출력하시오.
//			//1. 변수선언
//				int a = 30;
//			//2. scan 선언 후 입력
//				Scanner scan = new Scanner(System.in);
//				System.out.println("점수를 입력하세요.");
//				a = scan.nextInt();
//			//3. 비교
//			  if(a>=60) {
//				  System.out.println("합격");
//				  }  else { System.out.println("불합격");  }
//---------------------------------------------------------------------//
//
		
//		//1. 변수선언
//		int a = 30;
//	//2. scan 선언 후 입력
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		a = scan.nextInt();
//	//3. 비교
//	  if(a>=60||a<) {
//		  System.out.println("합격");
//		  }  else { System.out.println("불합격");  }
//	  			  
				  
	}// main

}//class
