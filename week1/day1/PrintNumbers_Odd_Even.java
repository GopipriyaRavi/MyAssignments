package week1.day1;

public class PrintNumbers_Odd_Even {
	public static void main(String[] args) 
	{
		System.out.println("The Numbers are: ");
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(+i);
		}
		
		System.out.println("The Odd Numbers between 1 to 10 are: ");
		for (int i = 1; i <= 10; i++) 
		{
			if(i%2 != 0)
			System.out.println(+i);
		}
		
		System.out.println("The Even Numbers between 1 to 10 are: ");
		for (int i = 1; i <= 10; i++) 
		{
			if(i%2 == 0)
			System.out.println(+i);
		}
	}

}
