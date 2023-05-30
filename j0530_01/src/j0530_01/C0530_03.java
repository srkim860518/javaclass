package j0530_01;

import java.util.Scanner;

public class C0530_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//대소문자 필수로 알아두기 
		String str = "ABCDEF";
		System.out.println(str.toLowerCase()); // 대소문자->소문자 변환기
		String str2 = "abcdef";
		System.out.println(str2.toUpperCase());//소문자->대문자 변환기
		
		
		
		//Str  - 2.3 String 클래스의 생성자와 메서드 중요한것 
		// 소문자를 대문자로 출력하시오 a= 97, A=65, 0=48
//		System.out.println("영문소문자를 입력하세요");
//		char input = scan.next().charAt(0);
//		System.out.println("입력한 문자: "+input);
//		char output = (char)(input-32); //형변환 : char
//		System.out.println("대문자: "+output);
		
		//소문자->대문자, 대문자->소문자 출력하시오.
//		
//		 System.out.println("영문자를 입력하세요");
//		 char input1 = scan.next().charAt(0);
//		 System.out.println("입력한 문자: ");
//		 if(input1>='a'&&input1<='z') {
//			 // 소 -> 대
//		 }else if(input1>='A'&& input1<='Z'){
//			 //대->소
//		 }else {
//			 System.out.println("잘못 입력하였습니다.");
//		 }
//		System.out.println("영문자를 입력하세요");
//		char input =scan.next().charAt(0);
//		char output = ' ';
//	
//
//		
//		 if((('a'<=input) && ('z'>= input))==true) {//소문자 입력
//			 output = (char)(input-32);
//		 }else if ((('A'<=input)&&('Z'>=input))==true) {
//			 output = (char)(input+32);
//		 }else {
//			 System.out.println("잘못 입력하셨습니다.");
//		 }
//		 
//		 System.out.println("입력한 문자: "+input);
//		 System.out.println("입력한 문자: "+output);
		 
	 
		System.out.println("영문자를 입력하세요");
		String input =scan.next();
		String output = "";
		char temp = ' ';
		
		for(int i = 0;i<input.length();i++) { 
			temp = input.charAt(i); // 핵심 : i를 뽑아서 출력할 수 있는지가 중요!!!
			System.out.println(temp);
		
			 if((('a'<=temp) && ('z'>= temp))==true) {//소문자 입력
				 output = output+(char)(temp-32);
			 }else if ((('A'<=temp)&&('Z'>=temp))==true) {
				 output = output+(char)(temp+32);
			 }else {
				 System.out.println("잘못 입력하셨습니다.");
			 }
		}
		 
		 System.out.println("입력한 문자: "+temp);
		 
		 
		 
		 
		 System.out.println("대소문자 변환: ");

		
		
		
		//switch는 true일때만 사용 , 속도는 빠르나 if문 조건 사용 범위가 넓어 if문을 더 자주 사용
//		//switch 문 
//		switch(output) {
//		case "fifamobile":
//			System.out.println("fifamobile 페이지를 열어줍니다.");
//			break;
//		case "asgard":
//			System.out.println("asgard 페이지를 열어줍니다.");
//			break;
//		case "GodzillaDF":
//			System.out.println("GodzillaDF 페이지를 열어줍니다.");
//			break;
//		}//switch
		
		
		
	}// main

}// class
