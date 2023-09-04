package basicProgramsNumbers;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int number;
		System.out.println("enter number to check whether it prime number or not");
	    Scanner sc= new Scanner(System.in);
	    number=sc.nextInt();
	    boolean checkPrime=isPrime(number);
	    if(checkPrime ==false)
	    System.out.println(number+" is not prime");
	    else
	    	System.out.println(number+" is prime");
	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		boolean check;
		int m=number/2;
		if(number==0|number==1) {
			check=false;
			return check;
		}
		else {
			for(int i=2;i<=m;i++) {
				//for (int i = 2; i < Math.sqrt(number); i++) or we can follow
				if(number%i==0) {
					check=false;
					return check;
				}
			}
		}
		check=true;
		return check;
	}
}
