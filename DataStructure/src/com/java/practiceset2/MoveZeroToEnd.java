package com.java.practiceset2;

public class MoveZeroToEnd {

	static void moveZerosToEnd(int arr[], int n) {
		int count = 0;

		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i];

		while (count < n)
			arr[count++] = 0;
	}

	public static void main(String[] args) {
		int arr[] = {6,0,-3,0,0,4};
		int n = arr.length;
		moveZerosToEnd(arr, n);
		System.out.println("Array after moving zeros to the End: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}