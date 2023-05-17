package j0515_01;

import java.util.Scanner;

public class Class0515_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 보물 상자 10개
		int temp =0;
		int random = 0;
		int input = 0; // 입력번호
		
		//int[] box = {0,0,0,0,0,0,0,1,1,1} // 이렇게 지정해주면  box의 0,1을 지정해주지 않아도 됨.
		int[] box = new int[10]; // 보물 상자
		// 	
		for(int i=0;i<10;i++) {  // 박스안에 ,0,1,0, 숫자 들어가 있음 
			if(i<7) {
				box[i]= 0;
			}else {
				box[i] = 1;
			}
		}//for
		
		String[] arr = new String[10];
		
		//arr이라는 배열에 물음표 10개 생성
		for(int i=0;i<10;i++) {
			arr[i]= "?"; // 
		}
		
		int count=0;
		
		while(true) {
			// 출력
			System.out.println("[보물찾기 프로그램");
			for(int i=0;i<10;i++){
				System.out.print(i+"\t");
			}//for
				System.out.println();
				System.out.println("-------------------------------------------------------------");
				for(int i=0;i<10;i++){
					System.out.print(arr[i]+"\t");
					
				}
				System.out.println();
				
			
			// 섞기
			for(int i=0;i<100;i++) { // 최대한 많이 섞기 위함 10번 구한다고 하지만 10번으로 하면  그 만큼 많이 섞이지 않음
				random=(int)(Math.random()*10);
				temp=box[0];
				box[0]=box[random];
				box[random]=temp;
			}
			
			
			// 번호 입력
			System.out.println();
			System.out.println(" 번호를 입력해주세욥");
			input = scan.nextInt();
			
			// 보물인지 아닌지 비교
			if(box[input]==1) // box 방
				arr[input]="보물";
			else // 보물방
			  arr[input]= "꽝";

		
			
		} //while
		
	} // main

}// class




















