package j0510_01;

import java.util.Scanner;

public class Class0510_02 {

	public static void main(String[] args) {
//Chapter 4. 조건문과 반복문
		// if문은 100개 이상을 써도 되나 속도가 느려짐
	
//---------------------------------------------------
//	 int num = 8;
////	 (num>=1)?"":"" //삼항식      // 뜻 num이 1보다 크냐? 
//	 if(num==8) {
//		 System.out.println("8입니다..");
//	 }else {
//		 System.out.println("8이 아닙니다.");
//	 }
//--------------------------------------------------	
//	     	int num = 8;
////		(num>=1)?"":"" 
//			if(num==8) {
//				System.out.printl("8입니다.");
//			} else{
//				System.out.println("8이 아닙니다.");
//			}
//		---------------------
//			//	if,else문
//				 int num = 0;
//				
//			     if(num>0) {
//					 System.out.println("양수 입니다.");
//				 }else if(num==0){
//					 System.out.println("0입니다.");
//				 }else {
//					 System.out.println("음수 입니다.");
//				 }
  //---------------------------------------------------	
//		//if 문만 
//		int num =0;
//		 if(num==0) {
//		 System.out.println("0입니다..");
//			 }
//------------------------------------------------------------------------------------------		
		// 문)입력한 숫자가 2의 배수이면 2의 배수입니다. 2의 배수가 아닙니다. 출력하시오
			int num = 5;
			// 2. Scan 선언후 입력
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			
			//3.비교
		// if문 중괄호 없어도 됨. 실습은 중괄호 넣어주세요
			if((num%2) == 0) { // 2의 배수를 구하려면: (num%2) 변수 나누기(%)2는 나누기 값으로 입력 받음
				System.out.println("2의 배수입니다.");
			}else {
				System.out.println("2의 배수가 아닙니다.");
			} 
		//-----------------------------------------
//		int num = 100;
//		Scanner scan = new Scanner(System.in);
//		num = scan.nextInt();
//		if((num % 2) == 0) {
//			System.out.println("2의 배수입니다.");
//		}else {
//			System.out.println("2의 배수가 아닙니다.");
//		}
//		 
 }// main
}//class
