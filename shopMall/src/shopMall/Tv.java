package shopMall;

public class Tv extends Product {
  
	int inch = 70; // 기본값 : 70
	String color = "black";
	
	Tv(){// 생성자
	  productName = "QLED";
	  price = 150;
	  bonusPoint = 15;
	  sale =10; // 10%
  }// tv
	
	public String toString() {
		return "구매 : "+productName;
	}
	
}// class
