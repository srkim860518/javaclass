package j0508_01;

public class Class0508_03 {
	
	static int num = 10; // 전역 변수 - class영역에서도 변수 선언 가능
	                     // static int num;전역변수에 숫자를 지정하지 않으면 자동으로 0으로 자동셋팅
	
	public static void main(String[] args){
		int num = 0; // 지역 변수 , 변수 선언을 안하면 blank로 인식-->에러가 난다., 메소드(괄호안은=함수)는 반드시 값 지정해야함
		num=15;
		System.out.println("main메소드 num 호출: "+num);
		sub();
	} // main
		
	static void sub() { // sub는 main에서 sub를 실행시키고 
		//System.out.println(num); main을 벗어나서 쓸 수 없다. 
		System.out.println("main메소드 num 호출: "+num);
	}//main
}//class