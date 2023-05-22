package j0522_01;

public class C0522_08 {

		// 
		 
	static int cv =1; // 클래스 변수 - 객체선언없이, 클래스명.변수명
	int iv = 1;// 인스턴스변수 = 객체 선언 후 참조변수명.변수명
	
	static {
		cv=2; // 클래스 초기화 블럭 : 중괄호
	}
	{
	iv=2; // 인스턴스 초기화 블럭
	
	}
//	C0522_08(){ // 클래스생성자
//		iv=4;	
//		System.out.println("iv"+c.iv);
//	
	
	
public static void main(String[] args) {
	C0522_08 c = new C0522_08(); // 객체선언, 
//	iv=3;
//    c.iv=3;	// 참조변수.변수명 = 3;
    System.out.println("iv: "+c.iv); //static이 없음으로 변수명 바로 사용가능

    
 }//main

}//class
