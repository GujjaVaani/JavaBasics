package basicProgramsNumbers;

import java.util.Scanner;

public class Swapusingbitwise {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number1");
	int a =sc.nextInt();
	System.out.println("Enter number 2");
	int b=sc.nextInt();
	System.out.println("before swapping "+a +"and"+ b);
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("After swapping "+a +"and "+b);
}
}
