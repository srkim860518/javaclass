package j0525;
 
public class C0524_04 {

	public static void main(String[] args) {
		// 인터페이스
		
		Tank t1 = new Tank(); // 객체선언
		Marine m1 = new Marine();
		Tank t2 = new Tank();
		Marine m2 = new Marine();
		Scv s1 = new Scv();
		Vulture v1 = new Vulture();

		t1.hitPoint-=10;// 총 , 140 = 150-10
		t1.hitPoint-=10;// 130 = 140-10
		System.out.println("현재체력: "+t1.hitPoint);
		s1.repair(t1);
		
		System.out.println("수리완료 후 체력: "+s1.hitPoint);
		
		t1.hitPoint -= 10;
		t1.hitPoint -= 10;
		t1.hitPoint -= 10;
		System.out.println("t1.hitPoint: "+t1.hitPoint);
		System.out.println("t1.hitPoint: "+t1.hitPoint);
		System.out.println("t1.hitPoint: "+t1.hitPoint);
		s1.repair(t1);
		System.out.println("수리완료 후 체력 : "+t1.hitPoint);
		
		v1.hitPoint -= 10;
		v1.hitPoint -= 10;
		System.out.println("현재체력: "+v1.hitPoint);
		s1.repair(v1);
		System.out.println("수리완료 후 체력 : "+v1.hitPoint);
	}

}
