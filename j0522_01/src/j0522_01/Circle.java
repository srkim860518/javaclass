package j0522_01;

public class Circle extends Shape {// 
	// 상속

// 다른 클래스를 사용하려면 객체선언후 참조변수명.변수명
	Point center;// 참조변수를 받을 수 있는 주소변수만 변경
	int r;  // 인스턴스 변수 - 객체선언 후 참조변수
	
	Circle(){ // 기본생성자- 
		this(new Point(0,0),100);
	}
	
	Circle(Point center, int r){ // Circle c2 = new Circle(center,50);
		this.center = center; 
		this.r=r;
	}
	
	void draw() {
		System.out.println();
	}
	
	
	
}//class
