package practice.string;

public class ReverseEntireString {
	String rev="";
	public static void main(String[] args) {

		String str = "My name is Neha123!@";
		ReverseEntireString reverseEntireString = new ReverseEntireString();
		reverseEntireString.reverseString(str);
	}

	private void reverseString(String str) {
		
		for(int i = str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Original string is : " + str);
		System.out.println("Reverse string is  : " + rev);
	}

}
