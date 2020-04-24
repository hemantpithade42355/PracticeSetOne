package com.java.timecomplexity;

public class BigO_N_Log_N {

	public static void main(String[] args) {

		o_N_Log_N(8);

	}

	public static void o_N_Log_N(int num) {
		for (int i = 1; i <= num; i++) {
			for(int j = 1 ; j <= num; j = j*2){
			System.out.println(i + " " + j);
			}
		}
	}
}
