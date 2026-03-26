package Com.Sample;

import java.util.Arrays;

public class sorrtinginarray {
	public static void main(String[] args) {
		int[] arr= {3,7,4,8,2,9};
		
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		//using for loop
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		//using for each loop
//		for(int ref:arr) {
//			System.out.println(ref);
		}
		
	}


