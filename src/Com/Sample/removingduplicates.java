package Com.Sample;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class removingduplicates {
	public static void main(String[] args) {
		String str="TesTer";
		LinkedHashSet<Character> ref=new LinkedHashSet<>();
		
		for(char c :str.toCharArray()) {
			ref.add(c);
			
}	
		for(char c :ref) {
			System.out.println(c);
		}
	}

}
