package j0511_01;

public class Class0511_08 {
	public static void main(String[] args) {
//		 int[] num = new int[5];
//		num[0]=1;
//		num[1]=2;
//		num[2]=3;
//		num[3]=4;
//		num[4]=5;
//		
//		for(int i=0;i<5;i++ ) {// 0,1,2,34
//			System.out.println(num[i]);
//		}
		//---------------------------------------------------------------------		
// 
//		int[] num = new int[2];
//		num[0]=1;
//		num[1]=2;
//		num[2]=3;
//		num[3]=4;
//		num[4]=5;
//		
//		for(int i=0;i<num.length;i++ ) {// num.length 배열을 읽어줌
//			System.out.println(num[i]);
//		}
//---------------------------------------------------------------------
	//문제) 배열 100개를 만들고 1-100까지 숫자를 입력
//		int[] num = new int[100];
//		for(int i=0;i<100;i++) {
//			num[i] = i+1;
//			System.out.println(num[i]);
//		}
//=---------------------------------------------
		//문제) 10개의 배열을 만들고 랜덤 숫자 1~10까지 숫자를 입력해서 출력하시오.
		int[] num = new int[10];
		for(int i=0;i<10;i++) {
			num[i] = (int)(Math.random()*10)+1; // random 숫자
			System.out.println(num[i]);
		}

	}// main

}// class
