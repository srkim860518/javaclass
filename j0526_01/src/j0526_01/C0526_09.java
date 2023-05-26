package j0526_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0526_09 { 

	public static void main(String[] args) {
		// 9장 2-3 String 클래스의 생성자와 메서드(3/3)
		Scanner scan = new Scanner(System.in);
		String str = "    aaa aaa aaa     ";
		String str2 = "bbb,bbb,bbb    ";
		System.out.println("현재 str : " + str);
		System.out.println("===================");
		String result = str.trim(); // trim : 앞뒤쪽 공백제거
		System.out.println("공백제거 str: " + result);
		String result2 = str2.replace("bbb", "abc");
		System.out.println("문자변경 str2 : " + result2);
		String result3 = str2.replace(","," ");
		System.out.println("사이띄우기 : "+result3);
		// str을 앞뒤 공백, 사이 공백을 모두제거해서 출력하시오
		String result4 = str.replace(" ", "");
		System.out.println("공백제거"+result4);
		String[] result5 = str2.split(",");
		
		System.out.println(Arrays.toString(result5));
		System.out.println(result5[0]);
		

//		String str = "    aaa aaa aaa     ";
//		System.out.println("현재 str : "+str);
//		System.out.println("===================");
//		String result = str.trim();
//		String str1 = str.trim(); // trim : 앞뒤쪽 공백제거
//		System.out.println("공배제거 str: "+str1);

	}// main

}// class
