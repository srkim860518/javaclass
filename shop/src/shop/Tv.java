package shop;

public class Tv extends Product{
	
	int ichi = 70;
	String color = "black";
	
	Tv(){// 생성자		
		productName = "QLED";
		price = 150;
		bonusPoint = 15;
		sale = 10;
	}
	@Override
	public String toString() {
		return "구매: "+productName;
	}

}// class
