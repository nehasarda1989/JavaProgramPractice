package practice.string;

public class DivideStringInParts {
	public static void main(String[] args) {

		String str = "My name is Neha123!@a";
		String str2 = "Peninslaviaa";
		DivideStringInParts divideStringInParts = new DivideStringInParts();
		divideStringInParts.divideStringInParts(str, 3);
	}

	private void divideStringInParts(String str, int len) {
		if(str.length()%len == 0) {
		for(int i = 0; i < str.length(); i =i + len) {
		System.out.println(str.subSequence(i , i+len));
		}
		}else {
			System.out.println("String cannot be diveded in even parts");
		}
	}
}
