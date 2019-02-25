package com.leirra.examrecal;

public class FloydsTriangle {

	public static void main(String[] args) {
		FloydsTriangle f= new FloydsTriangle();
		int a = 6;
		System.out.println("Input: "+f.solution(a));
	}
	public int solution(int i) {
		//int j,k;
		for(int j = 1; j<=i;j++) {
			for(int k = 1; k<=j;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return i;
	}
}
