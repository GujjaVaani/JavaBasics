package arrays;

import java.util.Scanner;

public class OddEvenArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size");
	int n = sc.nextInt();
	System.out.println("enter numbers");
	int arr[] = new int[n];
	for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	int even[]=new int[n];
	int odd[]=new int[n];
	for(int i=0;i<n;i++) {
		if(arr[i]%2==0) {
			even[i]=arr[i];
			
		}
		
	}
	System.out.println("Even number");
	for(int i=0;i<n;i++) {
		
		if(even[i]!=0) {
			System.out.println(even[i]);
		}
	}
	

	for(int i=0;i<n;i++) {
		
		if(arr[i]%2!=0) {
			odd[i]=arr[i];
		}
	}
	System.out.println("Odd number");
	for(int i=0;i<n;i++) {
		
		if(odd[i]!=0) {
			System.out.println(odd[i]);
		}
	}
	
}
}
