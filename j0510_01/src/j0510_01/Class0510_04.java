package j0510_01;

import java.util.Scanner;

public class Class0510_04 {

	public static void main(String[] args) {
		//Chapter 4. 조건문과 반복문 1.4 switch 문
				// if문은 100개 이상을 써도 되나 속도가 느려짐
//		if :   비교를 3번 , 연산 속도가 느림,크다 작다 비교 가능
//		switch: 비교 1번 , 연산 속도가 빠름, 크다 작다 비교 불가능
		
		//문)m,f 입력받아 m남자 f 여자라고 출력하시오.
		//switch문을 사용하시오
		//1.변수입력
		char a = ' ';
		//2. scan입력
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 출력하시오.");
		a = scan.next().charAt(0);
		//3. switch
		switch (a) {
		
		case 'm': 
		case 'M':  // case 변수명 : 
			System.out.println("m은 남자입니다.");
			break;
		case 'f': 
		case 'F':
		default:
			System.out.println("f는 여자입니다.");
		// 한가지만 지정할 때	
//		case 'm':// case 변수명 : 
//			System.out.println("m은 남자입니다.");
//			break;
//		default:
//			System.out.println("f는 여자입니다.");
		}
//		
//----------------------------------------------------	
//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		input = scan.nextInt();
//		
//		//swithc()
//		switch(input==1) {
//			
//		case 1:	// 숫자는 변수명
//			System.out.println("1입니다.");
//			break; //break를 만나면 종료하게 됨
//		case 2:
//			System.out.println("6입니다.");
//			break;
//		case 3:
//			System.out.println("9입니다.");
//			break;
//		default:	
//			System.out.println("원하는 숫자가 아닙니다.");		
// }		
//----------------------------------------------------
	}//main

}//class
