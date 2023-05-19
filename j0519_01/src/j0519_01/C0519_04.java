package j0519_01;

import java.util.Scanner;

public class C0519_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 번호,국영수 점수를 입력받아, calculate() 합계, 평균을 구해서 return
		// 번호,국영수,합계,평균 - int
		String[] title = {"번호","국어","영어","수학","합계","평균"};
		int[] arr = new int[6]; // 인스턴트 배열
		for(int i=0;i<4;i++) {
			System.out.println(title[i]+"를 입력하세요.");
			arr[i]= scan.nextInt();			
		}//for
		
		//calculate()메소드 호출 : 합계,평균을 계산함.
		calculate(arr); // 2가지 참조형 변수
		
		System.out.printf("번호 : %d \n", arr[0]);
		System.out.printf("국어 : %d ,영어: %d ,수학: : %d \n",arr[1],arr[2],arr[3]);
		System.out.printf("합계: %d \n",arr[4]);
		System.out.printf("평균: %d \n",arr[5]);
		
			}// main
	
	static void calculate(int[] arr) { //int[] arr인스턴트변수 변수명
		// 국어 arr[1],영어[2],수학[3]
		arr[4]=arr[1]+arr[2]+arr[3];
		arr[5]=arr[4]/3; //int라서 3 , 3.0이 아닌 소수점 버림
		
	}//void
	
}//main



	








