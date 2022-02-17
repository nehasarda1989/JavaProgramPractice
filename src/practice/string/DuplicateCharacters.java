package practice.string;

public class DuplicateCharacters {
	public static void main(String[] args) {

		String str = "My name is Neha";
		str = str.replaceAll(" ", "");
		DuplicateCharacters duplicateCharacters = new DuplicateCharacters();
		duplicateCharacters.findAllDuplicateChars(str);
	}

	private void findAllDuplicateChars(String str) {

		int[] frq = new int[str.length()];
		char string[] = str.toCharArray();  
		
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j]) {
					string[j] = '0';
					count++;
				}
				frq[i] = count;
			}
		}
		for (int i = 0; i < frq.length; i++) {
			if (str.charAt(i) != '0'&& string[i] != ' ' ) {
				System.out.println("Char : " + str.charAt(i) + "-----Occurs : " + frq[i]);
			}
		}
		System.out.println("Only duplicate chars are : " );
		for (int i = 0; i < str.length(); i++) {
			if (string[i] != '0'&& frq[i]>1) {
				System.out.println("Char : " + str.charAt(i) + "-----Occurs : " + frq[i]);
			}
		}
	}
}
