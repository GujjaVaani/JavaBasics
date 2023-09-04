package arrays;

import java.util.Scanner;

public class RightRotation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of element");
	int size=sc.nextInt();
	int array1[]=new int[size];
	System.out.println("Enter "+size+"numbers");
	for(int i=0;i<size;i++) {
		array1[i]=sc.nextInt();
	}
	System.out.println("Enter position for right");
	int n=sc.nextInt();
	
	for(int i=0;i<n;i++) {
		int j, last;
		last = array1[array1.length-1];
		for(j = array1.length-1; j > 0; j--){    
            //Shift element of array by one    
            array1[j] = array1[j-1];    
        }    
		array1[0]=last;
	}
	for (int i = 0; i < array1.length; i++) {
		System.out.print(array1[i] + " ");
	}
}
}
