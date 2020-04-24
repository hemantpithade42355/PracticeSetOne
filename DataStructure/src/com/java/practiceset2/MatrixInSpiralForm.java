package com.java.practiceset2;

public class MatrixInSpiralForm {

	static void spiralPrint(int endRowIndex, int endColumnIndex, int a[][]) {
		int i, startRowIndex = 0, startColumnIndex = 0;

		while (startRowIndex < endRowIndex && startColumnIndex < endColumnIndex) {
			for (i = startColumnIndex; i < endColumnIndex; i++) {
				System.out.print(a[startRowIndex][i] + " ");
			}
			startRowIndex++;

			for (i = startRowIndex; i < endRowIndex; i++) {
				System.out.print(a[i][endColumnIndex - 1] + " ");
			}
			endColumnIndex--;

			if (startRowIndex < endRowIndex) {
				for (i = endColumnIndex - 1; i >= startColumnIndex; i--) {
					System.out.print(a[endRowIndex - 1][i] + " ");
				}
				endRowIndex--;
			}

			if (startColumnIndex < endColumnIndex) {
				for (i = endRowIndex - 1; i >= startRowIndex; i--) {
					System.out.print(a[i][startColumnIndex] + " ");
				}
				startColumnIndex++;
			}
		}
	}

	public static void main(String[] args) {
		int R = 4;
		int C = 4;
		int a[][] = { { 1, 2, 3, 4}, { 5, 6, 7, 8}, { 9, 10, 11, 12}, { 13, 14, 15, 16} };
		spiralPrint(R, C, a);
	}
}
