package arrays;

import java.util.Scanner;

public class DuplicateNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of element");
	int size=sc.nextInt();
	int array1[]=new int[size];
	System.out.println("Enter "+size+"numbers");
	for(int i=0;i<size;i++) {
		array1[i]=sc.nextInt();
	}
	
	for(int i=0;i<array1.length;i++) {
	for(int j=i+1;j<array1.length;j++) {
		if(array1[i]==array1[j]) {
			System.out.println(array1[j]);
		}
	}
	}
}
}
