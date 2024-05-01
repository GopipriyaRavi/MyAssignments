package week1.day2;

import java.lang.reflect.Array;

public class FindDuplicateNumbers {
	public static void main(String[] args) {
		
		int[] nums= {2,5,7,7,5,9,2,3};
		System.out.println("The given numbers are ");

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);

		}
		
		int len= Array.getLength(nums);
		System.out.println("The length of the arrays is " +len);
		
		//Method1
		for (int i = 0; i < len; i++) 
		{
			for (int j = i+1; j < len; j++) 
			{				
				if(nums[i]==nums[j])
				{
					System.out.println(nums[i]);
				}
			}
		}
		
		//Method2
//		Arrays.sort(nums);
//		System.out.println("The Sorted numbers are ");
//		for (int i = 0; i < nums.length; i++) {	
//			System.out.println(nums[i]);
//		}
//		
//		System.out.println("The Duplicate numbers are ");
//		for (int i = 0; i < nums.length-1; i++) {
//			if (nums[i]==nums[i+1]) {
//				System.out.println(nums[i]);	
//			}
//		}
	}
}
