package j0525;

public class Unit {
	// 인터페이스
	
	
	int hitPoint; //현재 체력 70
	final int MAX_HP; // 체력의 최대값: 100, 체력의 한계치 
	
	Unit(){
		MAX_HP = 10;
	}
	
	Unit(int hp){
		MAX_HP = hp;
	}
	
}
