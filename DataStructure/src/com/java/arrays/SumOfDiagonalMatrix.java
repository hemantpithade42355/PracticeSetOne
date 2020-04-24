package com.java.arrays;

public class SumOfDiagonalMatrix {

	static void printDiagonalSums(int [][]mat, int n){ 
		int principal = 0, secondary = 0; 
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n; j++) {
				
				//for principle diagonal
				if (i == j) 
                    principal += mat[i][j]; 
				
				//for secondary diagonal
				if ((i + j) == (n - 1)) 
					secondary += mat[i][j]; 
			} 
		}
		System.out.println("Principal Diagonal:" + principal); 
              
		System.out.println("Secondary Diagonal:" + secondary); 
		} 

	static public void main (String[] args) { 
		int [][]a = { { 1, 2, 3, 4 }, 
                  { 5, 6, 7, 8 },  
                  { 1, 9, 3, 2 }, 
                  { 8, 6, 7, 3 } }; 
                  
		printDiagonalSums(a, 4); 
	} 
} 
