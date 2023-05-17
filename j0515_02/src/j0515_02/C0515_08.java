package j0515_02;

import java.util.Scanner;

public class C0515_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 연습-과제
// 5,5배열
String[][] box = new String[5][5];

// 1차원 배열에 숫자 넣기
// int[] num = {1~25} / zero index  순서
// int[] num = {25개의 숫자] 인덱스 번호에 따른 숫자

// 1-25번 순차적으로 번호넣기
int[] num = new int[25];
for(int i=0;i<25;i++) {
	num[i] = i+1;
	
}// for

// 배열섞기

int temp=0, random=0;
for(int i=0;i<100;i++) {
	random = (int)(Math.random()*25);
	temp = num[0];
	num[0]=num[random];
	num[random]=temp;
}

//2차원 배열에 숫자 넣기
for(int i=0;i<box.length;i++) {
	for(int j=0;j<box[i].length;j++){
		box[i][j] = ""+num[5*i+j]; // String type = " +int
	}//for j
} // for i

while(true) {
	System.out.print(" "+"|t");
	for(int i=0;i<5;i++) {
		System.out.print(i+"\t");
	}
	System.out.println();
	System.out.println("-----------------------------------------------");


// 화면출력
for(int i=0;i<box.length;i++) {
	System.out.print(i+"|\t");
	for(int j=0;j<box[i].length;j++) {
		System.out.println(box[i][j]+"\t");
} //for j
	System.out.println();
} //for i
			
		//1-25번까지 번호 입력
	
	System.out.println("1-25번가지 번호를 입력하세요.");
	int input = scan.nextInt();
	// 해당 값을 찾기
	loop:for(int i=0;i<5;i++) {
		for(int j=0;j<5;i++) {
			if(box[i][j].equals(input+"")) {
				box[i][j] = "X";
				break loop; // 이렇게 사용해야함.
			} //if
		} // for 
	} // for
	
 // 좌표 입력
// System.out.println("X좌푤르 입력하세요.>>0-4까지");
//	int no1 = scan.nextInt();
//	 System.out.println("Y좌푤르 입력하세요.>>0-4까지");
//		int no2 = scan.nextInt();
//		box[no1][no2]= "x";
	
	
	
	}//while

	} //main

} // class

