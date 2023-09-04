package arrays;

import java.util.Scanner;

public class CopyAllElementstoOther {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of element");
	int size=sc.nextInt();
	int array1[]=new int[size];
	System.out.println("Enter "+size+"numbers");
	for(int i=0;i<size;i++) {
		array1[i]=sc.nextInt();
	}
	int copyarray[]=new int[size];
	for(int j=0;j<size;j++)
	{
		copyarray[j]=array1[j];
	}
	System.out.println("Copied array");
	for (int i = 0; i < copyarray.length; i++) {
		System.out.println(copyarray[i]);
	}
}
}
