package basicProgramsNumbers;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		System.out.println("enter three numbers");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=b&&a>=c) {
			System.out.println(a+" greater number");
		}else if(b>=a&&b>=c) {
			System.out.println(b+" greater number");
		}
		else 
			System.out.println(c + " greater number");
		/*terenary contdion for largest of three numbers
		 * 
		 * largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  
		 * 
		 */
	}
}
