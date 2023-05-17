package j0511_01;

import java.util.Scanner;

public class Class0511_05 {
	public static void main(String[] args) {
//--------------------------
//	Scanner scan = new Scanner(System.in);	
//	int input = 0, num1=1, num2=0, sum=0;
//	
//	while(true) { //무한반복
//				System.out.println("1.더하기");
//				System.out.println("2.곱하기");
//				System.out.println("-------");
//				System.out.println("원하는 번호를 입력하세요.");
//				input = scan.nextInt();
//				if(input==0) {
//					System.out.println("프로그램을 종료합니다.");
//					break;
//				}
//				//조건문
//				switch(input) {
//				case 1: 
//				System.out.println("첫번째 숫자를 입력하세요.");
//					num1=scan.nextInt();
//					System.out.println("두번째 숫자를 입력하세요");
//					num2=scan.nextInt();
//					System.out.printf("결과값 : %d+%d = %d \n",num1+num2,num1+num2); // %가 3개면 3개의 인자값을 얻어야한다. 
//					break;
//				
//					// 그만할때까지 안나오게? 
//					
//				} //switch
//	} //while
//	
//-----------------------------------------------------	
//		Scanner scan = new Scanner(System.in);
//		int input = 0, num1 = 1, num2 = 0, sum = 0;
//
//		while (true) { // 무한반복
//			System.out.println("1.더하기");
//			System.out.println("2.곱하기");
//			System.out.println("-------");
//			System.out.println("원하는 번호를 입력하세요.");
//			input = scan.nextInt();
//			if (input == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			//조건문
//			switch (input) {
//			case 1:
//				while (true) {
//					System.out.println("첫번째 숫자를 입력하세요.(0.이전페이지,1:종료)");
//					num1 = scan.nextInt();
//					if(num1==0) break; // 첫번째 반복문 벗어나 이전페이지로 넘어감// 0번을 누르면 프로그램 종료가 됨
//					System.out.println("두번째 숫자를 입력하세요");
//					num2 = scan.nextInt();
//					System.out.printf("결과값 : %d+%d = %d \n", num1 + num2, num1 + num2); // %가 3개면 3개의 인자값을 얻어야한다.
//
//				} // while
//
//			} // switch
//		}

//----위에 비교-------------------------------------------------	
         // loop 확인하기 
		Scanner scan = new Scanner(System.in);
		int input = 0, num1 = 1, num2 = 0, sum = 0;

		loop1:while (true) { // 무한반복 , loop 실행 = for문 break;에서 빠져나오면 다시 시작하는 위치  
			System.out.println("1.더하기");
			System.out.println("2.곱하기");
			System.out.println("-------");
			System.out.println("원하는 번호를 입력하세요.");
			input = scan.nextInt();
			if (input == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; // break; 가장 가까운 반복문 종료, 
			}
			//조건문
			switch (input) {
			case 1:
				while (true) {
					System.out.println("첫번째 숫자를 입력하세요.(0.이전페이지,1:종료)");
					num1 = scan.nextInt();
					if(num1==0) break loop1; // 첫번째 반복문 벗어나 이전페이지로 넘어감// 0번을 누르면 프로그램 종료가 됨
					System.out.println("두번째 숫자를 입력하세요");
					num2 = scan.nextInt();
					System.out.printf("결과값 : %d+%d = %d \n", num1 + num2, num1 + num2); // %가 3개면 3개의 인자값을 얻어야한다.

				} // while

			} // switch
		}
//-----------------------------------------------------	

//-----------------------------------------------------	

//-----------------------------------------------------			

	}// main

}// class
