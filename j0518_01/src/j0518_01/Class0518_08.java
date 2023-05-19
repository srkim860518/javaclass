package j0518_01;

import java.util.Scanner;

public class Class0518_08 {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	// 로또 맞추기
	// 1-45 까지 숫자 입력
	int[] lotto = new int[45];
	int[] mynum = new int[6];
	int[] mylotto = new int[6];
	
	// 1-45 번까지 숫자를 lotto 넣어 보세요.
	// for문

	// 로또 번호 입력 1-45
	for(int i=0;i<45;i++) {
		lotto[i]= i+1;
	}	
	
	//섞기	
	int temp=0;
	int count =0;
	
	for(int i =0;i<1000;i++) {
		int random = (int)(Math.random()*45);
		temp=lotto[0];
		lotto[0]=lotto[random];
		lotto[random]=temp;
	}
	// 내가 입력한 숫자 6개 
	for(int i=0;i<6;i++) {
		System.out.println((i+1)+"번째 번호를 입력하세요. :");
		mynum[i]=scan.nextInt();
	}
	
//	// 당첨번호 넣기
//	for(int i=0;i<6;i++) {
//		for(int j=0;j<6;j++) {
//			if(lotto[i]==mynum[j]) {
//				mylotto[count]=lotto[i];
//				count++;
//				break;
//			}// if
//	
//		}// for-j
//	}//for - i
//	
//	System.out.println("당첨번호 개수: "+count);
//	
//	// 나의 로또 번호 출력
//	System.out.println("당첨번호: ");
//	for(int i=0;i<count;i++) {
//		System.out.print(mylotto[i]+" ");
//	}
//	System.out.println();
//    // 출력해보세요	 // lotto 당첨 번호 
//	System.out.println("로또번호: ");
//	for(int i=0;i<6;i++) {
//		System.out.print(lotto[i]+ " ");
//		}
//	System.out.println();
//	
//	// mynum 출력
//	System.out.println("입력한번호");
//	for(int i=0;i<mynum.length;i++) {
//		System.out.print(mynum[i]+" ");
//		
	}
	
	//====================================================================
	// 로또 맞추기
	// 1-45 숫자 입력
//	int[] lotto = new int[45]; // 로또 번호
//	int[] myNum = new int[6]; // 내가 넣는 번호
//	int[] mylotto = new int[6]; // 내가 당첨된 번호
//	// 1- 45 숫자를 lotto에 넣어보세요
//	for(int i =0;i<6<i++) {
//		
//	}
//	
	// lotto 섞기
	// lotto 출력하기
	// myNum에 숫자 6개 넣기
	// myNum 출력하기
	// lotto와 myNum에 같은 숫자가 있으면 mylotto에 넣기 (이중for, 당첨개수: count변수)


}// main
	
//}//class
