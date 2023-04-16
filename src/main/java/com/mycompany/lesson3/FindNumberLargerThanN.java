package com.mycompany.lesson3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class FindNumberLargerThanN {
	public static int findNumber(int[] arr, int n ) {
		List <Integer> copyOfArray = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List <Integer> listOfNumbersBiggerN = new ArrayList <Integer>();
		
		for(int integer : copyOfArray) {
			if(integer > n) {
				listOfNumbersBiggerN.add(integer);
			}
		}
		
		if(listOfNumbersBiggerN.isEmpty()) {
			return -1;
		} else {
			return Collections.min(listOfNumbersBiggerN);
		}
	}
}
