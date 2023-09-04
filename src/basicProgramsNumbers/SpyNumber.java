package basicProgramsNumbers;

import java.util.Scanner;

/*
 * 1124
 * sum=1+1+2+4=8
 * product=1*1*2*4=8
 */
public class SpyNumber {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	checkSpy(num);
}

private static void checkSpy(int num) {
	// TODO Auto-generated method stub
	int sum=0;
	int temp=num;
	int prod=1;
	while(num!=0) {
		sum+=num%10;
		num=num/10;
	}
	while(temp!=0) {
		prod*=temp%10;
		temp=temp/10;
	}
	if(sum==prod) {
		System.out.println("Spy Number");
	}
	else {
		System.out.println("not spy number");
	}
}
}
