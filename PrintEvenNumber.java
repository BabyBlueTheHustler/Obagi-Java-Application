public class PrintEvenNumber{
	public static void main(String[] args){
		
		//write a program that prints even numbers from 1 -20
		
		int num = 0;
		
		for (int i = 1; i <= 10; i++){
			num += 1;
			if (i % 2 == 0){
				System.out.printf("%d%n",num);
			}
		}
		
	}
}