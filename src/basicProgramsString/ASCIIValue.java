package basicProgramsString;

import java.util.Scanner;

/*ASCII Value of 48=0
49=1
50=2
51=3
52=4
53=5
54=6
55=7
56=8
57=9
*/
/*ASCII VALUE OF A-Z are 65 to 90*/
/*ASCII VALUE OF a-z are 97 to 122*/
public class ASCIIValue {
public static void main(String[] args) {
	
	//Using Typecasting
	for(int i=0;i<255;i++) {
		System.out.println("ASCII VALUE OF " +i+ "=" +(char)i );
	}
	// character whose ASCII value to be found  
	char ch1 = 'a';
	// variable that stores the integer value of the character  
	int asciivalue1 = ch1; 
	System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);  
	
	 
	int ch2 = 'b';  
	System.out.println("The ASCII value of b is: "+ch2); 
	
	System.out.print("Enter a character: ");  
	Scanner sc = new Scanner(System.in);  
	char chr = sc.next().charAt(0);  
	int asciiValue = chr;  
	System.out.println("ASCII value of " +chr+ " is: "+asciiValue);  
	String word="";
   String s="vani";
   
			word+=s.charAt(0);
			System.out.println(word);

}
}
