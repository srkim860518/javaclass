package j0512_02;

import java.util.Scanner;

public class C0512_04 {

	public static void main(String[] args) {
		//로또 번호 
		Scanner scan = new Scanner(System.in);
		// 변수선언
		int temp = 0;
		int count = 0;
		int random = 0;
		
		// 1. 배열 생성
		int[] Lotto = new int[45]; // 나의 당첨번호
		int[] myNum = new int[6];  // 나의 당첨번호
		int[] LottoNum = new int[6]; // 당첨번호

		// 2.로또 번호 생성
		for(int i=0;i<Lotto.length;i++) {
			Lotto[i]= i+1; 
		}
		// 3. 로또 번호 섞기
		for(int i=0;i<1000;i++) {
			random=(int)(Math.random()*45);
			temp = Lotto[0];
			Lotto[0]=Lotto[random];
			Lotto[random]=temp;
		}
		
		// 4. 로또 생성 번호 입력 6개
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"첫번째 번호를 입력하세요");
			myNum[i]=scan.nextInt();
		}
		// 5. 로도 번호 당첨 개수 확인
			for(int i=0;i<6;i++) {
				for(int j=0;j<6;j++) {
					if(Lotto[i]==myNum[j]) {
						LottoNum[count] = Lotto[i];
						count++;
					}//if
				}//for j
			}//for i
		
		// 6. 로또 번호 출력
			System.out.println("6개 로또번호 : ");
			for(int i=0;i<6;i++) {
				System.out.print(Lotto[i]+" ");
			} 
			
		// 7. 입력 번호 출력
			System.out.print("6개 입력번호 : ");
			for(int i=0;i<6;i++) {
				System.out.print(myNum[i]+" ");
			}
			System.out.println();
			
		// 8. 당첨번호 출력	
			System.out.println("당첨번호 : ");
			for(int i=0;i<count;i++) {
				System.out.println(LottoNum[i]+" ");
			}
			System.out.println();
			
		// 9. 당첨 개수 출력 
			System.out.println("당첨 개수 : "+count);
		
	}// main

} //class
