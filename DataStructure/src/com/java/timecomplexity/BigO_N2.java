package com.java.timecomplexity;

public class BigO_N2 {

	public static void main(String[] args) {

		o_N2(8);

	}

	public static void o_N2(int num) {
		for (int i = 1; i <= num; i++) {
			for(int j = 1 ; j <= num; j++){
			System.out.println(i + " " + j);
			}
		}
	}
}
