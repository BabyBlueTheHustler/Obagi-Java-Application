import java.util.Scanner;

public class MathClassMethods{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		System.out.printf("The absolute value is %d%n",Math.abs(num));
	}
}