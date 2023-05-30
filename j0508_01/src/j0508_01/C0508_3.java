package j0508_01;

public class C0508_3 {

		
		static int num=10;// 전역변수 -class 영역에서도 변수 선언 가능
							//static int num 전역변수에서 숫자를 지정하지 안으면 자동으로 0으로 셋팅
		
		public static void main(String[] args){
			int num = 0;
			num = 15;
			System.out.println("main 메소드 num 호출: "+num);
			sub();//?? 이건 뭘까? 
		} // main
		
			static void sub(){ // sub는 main에서 sub를 실행시키고
				System.out.println(num);// 10 -->static int num =10;--> 전역변수 10 출력  
				System.out.println("sub 메소드s는 전역변수 num 호출: "+num); // 전역 변수 10 출력
				
			} // sub
	
}//class
