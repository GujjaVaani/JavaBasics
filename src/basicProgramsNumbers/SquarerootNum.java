package basicProgramsNumbers;

import java.util.Scanner;

/*
 * sqrtn=(sqrn+(num/sqrn))/2.0
 * 9=3
 * 4=2
 * 16=4
 * 25=5
 * 
 */
public class SquarerootNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	double num=sc.nextInt();
	double t;  
	double sqrtroot=num/2;  //8
	
	do   
	{  
	t=sqrtroot;  //t=8 //t=5 
	sqrtroot=(t+(num/t))/2;//sqrtroot= (8+(16/8))/2=10 // (5+(16/5))/2=4.01
	
	}   
	while((t-sqrtroot)!= 0);  //8-5=3 //5-4.3
	  
	System.out.println(sqrtroot);

}
}
