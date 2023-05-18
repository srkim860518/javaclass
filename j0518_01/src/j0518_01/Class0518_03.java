package j0518_01;

import java.util.Scanner; // ctrl+m 자동완성

public class Class0518_03 {

	public static void main(String[] args) {
		// Scanner  입력 할때만 사용
		Scanner scan = new Scanner(System.in);
		
//		// 숫자 입력
//		//scan.nextInt();
//		int num = scan.nextInt();
//		//nextLine();
//		String str = scan.next();    // 문자 입력 받을 때 , 자주 사용 x
//		double d = scan.nextDouble();//실수 입력 받을 때  
		
		// 숫자 2개를 입력받아 1,10 -> 1부터 10까지의 합을 구하시오.
		// 교수님 풀이 
		int sum = 0;
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int num = scan.nextInt(); // 1
		System.out.println("두번째 숫자를 입력하세요");
		int num2= scan. nextInt(); //10
		
		for(int i=num;i<=num2;i++) { // (int i=1초기식 : int i<=10조건식 ;i++) 증감식
			sum = sum+i;			
		}
		System.out.println("합계 :"+sum);
		
		
		// 1-100까지의 합을 구하시오.
//		// 내가 푼 풀이//
//		int a = 0;
//		int b = 0;
//		int sum = 0;
//		
//		System.out.println("첫번째 숫자를 입력하세요.");
//		a = scan.nextInt(); // 1
//		System.out.println("두번째 숫자를 입력하세요");
//		b= scan. nextInt(); //10
//		
//		for(int i=a;i<=b;i++) { // (int i=1초기식 : int i<=10조건식 ;i++) 증감식
//			sum = sum+i;			
//		}
//		System.out.println("합계 :"+sum);
		
		
		//if : 2,9  위치 변경
		int temp =0;
		if(num>num2) {
		 temp = num; // num을 temp에 넣고
		 num = num2; // num2에 들어있는 숫자를 num에 넣고
		 num2 = temp; //temp에 있는 숫자를 num2에 넣기 
		 
		}

		
	}// main

}//class






































