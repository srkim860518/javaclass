package j0522_01;

import java.util.Scanner;

public class C0522_09 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 객체선언후
		// serialNo=1
		 Product p1 = new Product();
		 System.out.println("p1 count : "+p1.count);
		 System.out.println("p1 searialNo : "+p1.serialNo);
		 
		 
		 //serian no = +++
		 Product p2 = new Product();
		 System.out.println("p2 count : "+p2.count);
		 System.out.println("p2 searialNo : "+p2.serialNo);
		 
		 // int count =0;
		 // int serialNo=0;
		 // 초기화 블럭: count=1;, serialNo = 1;
		 // 생성자 : 
		 Product p3 = new Product();
		 System.out.println("p3 count : "+p3.count);
		 System.out.println("p3 serialNo : "+p3.serialNo);
    
		 //p1.count 얼마일까요?
		 System.out.println("p1 count : "+p1.count);//주소값
		 
		 // int count =0
		 // int serialNo = 0;
		 
 }//main
}//class
