package j0512_01;

import java.util.Scanner;

public class Class0512_03 {

	public static void main(String[] args) {
		// chapter 5. 배열  배열의 활용
		// 배열을 복사할 때 데이터의 값을 그냥 넣으면 안됨.
		// 배열 복사를 사용해야 함.
		
		// 로또 프로그램
		//1. 배열생성
//		int random=0; // 랜던 인데스 번호
//		int temp=00; // 임시저장 변수 
//		int[] lotto = new int[45];
//		
//		//2. 로또번호생성
//		for(int i=0;i<lotto.length;i++) {
//			lotto[i] = i+1; //1,2,3///45
//		// lotto[i] = (int)(Math.random()*45+1; // 45까지 나옴		
//			}
//		
//		
//		//3. 번호 섞기 (인덱스 번호로 
//		for(int i=0;i<1000;i++) {
//			random= (int)(Math.random()*45); // 0-44랜덤번호
//			temp = lotto[0]; // temp는 빈 공간의 임시 변수 , 숫자를 임시로 저장하는 곳 
//			lotto[0]= lotto[random];
//			lotto[random] = temp;
//		}
//		//System.out.println(lotto[random]);// lotto[0]= lotto[random];번호가 몇 번 인덱스 인지 확인
//			//출력
//		System.out.println("로또번호 자동생성: ");
//		for(int i=0;i<6;i++) {// 6개 로또 번호 출력
//			System.out.print(lotto[i]+" ");
//		}
		
//--------------------------------------------------------------------------
		// 로또 프로그램
		//1. 배열생성
		Scanner scan = new Scanner(System.in);  //  <---  추가
		int random=0; // 랜던 인데스 번호
		int temp=0; // 임시저장 변수 
		int count = 0; // 당첨번호 개수 
		int[] myNum = new int[6]; //나의 입력번호<--- 추가
		int[] lottoNum = new int[6]; // 당첨번호
		int[] lotto = new int[45]; // 로또번호
		
		//2. 로또번호생성
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1; //1,2,3///45
		// lotto[i] = (int)(Math.random()*45+1; // 45까지 나옴		
		}
		
		//3. 번호 섞기 (인덱스 번호로 
		for(int i=0;i<1000;i++) {
			random= (int)(Math.random()*45); // 0-44랜덤번호
			temp = lotto[0]; // temp는 빈 공간의 임시 변수 , 숫자를 임시로 저장하는 곳 
			lotto[0]= lotto[random];
			lotto[random] = temp;
		}
		//System.out.println(lotto[random]);// lotto[0]= lotto[random];번호가 몇 번 인덱스 인지 확인
			
		//4. 로또 번호 입력
		System.out.println("번호입력(6개 ");
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"첫번째 로또번호를 입력하세요.");
			myNum[i]= scan.nextInt();
		}
		
		//5. 로또번호 개수 확인
		for (int i = 0; i < 6; i++) { // lotto 배열
			for (int j = 0; j < 6; j++) { // myNum배열
				if (lotto[i] == myNum[j]) {
					// count 1증가
					lottoNum[count] = lotto[i]; // 당첨번호 넣기
				count++; // 당첨 개수 증가
				continue;}
			} // for
		} // for
		
		
		//6 출력
		System.out.println("로또번호 자동생성: ");
		for(int i=0;i<6;i++) {// 6개 로또 번호 출력
			System.out.print(lotto[i]+" ");
		}

		// 7.입력 번호 출력
		System.out.println("입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.println(myNum[i]+" ");
		}
		// 8. 당첨 번호 출력
		System.out.println("당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.println(lotto[i]+" ");
		}
		System.out.println();
		
		// 9. 당첨 갯수
	    System.out.println("당첨 개수 : "+count);
		

	} //main

}//Class
