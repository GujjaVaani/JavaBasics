package basicProgramsNumbers;

import java.util.Scanner;
/*
 * n * (n + 1) / 2;   
 */
public class SumOfNaturalNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int a =sc.nextInt();
	int sum=0;
	
	while(a!=0) {
		sum=sum+a;
		a--;
	}
	System.out.println(sum);
}
}
