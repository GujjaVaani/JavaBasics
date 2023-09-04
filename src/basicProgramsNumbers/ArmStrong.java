package basicProgramsNumbers;

import java.util.Scanner;

//An Armstrong number is a positive m-digit number that is equal to the sum of the mth 
//powers of their digits. It is also known as pluperfect, or Plus Perfect, or Narcissistic number
public class ArmStrong {
public static void main(String[] args) {
	int number;
	Scanner sc = new Scanner(System.in);
	number=sc.nextInt();
	int plusNum=Narcisstic(number);
	System.out.println(plusNum);
   if(plusNum==number) {
	   System.out.println("ArmStrong");
   }else {
	System.out.println("Not ArmStrong");
}
}

private static int Narcisstic(int number) {
	// TODO Auto-generated method stub
	int count=0;
	int storednum=number;
	while(number!=0) {
		
		number=number/10;
		count++;
	}
	//System.out.println(count);
	int sum=0;
	int remainder=0;
	int result=0;
	while(storednum!=0) {
		remainder=storednum%10;
		result+=Math.pow(remainder, count);
		storednum=storednum/10;
	}
	return result;
}
}
