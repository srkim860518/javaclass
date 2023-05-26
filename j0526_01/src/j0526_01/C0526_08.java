package j0526_01;

import java.util.Scanner;

public class C0526_08 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		String str = "안녕하세요. 반갑습니다. 안녕하세요. 반가워요. 오늘은 불금 완전 좋음";
		
		System.out.println("찾고자 하는 문자를 입력해주세요.");
		String search = scan.next();

//		int searchNum = str.indexOf(search,0);
//		System.out.println("찾는 위치 : "+searchNum);
			
		int count =0; // 찾는 문자 개수
		int searchNum =-1;// 찾는 문자 위치
		while(true) {
			searchNum = str.indexOf(search,searchNum+1);// 찾는 위치 메소드
			if(searchNum !=-1){
				System.out.println("찾는 문자 위치 : "+searchNum);
				count++;		
			}else {
				System.out.println("더이상 찾는 문자가 없습니다.");
				break;

			}
		}
		System.out.println("======================");
		System.out.println("찾는 문자 개수"+count++);
		System.out.println("프로그램을 종료합니다.");

//		for(int i =0;str.length;i++) {
//			if() {
//				
//			}
//				
//			}
		
	}// main

}//class
