package j0519_01;

import java.util.Scanner;

public class C0519_05 {

	public static void main(String[] args) {
		String[] title = {"번호","국어","영어","수학","합계","평균"};
		// 합계, 평균을 계산해서 출력하시오
		int[] arr = new int[6];
	
	//합계,평균을 계산함.
	System.out.printf("번호 : %d \n",arr[0]);
	System.out.printf("국어 : %d ,영어 : %d, 수학 : %d \n",arr[1],arr[2],arr[3]);
	System.out.printf("합계 : %d \n",arr[4]);
	System.out.printf("평균 : %d \n",arr[5]);
	}// main

	
	static void input(int[] arr,String[] title) {// 주소값이 동일함. 이름은 같지만 서로 다른 것임
//		//입력을 받음
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.println(title[i]+"를 입력하세요.>>");
			arr[i] = scan.nextInt();
		}
		
		arr[4] = arr[1]+arr[2]+arr[3];
		arr[5] = arr[4]/3;
	}//input
}//class