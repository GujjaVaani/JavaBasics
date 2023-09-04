package basicProgramsString;

import java.util.Scanner;

public class FindStringinRotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		System.out.println("Enter string");
		String s1 = sc.nextLine();
		
		String[] result = checkStringinRotation(s);
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);

	  for(int i=0;i<result.length;i++) {
		  if(s1.equals(result[i])) {
			  System.out.println("the second string is available");
		  }
	  }
		
		
	}

	private static String[] checkStringinRotation(String s) {
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
				if (k < n) {// taking upto position
					array[i] = array[i] + s.charAt(j);
					//System.out.println(s.charAt(j));
				}
				
			}
			
		}
		
	
		
		
		// System.out.println(count);
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);

		
		for (int i1 = count; i1 < n; i1++) {
			for (int k = 0; k < n; k++) {
				if ((array[i1].length() != n)) {
					System.out.println(array[i1]);
					array[i1] = array[i1] + s.charAt(k);
                       System.out.println(s.charAt(k));
				}
				System.out.println(array[i1]);
			}
		}
		return array;
		
		
		
	}
}
