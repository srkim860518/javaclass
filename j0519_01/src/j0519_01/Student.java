package j0519_01;

public class Student {
	
	// 기본 생성자
	Student(){}
	
	Student(String n, int k, int e, int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = k+e+m;
		avg = total/3.0;
	}

	static String[] title = {"이름","국어","영어","수학","합계","평균"};
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void sum() {
	total = kor+eng+math;
	}
	
	void avg(){ 
	avg = total/3.0;
		
	}
	
	
	
	
	
	
	
	
	
}// class

























