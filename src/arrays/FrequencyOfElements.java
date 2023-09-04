package arrays;

import java.util.Scanner;

public class FrequencyOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element");
		int size = sc.nextInt();
		int array1[] = new int[size];
		int[] freq = new int[size];
		System.out.println("Enter " + size + "numbers");

		for (int i = 0; i < size; i++) {
			array1[i] = sc.nextInt();
			freq[i] = -1;
		}
		// Array fr will store frequencies of element
		int count;

		for (int i = 0; i < array1.length; i++) {
			count = 1;
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					count++;
					// To avoid counting same element again
					freq[j] = 0;

				}

			}
			if (freq[i] != 0)
				freq[i] = count;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0)
				System.out.println(array1[i] + " occurs " + freq[i] + " times");
		}

	}
}
