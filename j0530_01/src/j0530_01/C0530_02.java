package j0530_01;

import java.util.Scanner;

public class C0530_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Str  - 2.3 String 클래스의 생성자와 메서드 중요한것 
		
		
		String domain = "https://forum.nexon.com"; //길이 
		String url = "https://forum.nexon.com/fifamobile";
		
//		String[] files = {"fifamobile","asgard","GodzillaDF","csonline"};
		String[] files = {"fifamobile","asgard","GODZILLADF","csonline"};
				
		System.out.println("파일명 : "+url.substring(domain.length()));   // 파일명 : /fifamobile/
		//url에 있는 도메인의 자리수 만큼 잘라서 출력
		System.out.println("파일명1 : "+url.substring(domain.length()+1)); 
		                   // 파일명 : fifamobile/ // domain.length()+1을 하면 1자리 뒤로 이동해서 마지막까지 출력
		String output = url.substring(domain.length()+1);
		
		System.out.println("파일명2: "+output); // switch문 출력
		//for문
//		for(int i=0;i<files.length;i++) {
//			if(files[i].equals(output)) {
//				System.out.println("files의 "+(i+1)+"몇변째 주소에 있습니다.");
//	}
//}
		//file 배열에 1에 있습니다.
		//switch 문
		if(output.equalsIgnoreCase(files[0])) {
		System.out.println("fifamobile 페이지를 호출합니다.");		
		}else if(output.equalsIgnoreCase(files[1])) {
			System.out.println("fifamobile 페이지를 호출합니다.");		
		}else if(output.equalsIgnoreCase(files[2])) {
			System.out.println("fifamobile 페이지를 호출합니다.");		
		}else{
			System.out.println("csonline 페이지를 호출합니다.");
		}
		
		
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
