package basicProgramsString;

import java.util.Scanner;

public class LargeAndSmall {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String s = sc.nextLine();
	s+=' ';
	String s1[]=findwords(s);
	for (int i = 0; i < s1.length; i++)
		System.out.println(s1[i]);
	String small=smallword(s1);
	System.out.println(small+" small");
	String large=largeword(s1);
	System.out.println(large+"large");
}

private static String largeword(String[] s) {
	// TODO Auto-generated method stub
	String large=s[0];
	for(int i=0;i<s.length;i++) {
		if(large.length()<s[i].length()) {
			large=s[i];
		}
	}
	return large;
}

private static String smallword(String[] s1) {
	// TODO Auto-generated method stub
	
	
	int min=0;
	String small=s1[0];
	for(int i=0;i<s1.length;i++) {
		if(small.length()>s1[i].length()) {
			small=s1[i];
		}
	}
	
	return small;
}

private static String[] findwords(String s) {
	// TODO Auto-generated method stub
	String word="";
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			count++;
		}
	}
	System.out.println(count);
	String s1[]=new String[count];
	int next=0;
	
	for(int i=0;i<s.length();i++) {
		
		if(s.charAt(i)!=' ') {
			word+=s.charAt(i);
		}else {
		s1[next]=word;
		word="";
		next++;
		}
	
	
	}
	
	
	
	return s1;
}
}
