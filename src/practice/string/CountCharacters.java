package practice.string;

public class CountCharacters {
	
	public static void main(String[] args) {

		String str = "My name is Neha123!@";
		CountCharacters countCharacters = new CountCharacters();
		countCharacters.countChars(str);
	}

	private void countChars(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
			if(str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Number of characters in the strings are : " + count);
	}

}
