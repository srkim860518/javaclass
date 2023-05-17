package j0511_01;

import java.util.Scanner;

public class Class0511_02 {

	public static void main(String[] args) {
		// chapter4. 조건문과 반복문
		// 2.6 do-while문

//--------------------------------------		
//		do {
//			System.out.println("i의 값: "+i);// 
//		}
//----------------------------		
//		int i = 10;
//		while(i<0) {
//			System.out.println("i의 값: "+i);
////			while 조건식이 맞으면 한번은도 안찍히고 끝남
//		}
//		
//		int i=10;		
//---------------------------------
		// 무한 반복-for // 무한반복: 멈추지 않고 프로그램이 계속 실행됨.
		// for(;;) {
//		System.out.println("프로그램실행");
//	}
//-------------------------------
//	//무한 반복-while
//	while(true) {
//	}
//	------------------------
//	Scanner scan = new Scanner(System.in);

		// 무한 반복-for // 무한반복: 멈추지 않고 프로그램이 계속 실행됨.
//		for(;;) {
//			System.out.println("프로그램실행");
//------------------------
		// 무한 반복: while

//	while(true) {
//		System.out.println("프로그램실행");
//	int num = sca.netxInt();
//	if(num==0) {
//		//프로그램을 종료
//		break; // 반복문의 종료는 break
//	}
//	}
//		------------------------------------
		// 무한 반복-for // 무한반복: 멈추지 않고 프로그램이 계속 실행됨.
//		for(;;) {
//			System.out.println("숫자를 입력하세요.");
//		int num = scan.netxInt();
//		if(num==0) {
//			System.out.println("프로그램을 종료합니다.");
//			//프로그램을 종료
//			break; // 반복문의 종료는 break		
//		}
//	}
//-----------------------------------------------------
//		// 어떤걸 눌러도 무한 반복
//		while (true) { // 무한반복
//			Scanner scan = new Scanner(System.in);
//			int input = 0, num1, num2 = 0; // num1,2는 두개의 숫자를 입력 받을 수 있음
//
//			System.out.println("[ 사칙연산 프로그램 ]");
//			System.out.println("[1. 더하기");
//			System.out.println("[2. 빼기");
//			System.out.println("[3. 곱하기");
//			System.out.println("[4. 나누기");
//			System.out.println("원하는 번호를 입력하세요.>>");
//			input = scan.nextInt(); // 스캔에서 원하는 번호 입력 받음
//
//			switch (input) {
//			case 1:
//				System.out.println("첫번째 숫자를 입력하세요.");
//				num1 = scan.nextInt();
//				System.out.println("두번째 숫자를 입력하세요.");
//				num2 = scan.nextInt();
//				System.out.println("더하기 결과값 : " + (num1 + num2));
//				break;
//			case 2:
//				System.out.println("첫번째 숫자를 입력하세요.");
//				num1 = scan.nextInt();
//				System.out.println("두번째 숫자를 입력하세요.");
//				num2 = scan.nextInt();
//				System.out.println("빼기 결과값 : " + (num1 - num2));
//				break;
//			case 3:
//				System.out.println("첫번째 숫자를 입력하세요.");
//				num1 = scan.nextInt();
//				System.out.println("두번째 숫자를 입력하세요.");
//				num2 = scan.nextInt();
//				System.out.println("곱하기 결과값 : " + (num1 * num2));
//				break;
//			case 4:
//				System.out.println("첫번째 숫자를 입력하세요.");
//				num1 = scan.nextInt();
//				System.out.println("두번째 숫자를 입력하세요.");
//				num2 = scan.nextInt();
//				System.out.println("나누기 결과값 : " + (num1 / num2));
//				break;
//			}//while
//			}//switch
//---------------------------------------
				// 반복되는 코드가 나올때는 앞으로 빼서 진행
				while (true) { // 무한반복
					Scanner scan = new Scanner(System.in);
					int input = 0, num1, num2 = 0; // num1,2는 두개의 숫자를 입력 받을 수 있음

					System.out.println("[ 사칙연산 프로그램 ]");
					System.out.println("[1. 더하기");
					System.out.println("[2. 빼기");
					System.out.println("[3. 곱하기");
					System.out.println("[4. 나누기");
					System.out.println("[5. 종료");
					System.out.println("원하는 번호를 입력하세요.>>");
					input = scan.nextInt(); // 스캔에서 원하는 번호 입력 받음
					
					if(input==0) {
						System.out.println("프로그램을 종료합니다.");
						break; 
					}			// 한줄만 있으면 중괄호 생략 가능		
					// 반복되는 코드가 나올때는 앞으로 빼서 진행
					System.out.println("첫번째 숫자를 입력하세요.");
					num1 = scan.nextInt();
					System.out.println("두번째 숫자를 입력하세요.");
					num2 = scan.nextInt();

					//조건문
					switch (input) {
					case 1:						
						System.out.println("더하기 결과값 : " + (num1 + num2));
						break;
					case 2:						
						System.out.println("빼기 결과값 : " + (num1 - num2));
						break;
					case 3:						
						System.out.println("곱하기 결과값 : " + (num1 * num2));
						break;
					case 4:					
						System.out.println("나누기 결과값 : " + (num1 / num2));
						break;
			    //  case 0:
				//		sysoutSystem.out.println("[4. 나누기");
				//		break; //여기는 스위치 임으로 전체에 실행됨,, 이 위치는 하지마세요  위에 case0:+break를 지정해줘야함
			}// switch
		}// while
//----------------------------------------------------------------------------------------------------------

	}// main

}// class


















