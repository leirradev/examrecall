package com.leirra.examrecal;

public class LongestSentence {

	public static void main(String[] args) {
		LongestSentence l = new LongestSentence();
		String sentence = "sikretong malupet! pwedeng pabulong? mapapamura ka ng pakshet! malutong."
				.toLowerCase();
		System.out.println("The longest number of words in sentence below\n"+sentence
				+"\nis: "+l.solution(sentence));
	}

	public int solution(String s) {
		int maxCount = 0;
		int count = 0;
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++)
			if (split[i].contains(".") || split[i].contains("!") || split[i].contains("?")) {
				if (count > maxCount) {
					maxCount = count;
				}
				count = 0;
			} else {
				count++;
			}
		return maxCount + 1;
	}
}
