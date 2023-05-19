package j0519_01;

import java.util.Scanner;

public class C0519_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 10, b=5;
		
		int total = 0;
		System.out.println(("[두수의 합"));
		total = C0519_03.total(a, b);
//		int total = a+b;
		
		System.out.printf("%d,%d+%d\n",a,b,total);
	
		
	} //main

	//2개의 매개변수를 전달 받아 합계:total를 return해서 출력을 하시오.
	// {static:클래스 int: 리턴타입 total:메소드명 (int a,int b): 매개변수
		static int total(int a,int b){//
		int total = a+b;
			return total;
		
	}// total

}// class
