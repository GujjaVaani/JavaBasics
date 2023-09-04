package basicProgramsString;

import java.util.Scanner;

public class StringDivide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String word=sc.nextLine();
		System.out.println("enter number to divide");
		int divide=sc.nextInt();
		int count=0;
		String words="";
		String newword="";
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)!=' ') {
				count++;
				newword+=word.charAt(i);
			}
		}
		System.out.println(count);
		int len=count/divide;
		String splitword[]=new String[divide];
		System.out.println(newword);
		if(count%divide!=0) {
			System.out.println("cannot to divided");
			return;
		}
		else {
			
			int m=0;
			int len1=len;
		  for(int i=0;i<count;i+=len) {
			
			for(int k=i;k<len1;k++) {
				  words=words+newword.charAt(k);
				  
			}
			len1+=len;
				 
			//System.out.println(words);
			  splitword[m]=words;
			 
			  m++; 
			  words="";
			
			}
		  }
		for (int i = 0; i < splitword.length; i++) {
			System.out.println(splitword[i]);
		}
		
		
	}
	
}
