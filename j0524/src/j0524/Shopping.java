package j0524;

public class Shopping {
	public static void main(String[] args) {
		
		System.out.println("[ 쇼핑몰 프로그램 ]");
		System.out.println("1. Stv");
		System.out.println("2. Computer");
		System.out.println("3. Audio");
		System.out.println("====================");
		System.out.println("구매하고 싶은 번호를 입력하세요.");
		
		//class객체선언
		Buyer b = new Buyer();
	   // 동일	Stv s = new Stv();
	   // buyer 구매 b.buy(s);
		b.buy(new Stv());  
		b.buy(new Stv());	//tv 추가 구매			

		System.out.println("b.잔액: "+b.money); // = 150
		System.out.println("b.보너스: "+b.bonusPoint);
		System.out.println("--------------------------");		
	    
		// buyer  - computer 구매
		b.buy(new Computer()); // new computer를 넣으면 객체 선언 별도 안해도 됨
		b.buy(new Audio());
			
		System.out.println("b.잔액: "+b.money); //b.money = 200+350
		System.out.println("b.보너스: "+b.bonusPoint); // = 20+5
		System.out.println("--------------------------");
		
		
		
		
		
		
	}	//main
 }// class
