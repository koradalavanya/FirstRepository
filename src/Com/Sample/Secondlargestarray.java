package Com.Sample;

public class Secondlargestarray {
	public static void main(String[] args) {
		
	
	int[] arr = {10,20,40,30};

	int first = 0, second = 0;

	for(int num : arr){
	    if(num > first){
	        second = first;
	        first = num;
	    } 
	    else if(num > second){
	        second = num;
	    }
	}

	System.out.println("Second Largest: " + second);

}
}

