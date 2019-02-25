package com.leirra.examrecal;

import java.util.Arrays;

public class TestingComputeMin {

	public static void main(String[] args) {
		TestingComputeMin e = new TestingComputeMin();
		int num = 3;
		System.out.println("An Array to print and repeat its element is the number " + num + " \nAnswer: "
				+ Arrays.toString(e.solution(num)));
		int[] f = { 5, 4, 5, 6, 3 };
		System.out.println(e.find_min(f));
	}

	public int[] solution(int N) {
		int[] x = new int[N];
		return x;
	}

	public int find_min(int A[]) {
		int ans = A.length;
		for (int i = 1; i < A.length; i++) {
			if (ans > A[i]) {
				ans = A[i];
			}
		}
		return ans;
	}
}
