package practice.string;

public class ReplaceSpacesWithDash {
	public static void main(String[] args) {

		String str = "My name is Neha123!@";
		ReplaceSpacesWithDash replaceSpacesWithDash = new ReplaceSpacesWithDash();
		replaceSpacesWithDash.replaceSpacesWithDash(str);
	}

	private void replaceSpacesWithDash(String str) {
		System.out.println(str.replace(' ', '-'));
	}
}
