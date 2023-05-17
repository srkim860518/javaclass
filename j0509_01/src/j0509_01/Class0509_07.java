package j0509_01;

import java.util.Scanner;

public class Class0509_07 {

	public static void main(String[] args) {

		
		// 대문자 입력시 소문자로 출력하시오.
		// 1. 변순선언 2. 입력 3. 출력
		char ch = ' ';
		Scanner scan = new Scanner(System.in); // main에 한 번만 있으면 됨
		System.out.println("대문자를 입력하시오.");
		ch = scan.next().charAt(0); // 문자열에 첫번째 문자를 가져옴.
		char ch2 = (char)(ch+32); // 대문자로 치환
	    System.out.println("입력한 대문자: "+ch);	
	    System.out.println("입력한 소문자: "+ch2);
		
	    // 소문자를 입력받아 대문로 출력하시오.
	    System.out.println("소문자를 입력하시오.");	    
	    int ch3 = ' ';
	    
	    ch3 = scan.next().charAt(0); // 문자열에 첫번째 문자를 가져옴.
	    char ch4 = (char)(ch3-32);
	    System.out.println("입력한 소문자: "+ch3);
	    System.out.println("변환된 문자: "+ch4);
	    
	    
	    
	    
	    
		
//		char ch ='A';
//		int num = ch+1;
//		System.out.println(num);
//		
		// 2항 연산자
//		int num = 10;
//		double num2 = 10;
//		double num3 = num+num2; // num: 1항 + num2 2항 두개를 연산해서 2항 연산자라고함
//		System.out.println();
//		
		
		
	
		//숫자를 입력 받아 짝수인지 홀수인지 출력하시오.
		// 짝수입니다. 홀수 입니다.
		// 변수선언 2. 입력 3.출력
	
		// 변수선언
//		int input = 0;

//		Scanner name = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		input = scan.nextInt();
//	    String result = (input%2==0)?"짝수입니다.":"홀수입니다.";
//		System.out.println(result);
		
		
}
 }