package j0524;

import java.util.Scanner;

public class C0524_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//
		Car c = new Car();
		Car cc = null;
		Ambulance a = new Ambulance();
		Ambulance aa = null;
		FireEngine f = new FireEngine();
		FireEngine ff = null;;
		
		//다형성
		Car c2 = new Ambulance();
		Car c3 = new FireEngine();
		
		a.siren();
		f.water();
		//c2.siren(); 안됨: 부모에는 siren()주소가 없음->사용 불가
		//c3.water(); 안됨: 부모에는 water()주소가 없음->사용 불가
		aa = (Ambulance)c2;  //강제 형변환
		aa.siren();
		
		// 중요 개념 : 다른 자손의 형변환은 안됨.
		// aa = (Ambulance)c3; // 구문으로는 입력이 되지만 실행은 안됨.
		
		//자손 참조변수로 부모의 객체를 다루것은 안됨.
		//aa = (Ambulance)c; 
		//Ambulance aa = new Car(); 다형성인것만 부모-> 자손으로 형변환으로 옮길수있음 , 다형성이 아님  
		// aa.siren();  // error 자손의 객체가 있어야만 가능
		
	}//main

}//class
