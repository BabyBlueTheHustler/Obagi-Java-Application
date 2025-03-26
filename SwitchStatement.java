
import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter *131# to Subscribe Data");
		System.out.println("Enter *310# to Check Balance");
		System.out.println("Enter *606# to Borrow Data");
		System.out.println();
		
		String code = input.nextLine();
		
		switch(code){
			case "*131#":
			{
				System.out.println("Enter 1 for 1 Month Subscription");
				System.out.println("Enter 2 for 2 months Subscription");
				System.out.println("Enter 3 for 3 months Subscription");
				System.out.println("Enter 4 for 4 months Subscription");
				System.out.println();
				
				
			int option = input.nextInt();
			switch (option){
				case 1:
				{
					System.out.println(" Your 1 Month Data has been subscribed successfully activated");
				}
				break;
				
				case 2:
				{
					System.out.println("Your 2 Month Data has been subscribed successfully activated");
				}
				break;
				
				case 3:
				{
					System.out.println("Your 3 Month Data has been subscribed successfully activated");
				}
				break;
				
				case 4:
				{
					System.out.println("Your 4 Month Data has been subscribed successfully activated");
				}
				break;
								
				default:
					System.out.println("Invalid Input");
				}
			}
			break;
			
			
			case "*310#":
			{
				System.out.println("Your Balance is: N746.89");
			}
			break;
			
			case "*606#":
			{
				System.out.println("Enter 1 TO Borrow 1000");
				System.out.println("Enter 2 TO Borrow 2000");
				System.out.println("Enter 3 TO Borrow 3000");
				System.out.println("Enter 4 TO Borrow 4000");
				System.out.println();
				
				int option = input.nextInt();
				switch (option){
					case 1:
					{
						System.out.println("You have successfully borrowed 1000");
					}
					break;
					
					case 2:
					{
						System.out.println("You have successfully borrowed 2000");
					}
					break;
					
					case 3:
					{
						System.out.println("You have successfully borrowed 3000");
					}
					break;
					
					case 4:
					{
						System.out.println("You have successfully borrowed 4000");
					}
					break;
					default:
						System.out.println("Invalid Input");
					
				}
			}
			default:
				System.out.println("Invalid Input");
		}
	}
}