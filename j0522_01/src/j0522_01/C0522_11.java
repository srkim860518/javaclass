package j0522_01;


public class C0522_11 {
	public static void main(String[] args) {
// 원을 만드는 방법
		// c1에는 
		// point cent = new point(0,0);
		//x=0,y=0;
		//int r=100; 
		// 위 값이 들어가 있다. 
		
		// circle 객체 선언 
		Circle c1 = new Circle(); // shape의 point center, int r 호출
		Point center = new Point(150,150);
//		Circle c2 = new Circle(center,50); // 50은 임으로 넣어줌
//		= 위와 동일하게 저장하여 사용 하는 방법 Circle c2 = new Circle(new Point(150,150),50);
		// c2 변수에 저장된 값 = x=150,y=150, r=50
		
//		int a = 10;
//		int b = 5;
//		int sum = a+b;
//		Point P = new Point(sum);
		
//		
//		int[]x = {1,2,3,4};// x[1] = 2
//		int y = 10;
		// 삼각형 좌표 3개
		Point[] p = { new Point(100,100), new Point(140,50),new Point(200,100)}; // 기본생성자 좌표(100,100) 
//		
		// 객체선언
		Triangle t = new Triangle(p); // p는 데이터를 보내야함.
		Triangle t2 = new Triangle(p[0],p[1],p[2]);

		
		
		
		
		
 }//main
}//class
