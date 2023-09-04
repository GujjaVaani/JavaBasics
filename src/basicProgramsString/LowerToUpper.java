package basicProgramsString;

import java.util.Scanner;

//Java Program to replace lower-case characters with upper-case and vice-versa
/*
 * ip=lOWERtOuPPER
   op=LowerToUpper
   Great Power
gREAT pOWER
 */
public class LowerToUpper {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String");
	String s=sc.nextLine();
	convertLowerToUpper(s);
}

private static void convertLowerToUpper(String s) {
	// TODO Auto-generated method stub
	String s1="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>=64&&s.charAt(i)<=90) {
			s1+=(char)(s.charAt(i)+32);
		}
		else if(s.charAt(i)>=96&&s.charAt(i)<=122){
			s1+=(char)(s.charAt(i)-32);
		}
		else if(s.charAt(i)==' ') {
			s1+=' ';
		}
		
	}
		
	System.out.println(s1);
	
}
}
