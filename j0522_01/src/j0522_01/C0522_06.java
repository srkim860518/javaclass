package j0522_01;

import java.util.Scanner;

public class C0522_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Car class 변수를 불러옴 
//		// Car- 기본 생성자 사용 : color, gearType,door
		
		//기본생성자 객체 선언
		Car c = new Car(); 
		
		System.out.println("color: "+ c.color);
		System.out.println("gearType: "+c.gearType);
		System.out.println("door: "+c.door);
		System.out.println("--------------");
		
		// 매개변수가 있는 생성자사용 red auto 5출력하시오.
		
		//객체선언 - 매개변수있는 생성자 : (매개변수 개 수 맞춰서 입력)
		Car c2= new Car("red","auto",5);
		System.out.println("color: " + c2.color);
		System.out.println("gearType: " + c2.gearType);
		System.out.println("door: " + c2.door);
		System.out.println("--------------");
		
		//c2 red, auto, 5
		//객체 복사  확인 !! /Car(car c)
		// 참조변수 선언
//		Car c3 = null; // null 아무것도 없다.
//		
//		//복사 
//		c3=c2; // 주소만 복사함, 서로 바라보고 있기 때문에 
//		c3.color = "blue";
//		
//		System.out.println("c2: "+c2.color);
//		System.out.println("c3: "+c3.color);
//		System.out.println("--------------");
		
//=====================================================				
		
		// 객체선언
		//다른 객체를 복사 할때 사용      확인 !! /class Car(car c) 객체 변수 확인
		Car c3 = new Car(c2);
		// c2와 ㅊ3의 공간은 완전 다름 
		// c2-> blue로 바뀌면 c3는 변경이 안됨. 
		 c3.color = "blue";
		 c3.gearType = "stick";
		 c2.door=3;
		 
		 //c3 = blue, stic, 3		 
		 Car c4 = new Car(c3); 
		// c4 = yellow, auto , 4
		 // 프로그램 만들때 한글, 포토샵 프로그램에 사용, 현업에서는 거의 사용하지 않음 
		 // c4 = yellow, auto , 4
		 c4.color = "yellow";
		 c4.gearType="auto";
		 c4.door=4;
				
		
				 
		 
 }//main
}//class
