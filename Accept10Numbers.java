//Accept 10 numbers from a user and print the sum, average 
//and product of the numbers

import java.util.Scanner;

public class Accept10Numbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		double average;
		long product = 1;
		
		for(int i = 1; i <= 10; i++){
			System.out.printf("Enter num %d: ",i);
			
			int num = input.nextInt();
			sum += num;
			product *= num;			
		}
		average = (double)sum /10;
		
		System.out.println();
		System.out.println("**********************************");
		System.out.printf("The Sum of the numbers is: %d%n",sum);
		System.out.printf("The Average of the numbers is: %.2f%n",average);
		System.out.printf("The Product of the numbers is: %d%n",product);			
		
	}
}