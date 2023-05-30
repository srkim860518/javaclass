package j0508_01; // 복습 0528

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class C0508_1 {

	public static void main(String[] args) {
    
		boolean  temp = true;
		boolean  temp2 = false;
		boolean temp3;
		temp3 = true;
		
		char ch1 = ' '; // 공백없이 사용 불가, 문자형 타입
		char ch2 = 'a'; // ''만 사용 가능
		char ch3 = 'A';
		char ch4 = 't';
		//char ch5 = " "; 에러!!--> 작은 따옴표=char
		//String ch5 = " "; 큰 따옴표 = String
		
	 byte num = 1;
	 byte num11 = 127; // 127까지만
//	 byte num12 = 128; 에러!!! 	 
	 short num2 = 10;
	//short num4 = 32768; //32767까지 숫자표현 가능
	 
	 int num5 =21;
//	 int num6 = 2147483648; //2147483647까지 숫자표현 가능
	 long num7 = 21;
	 long num8 = 2147483648L; //접미사 L,l을 붙여야 함.
	 
		//문자열 - class일때 대문자 표현 
	 float num09= 3.14f; // 실수형, 소수점 실수 + f/F = 접미사 
	 float num9 = 3.87654321f; // 실수형 8자리까지 정밀도 표현 
	 float num10= 987.654321000000f; // // 접미사 F,f를 붙여야 함.8자리 이상 사용 가능하나, 정확하지 않은 숫자가 됨.
	 
//	 double num11 = 1.123456789012345;// 실수형 16자리까지 

		// 문자열의 타입 = class 일때 대문자 표현 , 소문자를 쓰면 에러남
	  
	 String str1 = new String("abc"); 
	 String str2 = "aaa";// 기본형 타입으로 선언(예외), 대부분의 개발자들은 변수 이름을 소문자로 선언함.
	 
	 char str3 = ' '; //char는 작은 따옴표 안에 공백을 넣어야함. 공백 없으면 에러 발생
	 String str4 = ""; //빈공백이 없어도 에러 안남
	 
	 // 변수 
	 int score = 100;
	 score = score + 200; // score 300이라는 값이 들어감.
	 
	 // 상수
	 final int score2 = 100; // 상수는 값을 변경 할 수 없음.
	 
	
	}// main

}// class
