package basicProgramsNumbers;

import java.util.Scanner;
/*
 * A number is called a sunny number if the number next to the given number is a perfect square. 
 * In other words, a number N will be a sunny number if N+1 is a perfect square.
 * 80=80+1 =81 
 * sqrt of 81 =9
 */
public class SunnyNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	checkSunny(num);
}

private static void checkSunny(int num) {
	// TODO Auto-generated method stub
	int sunny = num+1;
	int count = 0;
	int sqrt=(int)Math.sqrt(sunny);
	int checknum=sqrt*sqrt;
	if(checknum==sunny) {
		System.out.println("sunny");
	}
	else
		System.out.println("Not sunny");
	
}
}
