package com.leirra.examrecal;

public class WordsInSentence {
	public static void main(String args[]) {
		/*
		 * String userEssay =
		 * "Kahit ikaw ay magalit. sayo lang lalapit! kahit di ka na sakin?";
		 * WordsInSentence c = new WordsInSentence();
		 * System.out.println("The largest word for\n" + userEssay + "\nis: " +
		 * c.solution(userEssay));
		 */

		String str = "Kahit ikaw ay magalit. sayo lang lalapit! kahit di ka na sakin?";
		WordsInSentence w = new WordsInSentence();
		System.out.println("The largest number of words in sentence below\n" + str + "\nis: " + w.solution(str));
	}

	public int solution(String num) {
		if (num.length() < 1)
			return 0;
		int maxCount = 0;
		int count = 0;
		String[] splits = num.split(" ");
		if (splits.length < 1)
			return 0;
		for (int i = 1; i < splits.length; i++)
			if (splits[i].contains(".") || splits[i].contains("!") || splits[i].contains("?")) {
				if (count > maxCount)
					maxCount = count;
				count = 0;
			} else
				count++;
		return maxCount+1;
	}

	/*
	 * public int solution(String userEssay) { String essayInput = userEssay.trim();
	 * 
	 * String[] tokens = essayInput.split("[.?!]+");
	 * 
	 * int numTokens = tokens.length;
	 * 
	 * String[] words = essayInput.split("[ ]+"); int numwords = words.length; int
	 * numwordspersentence = 0;
	 * 
	 * for (int i = 0; i < numTokens; i++) { String[] wordspersentence =
	 * tokens[i].split("[ ]"); numwordspersentence += wordspersentence.length ; }
	 * return numwordspersentence; }
	 */
}
