package j0509_01;

public class Class0509_05 {
	public static void main(String[] args) {
		// 연산자 p.84
		
		//int result = 3+(4*5); //23 연산을 할때는 반드시 우선순위에 괄호 넣기 필수
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		//int result =(num2*num3)+num1; //23  // 실수는 에러 찾기는 어려움으로 주의하세요!!!
		//System.out.println(result);
		
		//증감 연산자 ++
		int result = ++num3; // 5+1=6
		System.out.println(result);

		int result2 = num2++; // 4
		System.out.println(result2++); // result2 값=4
//		System.out.println(result2++); // result2 값=4
//		System.out.println(result2); // result2 값=4
		System.out.println("num2 : "+num2); //  result2 = 4 +1 = num2, 5/ num2=5가 됨		
	}

}
