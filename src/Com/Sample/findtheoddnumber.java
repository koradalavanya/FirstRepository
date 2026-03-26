package Com.Sample;

public class findtheoddnumber {
	public static void main(String[] args) {
		int[] array= {3,6,2,8,5};
		 
		
		for(int num:array) {
			//if(num%2==0) even number condition 
			if(num %2 !=0) {
				System.out.println("odd number is "+ num);
			}
		}
	}

}
