package j0523_01;

public class Card {  //tip : static 지정후 ; 안하면 줄바꿈이 kind에 진행이 되어 문자형이 자동으로 바뀌게 됨 오류인식일수 있으니 내용 추가 해주세요
	
	
	
	static String[] kinds = {"Space","Heart","Diamond","Clover"};
	static String[] numbers = {"0,","1","2","3","4","5","6","7","8","9","10","J","Q","k"};
	
//    String[] kind = {"Spade","Heart","Diamond","Clover"};
//	 String[] number = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	// 연관이 있으면 s를 붙여줌 number, numbers
	
	String kind; // 무늬: 하트,스페이드,다이아몬드,크로버
	int number; // 숫자-1,2,3,4,5,6,7,8,9,10,11-J,12-Q,13-K	
	
	Card(){
	//	this("Space",1); // this는 다른 생성자 호출
		} // 기본 생성자 
	
	Card(String kind){
		this.kind = kind;
	}
	
	Card(String kind, int number){ //생성자
		this.kind = kind;
		this.number = number;
	}
	
	
	// 오브젝트 클래스 : to String의 기능:
	//오브젝트 클래스는 모든 클르스가 상속받게 된다.
@Override
public String toString() {
	String str = kind+","+number;
	return kind;
}
}
