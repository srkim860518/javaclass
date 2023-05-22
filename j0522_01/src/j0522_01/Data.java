package j0522_01;

public class Data {
	//6-3 생성자
	
	
	Data(){ // 기본 생성자 변수명(){} 자동으로 만들어짐, 
	// 같은 클래스 내 다른 생성자를 호출 this()
		this(1,1); //num1,num2를 초기화
	}
	//매개변수를 받는 생성자, 초기화
//	Data(int n1,int n2){ // 생성자 : 매개변수 2개 \
		// 아래와 비교 data를 어떻게 입력할지 수식을 넣어
//		num1 = n1;
//		num2 = n2;
//		data1 = num1+num2;
//		data2 = num1-num2;
//		data3 = num1*num2;
//		data4 = num1/num2;
//	}
	Data(int num1,int num2){ 
	//클래스 내 인스턴스 변수를 가리킴
	this.num1 = num1;
	this.num2 = num2;
	this.data1 = num1+num2;
	//(=인스턴스변수)  (=지역변수) 
	this.data2 = num1-num2;
	this.data3 = num1*num2;
	this.data4 = num1/num2;
	}
		//매개변수를 받는 생성자 = Data(int n1,int n2){를 풀어서 쓴다면 아래 내용과 같이 객체 선언을 해야함.일일히 생성해야함}
//		d[i] = new Data();
//		d[i].num1 = n1;
//		d[i].num2 = n2;
//		d[i].data1= d[i].num1+d[i].num2;
//		d[i].data2= d[i].num1+d[i].num2;
//		d[i].data3= d[i].num1+d[i].num2;
//		d[i].data4= d[i].num1+d[i].num2;
	
	// data 입력 안되어 있음, 
	
	int num1; // 입력받을 1번째 숫자
	int num2; // 입력받을 2번째 숫자
	int num3;
	int num4;
	
	int data1; // 두수 더하기
	int data2; // 두수 빼기
	int data3; // 두수 곱하기
	int data4; // 두수 나누기
	
	

} // class
