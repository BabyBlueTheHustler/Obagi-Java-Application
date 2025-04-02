import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
		//write a program to accept numbers and display the 
		//multiplication table of that number
		
		Scanner input = new Scanner(System.in);
		
        System.out.println("Enter any number: ");
        int number = input.nextInt();
        
		for (int i = 1; i <= 12; i++) {  
            System.out.println(number + " x " + i + " = " + (number * i));
        }
	}
}