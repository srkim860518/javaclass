package j0526_01;

public class Student {
	// C0526_10 적용
	
	Student(){}
	Student(int stuNo, String name, int kor, int eng, int math){
		this.stuNo= stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
		
	}
	Student(String name, int kor, int eng, int math){	
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
	}
	
	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private Double avg;
	private int rank;
	
	
	public int getStuNo() {// 불러오기
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo; // 저장
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
	public Double getAvg() {
		return avg;
	}
	public void setAvg(Double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}


}
