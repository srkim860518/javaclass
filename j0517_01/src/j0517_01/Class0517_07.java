package j0517_01;

import java.util.Scanner;

public class Class0517_07 {

	public static void main(String[] args) {
		//Tv
		// 객체 선언
		 Tvv t1 =new Tvv();
		 Tvv t2 =new Tvv();
		 
		 t1.channel=7;
		 System.out.println("Tvv t1 channel : "+t1.channel);
		 
		 t2.channel=8;
		 System.out.println("Tvv t2 channel : "+t2.channel);

		 t2																								=t1;
		 System.out.println("t2 channel : "+t2.channel);

		 t2.channel=0;
		 System.out.println("Tvv t1 channel : "+t1.channel);

				 
	
		}
	
	
}	//class


































