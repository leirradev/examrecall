package com.leirra.examrecal;

import java.util.Arrays;

public class ArrayReverseInString {

	public static void main(String[] args) {
		String[] arr = new String[] { "redfield", "zoe", "mia", "oppo", "natalia", "baker" };
		ArrayReverseInString a = new ArrayReverseInString();
		System.out.println("Array before sorting: " + Arrays.toString(arr) 
		+ "\nArray after sorting alphabetically in reverse: " + Arrays.toString(a.solution(arr)));
	}

	public String[] solution(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				String tmp = "";
				if (arr[j].compareTo(arr[i]) > 0) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

}
