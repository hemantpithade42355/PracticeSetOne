package com.java.timecomplexity;

public class bigO_Log_n {

	public static void main(String[] args) {
		
		o_Log_N(20);	
			
		}
		
		public static int o_Log_N(int num) {
			int count = 0;
			for(int i = 1 ; i <= num ; i = i*2){
				System.out.println(count++);
			}
			return count;
		}
}
