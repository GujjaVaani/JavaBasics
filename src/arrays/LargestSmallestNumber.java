package arrays;

import java.util.Scanner;

public class LargestSmallestNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size");
	int n = sc.nextInt();
	System.out.println("enter numbers");
	int arr[] = new int[n];
	for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
			  temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
				
			}
		}
	}
	System.out.println("descending order");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Second largest "+arr[1]);
	System.out.println("Third largest "+arr[2]);
	System.out.println("smallest "+arr[arr.length-1]);
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
			  temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
				
			}
		}
	}
	System.out.println("Ascending order");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
	
}
}
