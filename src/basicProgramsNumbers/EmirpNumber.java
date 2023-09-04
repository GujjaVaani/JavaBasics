package basicProgramsNumbers;

import java.util.Scanner;

/*
 * A number is called an emirp number if we get another prime number on reversing the number itself. In other
 * words, an emirp number is a number that is prime forwards or backward.
 *  It is also known as twisted prime numbers.
 *  ex:79 and 97 are prime twisted number
 */
public class EmirpNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	boolean cprime=checkprime(num);
	System.out.println(cprime);
	int revpr=0;
	while(num!=0) {
		revpr=revpr*10+num%10;
		num=num/10;
	}
	
	boolean rprime=checkprime(revpr);
	System.out.println(rprime);
	if(rprime==true&&cprime==true) {
		System.out.println("EmirpNumber");
	}else {
		System.out.println("Not emirpnumber");
	}
	
}

private static boolean checkprime(int num) {
	// TODO Auto-generated method stub
	boolean check=true;
	for(int i=1;i<num/2;i++) {
		if(num%i==0) {
			
				check=false;
				return check;
			}
		}
	
	return check;
}
}
