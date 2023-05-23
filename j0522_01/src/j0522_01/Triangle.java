package j0522_01;

// 삼각형 - 점이 3개 임으로 배열로 받아요
public class Triangle extends Shape {
	Point[] p; //인스턴스 변수- 객체선언후 참조변수명. 변수명
	
	Triangle(Point[] p){ //생성자 -클래스명 일치, void없음
		this.p = p;
			
	}
	
	Triangle(Point p1,Point p2, Point p3){ //생성자 -클래스명 일치, void없음
//		  Point[] p = {p1,p2,p3}; //동일
		p = new Point[]{p1,p2,p3};
	}

	
	
	
	
	
	

	
	
}//class
