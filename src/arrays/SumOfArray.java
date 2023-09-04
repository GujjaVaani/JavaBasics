package arrays;

import java.util.Scanner;

public class SumOfArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of element");
	int size=sc.nextInt();
	int array1[]=new int[size];
	System.out.println("Enter "+size+"numbers");
	for(int i=0;i<size;i++) {
		array1[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<array1.length;i++) {
		sum=sum+array1[i];
	}
	System.out.println(sum);
}
}
