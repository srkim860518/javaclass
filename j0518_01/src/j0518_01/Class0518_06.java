package j0518_01;

import java.util.Scanner;

public class Class0518_06 {
	public static void main(String[] args) {
	
		//1-100까지의 랜덤 숫자를 생성해서 숫자를 맞추는 프로그램을 구현하시오.
		// 횟수 10번만 가능
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		//배열 사용해서 입력한 숫자를 모두 출력하시오.
		
		int[] num = new int[10];

		int input=0;

		
		for(int i=0;i<10;i++) {
			System.out.println( (i+1)+ "번째 숫자를 입력하세요.");
			input  = scan.nextInt();
			num[i]= input;             // 아래 for문의 
			if(input==random) {
				System.out.println("당첨");
				break; 
			}else {
				System.out.println("미당첨");
			} // else
		}// if
		
		// 입력한 숫자의 배열 10가지 ( 미당첨 이후로 입력한 10개의 번호가 들어옴)
		for(int i=0;i<10;i++) {
			System.out.println(num[i]);
		}
		
//		 while //문 공부하자 김선례!!!!!!!!!! 정신차려!!!!!!!
//		int j =0;
//		
//		while(j<10) {
//			System.out.println((j+1)+"입력하세요(0 종료)");
//			input = scan.nextInt();
//			
//			if(input==0) {
//				System.out.println("종료");
//				break;
//				
//			}
//			if(input==random) {
//				System.out.println("당첨");
//				break;
//			}else {
//				System.out.println("미당첨");
//			}
//
//			j++;
//			
//	
//		}//while
		
		System.out.println("당첨번호는 : "+random);
		
	}//main 
}//class























