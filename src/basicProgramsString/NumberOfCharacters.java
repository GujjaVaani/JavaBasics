package basicProgramsString;

import java.util.Scanner;

public class NumberOfCharacters {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String word=sc.nextLine();
	System.out.println(word.length());
	int count=0;
	for(int i=0;i<word.length();i++) {
		if(word.charAt(i)!=' ') {
			count++;
		}
	}
	System.out.println(word+" "+count);
}
}
