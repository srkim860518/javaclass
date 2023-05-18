import java.util.Scanner;

public class StuMain {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		// 필수로 외워야하는 코드- 교수님 
		 //1. 성적입력
			// 2. 성적출력
			// 3. 성적수정
			// 4. 등수처리
			// 5. 학생성적검색
			// 0. 프로그램종료

			// 이름,국어,영어,수학, 합계,평균 - 10명
			// a.변수선언

		
		
		
		
	    	Student[] s = new Student[10];
			int choice = 0; //선택번호
			int count = 0;  //성적입력 학생수
			String searchName=""; //검색이름
			int chk=0; //존재유무 체크

			while (true) {
				// b.화면출력
				
			choice=stuScreen();
				
				

			switch(choice) {
			case 1:// 성적입력 
				
				//성적 입력 메소드 호출= 클래스명, 메소드명()/ 메소드명()
				 count = stuInput(count,s); //입력된 학생수			
				 // 중괄호가 있으면 : 메소드 선언, 중괄호가 없으면 메소드 호출
				 break;
				 
			case 2: //성적입력
				// 한줄
				break;
			case 3: // 성적수정
				//한줄
				break;
			case 4:// 등수처리
				//한줄
				break;
			case 5:
				//학생 검색
				break;
			case 0:
				
				break;
				
			} //switch
			} // while
				

			

}// main
//===================================================================================
	static int stuScreen() {
		System.out.println("[성적처리프로그램]");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.성적수정");
		System.out.println("4.등수처리");
		System.out.println("5.학생성적검색");
		System.out.println("0.프로그램 종료");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요.");
		
		int choice = scan.nextInt();
		return choice;
		}
	
	
	
	static int stuInput(int count, Student[] s) { //Student[] s 변수선언
	for(int i=count;i<s.length;i++) {
		s[i] = new Student(); //객체선언
		
		//이름입력부분
		System.out.println(count+1 + "번째 학생의 이름을 입력하세요.(0.이전페이지 이동)>>");
		s[i].name = scan.next();
		
		//이전페이지 이동확인
		if(s[i].name.equals("0")) {
			System.out.println("이전페이지로 이동합니다.!!");
			System.out.println();
			break;
		}
		
		//국어,영어,수학
		System.out.println("국어점수를 입력하세요.");
		s[i].kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		s[i].eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		s[i].math = scan.nextInt(); 
		
		//합계부분
		s[i].sum();
		//평균부분
		s[i].average();
		
		System.out.println((count+1)+"번째 학생성적이 등록되었습니다.");
		System.out.println();
		
		//학생수 1증가
		count++;
	}//for
	
	return count;
}
	
}// class

