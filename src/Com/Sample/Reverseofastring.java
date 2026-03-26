package Com.Sample;

public class Reverseofastring {
	public static void main(String[] args) {
		String input="lavanya korada";
		String output="";
		 
		for(int i=input.length()-1;i>=0;i--) {
			output=output+input.charAt(i);
		}
		System.out.println(output.replace(" ",""));
	}

}
