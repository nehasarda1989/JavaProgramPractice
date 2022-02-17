package practice.string;

public class SwapCornerReverseMiddle {
	public static void main(String[] args) {

		String str = "Sarda";
		SwapCornerReverseMiddle reverseMiddle = new SwapCornerReverseMiddle();
		reverseMiddle.reverseOnlyMiddleString(str);
	}

	private void reverseOnlyMiddleString(String str) {
		String rev = "";
		char start = str.charAt(0);
		char last = str.charAt(str.length()-1);
		
		for (int i = str.length()-2; i > 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Desired output string is : " + last + rev + start);
		
	}
}
