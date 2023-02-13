package com.exercice2;

import java.util.Arrays;

public class Generic {
	
	
public <T> void printArray(T[] Array) {
	
		Arrays.sort(Array);
		
		System.out.println(Arrays.toString(Array));
		
	}

}


