package j0522_01;

import java.util.Scanner;

public class C0522_07 {

		Scanner scan = new Scanner(System.in);
		// 6.1변수의 초기화

		//C0522_07 
		int x; // 인스턴스 변수(지역변수) 생성	, 지역변수는 초기화를 반드시 해줘야한다.	,
		int y=x; // 인스턴스 변수 생성
		char ch;
		String str;
		public static void main(String[] args) {	
		
		C0522_07 c = new C0522_07(); // class 명 
		
		int a = 0; // 초기화
		int b = a; 
		//int num =0; long num2 --> 사용 불가
		
		long num2 =0;//초기화
		
		//a,b,x,y를 출력하시오.
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("x: "+c.x); // 참조변수.변수명
		System.out.println("y: "+c.y);
		System.out.println("ch: "+c.ch); // 디폴트가 빈 공백(=\u0000= 무한대의 개념), 데이터가 없다.
		System.out.println("str: "+c.str);// 디폴트가 null 
				 
		 
 }//main
}//class
