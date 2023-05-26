package j0526_01;

public class C0526_01 {

	public static void main(String[] args) {
		//8장 예외 처리 - finally 블럭
		
		Exception e1 = new Exception("고의로 예외 발생");
		System.out.println("[프로그램 시작");
		try {
			System.out.println("파일 복사를 시작합니다."); 
			System.out.println("파일 복사 진행");
//			throw e1;
			System.out.println(0/0);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일을 종료합니다.");
		} finally {
			System.out.println("파일을 종료합니다.!!");
			
		}
		System.out.println("[프로그램 종료]");
		

		
	}//main

}//class 
