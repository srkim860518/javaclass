package j0511_01;

import java.util.Scanner;

public class Class0511_06 {
public static void main(String[] args) {
	// 문제)
	//1. 랜덤 숫자 생성
	//2. 숫자 맞추기 10까지 사용할 수 있도록
	//0.종료
	
	// 숫자 맞추기 프로그램
	Scanner scan = new Scanner(System.in);
	int random=0,input=0,num=0;
	
	while(true) {
		System.out.println("[랜덤숫자 프로그램]");
		System.out.println("1. 랜덤숫자 생성");
		System.out.println("2. 숫자 맞추기 게임");
		System.out.println("3. 종료");
		System.out.println("--------------");
		System.out.println("원하는 번호를 입력하세요.");
		input = scan.nextInt();
	
		switch(input) {
		
		case 1:
			//1~100까지 랜덤 숫자 생성
			random = (int)(Math.random()*100)+1;
			//System.out.println("랜덤 숫자: "+random); // 먼저 확인 하고 다시 주석 처리-->아래거 실행하세요
			System.out.println("랜덤 숫자가 생성 되었습니다. ");
			break;
		case 2:
			System.out.println("1~100까지의 숫자를 입력하세요.");
			input = scan.nextInt();
			if(input==random) { // input=random이 같으면 브레이크: 정답입니다.
				System.out.println("정답입니다.");
				break;
			}else {
				System.out.println("오답입니다.");
			}
----------------------------------------------------------------------------------------------------			
//	// 문제) 3번까지만 나오게
//	Scanner scan = new Scanner(System.in);
//	int random=0,input=0,num=0,count=0;
//	
//	while(true) {
//		//count
//				System.out.println("[랜덤숫자 프로그램]");
//				System.out.println("1. 랜덤숫자 생성");
//				System.out.println("2. 숫자 맞추기 게임");
//				System.out.println("3. 종료");
//				System.out.println("--------------");
//				System.out.println("원하는 번호를 입력하세요.");
//				input = scan.nextInt();
//			
//				switch(input) {
//				
//				case 1:
//					//1~100까지 랜덤 숫자 생성
//					random = (int)(Math.random()*100)+1;
//					//System.out.println("랜덤 숫자: "+random); // 먼저 확인 하고 다시 주석 처리-->아래거 실행하세요
//					System.out.println("랜덤 숫자가 생성 되었습니다. ");
//					break;
//				case 2:
//					
//					while(true) {
//						//count
//						if(count>=3) {
//							System.out.println("3번 도전했습니다.");
//							System.out.println("정답 : "+random);
//							break;
//						}//if
//									
//					System.out.println("1~100까지의 숫자를 입력하세요.");
//					input = scan.nextInt();
//					if(input<=3) { // input=random이 같으면 브레이크: 정답입니다.
//						System.out.println("정답입니다.");
//						break;
//					}else {
//						System.out.println("오답입니다.");
//					}//if
//		
//					}//while
//		}//switch	
//	
//	}//while
//-----------------------------------------------------		
	

	}// main

}// class
