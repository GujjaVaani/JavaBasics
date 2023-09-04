package basicProgramsString;

import java.util.Scanner;

public class StringRotate {
	/*
	 * Write a program to form distinct circular strings of a given length from a
	 * given string. Input from the users: a) A string b) A number If the input
	 * string is "aaabcd" and input number is 3 then the possible distinct circular
	 * strings are: aaa, aab, abc, bcd, cda, daa
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		String s = sc.nextLine();
		System.out.println("Enter number");
		int position = sc.nextInt();
		String[] result = formCircularwords(s, position);
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);

	}

	private static String[] formCircularwords(String s, int position) {
		// TODO Auto-generated method stub
		int n = s.length();

		String array[] = new String[n];
//assigning array as null
		for (int r = 0; r < n; r++) {
			array[r] = "";

		}
		int count = 0;
		for (int i = 0; i < n; i++) {// taking no of words
			for (int j = i, k = 0; j < n; j++, k++) {// taking characters from given string
				if (k < position) {// taking upto position
					array[i] = array[i] + s.charAt(j);
				}
			}
			if (array[i].length() == position) {// only position of word are printed
				count++;
			}
		}
		// System.out.println(count);

		for (int i1 = count; i1 < n; i1++) {
			for (int k = 0; k < position; k++) {
				if ((array[i1].length() != position)) {
					array[i1] = array[i1] + s.charAt(k);

				}
			}
		}
		return array;
	}

}