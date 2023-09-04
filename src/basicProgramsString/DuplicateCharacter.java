package basicProgramsString;

import java.util.Scanner;

public class DuplicateCharacter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String s=sc.nextLine();
	String dup="";
	
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			
			if(s.charAt(i)==s.charAt(j))
				dup+=s.charAt(i)+" ";

		}
	}
	
	System.out.println(dup);
	
}
}
