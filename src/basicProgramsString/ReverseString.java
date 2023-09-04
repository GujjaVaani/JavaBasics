package basicProgramsString;

/*
 * Stores the reverse of given string
Revers by Letter: gnirts nevig fo esrever eht serotS
reverse only by words
string given of reverse the Stores
 * 
 */
import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String s=sc.nextLine();
	String reverse=reversetotal(s);
	System.out.println("Revers by Letter: "+reverse);
	String[] revwords=reversewords(s);
	System.out.println("reverse only by words");
	for(int i=revwords.length-1;i>=0;i--) {
		
   	 System.out.print(revwords[i]+" ");
    }
}

private static String[] reversewords(String s) {
	// TODO Auto-generated method stub
	String temp=s+" ";
	int count=0;
	for(int i=0;i<temp.length();i++) {
		if(temp.charAt(i)==' ')
			count++;
	}

     String words[]=new String[count];
     String word="";
     int m=0;
     for(int i=0;i<temp.length();i++) {
    	 if(temp.charAt(i)!=' ') {
    		 word=word+temp.charAt(i);
    	 }
    	 else {
    		 words[m]=word;
    		 word="";
    		 m++;
    	 }
     }

	return words;
}

private static String reversetotal(String s) {
	// TODO Auto-generated method stub
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	return rev;
}
}
