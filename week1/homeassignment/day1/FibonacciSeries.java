package week1.homeassignment.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int input=8;
		int f1= 0,f2 =1, fout= 0;
		
		System.out.println("Fibonacci Series for the given input:");
		//To print 1st and 2nd output 
		System.out.println(f1 + "\n" +f2);
		
		fout = f1+f2;
		
		//To print the output from 3rd
		for (int i = 3; i <= input; i++) {
			System.out.println(fout);
			
			f1=f2;
			f2=fout;
			fout=f1+f2;
			
		}
	}
}
