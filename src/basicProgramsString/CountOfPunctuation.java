package basicProgramsString;

import java.util.Scanner;

//!, . , ' , - , " , ? , ;
/*"He said, 'The mailman loves you.' I heard it with my own ears."
 * ",''.."
 * count = 7
 */
public class CountOfPunctuation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter string");
	String s =sc.nextLine();
	int count=0;
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)=='!'||s.charAt(i)=='.'||s.charAt(i)==','||s.charAt(i)=='"'||s.charAt(i)=='?'||s.charAt(i)==';'
				||s.charAt(i)==':'||s.charAt(i)=='\'') {
			count++;
		}
		
	}
	System.out.println(count);
}
}
