package basicProgramsNumbers;
//Let's see the palindrome program in java
import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	int number;
	Scanner sc = new Scanner(System.in);
	number=sc.nextInt();
	checkPalindrome(number);
}

private static void checkPalindrome(int number) {
	// TODO Auto-generated method stub
	int storedvalue=number;
	int reverse;
	int sum=0;
	while(number!=0) {
	reverse=number%10;
	sum=sum*10+reverse;
	number=number/10;
	}
	if(sum==storedvalue) {
		System.out.println("Pallindrome");
	}
	else {
		System.out.println("Not Pallindrome");
	}
}
}
