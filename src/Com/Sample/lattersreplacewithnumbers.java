package Com.Sample;

public class lattersreplacewithnumbers {

	public static void main(String[] args) {

		String str ="korada lavanya";
		String result="";
		int number=1;
		for(int i=0;i<str.length();i++) {

			if(i%2==1) {

				result+=number;
				number++;



			}
			else 
				result+=str.charAt(i);

		}
		System.out.println(result);
	}
}
