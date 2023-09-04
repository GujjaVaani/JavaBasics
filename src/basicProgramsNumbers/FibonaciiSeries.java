package basicProgramsNumbers;

import java.util.Scanner;

//Let's see the fibonacci series program in java without using recursion
public class FibonaciiSeries {
	public static void main(String[] args) {
		int num1=0;
		 int num2=1;
		 
		 int count;
		 
		 Scanner sc =new Scanner(System.in);
		 System.out.print("enter number of series :");
		 count=sc.nextInt();
		 printfibonacci(count,num1,num2);	
	}

	 private static void printfibonacci(int count,int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println(num1);
		System.out.println(num2);
		
		int num3;
	
		for(int i=2;i<count;i++){
		num3=num1+num2;
		System.out.println(num3);
		num1=num2;
		num2=num3;
		
		}
	}
 
	
}
