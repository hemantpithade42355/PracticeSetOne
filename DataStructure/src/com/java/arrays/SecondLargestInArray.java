package com.java.arrays;

public class SecondLargestInArray {

	public static void printSecondlargest(int arr[], int arr_size) {
		int i, first, second;

		if (arr_size < 2) {
			System.out.print(" Invalid Input ");
			return;
		}

		first = second = Integer.MIN_VALUE;
		for (i = 0; i < arr_size; i++) {

			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}

			else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.println("There is no second largestelement");
		else
			System.out.println("The second largest element is " + second);
	}

	public static void main(String[] args) {
		int arr[] = { 12, 35, 1, 10, 34, 1 };
		int length = arr.length;
		printSecondlargest(arr, length);
	}
}