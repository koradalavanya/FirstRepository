package Com.Sample;

import java.util.Scanner;

public class fibonoci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int f1=0;
		int f2=1;
		System.out.println("Enter the input value :");
		int n=sc.nextInt();
	
		for(int i=0;i<n;i++) {
			System.out.print(f1+" ");
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			//System.out.println(f3);
		}
	}

}
 