package basicProgramsString;

import java.util.Scanner;

public class ReplaceString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String");
	String s1=sc.nextLine();
	System.out.println("enter to replace");
	char c=sc.next().charAt(0);
	String s="";
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)==c) {
			s+='m';
		}else {
			s+=s1.charAt(i);
		}
	}
	System.out.println(s);
	
}
}
