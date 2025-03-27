

import java.util.Scanner;

public class SumOfNum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter num 1: ");
		int number_1 = input.nextInt();
		
		System.out.println("Enter num 2: ");
		int number_2 = input.nextInt();
		
		System.out.println("Enter num 3: ");
		int number_3 = input.nextInt();
		
		System.out.println("Enter num 4: ");
		int number_4 = input.nextInt();
		
		System.out.println("Enter num 5: ");
		int number_5 = input.nextInt();
		
		System.out.println("Enter num 6: ");
		int number_6 = input.nextInt();
		
		System.out.println("Enter num 7: ");
		int number_7 = input.nextInt();
		
		System.out.println("Enter num 8: ");
		int number_8 = input.nextInt();
		
		System.out.println("Enter num 9: ");
		int number_9 = input.nextInt();
		
		System.out.println("Enter num 10: ");
		int number_10 = input.nextInt();
		
	
		int sumOf6_9 = number_6 + number_7 + number_8 + number_9;
		
		System.out.println();
		
		System.out.println("**********************************");
		System.out.printf("the sum of the 6th to 9th number is: %d%n",sumOf6_9);
		
	}
}