package j0515_01;

import java.util.Scanner;

public class Class0515_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//5,5 배열을 만들어서 해당 번호를 x표시하는 프로그램을 구현하시오.
		
		int temp = 0;
		int random = 0;
		String input ;
		
		String[][] box = new String[5][5];
		int[] num = new int[25];
		
		// 1차원 배열 생성
		for(int i=0;i<num.length;i++) {
			num[i]=i+1;
		}
		// 섞기
		for(int i=0;i<100;i++) {
			random=(int)(Math.random()*25);
			temp=num[0];
			num[0]=num[random];
			num[random]=temp;
		}
		// 2차원 배열 채우기
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				box[i][j]=""+num[5*i+j];
			}
		}
		
		// 출력
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(box[i][j]+"\t");
			}
			System.out.println();
		}
		
		// 
		while(true) {
			 // 해당값 찾기
			 System.out.println("좌표를 입력해주세요");
			input=scan.next();
			int no1 = input.charAt(0)-'0' ; 
			int no2 = input.charAt(1)-'0' ;
			box[no1][no2]="x";
			
			
			//
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					System.out.print(box[i][j]+"\t");
				}
				System.out.println();
			}
			
			
//		// 출력 test
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
//		
		
		
		
		}//while
		
	} // main

}// class