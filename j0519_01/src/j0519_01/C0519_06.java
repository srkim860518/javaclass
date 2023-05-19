package j0519_01;

import java.util.Scanner;

public class C0519_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		String no = "1";
		String title = "홈페이지 오픈";
		String content = "홈페이지를 개설합니다.";
		String date = "2023-05-19";
		String name = "홍길동";
		
		//객체선언
		Board b= new Board();
		String[] saveBoard = b.save(no,title,date,name);//	b.save(); // 참조변수명.변수명
		// 메소드의 매개 변수는 데이터를 넘겨줄때 사용
		for(int i =0;i<saveBoard.length;i++) {
			System.out.println(saveBoard[i]+" ");
		}
		System.out.println();
	}//main
		
	
	
	static void board() {

}
}// class