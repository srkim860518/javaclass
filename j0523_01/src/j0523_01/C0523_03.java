package j0523_01;

import java.util.Date;
import java.util.Scanner;

public class C0523_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date today = new Date();
	
		// 7. 객체 지향개념 2 // 1.5 오브젝트 클래스
		Card c = new Card("Space", 1);


		Card c2 = null;
		Deck d1 = new Deck();

		// c2= d1; // 타입이 다르기에 넣을 수 없다.

		Object o = null;

		o = d1; // 조상과 자손이라는 관계가 맺어져서 가능함. ** 관계일 경우만 가능

		c2 = c; // 같은 타입이면 넣을 수 있음.

		int a = 5;
		String str = null;
		// str = a; // 타입이 다르기에 넣을 수 없음.

		System.out.println(c);
		
		int num = 5;
		num = 10;
		final int number=1; // 변수와 구별이 어려움으로 final + int + Number(대문자)로 적워주면 구별이 됨,
//		number=5;
		
	

//	static void add() { // error
//}
//	static void add() {
//	}
	}
}
