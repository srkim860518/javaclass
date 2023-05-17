package j0512_01;

import java.util.Scanner;

public class Class0512_04 {

	public static void main(String[] args) {
		// 
		
	// 변수선언
		Scanner scan = new Scanner(System.in);
		int temp =0; // 임시 저장 변수
		int random = 0; // 랜덤개수
		int count = 0;// 당첨 개수 확인
		
	//1. 배열생성
		int[] lotto = new int[45]; //
		int[] myNum = new int[6]; //나의 당첨번호 
		int[] lottoNum = new int[6];// 당첨번호
		
	//2. 로또 번호 생성
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1; // 0부터 시작하고 싶을때 [i]
		}
		
	//3. 로또 번호 섞기
	for(int i=0;i<1000;i++) {
		random= (int)(Math.random()*45); // 랜덤 번호는 45번까지
		temp = lotto[0]; // 0번째
		lotto[0]=lotto[random];
		lotto[random] = temp; 
	}
		
	// 4. 로또 번호 입력 (6개_)
	for(int i= 0;i<6;i++) {
		System.out.println((i+1)+"첫번째 번호를 읿력하세요.");
		myNum[i]= scan.nextInt();
	}
	
	//5. 로또 번호 당첨개수 확인
	for(int i=0;i<6;i++) {
	   for(int j=0;j<6;j++) {
	     if(lotto[i]==myNum[j]) { 
	    	 lottoNum[count] = lotto[i];
	    	 count++; // 당첨개수 증가
	     }//if
	   }//for j
	  }//for i
	
	//6. 로또번호 출력
	System.out.print("6개 로또번호 : ");
	for(int i=0;i<6;i++) {
		
		System.out.print(lotto[i]+" ");
	}
	
	//7. 입력번호 출력
	System.out.print("6개 입력번호 : ");
	for(int i=0;i<6;i++) {
		System.out.print(lotto[i]+" ");
	}
	System.out.println();
	
	//8/ 당첨번호 출력
	System.out.println("당첨번호 : ");
	for(int i=0;i<count;i++) {
		System.out.println(lottoNum[i]+" ");
	}
	System.out.println();
	
	//9. 당첨개수 출력

	System.out.println("당첨개수 : "+count);
	//----------------------------------------------
	
	} //main

}//Class
