package com.java.timecomplexity;

public class BigO_N3 {

	public static void main(String[] args) {

		o_N3(8);

	}

	public static void o_N3(int num) {
		for (int i = 1; i <= num; i++) {
			for(int j = 1 ; j <= num; j++){
				for(int k = 1; k<= num; k++)
			System.out.println(i + " " + j + " " + k);
			}
		}
	}
}
