package basicProgramsNumbers;

import java.util.Scanner;

/*
 * A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.
 * 145=1!+4!+5!=1+24+120 =145
 */
public class Peterson {
 public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	int temp=num;
	int sum = 0,rem=0;
	int fact =0;
	while(num!=0) {
		rem = num%10;
		fact=fact(rem);
		sum=sum+fact;
		num=num/10;
		
	}
	
	if(temp==sum) {
		System.out.println("Pearson");
	}
	else {
		System.out.println("Not Pearson");
	}
	
}

private static int fact(int rem) {
	// TODO Auto-generated method stub
	int fact=1;
	while(rem!=0) {
		fact=rem*fact;
		rem--;
	}
	return fact;
}
}
