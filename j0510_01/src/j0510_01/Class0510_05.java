package j0510_01;

import java.util.Scanner;

public class Class0510_05 {

	public static void main(String[] args) {
		//문)  97점 이상 A+, 93점 A-, 87점 이상 B+, 83이하 B-	
		int score = 0; // 디폴트 값 : 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		score= scan.nextInt();
		
		if(score>=90) {// 90~100까지 
			System.out.print("A");  //print 후, 줄바꿈 안함
			if(score>=97) {
				System.out.println("+");
			}else if(score>=93){ // 80~89까지 비교			
				System.out.println("-"); // print 후+ ln 줄바꿈함 
			}	
		}
				
		else if(score>=80){ // 80~89까지 비교			
			System.out.print("B");
			if(score>=87) {
				System.out.println("+");
		    }else if(score>=83) {
			System.out.println("-");
		    }	
		}
			
		else if(score>=70){ // 80~89까지 비교			
			System.out.println("C");
			if(score>=77) {
				System.out.println("+");
			}else if(score>=73) {
				System.out.println("-");
			}
	    }
			
		else if(score>=60){ // 80~89까지 비교			
			System.out.println("D");
			if(score>=67) {
				System.out.println("+");
			}else if(score>=63) {
				System.out.println("-");
			}
		else if(score>=50){ // 80~89까지 비교			
			System.out.println("F");
		    }
		}
			
		} //main

	    } // class
		
		//문) 점수를 입력받아, 90점 이상이면 A, 80점 이상이면 B, 70-C, 60_D,F

//		int score = 0; // 디폴트 값 : 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		score= scan.nextInt();
//		
//		if(score>=90) {// 90~100까지 
//			System.out.println("A");
//		}else if(score>=80){ // 80~89까지 비교			
//			System.out.println("B");
//		}else if(score>=70){ // 80~89까지 비교			
//			System.out.println("C");
//		}else if(score>=60){ // 80~89까지 비교			
//			System.out.println("D");
//		}else if(score>=50){ // 80~89까지 비교			
//			System.out.println("F");
//		}
//		
	
////-------------------------------------------------------------------------------------------------------		
	 // 기본형 8개 = boolean, char, byte, short, int, lont, float, double 
//		String input ="";
//		char ch = ' '; // String=객체, 기본형 타입 == (부등호)계산이 안됨--> 변수명.equals(")
//		// 2. scan 선언 후 입력
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요.");
//		//input = scan.next(); // 문자열
//		
//		// 에러 발생  String input =""; 첫번째 문자가 비어있음, (ch = input.charAt(0);)라는 명령을 내렸는데 비어있으므로 못 불러냄
//		ch = input.charAt(0); // null이 아닐때만!! 문자열의 첫번째 문자를 가져옴
//		// 3.비교
//		if (ch =='C') { // equalsIgnoreCase("") 대소문자 구별의 값을 구한다.
//			System.out.println("c 입니다.");
//		} else {
//			System.out.println("c가 아닙니다..");
//			 // String은 객체임으로 equals로 비교 연산 할 수 있음
		
//-------------------------------------------------------------------------------------------
//		String c = ""; // String=객체, 기본형 타입 == (부등호)계산이 안됨--> 변수명.equals(")
//		// 2. scan 선언 후 입력
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요.");
//		c = scan.next(); // 문자열을 입력받음 // 문자열은 next()만 써주세요	m,M을 제외한 모든 알파벳은 f로 인식함
//		// 3.비교
//		if (str.equalsIgnoreCase("C") { // equalsIgnoreCase("") 대소문자 구별의 값을 구한다.
//			System.out.println("c 입니다.");
//		} else {
//			System.out.println("c가 아닙니다..");
//			 // String은 객체임으로 equals로 비교 연산 할 수 있음
//		}			

