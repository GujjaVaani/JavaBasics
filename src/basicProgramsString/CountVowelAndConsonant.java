package basicProgramsString;

import java.util.Scanner;

public class CountVowelAndConsonant {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String word=sc.nextLine();
	String vowel="";
	String consonant="";
	int vcount=0;
	int ccount=0;
	String conword="";
	for(int i=0;i<word.length();i++) {
		if(word.charAt(i)=='a'||word.charAt(i)=='A'||word.charAt(i)=='E'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='I'||
				word.charAt(i)=='o'||word.charAt(i)=='O'||word.charAt(i)=='u'||word.charAt(i)=='U') {
		    vcount++;
		    vowel=vowel+word.charAt(i)+"";
		}
		else {
			ccount++;
			consonant=consonant+word.charAt(i)+"";		
		}	
	}
	
	for(int j=0;j<consonant.length();j++) {
	
		if(consonant.charAt(j)!=' ') {
			conword=conword+consonant.charAt(j)+"";
		}
	}
	
	System.out.println(vowel);
	System.out.println(vcount);
	System.out.println(conword);
	System.out.println(consonant);
	System.out.println(ccount);
	
}	
}
