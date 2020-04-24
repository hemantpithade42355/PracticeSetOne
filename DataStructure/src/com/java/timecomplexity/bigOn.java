package com.java.timecomplexity;

public class bigOn {

	public static void main(String[] args) {
		
	o_N(5);	
		
	}
	
	public static int o_N(int num) {
		int count = 0;
		for(int i = 0 ; i < num ; i++){
			System.out.println(count++);
		}
		return count;
	}
}
