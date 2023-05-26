package spjt2;

public class TestFile2 {

	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 100;
		int eng = 99;
		int math = 90;
		System.out.printf("%s,%d,%d,%d \r\n",name,kor,eng,math);// \r맨끝에 엔터키를 넣어라, 윈도우일경우만  출력

		String data = String.format("%s,%d,%d,%d \r\n",name,kor,eng,math); // 저장
		System.out.println("문자열로 변수에 저장: "+data);
	}

}
