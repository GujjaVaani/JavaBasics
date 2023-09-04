package arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element");
		int size = sc.nextInt();
		int array1[] = new int[size];
		System.out.println("Enter " + size + "numbers");
		for (int i = 0; i < size; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Reverse Array");
		for(int i=array1.length-1;i>=0;i--) {
			System.out.println(array1[i]);
		}
	}
}
