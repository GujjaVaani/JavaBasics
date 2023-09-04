package basicProgramsString;
/*
 * 
 *input FAN
output
  F
  FA
  FAN
  A
  AN
  N
 * 
 * 
 */
import java.util.Scanner;

public class PossibleStrings {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String s=sc.nextLine();
	int length=s.length();
	int countOfStrings=(length*(length+1))/2;
	String noStrings[]=new String[countOfStrings];
	noStrings=possibleString(countOfStrings,s);
	for(int i=0;i<noStrings.length;i++) {
		System.out.println(noStrings[i]);
	}
	System.out.println(noStrings.length);
	
	
}



private static String[] possibleString(int countOfStrings, String s) {
	// TODO Auto-generated method stub
	String noStrings[]=new String[countOfStrings];
//	int length=s.length();
	String newword="";
	int m=0;
	for(int i=0;i<s.length();i++) {
		for(int j=i;j<s.length();j++) {
			
			newword=newword+s.charAt(j);
			noStrings[m]=newword;
			m++;
		}	
		newword="";
	}
	
	return noStrings;
}



}
