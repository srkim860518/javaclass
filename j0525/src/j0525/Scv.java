package j0525;

public class Scv extends GroundUnit implements Repairable {
	//인터페이스
	//Scv는 기계를 수리할 수 있다.
	
	Scv(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable g) {
		// Repairable g = new Tank(); //다형성
		Unit t = (Unit)g;
		
		
		while(t.hitPoint !=t.MAX_HP) {  
			// while 무한 루프 : g.hitPoint가 !=g.MAX_HP: 150이 아니면 무한루프 증감,
			//  max 150이 될 때 무한루프 탈출 --> 프린트(수리 완료되었습니다.)
			t.hitPoint++;		
			}
		
		System.out.println("수리가 완료되었습니다."); 
	}
	



}//class
