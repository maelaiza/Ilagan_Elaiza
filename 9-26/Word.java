package Ilagan_Lesson6Activity1;

public class Word {

	public static int search(String sentence, String searchWord) {
		int result = 0;
		int index = sentence.indexOf(searchWord);
		if (index == -1) {
			return -1;
		}
		for (int i = 0; i < index; i++) {
			if(sentence.charAt(i) == ' ') {
				result++;
			}
		}
		return result + 1;
	}

	public static void main(String[] args) {
		String sentence ="Guitar is my favorite musical instrument";
		String searchWord = "cal";
		
		System.out.println("index: " + search(sentence,searchWord));
	}

	

	
}

	
