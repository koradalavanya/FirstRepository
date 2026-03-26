package Com.Sample;

public class largestnumberinarray {
	public static void main(String[] args) {
		int[] array= {5,25,98,67,34};
		int max=array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			
		}
		System.out.println(max);
	}

}
