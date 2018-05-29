package com.gft.fpintroduction.doubleandsum;

import java.util.Arrays;
import java.util.List;

public class Main {

	static Double doubleAndSum7(List<Integer> items) {
		Double result = 0.0;
		for (Integer item: items) {
			result += 2.0 * item;
		}
		return result;
	}

	static Double doubleAndSum8(List<Integer> items) {
		return items
				.stream()
				.mapToDouble(e -> e * 2)
				.sum();
	}

	public static void main(String[] args) {
		List<Integer> items = Arrays.asList(1, 2, 3);
		System.out.println(doubleAndSum7(items));
		System.out.println(doubleAndSum8(items));
	}
}
