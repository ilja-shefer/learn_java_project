package com.mycompany.lesson3;

import java.util.List;
import java.util.Collections;

public class ReverseListOfIntegers {
	public static List<Integer>  reverseList(List<Integer> numbers) {
		Collections.reverse(numbers);
		return numbers;
	}
}
