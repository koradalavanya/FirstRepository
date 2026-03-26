package Com.Sample;

public class missingnumberinarray {
	public static void main(String[] args) {
		int[] array= {1,2,4,5,6,7};
		int n=7;
		
		int expected=n*(n+1)/2;
		int actual=0;
		
		for(int ref:array) {
			actual=actual+ref;
			
		}
		
		System.out.println(expected-actual);
	}

}
