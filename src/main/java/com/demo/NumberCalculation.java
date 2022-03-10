package com.demo;

public class NumberCalculation {
	String temp="";
	public int add(int a, int b) {
		return a+b;
	}
	
	public String convertCase(String str) {
		
		for(int i =0; i<str.length();i++) {
			int x = str.charAt(i);//return ascii code, 97-121 is small letter
			x = x - 32;
			temp = temp + (char)x;
		}
		
		return temp;
	}
}
