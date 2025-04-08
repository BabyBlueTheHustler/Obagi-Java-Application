import java.util.Scanner;

public class MethodOverloading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Perimeter of different shapes");
		System.out.println("Enter 1 to calculate the Parimeter of a Square");
		System.out.println("Enter 2 to calculate the Parimeter of a Rectangle");
		System.out.println("Enter 3 to calculate the Parimeter of a Circle");
		
		System.out.println("Enter your choice: ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter the lenght of the square: ");
				int lenghtOfSquare = input.nextInt();
				MethodOverloading.shape(lenghtOfSquare);
			}
			break;
			
			case 2:
			{
				System.out.print("Enter the lenght of the rectangle: ");
				int lenghtOfRectangle = input.nextInt();
				
				System.out.print("Enter the breadth of the rectangle: ");
				int breadthOfRectangle = input.nextInt();
				
				MethodOverloading.shape(lenghtOfRectangle, breadthOfRectangle);
			}
			break;
			
			case 3:
			{
				System.out.print("Enter the radius of the circle: ");
				double radiusOfCircle = input.nextDouble();
				
				MethodOverloading.shape(radiusOfCircle);
			}
			break;
			default:
			System.out.println("Invalid Input");
		}
		
	}
	
	public static void shape(int lenght){
		int perimeterOfSquare = 4 * lenght;
		System.out.printf("The Perimeter of square is %d%n",perimeterOfSquare);
	}
	
	public static void shape(int lenght, int breadth){
		int perimeterOfRectangle = 2 *(lenght + breadth);
		System.out.printf("The Perimeter of a rectangle is %d%n",perimeterOfRectangle);
	}
	
	public static void shape(double radius){
		double perimeterOfCircle = 2 * Math.PI * radius;
		System.out.printf("The Perimeter of a circle is %f%n",perimeterOfCircle);
	}
}