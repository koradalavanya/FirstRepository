package Com.Sample;

import java.util.Arrays;

public class decendingorder {
	public static void main(String[] args) {
		int[] arr= {3,7,4,8,2,9};
		
		Arrays.sort(arr);
//		
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.println(arr[i]);
		}
		
	}
}

