package j0525;

public class C0525_05 {

	public static void main(String[] args) {
		// 인터페이스의 이해
		A a = new A(); //객체선언 
		a.methodA(new SuperB());// B클래스의 a메소드 불러옴
	}

}
