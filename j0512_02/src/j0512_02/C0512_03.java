package j0512_02;

import java.util.Scanner;

public class C0512_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또 프로그램
		
		//1. 배열 생성 
		int random = 0;               // 랜덤번호
		int temp = 0;                 // 임시 저장 변수
		int count = 0;                // 당첨 번호 개수
		int[] myNum = new int [6];    // 입력 번호
		int[] LottoNum = new int [6]; // 당첨 번호
		int[] Lotto = new int[45];    // 로또 번호 범위 1~45까지
		
		// 2. 로또 번호 생성
		for(int i=0; i<Lotto.length;i++) {
			Lotto[i] = i+1; // 로또 범위 1~45번
		} // for
		
	//3. 번호 섞기(인덱스 번호)
		for(int i=0;i<1000;i++) {
			random = (int)(Math.random()*45);// 랜//0-44 랜덤번호
			temp = Lotto[0]; // temp: 빈 공간의 임시 변수를 저장하는 곳
			Lotto[0]= Lotto[random];
			Lotto[random]= temp; 			
		} // for
		// 4. 로또 번호 입력
		System.out.println("번호 입력 : 6개");
		for(int i=0;i<6;i++) {
		System.out.println((i+1)+"번째 로또 번호를 입력하세요");
		myNum[i]= scan.nextInt();
		}
		
		//5. 로또번호 개수 확인
		for (int i=0;i<6;i++) { // lotto 배열
			for (int j=0;j<6;j++) { // myNum배열
				if(Lotto[i]==myNum[j]) {
					
					LottoNum[count]=Lotto[i];// 당첨 번호 넣기
					count++;
					continue;
					} //if
				}//for j
			}// for i
			
		//6. 출력 
		System.out.println("로또번호 생성: ");
		for(int i=0;i<6;i++) {
			System.out.print(Lotto[i]+" ");
		}// for
		
		// 7. 입력 번호 출력
		System.out.println("입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.println(myNum[i]+" ");
		}// for
		
		// 8. 당첨 번호 출력
		System.out.println("당첨번호: ");
		for(int i=0;i<6;i++) {
			System.out.println(Lotto[i]+" ");
		}
		System.out.println();
			
		//9. 당첨 갯수
		System.out.println(" 당첨 개수 : "+count);
		

	}// main

} //class














