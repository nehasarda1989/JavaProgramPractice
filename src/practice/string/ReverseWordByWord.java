package practice.string;

public class ReverseWordByWord {
	public static void main(String[] args) {

		String str = "My name is Neha123!@";
		ReverseWordByWord reverseWordByWord = new ReverseWordByWord();
		reverseWordByWord.reverseWords(str);
	}

	private void reverseWords(String str) {
		String[] s = str.split(" ");
		for(int i=s.length-1; i>=0; i--) {
			System.out.print(s[i] + " ");
		}
	}
}
