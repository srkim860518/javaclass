package j0515_01;

import java.util.Scanner;

public class Class0515_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	// 10개 중 2개의 보물을 찾기 프로그램을 구성하시오.
		// 꽝 = 0, 1억 보물 = 1, 1억보물 -2 
		
		//box 배열 10개
		// arr 배열 10개
		// 섞기  temp, random
		//scan입력 -> input
		//while -  무한 반복
		// 화면 출력 = 출력, 번호 출력
		int temp = 0; 
		int random = 0; 
	
		int input =0; // input 번호입력
		int count =0; // count를 입력해줘야 출력
		
		int[] box = {0,0,0,0,0,0,0,0,1,2};// 번호를 맞추기 위한 배열
		//int[] box = new int[10];
		String[] arr = {"?","?","?","?","?","?","?","?","?","?"};// 출력을 위한 배열
		//String[] arr = new String[10]; // 출력을 위한 배열
		
		//arr이라는 배열에 물음표 10개 생성
		for(int i=0;i<10;i++) {
			arr[i]="?";
		}
		
		// box번호 섞기
		for(int i=0;i<100;i++) {
			random=(int)(Math.random()*10);//0-9
			temp=box[0];
			box[0]=box[random];
			box[random]=temp;
		}
		
		while(true) {
	// 출력
      System.out.println("[보물 찾기 프로그램");
      for(int i=0;i<10;i++) {
      System.out.print(i+"\t");
      }//for
      
      // 
      System.out.println();
      //밑줄
      System.out.println("---------------------------------------------------------------------------------");
      // 정답 화면 출력
      for(int i=0;i<10;i++) {
    	  System.out.print(arr[i]+"\t");
      } //for
      System.out.println();

      // 번호 입력
      System.out.println();
      System.out.println("번호를 입력해주세요.");
      input = scan.nextInt();
      
      //입력된 번호가 보물인지 비교 box 배열0,1,2   // (보물 확인, 꽝 비교 // 정답은 박스 안에 있음)
      if(box[input]==1) { // 박스에 [숫자(0~9번까지)=input]== 1이면  , 결과- arr(물음표?)= 입력숫자
    	  arr[input]="1억 보물";
      }
      else if(box[input]==2) {
    	  arr[input]="100만원 보물";
      }
    	  else arr[input]="꽝";
      
      
      }// while
			
	} // main

}// class