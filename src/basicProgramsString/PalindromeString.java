package basicProgramsString;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String Original;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		Original = sc.nextLine();
		checkPalindrome(Original);
				
				
	}

	private static void checkPalindrome(String original) {
		// TODO Auto-generated method stub
		String rev="";
		int length=original.length();
		for(int i = length-1;i>=0;i--) {
			rev=rev+original.charAt(i);
		}
		if(rev.equalsIgnoreCase(original)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
