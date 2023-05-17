package j0511_01;

import java.util.Scanner;

public class Class0511_01 {  // 전역변수
public static void main(String[] args) { //지역변수
//// 구구단을 출력하시오.
//	Scanner scan = new Scanner(System.in);
//	
//	for(int i=2;i<=9;i++) {
//	//	System.out.println("[  %단  ]")\n;
//------------------------------------------------		
//	}
	//중첩 반복문 - 구구단  구간 나눔System.out.println("[    ]");
	for(int i=1;i<=9;i++) {
		System.out.println("[ %단  ]");
		for(int j=2;j<=9;j++) // i = 1일때 j는 9번--> i가 9번 돌고*j가 9번 돌면 = 81번 반복  
		//System.out.println(i+" * "+i" = "+(i*i));
		System.out.printf("%d *%d = %d \t",j,i,i*j);
	}
	System.out.println();// i=1 * j=1~9까지 반복 하고 구간 나눔
	
//----------------------------------------
	 //구구단 
//		for (int i = 2; i <= 9; i++) {
//			System.out.printf("[%d 단)\t", i);
//		}//for
//  		System.out.println();
//		for (int i = 1; i <= 9; i++) {
//			for(int j=2;j<=9;j++) {
//			System.out.printf("%d*%d=%d\t",j,i,i*j);
//		}//for
//		System.out.println();
  		
	
	//연습
//  		for(int i = 2; i <= 9; i++) {
//  				System.out.println("[ %d 단]\n",i);
////  	  			for(int i = 2; i<=9;i++) {
//  				for(int j=2;j<=9;j++)
//System.out.printf("%d*%d=%d\t",j,i,i*j);
//  				
//  			}
  		
  		
//}//for
	}// main

}// class



