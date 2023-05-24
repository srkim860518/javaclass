package j0518_01;

public class Class0518_10 {

	int iv;
	static int cv;
	
	void i_Method() {		
		System.out.println(iv);
		System.out.println(cv);
	}

	static void c_Method() {
		//System.out.println();	
		System.out.println(cv);
		
	}
	public static void main(String[] args) {
		Class0518_10.cv = 50; // class명.변수명  main내 이런 변수는 없다.  일부러 넣어둠 
		System.out.println(cv);

		Class0518_10 c = new Class0518_10();// 객체선언
	    c.iv = 100;
		System.out.println(c.iv);
		
		

	}

}
