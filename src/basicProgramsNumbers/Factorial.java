package basicProgramsNumbers;
//Factorial Program using loop in java
import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	
	int number;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to be factored");
	number = sc.nextInt();
	Factorial(number);
}

private static void Factorial(int number) {
	// TODO Auto-generated method stub
	long fact =1;
	while(number!=0) {
		fact *= number;
		number=number-1;
	}
	System.out.println(fact);
}
	

}
