package practice.string;

public class CountVowelsConsonants {
	public static void main(String[] args) {

		String str = "This is a 123 really simple sentence";
		CountVowelsConsonants countVowelsConsonants = new CountVowelsConsonants();
		countVowelsConsonants.countTypesOfChars(str);
	}

	private void countTypesOfChars(String str) {
		str = str.toLowerCase();
		int vCount = 0, cCount = 0, dCount=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				dCount++;
			}
		}

		System.out.println("Length of the string is : " + str.length());
		System.out.println("Consonants : " + cCount);
		System.out.println("Cowels : " + vCount);
		System.out.println("Digits : " + dCount);
	}
}
