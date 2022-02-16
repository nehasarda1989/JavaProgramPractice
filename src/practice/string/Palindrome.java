package practice.string;

public class Palindrome {
	String reverse = "";

	public static void main(String[] args) {

		String str = "2radar";
		Palindrome palindrome = new Palindrome();
		palindrome.isSPalindrome(str);
	}

	private void isStringPalindrome(String str) {

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse string is : " + reverse);
		if (str.equals(reverse)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

	private void isPalindrome(String str) {
		Boolean flag = true;

		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

	private void isSPalindrome(String str) {
		Boolean flag = true;
		int i = 0, j = str.length() - 1;
		while(i<j) {
		
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}
		
		i++;
		j--;
	}
	if (flag) {
		System.out.println("String is palindrome");
	} else {
		System.out.println("String is not palindrome");
	}
	}

}
