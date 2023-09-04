package basicProgramsNumbers;

import java.util.Scanner;
/*
 *TechNumber 
 * 2025
 * 20 | 25
 * 20+25 = 45
 * 45*45=2025
 * 
 */
public class TechNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	int tem=num;
	int first=num;
	int store=num;
	int count=0;
	while(num!=0) {
		count++;
		num=num/10;
	}
	int quotient;
	quotient=count/2;
	//System.out.println(count);
	if(count%2!=0) {
		System.out.println("not tech number");
	}
	
	else {	
		
		int lasthalf=(int) (first%Math.pow(10, quotient));
		//System.out.println(lasthalf);
		int rev=0,rem=0;
		while(tem!=0) {
			rem=tem%10;
			rev=rev*10+rem;
			tem=tem/10;
		}
		//System.out.println(quotient);
		//System.out.println(rev);
		int firsthalf=(int) (first/Math.pow(10, quotient));
		//System.out.println(firsthalf);
		int res=firsthalf+lasthalf;
		int finalresult=res*res;
		if(finalresult==store) {
			System.out.println("Tech");
		}
	}
	
}
}
