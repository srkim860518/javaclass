package j0522_01;

public class Point {
	// 상속
	int x; // 인스턴스 변수 - 객체선언후 참조변수명.변수명
	int y; // 인스턴스 변수 - 객체선언후 참조변수명.변수명
	
	Point(){ // 생성자 - 클래스명과 일치, void 없음
		this(0,0); 
	}
	
	Point(int x, int y){ // 생성자 - 클래스명과 일치, void없음.
		this.x = x; // this: 인스턴스 변수 x:지역변수-메소드 내, 메소드를 벗어나면 주소값만
		this.y = y;
	}
	
}//class
