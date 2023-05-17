package j0515_01;

import java.util.Scanner;

public class Class0515_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 2차원 배열
		// [4][3]
		
		int[][] box = new int[4][3]; //4*3의 행열 구조 배열
		//번호 입력
//		for(i=0;i<4;i++) {
//			for(j=0;j<3;j++) {
		for(int i=0;i<box.length;i++) {
			for(int j=0;j<box[i].length;j++) {
				//box[i]=i+1;
				//box[j]=j+1;	
				box[i][j] = (3*i)+(j+1); // 공식 외우세요!!!
 			} //for j
		}// for i
		
		
		// 행  인덱스 번호 추가 입력
		System.out.print("  |\t"); 
		
		// 위 타이틀 출력 0,1,2  출력
		for(int i=0;i<3;i++)
			System.out.printf(i+"\t"); // 위 타이틀 0,1,2 출력
	
		System.out.println();
		System.out.println("------------------------------------------------");
		
	
		// 번호 출력
		for(int i=0;i<4;i++) {			
			// 인덱스 번호 입력
			System.out.print(i+"|\t"); // 제로 인덱스 추가하기 위치 - 번호 입력하기 전
			
	 		for(int j=0;j<3;j++) {
				System.out.print(box[i][j]+"\t");
							
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	} // main

}// class




















