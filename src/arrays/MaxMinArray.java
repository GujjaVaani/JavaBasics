package arrays;

import java.util.Scanner;

public class MaxMinArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of element");
	int size=sc.nextInt();
	int array1[]=new int[size];
	System.out.println("Enter "+size+"numbers");
	for(int i=0;i<size;i++) {
		array1[i]=sc.nextInt();
	}
	int max=array1[0];
	for(int i=0;i<array1.length;i++) {
		if(array1[i]>max)
			max=array1[i];
	}
	System.out.println(max);


int min=array1[0];
for(int i=0;i<array1.length;i++) {
	if(array1[i]<min)
		min=array1[i];
}
System.out.println(min);


}
}
