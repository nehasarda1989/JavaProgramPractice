package practice.string;

import java.util.Arrays;

public class AnagramStrings {
	public static void main(String[] args) {

		String str1 = "Grba";
		String str2 = "BRAG";

		AnagramStrings anagramStrings = new AnagramStrings();
		anagramStrings.checkAnagramStrings(str1, str2);
	}

	private void checkAnagramStrings(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		Boolean flag = true;

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (ch1.length == ch2.length) {
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					flag = false;
					System.out.println("Strings are not anagrams");
					break;
				}
			}
			if(flag) {
				System.out.println("Strings are anagrams");
			}
		}
	}
}
