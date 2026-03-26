package Com.Sample;

import java.util.HashMap;

public class EachCharacteroccurance {
	public static void main(String[] args) {
		
		String str="Bharathi";
		
		HashMap<Character,Integer> ref=new HashMap<>();  
		
		for(char c:str.toCharArray()) {
			if(ref.containsKey(c))
			{
				ref.put(c, ref.get(c)+1);
				
			}
			else {
				ref.put(c, 1);
			}
		}
		System.out.println(ref);
	
		
	}

}
