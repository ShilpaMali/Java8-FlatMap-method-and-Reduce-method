package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI2 {
	public static void main(String[] args) {

		// one to many-> multiple List
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(10, 20));
		list.add(Arrays.asList(30, 40));
		list.add(Arrays.asList(50, 60));
		list.add(Arrays.asList(70, 80));
		List<Integer> l1 = list.stream().
				flatMap(p -> p.stream()).
				collect(Collectors.toList());
		System.out.println(l1);
	}

}
