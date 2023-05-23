package j0523_01;

public class C0523_05 {

	public static void main(String[] args) {
		// 12시 50분 52초를 입력하고 
//		Time t = new Time();// 기본생성자
		Time t = new Time(12,50,52); // 매개변수가 있는 생성자를 공간생성 및 호출
		
		
//		t.hour=13;
	//	t.setHour(10);
		
		//12시를 출력하시오.
		System.out.println("Hour: "+ t.getHour());// //hour의 변수값을 읽어오는 메소드
		System.out.println("Minute: "+t.getMinute());
		System.out.println("Second: "+t.getSecond());
		
		t.setHour(22);
		System.out.println("Hour: "+t.getHour());
		
	}

}
