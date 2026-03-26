package Com.Sample;

import java.util.HashSet;

public class missingnumberinarrays {
	public static void main(String[] args) {
		int [] A= {1,4,3,6,8,6,7,9,10};
		int [] B= {1,4,3,6,8};
		HashSet<Integer> set= new HashSet<>();
		
		 for(int  num:B){
			 set.add(num);
			 
			 
		 }
		for(int num:A) {
			if(!set.contains(num)) {
				System.out.println(num);
			}
		}
	}

}
