package com.java.string;

public class ReverseString {

	public static void main(String[] args) 
    { 
        String input = "GeeksForGeeks"; 
  
        char[] output = input.toCharArray(); 
  
        for (int i = output.length-1; i>=0; i--) 
            System.out.print(output[i]); 
    } 
} 
