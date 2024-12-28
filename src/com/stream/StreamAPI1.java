package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI1 {
	public static void main(String[] args) {

		//single List-> one to one 
		ArrayList<String> list = new ArrayList<String>();
		list.add("ajay");
		list.add("sachin");
		list.add("vinit");
		list.add("samadhan");

		List<String> l = list.stream().
				map(s -> s).collect(Collectors.toList());
		System.out.println(l);
	}

}
