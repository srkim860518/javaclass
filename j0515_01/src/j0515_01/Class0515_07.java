package j0515_01;

import java.util.Scanner;

public class Class0515_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 5,5 배열
		String[][] box = new String[5][5]; // 2차원 25개의 배열
		int input=0;
		//1차원 배열에 숫자 넣기
		int[] num= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,171,81,19,20,21,22,23,24,52};
		// 중요!!!!!!!!!!!!!!!!!!!1개의 배열에 숫자 넣기 
//		int[] num = new int[25];
//		for(int i=0;i<num.length;i++) {              // 인덱스 번호 
//			num[i]= i+1;    // 1~25의 숫자가 배열안에 있음  // i=인덱스 번호의 값을 가져와서 +1을 더해라
//		}
		
		// 배열 섞기
		int temp = 0;
	   	int random = 0;
	   	for(int i=0;i<100;i++) {
	   		random = (int)(Math.random()*25);
	   			temp=num[0];
	   			num[0]=num[random];
	   			num[random]=temp;
	   	}
	   		
		
		// 2차원 배열에 숫자 넣기 - 2차원은 배열 2개 = for문 2개
		for(int i=0;i<box.length;i++) {
			for(int j=0;j<box[i].length;j++) {
			box[i][j]= ""+num[5*i+j];// String 타입 = " "+int;//  인덱스 번호
			// 설명 : 박스에 있는 제로인덱스[0][0]= num[0]; --> [행][열] = num[0] 인덱스 번호 // 대괄호안은 무조건 인덱스 번호 임
		} // for i
	}// for j
//		
//		box[0][0] = num[0];
//		box[0][1] = num[1];
//		box[0][2] = num[2];
//		box[0][3] = num[3];
//		box[0][4] = num[4];
//		box[1][0] = num[5];
//		box[1][1] = num[6];
//		box[1][2] = num[7];
//		box[1][3] = num[8];
//		box[1][4] = num[9];
//		box[2][0] = num[10];
//		box[2][1] = num[11];
//		box[2][2] = num[12];
//		box[2][3] = num[13];
//		
//		box[4][4] = num[25];
//		
		
		while(true) {
		// 상단 번호 출력
		System.out.print(" "+"|\t");
		for(int i=0;i<5;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------");
				
	//화면출력
			for(int i=0;i<box.length;i++) {
				System.out.print(i+"|\t");
				for(int j=0;j<box[i].length;j++) {
				System.out.print(box[i][j]+"\t");
			} // for i
			System.out.println(); // 줄바꿈
		}// for j
			
		// 해당 값을 찾기
			for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(box[i][j].equals(input+"")) {
					box[i][j]= "x";
					continue;
				}//if
				}//for j
			}//for i			
	
			// 1-25까지 번호 입력
		 System.out.println("1-25까지 번호를 입력하세요.");
		 input = scan.nextInt();
		
		// 좌표 입력
//			System.out.println("좌표를 입력하세요.>>>(0-4까지 번호)");
////			String input = scan.next(); // 12
////			int no1 = '4'-'0'; //문자-> 숫자 만드는 공식char = '0' = int ex)  '9'-'0'= 9
//			
//			int no1 = scan.nextInt();
//			System.out.println("y좌표를 입력하세요.>>>(0-4까지 번호)");
//			int no2 = scan.nextInt();
//			
//			box[no1][no2] = "x";
		} //while
		
	} // main

}// class




















