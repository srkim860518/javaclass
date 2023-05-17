package j0516_01;

public class Student {
// 객체	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void sum() { // 합계 메소드
		total = kor+eng+math;
	}
	
	void average() {
		avg = total/3.0;
	}
	
}// class





