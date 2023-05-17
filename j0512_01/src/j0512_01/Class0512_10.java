package j0512_01;

import java.util.Arrays;

public class Class0512_10 {

	public static void main(String[] args) {
		// 정렬
		//int는 기본형, Integer는 객체 type이 다름!!! 
		
       int[] arr = {1,11,23,45,2,3,9,5};
       //  Arrays.sort(arr); // 오름차순 정렬
       // Arrays.sort(arr,Collections.reverseOrder()); // 내림 차순 정렬, Co= Collections.
       int num=10;
       //단순 for문
       for(int i:arr) { // arrys는 단순 배열만 가능 / array가 배열로 되어 있으면 array가 i 값이 됨.  
    	   System.err.println(i+" ");
       }
       // 기본 for문
       for(int i=0;i<arr.length;i++) {
    	   System.out.println(arr[i]+" ");
       }
		
		
//----------------------------------------------
//----------------------------------------------
//----------------------------------------------
//----------------------------------------------
//----------------------------------------------
		
		
		
		

	} //main

}//Class
