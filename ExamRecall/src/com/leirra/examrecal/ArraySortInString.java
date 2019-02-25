package com.leirra.examrecal;

import java.util.Arrays;

public class ArraySortInString {

	public static void main(String[] args) {
		String[] arr = new String[] { "redfield", "zoe", "mia", "oppo", "natalia", "baker" };
		ArraySortInString a = new ArraySortInString();
		System.out.println("Array before sorting: " + Arrays.toString(arr) 
		+ "\nArray after sorting alphabetically: " + Arrays.toString(a.solution(arr)));
	}

	public String[] solution(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				String tmp = "";
				if (arr[i].compareTo(arr[j]) > 0) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

}
