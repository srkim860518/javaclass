package shopMall;

public class Washer extends Product {

	int size =  21;
	String color = "White";
	
	Washer(){
		productName = "그랑데 세탁기";
		price = 120;
		bonusPoint = 12;
		sale = 10;
		
	}
	public String toString() {
		return "구매 : :"+productName;
	}
}
