package com.leirra.examrecal;

public class FizzBuzz {

	public static void main(String[] args) {
		FizzBuzz f = new FizzBuzz();
		String num = "";
		System.out.println(f.solution(num));
	}

	public String solution(String a) {
		for (int i = 1; i <= 100; i++)
			if (i % 3 == 0 && i % 5 == 0)
				a+="FizzBuzz\n";
			else if (i % 3 == 0)
				a+="Fizz\n";
			else if (i % 5 == 0)
				a+="Buzz\n";
			else
				a+=i +  "\n";
		return a;
	}
}
