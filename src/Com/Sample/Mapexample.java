package Com.Sample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mapexample {
	public static void main(String[] args) {
		Map<Integer,String> student=new LinkedHashMap<>();
		
		 student.put(3, "lavanya");
		 student.put(1, "bharathi");
	     student.put(2,"gopi");
		 System.out.println(student);
	}

}
