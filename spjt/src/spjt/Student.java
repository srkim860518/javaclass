package spjt;
 
public class Student {
	// 성적처리
	static String[] title = {"학번","이름","국어","영어","수학","합계","평균","순위"};
	
	static int count=1000; // count는 1000번부터 시작
	int stuNo; //클래스 변수 객체 선언없이 클래스명.변수명
	String name; //클래스 변수 객체 선언없이 클래스명.변수명
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{
		count++;// 앞,뒤 어디에 넣어도됨, 줄을 나눴기  때문에 
		stuNo =count; // 객체선언할때마다 증가(배열 수만큼 10)
		
	}

	Student(){} // 기본 생성자 - 클래스명과 일치, void 없음.
	Student(String name, int kor, int eng, int math){// 생성자
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.total = kor+eng+math;
			this.avg = this.total/3.0;
			
		
	}
}
