package shopMall;

public class ShopMain {

	public static void main(String[] args) {
		System.out.println("[삼성 쇼핑몰]");
		System.out.println("1. QLED TV 70inch");
		System.out.println("2. 갤럭시 북");
		System.out.println("3. 홈 미니 블루투스 스피커");
		System.out.println("------------------------");
		System.out.println("구매하고 싶은 번호를 입력하세요.");
		
		//id, pw 확인
		Buyer b = new Buyer("hong","홍길동","길동스");
		
//		Tv t = new Tv();
//		Computer c = new Computer();
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		
	
		//Computer
		b.buy(new Computer());
		b.buy(new Speaker());
		
		
		//Class Washer 그랑데 세탁기 120, 12,10
		b.buy(new Washer());
		
		System.out.println("잔액 : "+b.money);
		System.out.println("구매개수 : "+b.list.size());
	
//		System.out.println("구매 : "+s.ProductName);
//		System.out.println("nickName: "+b.nickName);
//		System.out.println("id : "+b.id);
//		System.out.println("name: "+b.name);
//		System.out.println(" : "+ t.ProductName);
		// 배열은 for 문을 쓴다. 
		
		// 구매 목록 메소드 호출
		b.buylist();

	}
}