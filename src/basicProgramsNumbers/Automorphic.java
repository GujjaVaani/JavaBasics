package basicProgramsNumbers;

import java.util.Scanner;

/*
 * A number is called an automorphic number if and only if the square of the given number ends 
 * with the same number itself. For example, 25, 76 are automorphic numbers because their square is 625 and 5776,
 *  respectively and the last two digits of the square represent the number itself. 
 *  Some other automorphic numbers are 5, 6, 36, 890625, etc.
 */
public class Automorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sqr= num*num;
		int temp=num;
        int count =0;
		while(num>0) {
			count++;
			num=num/10;
		}
		int lastdigit = (int)(sqr%(Math.pow(10,count)));
		if(lastdigit==temp) {
			System.out.println("Automorphic");
		}else {
			System.out.println("Not Automorphic");
		}
	}
}
