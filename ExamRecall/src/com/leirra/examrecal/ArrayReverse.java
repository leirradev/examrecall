package com.leirra.examrecal;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
		ArrayReverse a = new ArrayReverse();
		System.out.println("Array before reverse: " + Arrays.toString(array) + "\nArray after reverse: "
				+ Arrays.toString(a.solution(array)));
	}

	public int[] solution(int[] array) {
		int[] array2 = array;
		int count = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			array2[count] = array[i];
			count++;
		}
		return array;

		/*
		 * int count = 0; int[] array = new int[]{ 1, 4, 9, 16, 9, 7, 4, 9, 11 };
		 * for(int i = array.length-1; i >= count; i--) { int x = array[i]; array[i] =
		 * array[count]; array[count] = x; count++; }
		 */
	}
}
