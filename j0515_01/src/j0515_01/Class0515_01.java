package j0515_01;

import java.util.Scanner;

public class Class0515_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 배열 10개 
		int random = 0;
		int temp = 0;
		int count = 0; // 로또 번호 맞춘개수
	int[] arr = new int[10];
	int[] mynum = new int[6]; // 내가 입력한 번호
	int[] lottonum = new int[6];// 로또 번호 맞춘 개수
	//1-10
	for(int i=0;i<10;i++) {
		arr[i]=i+1;
	}
		// 섞기
		for(int i=0;i<1000;i++) {
			random=(int)(Math.random()*45); //0-44 zero index 
			temp=arr[0]; // 0번째 있는 배열
			arr[0]=arr[random];
			arr[random]=temp;			
		}
		
	
		// 번호 입력
		for(int i=0;i<mynum.length;i++) {
			System.out.println((i+1)+"번째 번호를 입력하세요.");
		    mynum[i]=scan.nextInt();
		}
		
		// 맞춘 개수
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;i++) {
				if(arr[i]==mynum[j]) {
					lottonum[count]=arr[i];// 
					count++;
					continue;
				}
			}
		}
		
		// 로또 번호 출력
		System.out.println("로또 번호 출력: ");
		for(int i=0;i<6;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();

		// 로또 번호 출력
		System.out.println("입력번호 출력: ");
		for(int i=0;i<6;i++) {
			System.out.print(mynum[i]+"\t");
		}
		System.out.println();
		
		System.out.println("맞춘 개수 :"+count);
		
	} // main

}// class
