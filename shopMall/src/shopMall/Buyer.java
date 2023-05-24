package shopMall;

import java.util.ArrayList;

public class Buyer {

	Buyer(){}
	Buyer(String id, String name, String nickName){
		this.id = id;
		this.name = name;
		this.nickName = nickName;
	}
	
	// 배열
	// Product[] cart = new Product[10]; //cart는 구매 목록 확인하기 위함, 10개 이상 구매 불가
	//cart[0]=p;
	//collection
	// 제너릭 = 지네릭스를 쓰는 이유는 : 특정 타입만 들어오게 하기 위해 사용
	ArrayList<Product> list = new ArrayList(); // Product와 관련된것만 들어올 수 있다.
//	ArrayL<E> list = new ArrayList<>();
	
	//cart[i] = p, list.add(p); 객체추가 // type : 오브젝트-> Object o = new Product(); 
	//cart[0] = , list.get(0) 읽어오기
	//cart.length, list.size : 총 개수
	
	
	String id;
	String pw;
	String name;
	String nickName;
	
	int money = 10000;
	int bonusPoint = 0;
	
	void buylist() {
		System.out.println("구매목록: ");
		for (int i = 0; i < list.size(); i++) {
			Product p = list.get(i); // Object	
			if(i==0) 
				System.out.print(p.productName);
			else 
				System.out.print(","+p.productName);
		}//for
		System.out.println();
	}
	// 다형성
	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("보유금액이 부족해서 상품을 구매할 수 없습니다.");
			return;
		}
		money = money - p.price; // tv의 가격을 빼고 다시 money에 넣음
		bonusPoint = bonusPoint + p.bonusPoint; //현재 보너스에 추가해서 다시 보너스에 넣음.
		System.out.println("구매: "+p.productName);
		list.add(p);//list에 데이터 추가// cart count 0번 부터 		
	}
	
	
	
//	
//	void buy(Tv t) {
//		money = money - t.price; // tv의 가격을 빼고 다시 money에 넣음 
//		bonusPoint = bonusPoint + t.bonusPoint;// 현재 보너스에 추가해서 다시 넣음
//		
//	} //buy
//	
//	void buy(Computer c) {
//		money = money - c.price; // tv의 가격을 빼고 다시 money에 넣음 
//		bonusPoint  = bonusPoint + c.bonusPoint;// 현재 보너스에 추가해서 다시 넣음
//		System.out.println(c.ProductName);// 오버라이딩이 안되었기 때문에 c.ProductName으로 넣어줌
//	}
//	
//	void buy(Speaker s) {
//		money = money - s.price; // tv의 가격을 빼고 다시 money에 넣음 
//		bonusPoint  = bonusPoint + s.bonusPoint;// 현재 보너스에 추가해서 다시 넣음
//		System.out.println(s.ProductName);
//	}
//	
//	void buy(Washer w) {
//		money = money - w.price;
//		bonusPoint = bonusPoint + w.bonusPoint;
//		System.out.println(w.ProductName);
//	}
//	
}//class
