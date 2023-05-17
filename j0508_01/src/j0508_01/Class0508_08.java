package j0508_01;

public class Class0508_08 {
	
	public static void main(String[] args){
		// 연습문제1		
		// num1 변수 10, num2 변수 3을 선언후, 두 수를 나워서 소수점2자리까지 출력하시오.
		
		int num1 = 10;
		int num2 = 3;
		System.out.printf("%.2f \n",(float)num1/num2); // 강제 형변환
		System.out.printf("%.2f \n",num1/(float)num2); // 둘중에 하나만 소수점 형태이면 값은 소수점으로 나온다 
		System.out.println(10/3.0); //3.0으로 입력하면 결과값은 소수점으로 나옴
		
		// 연습문제2		
		// 변수 n1 : 3.14, 변수 n2 : 5
		// [n1+n2의 결과값 : 8.14]를 출력하시오.
		
		// 풀이 교수님
		double n1 = 3.14;
		int n2 = 5;
		System.out.printf("[n1+n2의 결과값 : %f] \n",n1+n2);
		System.out.printf("[n1+n2의 결과값 : %.2f] \n",n1+n2);
		
		//풀이 (my A:)
		float n3 = 3.14f;
		float n4 = 5f;
		System.out.printf("[(my A:) n1+n2의 결과값 : %.2f] \n",n3+n4);
		
		// 연습문제3
		// 과목점수 kor 100, eng 100, math 99
		// 합계와 평균을 출력하시오. 평균은 소수점2자리까지 출력
		// [ 합계 : 299, 평균 : 99.99 ]
		
		int kor = 100,eng = 100,math = 99;
		int total = kor+eng+math;
		double avg = (float)total/3; // total/0.3
		System.out.printf("[ 합계 : %d , 평균 : %.2f ] \n",total,avg);
		
		// 풀이(my A:)                    
		System.out.printf("[(my A:) 합계 : %d , 평균 : %.2f] \n",kor+eng+math,(float)(kor+eng+math)/3);
	}// main
}// class
