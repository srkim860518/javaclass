package j0526_01;

public class Person {
	// equals, 
	long id; // 13자리 주민번호 8801011111111 // 21억이 넘어 int 사용 불가

	
	Person(){}
	Person(long id){
		this.id = id;
	}
	//---------------------C-526_04 적용 person p4,p5
	Person(Person p){
		this.id = p.id;
	}
	//----------------------C-526_04 적용---
	// 이퀄스는 정의 필수!!  
	public boolean equals(Object obj) {//현재의 오브젝트 p1--> -p3 // 데이터를 가지고 비교 
		Person p = (Person) obj;
		boolean chk = false;
		if(id==(p.id)) {
			chk = true; 
		}
		return chk; //
	}
	
	
//	public String toString() { // toString오브젝트에있는 메소드
//		String str = "주민번호: "+id;		
//		return str;
//}
	
}// class
