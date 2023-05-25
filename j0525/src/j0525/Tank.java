package j0525;

public class Tank extends GroundUnit implements Repairable {
	// 인터페이스
	
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
}
