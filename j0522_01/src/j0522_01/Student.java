package j0522_01;

public class Student {
	// C0522_10에서 진행
	static int count=1000; // 클래스 변수// 1000번부터 시작
	int stuNo; // 예시 "2023"+ 17번줄 = 2023011001
	String name; // 인스턴스변수
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	{//초기화 블럭- 자주 사용하지 않음 이정도 있다는 것만 알고 있으세요.
//--------------------------------------------------
//		stuNo = "20230101"+  count; // 2023 101 1001
//		stuNo = "2023"+String.format("%4d", 1); // 2023 101 1001
//		stuNo = " "+count; //1001,1002,1003,1004.......증가 하려면 위에 int--> String stuNo로 변경해야함.
//---------------------------------------------------
		++count; // 1증가 하면 count는 1001
		stuNo = count; //1001,1002,1003,1004.......증가 
	}
	
	Student(){
//		++count; // 1증가 하면 count는 1001
//		stuNo = count; //1001,1002,1003,1004.......증가 
	}
	
	Student(String name, int kor, int eng, int math){// 
	 this.name = name; // 인스턴스 변수로 생성
	 this.kor = kor;
	 this.eng = eng;
	 this.math = math;
	 
	 // 객체선언+매개변수가 있는 생성자 호출
	 this.total = kor+eng+math;
	 this.avg = this.total/3.0;
	}
	
}//class
