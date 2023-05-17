package j0509_01;

public class Class0509_02 {

	public static void main(String[] args) {
       int kor = 100;
       int eng = 90;
       int math = 89;
       int total = kor+eng+math;
       double avg = total/3.0;
       System.out.println("------------------------------------");
       System.out.println("국어\t영어\t수학\t합계\t평균");
       System.out.println("------------------------------------");
       System.out.printf("%d\t%d\t%d\t%d\t%.3f\n", kor,eng,math,total,avg);  // \t: tap키 (빈칸)
       
       // ctrl + v 할 때, 특수문자를 문자로 인식하려고 \\역슬래시가 하나 더 생김
	} // main
} //class
