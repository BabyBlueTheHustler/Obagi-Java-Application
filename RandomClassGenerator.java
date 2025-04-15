
import java.util.Random;

public class RandomClassGenerator{
	public static void main(String[] args){
		Random random = new Random();
		
		System.out.println("-------------------------------");
		
		//random.nextBoolean() returns a randon bollean value.
		boolean option = random.nextBoolean();
		System.out.printf("Do you love java ? %b%n",option);
		
		//random.nextInt() returns a random integer with no bound
		int integerWithNoBound = random.nextInt();
		System.out.printf("The random number is: %d%n",integerWithNoBound);
		
		//random.nextInt(...) returns a random integer with bound
		int integerWithBound = random.nextInt(2000) + 1;
		System.out.printf("The random number with bound is: %d%n",integerWithBound);
		
		//random.nextLong() returns a random Long
		long randLong = random.nextLong();
		System.out.printf("The random Long Number is: %d%n",randLong);
		
		//random.nextFloat() returns a random Float
		float randFloat = random.nextFloat();
		System.out.printf("The random float number is: %f%n",randFloat);
		
		//random.nextDouble() returns a random Double
		double randDouble = random.nextDouble();
		System.out.printf("The random Double number is: %f%n",randDouble);
	}
}