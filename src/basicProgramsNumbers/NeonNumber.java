package basicProgramsNumbers;

import java.util.Scanner;

/*
 * num=9
 * sqr=9*9=81
 * res=8+1=9 
 * num==res
 */
public class NeonNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	checkNeon(num);
			
}

private static void checkNeon(int num) {
	// TODO Auto-generated method stub
	
	int sqr=num*num;
	int sum=0;
	while(sqr!=0) {
		sum+=sqr%10;
		sqr=sqr/10;
	}
	if(sum==num) {
		System.out.println("Neon Number");
	}
	else {
		System.out.println("not neon number");
	}
}
}
