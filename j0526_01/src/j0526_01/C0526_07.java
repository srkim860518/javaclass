package j0526_01;

import java.util.Scanner;

public class C0526_07 {

	public static void main(String[] args) {
		// 2.3 String 클래스의 생성자와 메소드
		Scanner scan = new Scanner(System.in);
		
		System.out.println("찾고자하는 문자를 입력하세요.");
		String search = scan.next();
		String str1 = "홍길동 홍길순 홍길자 이순신 강감찬 유관순 김구 김유신";
		
		//
		String str2 = "https://semiconductor.samsung.com/kr/dram/ddr/.jsp"; 
		String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology/.jsp";
		//https://semiconductor.samsung.com/kr 한국 사이트/주소 : dram(폴더)/ddr(파일명)/.jsp(파일명:자바웹파일명)
		
		// endswith 확인
		if(str2.endsWith("jsp")) { // jsp로 끝나면
			System.out.println("jsp로 끝납니다.");
		}else {
			System.out.println("jsp로 끝나지 않습니다.");
		}
		
		
		
		//contains - 문자열 내에 문자가 있는지 확인
//		if(str1.contains(search)) {
//			System.out.println(search+"길자라는 글자가 있습니다.");
//		}else {
//			System.out.println(search+"길자라는 글자가 없습니다.");
//			
//		}
			
	}//main

}
