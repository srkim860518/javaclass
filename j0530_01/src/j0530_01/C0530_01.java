package j0530_01;

import java.util.Scanner;

public class C0530_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Str  - 2.3 String 클래스의 생서자와 메서드 중요한것 
		
		System.out.println("복권을 입력하세요(예:1조1234567)");
		// 1조 1234567   1조와 1234567 분리 
		String input = scan.next();
		
		//subString(0,2)
		String output1 = input.substring(0,2);		
		String output2 = input.substring(2);
		int output3 = Integer.parseInt(output2);
		int random =(int)(Math.random()*10000000)+10000000;  //1000000-9999999
		
		System.out.println("랜덤생성 : "+random);
		System.out.println(output1);
		System.out.println("문자타입: "+output2);
		System.out.println("숫자타입: "+output3);
		
		// output2 숫자가 무엇인지 맞춰보세요.
		//Integer.parseInt(output2)
		//1245780 정수타입으로 변경후 for문을 써서 0-9999999까지 비교해보세요.
		
		//랜덤으로 1000000-9999999		
		for(int i=1000000;i<9999999;i++) {
			if(output3==i) {
			System.out.println("입력한 숫자 : "+i);
		 }//if
		}//for
		for(int i=1000000;i<=9999999;i++) {
			if(random==i) {				
			}
		}
		
		
		
//		String str = new String("abc"); // 클래스는 new 라는 생성자를 써야함
//		char ch = 'a';
//		char ch1 = 'b';
//		char ch2 = 'c';
//		
//		String str2 = "abc";  //String만 생성자 예외 처리 사용 가능
//		//charAt(0) 0번째거를 가져와라
//		
//		System.out.println(str.charAt(0)); // a
//		
//		String str3 = "abcdefg";
//		
//		String str4 = str3.substring(3,5);
//		System.out.println(str4);
//		
//		String str5 = "안녕하세요.반값습니다.";
//		System.out.println(str5.substring(2,5));
		
		
	}// main

}// class
