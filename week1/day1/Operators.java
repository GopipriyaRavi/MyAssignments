package week1.day1;

public class Operators {

	public static void main(String[] args) {
		int a= 15, b= 5;
		
		System.out.println("The Value of a is " +a +"\n"+ "The Value of b is " +b);
		
		// Add, Sub, Mul, Div- Qus,Rem
		System.out.println("Addition: " +(a+b));
		System.out.println("Subtraction: " +(a-b));
		System.out.println("Multiplication: " +(a*b));
		System.out.println("Div-Quotient: " +(a/b));
		System.out.println("Div-Reminder: " +(a%b));
		
		//Greater, Lesser, Equal
		if (a>b) 
		{
			System.out.println("A is greater than B");
		}
		else if(a<b)
		{
			System.out.println("A is less than B");
		}
		else
		{
			System.out.println("A and B are equal");
		}
		
		//Increment, Decrement Operators
		System.out.println("Post Increment: " + a++);
		System.out.println("After Post Increment: " +a);
		
		System.out.println("Pre Increment: " + ++a);
		System.out.println("After Pre Increment: " +a);
		
		System.out.println("Post Decrement: " + b--);
		System.out.println("After Post Decrement: " +b);
		
		System.out.println("Pre Decrement: " + --
				b);
		System.out.println("After Pre Decrement: " +b);

		System.out.println("Test Increment/Decrement: " + (--a - ++b));
		
	}
}
