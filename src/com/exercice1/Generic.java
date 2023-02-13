package com.exercice1;

import java.util.ArrayList;
import java.util.List;

public class Generic {




	public <T> void printArray(T[] Array) {
		
		for (T Element : Array) {
			
			System.out.println(Element);
			
		}
	}
}
