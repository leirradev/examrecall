package com.leirra.examrecal;

public class IntegerReductionCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerReduceCount count = new IntegerReduceCount();
		String word = "9";
		System.out.println("Result: "+count.solution(word));
	}
	
	public int solution(String S) {
	    // convert binary string to integer
	    int num = Integer.parseInt(S);
	    //System.out.println("num is..." + num);
	    int counter = 0;
	    // while integer > 0
	    while (num > 0) {
	        // keep track of how many interations thru the loop
	        counter++;
	        // if integer is even, divide by 2
	        if (num % 2 == 0) {
	            num = num / 2;
	        } else {
	            // if integer is odd, subtract 1
	            num--;
	        }
	    }
	    return counter;
	}

}
