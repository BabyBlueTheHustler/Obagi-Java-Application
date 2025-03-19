public class DataType{
	public static void main(String[] args){
		//Integer Type (byte, sort, int, long)
		byte age = 50;
		System.out.printf("you are %d years old %n", age);
		
		short quantity = 20000;
		System.out.printf("I bought %d quantity of bags for my business %n", quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("The population in Nigeria is %d %n", populationInNigeria);
		
		long worldPopulation = 8000000000L;
		System.out.printf("The population of the world is %d %n", worldPopulation);
		
		//Float Point Numbers(float and double) 
		float weight = 5.6F;
		System.out.printf("The bag of rice was %.1f kg %n", weight);
		
		double acctBalance = 455744.849050446;
		System.out.printf("Your account banlance is %c %.2f %n",'$', acctBalance);
		
		//Boolean Type(boolean) 
		boolean isJavaFun = true;
		System.out.printf("Is Java Fun? %b %n",isJavaFun);
		
		//Character Type(char)
		char alpha = '@';
		System.out.printf("My email is kanjr%cgmail.com",alpha);
		
	}
	
	
}