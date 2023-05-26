package j0526_01;

public class C0526_04 {
	//equals + person 클래스
	public static void main(String[] args) {
		Person p =new Person(8801011111111L); // 8801011111111L long은 L 접미사 넣어줘야함 
		Person p1 =new Person(8801011111111L);
		Person p2 =new Person(8801011111111L);
		Person p3 =new Person(8801011111111L);
		
		Person p4 = new Person(p1); // 공간분리,깊은 복사,객체 생성
		Person p5 = p3;              // 주소 복사, 얕은 복사
		
		
		System.out.println(p4.id);
		
		System.out.println(p1);
		System.out.println(p3);
		
		if(p1.equals(p3)) { //  
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	
	
	
	} ///main
	

}//class
