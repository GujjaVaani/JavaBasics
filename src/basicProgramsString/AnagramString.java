package basicProgramsString;

import java.util.Scanner;

/*
 * string s = Brag
 * String s1 = graB
 */
public class AnagramString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String s=sc.nextLine();
	System.out.println("enter another word");
	String s1=sc.nextLine();
	boolean isanagram=checkAnagram(s,s1);
	System.out.println("Given words are "+isanagram);
}

private static boolean checkAnagram(String s, String s1) {
	// TODO Auto-generated method stub
	boolean status=false;
	String lowers1="";
	String lowers2="";
	if(s.length()!=s1.length()) {
		return status;
	}
	else {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=64&&s.charAt(i)<=90) {
				lowers1=lowers1+(char)(s.charAt(i)+32);
			}
			else {
				lowers1+=s.charAt(i);
			}
		}
		System.out.println(lowers1);
		
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>=64&&s1.charAt(i)<=90) {
				lowers2=lowers2+(char)(s1.charAt(i)+32);
			}
			else {
				lowers2+=s1.charAt(i);
			}
		}
		System.out.println(lowers2);
		
	}
	
	int count=0;
	for(int j=0;j<lowers1.length();j++) {
	for(int i=0;i<lowers1.length();i++) {
		if(lowers1.charAt(j)==lowers2.charAt(i)) {
			count++;
		}
	}
	}
	System.out.println(count);
	if(count==lowers1.length())
	{
		status=true;
	}
	return status;
	
}
}
