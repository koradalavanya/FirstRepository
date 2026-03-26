package Com.Sample;

public class duplicatestring {
	public static void main(String[] args) {
		
		String[] L= {"tester","java","python","QA","java"};
		for(int i=0;i<L.length;i++) {
			for(int j=i+1;j<L.length;j++) {
				if(L[i].equals(L[j])) {
					System.out.println(L[i]);
					
				}
			}
		}
	}

}
