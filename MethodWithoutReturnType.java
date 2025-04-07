public class MethodWithoutReturnType{
	public static void main (String[] args){
		MethodWithoutReturnType mwrt = new MethodWithoutReturnType();
		mwrt.addition();
		mwrt.subtraction();
	}
	
	public void addition(){
		int num1 = 15;
		int num2 = 20;
		int sum = num1 + num2;
		
		System.out.printf("The sum is %d%n",sum);
	}
	
	
	public void subtraction(){
		int num1 = 20;
		int num2 = 15;
		int sum = num1 - num2;
		
		System.out.printf("The difference is %d%n",subtraction);
	}
	
}