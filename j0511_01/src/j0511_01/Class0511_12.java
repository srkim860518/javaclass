package j0511_01;

import java.util.Scanner;

public class Class0511_13 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int input=0,num1=0,num2=0;
//		
//		while(true) {
//			System.out.println("[ 사칙연산 프로그램 ]");
//			System.out.println("1. 더하기");
//			System.out.println("2. 빼기");
//			System.out.println("3. 곱하기");
//			System.out.println("4. 나누기");
//			System.out.println("0. 종료");
//			System.out.println("원하는 번호를 입력하세요.>>");
//			input = scan.nextInt(); //원하는 번호 입력받음.
//			
//			if(input==0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			
//			
//			//숫자를 입력
//			System.out.println("첫번째 숫자를 입력하세요.");
//			num1 = scan.nextInt();
//			System.out.println("두번째 숫자를 입력하세요.");
//			num2 = scan.nextInt();
//			
//			//조건문
//			switch(input) {
//			case 1:
//				System.out.println("더하기 결과값 : "+(num1+num2));
//				break;
//			case 2:
//				System.out.println("빼기 결과값 : "+(num1-num2));
//				break;
//			case 3:
//				System.out.println("곱하기 결과값 : "+(num1*num2));
//				break;
//			case 4:
//				System.out.println("나누기기 결과값 : "+(num1/num2));
//				break;
//			}//switch
//			
//		}//while
//		
//--------------------------------------------------------------------------
		//무한반복
//		for(;;) {
//			System.out.println("숫자를 입력하세요.");
//			int num = scan.nextInt();
//			if(num==0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//		}
		
		//무한반복
//		while(true) {
//			System.out.println("숫자를 입력하세요.");
//			int num = scan.nextInt();
//			if(num==0) {
//				//프로그램을 종료
//				break; //반복문을 종료는 break
//			}
//		}
		
		
		int i=10;
		while(i<0) {
			System.out.println("i의 값 : "+i);
		}
		
		do {
			System.out.println("i의 값 : "+ i);
		}while(i<0);
		
		System.out.println("프로그램을 종료합니다.");


	}

}

