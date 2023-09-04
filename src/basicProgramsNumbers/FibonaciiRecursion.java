package basicProgramsNumbers;
//Let's see the fibonacci series program in java using recursion.
public class FibonaciiRecursion {
	static int num1=0;
	static int num2=1;
	static int num3=0;
	public static void main(String[] args) {	
	int count=10;
	 System.out.print(num1+" "+num2);//printing 0 and 1
	printFibonacci(count-2);
	}

	private static void printFibonacci(int count) {
		// TODO Auto-generated method stub
		 if(count>0){    
	         num3 = num1 + num2;    
	         num1 = num2;    
	         num2 = num3;    
	         System.out.print(" "+num3);   
	         printFibonacci(count-1);    
	     }     
		
	}

}
