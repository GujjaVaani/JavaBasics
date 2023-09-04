package arrays;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		System.out.println("enter numbers");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int  j=removeDuplicates(arr,n);
			 
		for (int i = 0; i <j; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

	private static int removeDuplicates(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int j=0;
		for (int i = 0; i < n-1; i++) {
			if(arr[i]!=arr[i+1]) {
		       arr[j++]=arr[i];		
			}
				
		}
		arr[j++]=arr[n-1];
		
		return j;
	}
}
