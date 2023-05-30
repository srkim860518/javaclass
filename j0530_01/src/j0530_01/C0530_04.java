package j0530_01;

import java.util.Scanner;

public class C0530_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Str  - 2.4. 문자열과 기본형간의 변환 
		
		String str = "abc";
		str = str+"1"; // 동일 한 이름이지만 새로운 공간을 만들어 저장, 100번 돌리면 100개의 공간이 생김
		str = str="1";
		System.out.println(str); // 100번까지는 버퍼보다 이 방법으로 추천!! 100번까지는 
		
		int a = 0;
		a = a+1;  // 1개의 공간에서 연산 
		
		//3.StringBuffer  
		StringBuffer sb = new StringBuffer("abc");
		//sb  = sb +1
		sb.append(1);//abc1
		sb.append(1);//abc11
		System.out.println(sb);
		
		
	}// main

}// class
