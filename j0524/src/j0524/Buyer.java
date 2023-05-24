package j0524;

public class Buyer {

	int money = 1000;
	int bonusPoint = 0;

	Product[] cart = new Product[10]; // 구매 목록은 10개까지만 확인 가능

	// Stv s = new Stv();
	// Product p = new Stv();
	// Product p = new Computer();
	// Product p = new Audio();

	int count = 0;

	void buy(Product p) {
		money = money - p.price; // 가격 150
		bonusPoint = bonusPoint + p.bonusPoint;
		cart[count] = p; // count : 구매한 물건 개수, 0번째 방부터 넣기
		count++;
	}

	
		

//	void buy(Computer c)
//	{
//		money = money - c.price; //가격 200
//		bonusPoint = bonusPoint +c.bonusPoint;			
//	}
//	
//	void buy(Audio a) {
//		money = money - a.price; //가격 200
//		bonusPoint = bonusPoint +a.bonusPoint;
//	}

}// class
