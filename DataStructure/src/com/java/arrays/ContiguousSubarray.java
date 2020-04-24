package com.java.arrays;

public class ContiguousSubarray {

	public static void main (String[] args) 
    { 
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a)); 
    } 
  
    static int maxSubArraySum(int a[]) 
    { 
        int size = a.length; 
        int min_start = 0, max_end = 0; 
        
        for (int i = 0; i < size; i++) 
        { 
        	max_end = max_end + a[i]; 
            
            if (max_end < 0) 
            	max_end = 0; 
            
            else if (min_start < max_end)  
            	min_start = max_end;  
        } 
        return min_start; 
    } 
} 
