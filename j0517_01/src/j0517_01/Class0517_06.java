package j0517_01;

import java.util.Scanner;

public class Class0517_06 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
	
		System.out.println("-------------");
		d.x= -change(d.x);  // x값이 없다. 
		System.out.println("change d.x : "+d.x); // 10
	}
		
		
		
		static int change(int x) {
			x=1000;
			System.out.println("x: "+x);
			return x;
		}
	
	
}	//class


































