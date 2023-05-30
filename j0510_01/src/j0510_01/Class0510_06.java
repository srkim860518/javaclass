package j0510_01;

import java.util.Scanner;

public class Class0510_06 {

	public static void main(String[] args) {

// 1.변수선언 num1,num2,op 2.scan입력 3번 입력
// 3. 비교(switch) 4. 결과값 출력  더하기 결과값:4
	    int num1 = 0;  // int num=0int num2=0;
	    int num2 = 0;
		char op = '*';
	 
	 // 2. scan 3번 입력
	 Scanner scan = new Scanner(System.in);
	 System.out.println("첫번째 숫자를 입력해 주세요");
	 num1 = scan.nextInt();
	 System.out.println("두번째 숫자를 입력해 주세요");
	 num2 = scan.nextInt();
	 System.out.println("연산자를 입력해 주세요");
	 op = scan.next().charAt(0);
	 
			 
	 // 3. 비교(switch) 
	 int result = 0; 
	 switch(op) { // 확인하기!!!!
	 case '+':
		 result = num1 + num2;
		 System.out.println("결과값 : "+(num1 + num2));
		 break;
		 
	 case '-':
		 result = num1 - num2;
		 System.out.println("결과값 : "+(num1 - num2));
		 break;
	 case '*':
		 result = num1 * num2;
		 System.out.println("결과값 : "+(num1 * num2));
		 break;
	 case '/':
		 result = num1 / num2;
		 System.out.println("결과값 : "+(num1 / num2));
		 break;
	 }
//---------------------------------------------------------
//		 //다른 풀이
//		 switch(op) {
//			int result = 0; 
//			
//		 case '+':
//			 result = num1 + num2;
//			 break;
//			 
//		 case '-':
//			 result = num1 - num2;
	 
//			 break;
//			 
//		 case '*':
//			 result = num1 * num2;
//			 break;
//		 case '/':
//			 result = num1 / num2;
//			 break;
//			 System.out.println("결과값 :"+result );
//	 }

		 
	 }// main
 
}// calss
