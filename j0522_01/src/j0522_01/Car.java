package j0522_01;

public class Car {
	
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",4);
//		color = "white";
//		gearType= "auto";
//		door = 4;
	}
	
	
	Car(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
		
	Car(Car c){ // Car라는 객체 변수 받음, 다른 생성자 
		color =c.color;
		gearType=c.gearType;
		door =c.door;
	}
	
}//class
