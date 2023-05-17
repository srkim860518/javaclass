package j0515_01;

import java.util.Scanner;

public class Class0515_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 5. 5배열을 만드는데, 1-25까지 랜덤으로 섞어서 출력하시오.
		
		int temp = 0;
		int random = 0;
		String input = ""; // 좌표를 input으로 한 번에 받기위해서 
		//생성
		String[][] box = new String[5][5];
		int[] num = {1,5,6,8,9,20,15,18,19,15,3,5,24,33,23,10,22,19,10,2,8,22,20,12,10};
		
		//String[][] arr = new String[];

		// 1차원 값을 2차원 배열에 넣기
		// 1-25까지 숫자 입력
//		for(int i=0;i<num.length;i++) {
//				num[i]=i+1;
//		}//for i+
				
			// 1차원 배열 섞기
			for(int i=0;i<100;i++) {
				random=(int)(Math.random()*25);
				temp=num[0];
				num[0]=num[random];
				num[random]=temp;
			} //for

	

		// 2차원 배열 값을 2차원에 배열 넣기
		for(int i=0;i<box.length;i++) { // 1-20번까지
			for(int j=0;j<box[i].length;j++) { 
			//box[i][j]=(4*i)+(j+1);
				box[i][j]=""+num[(5*i)+j]; //0-19
				
//				if(i!=4) {// i가 4가 아니면 
//					box[i][j]="0";
//				}//if 2번행~3번행까지 0 입력
//				else box[i][j]="1"; // 4번행 1 넣기 
			     // else
		  }// for j
		}	//for i
		
		
		// 무한 반복 출력
		while(true) {

		// 상단 번호 출력
		// 번호 출력 // 0,1,2,3 출력
		System.out.print("  "+"\t"); //"두칸 띄우기"
		for(int i=0;i<5;i++) {       
			System.out.print(i+"\t"); // 
		}
		System.out.println();			
		System.out.println("-----------------------------------------------");
				
		// box 번호 출력
		for(int i=0;i<box.length;i++) {
			System.out.print(i+"|\t");
			for(int j=0;j<box[i].length;j++) {
			System.out.print(box[i][j]+"\t");
		  }// for j
			System.out.println();		
		}	//for i
		System.out.println();
		
		// 좌표입력
		System.out.println("좌표를 입력하세요.");
		input = scan.next(); //42
		
		// x 표시 넣기 - char를 int형 변환
		int no1 = input.charAt(0)-'0'; // 첫째자리 4 - a:97 A:65 '3'-'0'=3
		int no2 = input.charAt(1)-'0';// 첫째자리 2 
		
		box[no1][no2] = "x"; // 변경할 좌표 위치 box[4][2] => 23-->문자 x로 변경
		
		
		
		} //while
		
	} // main

}// class




















