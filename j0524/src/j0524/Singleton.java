package j0524;

public class Singleton {

	private static int num;  // 현재 num = 10 
	
	// 같은 클래스 내에서만 s를 사용할 수있음.
	private static Singleton s = new Singleton(); // s는 공용 사용 가능, 객체 선언 없이 사용 가능
	
	
	private Singleton() {
		num=10;
		
	} //private 같은 클래스 내에서만 생성 가능

	//getInstance 인스턴스 메소드(static이 없음) - 리턴타입: Singletone클래스
	static Singleton getInstance() { 
		if(s==null) { // 조건 만약 s가 null이면 
			s = new Singleton(); // 객체선언을 다시함
		}
		
		return s;
	}
	

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Singleton.num = num;
	}

}//class
