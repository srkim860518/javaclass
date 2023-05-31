package j0510_01;

import java.util.Scanner;

public class Class0510_08 {

	public static void main(String[] args) {
    //교수님 자바 Chapter 4. 조건문과 반복문 
		// 2. 반복문(for, while, do-while)
//for (int i=1;i<=10;i++) {
//	System.out.println(i); // 1~10까지 나옴
//}
//----------------------------------------
//		int sum=0;
//		
//    for (int i=1;i<=100;i++) {
//    	sum= sum +i;
//	System.out.println(i+":"+sum);
//}
//----------------------------------------

//	int sum=0;
//	int i =1;
//    for (i=1;i<=100;i++) { // 부등호 뒤 숫자는 반복하는 횟수 =100번 반복, print에서 i를(1을) 더하니 101번째가 표기됨
//    	sum= sum +i;
//	System.out.println(i+":"+sum);   
//    }
//--------------------------------------------------------------------

	int sum=0;
	int i =1;
    for (i=1;i<=3;i++) { // 부등호 뒤 숫자는 반복하는 횟수 =3번 반복
    	sum= sum +i;
	System.out.println((i-1)+":"+sum);
    }
////---------------------------------------------------------------------
		
//		숫자를 3번 반복해서 입력 받아, 합을 출력하시오
//		1. 변수 선언 num, sum
//		2. scan 1번 선언
//		3. 반복문
//		4. 숫자 입력 넣어줌
//		5. sum 변수에 더하기 해줌
//		6. sum 출력
//       int num = 0;
       
       Scanner scan = new Scanner(System.in);
     
//       int sum=0;
//   	   int i =1;
//   	   
//       for (int i=1;i<=3;i++) { // 부등호 뒤 숫자는 반복하는 횟수 =3번 반복
//    	   System.out.println("숫자를 입력하세요.");
//    	   int num = scan.nextInt();
//    	   sum= sum + num;
//    	   //System.out.println((i-1)+sum);
//    	   System.out.println((i-1)+":"+sum);
//		
//       }
//--------------------------------------------------
     //교수님 풀이 - 이문장 외워야함.
//       Scanner scan = new Scanner(System.in);
//       int num =0,sum = 0;
//       
//       for(int i=0;i<3;i++) {
//    	   System.out.println((i+1)+"번째 숫자를 입력하세요.");
//    	   num = scan.nextInt(); 
//    	   sum = sum+num;  			
//   		System.out.println("합계:"+sum);
//       }
//
//		

	}//main

}//class

		


















 

