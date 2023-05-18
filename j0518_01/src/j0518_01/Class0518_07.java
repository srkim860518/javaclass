package j0518_01;

import java.util.Scanner;

public class Class0518_07 {
	public static void main(String[] args) {
	
		//국어,영, 수 입력받아 평균 점수 90점 이상 A, 80, B,c,d,f
		// 97점 이상 A+, 93 A-, 87점 이상 8+, 83점 이하 B-
		Scanner scan = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.println("국어 점수를 입력해주세요");
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력해주세요");
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력해주세요");
		math = scan.nextInt();
		
		int total = kor + eng + math;
		double avg = total/3.0;
		
		
		if(avg>=90) {
			
			if(avg>=97) {
				System.out.printf("평균은:  %.2f, 학점은 : A+",avg);
			}else if(avg<=93) {
				System.out.printf("평균은:  %.2f, 학점은 : A-",avg);
			}else {
				System.out.printf("평균은:  %.2f, 학점은 : A",avg);
			}
			
		}else if(avg>=80) {
			if(avg>=87) {
				System.out.printf("평균은:  %.2f, 학점은 :B+",avg);
			}else if(avg<=83) {
				System.out.printf("평균은:  %.2f, 학점은 :B-",avg);
			}else {
				System.out.printf("평균은:  %.2f, 학점은 :B",avg);
			}
							
		}else if(avg>=70) { 
			if(avg>=77) {
				System.out.printf("평균은:  %.2f, 학점은 :C+",avg);
			}else if(avg<=73) {
				System.out.printf("평균은:  %.2f, 학점은 :C-",avg);
			}else {
				System.out.printf("평균은:  %.2f, 학점은 :C",avg);
			}
			
		}else if(avg>=60) {
			if(avg>=67) {
				System.out.printf("평균은:  %.2f, 학점은 :D+",avg);
			}else if(avg<=63) {
				System.out.printf("평균은:  %.2f, 학점은 :D-",avg);
			}else{
				System.out.printf("평균은:  %.2f, 학점은 : D",avg);
						}
			
		}else {
			System.out.printf("평균은:  %.2f, 학점은 : F",avg);
		}

		
	}//main 
}//class























