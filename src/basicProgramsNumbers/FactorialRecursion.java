package basicProgramsNumbers;

import java.util.Scanner;

//Factorial Program using loop in java using Recursion
public class FactorialRecursion {
 public static void main(String[] args) {
int number;
Scanner sc= new Scanner(System.in);
System.out.println("Enter number");
number=sc.nextInt();
long fact=factorial(number);
System.out.println(fact);
}

private static int factorial(int i) {
	// TODO Auto-generated method stub
	if(i==0) {
		return 1;
	}
	else {
		return i*factorial(i-1);	
	}
}
	
}
