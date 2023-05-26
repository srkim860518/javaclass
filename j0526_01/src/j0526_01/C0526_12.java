package j0526_01;

import java.util.Scanner;

public class C0526_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 
		String lotto1 = "1";
		String lotto2 = "1조12587";
		//앞: 1-9조 뒤 : 00000-99999 
		// 0-9조 랜덤 숫자를 맞추는 게임을 구현하시오.
		// 랜덤 숫자를 int random
		
		int random= (int)(Math.random()*10);		
		System.out.println("랜덤번호 : "+random);

//		//입력숫자 : int myNum = 입력숫자, 1조 
//		System.out.println("숫자를 입력해주세요");
//		int myNum = scan.nextInt();
//		System.out.println("myNum: "+myNum);
//	
//		if(random==myNum) {
//			System.out.println("당첨");
//		}else {
//			System.out.println("꽝");
//			
//		}
		
		// 입력 -String type : 1조 
		System.out.println("조를 입력해주세요");
		String strNum = scan.next();// 
		String result = strNum.substring(0,1);
//		System.out.println(result);	
		//String strNum2 = strNum.substring(0,1);
		int myNum = Integer.parseInt(result);
		System.out.println("myNum: "+myNum);
	
		if(random==myNum) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
			
		}	
			
		
		
		
		
		
		
		
		
		//
		// 출력 
		
		
		
		

	}

}
