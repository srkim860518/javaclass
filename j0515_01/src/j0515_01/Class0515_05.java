package j0515_01;

import java.util.Scanner;

public class Class0515_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 5,4 배열 1-20까지 숫자 입력 후 출력하시오.
		
		//변수
		int temp = 0;
		int random = 0;
	// 생성
		int[][] box = new int[5][4];
		int[] num= new int[20];
		
		for(int i=0;i<20;i++) {
			for(int j=0;j<20;j++) { //1~19까지
				if(i<16) {// 16까지 0넣고 17번부터는 1 ㅅㅂ입
					num[i]=0;
				}else {
					num[i]=1;
				}//else
			}//for-j
		}//for i+
				
			// 1차원 배열 섞기
			for(int i=0;i<100;i++) {
				random=(int)(Math.random()*20);
				temp=num[0];
				num[0]=num[random];
				num[random]=temp;
			} //for

	

		// 2차원 배열 값을 2차원에 배열 넣기
		for(int i=0;i<box.length;i++) { // 1-20번까지
			for(int j=0;j<box[i].length;j++) { 
			//box[i][j]=(4*i)+(j+1);
				box[i][j]=num[(4*i)+j]; //0-19
				
				if(i!=4) {// i가 4가 아니면 
					box[i][j]=0;
				}//if 2번행~3번행까지 0 입력
				else box[i][j]=1; // 4번행 1 넣기 
			     // else
		  }// for j
		}	//for i
		
		
		// 상단 번호 출력
		// 번호 출력 // 0,1,2,3 출력
		System.out.print("  "+"\t"); //"두칸 띄우기"
		for(int i=0;i<4;i++) {       
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
	
		
	} // main

}
// class
