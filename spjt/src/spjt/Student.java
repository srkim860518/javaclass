package spjt;
 
public class Student {
	// 성적처리
	static String[] title = {"학번","이름","국어","영어","수학","합계","평균","순위"};
	
	static int count=1000; // count는 1000번부터 시작
	private int stuNo; //클래스 변수 객체 선언없이 클래스명.변수명
	private String name; //클래스 변수 객체 선언없이 클래스명.변수명
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	
	{
		count++;// 앞,뒤 어디에 넣어도됨, 줄을 나눴기  때문에 
		stuNo =count; // 객체선언할때마다 증가(배열 수만큼 10)
		
	}
	
	public Student() {}
	
// 자동생성 경로 : 오른쪽 마우스 -source-get
	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

		
	
	



} //main


//static int count=1000; // count는 1000번부터 시작
//int stuNo; //클래스 변수 객체 선언없이 클래스명.변수명
//String name; //클래스 변수 객체 선언없이 클래스명.변수명
//int kor;
//int eng;
//int math;
//int total;
//double avg;
//int rank;

//Student(){} // 기본 생성자 - 클래스명과 일치, void 없음.
//Student(String name, int kor, int eng, int math){// 생성자
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		this.total = kor+eng+math;
//		this.avg = this.total/3.0;
//		