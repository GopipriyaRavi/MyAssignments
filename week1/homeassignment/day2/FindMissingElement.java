package week1.homeassignment.day2;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		int input[] = {1,4,3,2,8,6,7};
		int missingnumber;
		
		Arrays.sort(input);
		
		System.out.println("Input after Sort");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
		
		for (int i = input[0]; i <= input.length; i++) {
			if (i+1 != input[i]) 
			{
				missingnumber=i+1;
				System.out.println("The element missed in the array : " +missingnumber);
				break;
			}
		}	
	}
}
