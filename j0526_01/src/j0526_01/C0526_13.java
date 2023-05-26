package j0526_01;

import java.util.Scanner;

public class C0526_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 
		String lotto1 = "1";
		String lotto2 = "1조12587";
		
		//앞: 1-9조 뒤 : 00000-99999 
		// 0-9조 랜덤 숫자를 맞추는 게임을 구현하시오.
		// 랜덤 숫자를 int random
		
		int random= (int)(Math.random()*10); //	0-9조
		int random2 =(int)(Math.random()*10000);//0-99999
		String strRandom=String.format("%05d",random2);// 0을 5개를 채워라,/00000,09999,99999
		System.out.println("랜덤번호 : "+random);
		System.out.println("str랜덤번호 : "+strRandom);
		
		
		// 입력 -String type : 1조 
		System.out.println("조앞의 숫자와 5자리 숫자를 입력해주세요(예:1조12587)");
		String strNum = scan.next("");// "1조 12587
		
		// 핵심!! 여기가 중요
		int myNum = Integer.parseInt(strNum.substring(0,1));//입력받은 문자열 1을 숫자1로 변경
		System.out.println("[조단위]");	
		if(random==myNum) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
			
		}	
			
		//5자리 확인
		String myNum2 = strNum.substring(2,3);
		String strRandom2 = strRandom.substring(0,1);
		System.out.println("[5자리 숫자 비교]");
		if(myNum2.equals(strRandom2)) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
		
		
		
		
	}

}
