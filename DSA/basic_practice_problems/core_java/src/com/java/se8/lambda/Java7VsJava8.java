package com.java.se8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java7VsJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Sam","Peter","John","Sam");
		List<String> uniqueList = new ArrayList<>();
		for(String name : names) {
			if(!uniqueList.contains(name)) {
				uniqueList.add(name);
			}
		}
		System.out.println(uniqueList);
		List<String> uniqueList1 = new ArrayList<>();
		uniqueList1 = names.stream()
				.distinct().collect(Collectors.toList());
		System.out.println(uniqueList1);
		}


}
