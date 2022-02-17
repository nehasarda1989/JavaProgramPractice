package practice.string;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {

		String str = "My name is Neha123!@";
		RemoveWhiteSpaces removeWhiteSpaces = new RemoveWhiteSpaces();
		removeWhiteSpaces.removeWhiteSpaces(str);
	}

	private void removeWhiteSpaces(String str) {
		System.out.println(str.replaceAll("\\s+", ""));
	}


}
