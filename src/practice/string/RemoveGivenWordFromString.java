package practice.string;

public class RemoveGivenWordFromString {
	public static void main(String[] args) {

		String stringToRemove = "is";
		String str = "My name is Neha123!@";
		RemoveGivenWordFromString givenWordFromString = new RemoveGivenWordFromString();
		givenWordFromString.removeGivenWord(str, stringToRemove);
	}

	private void removeGivenWord(String str, String string) {
		String[] s1 = str.split(" ");
		StringBuilder sb=new StringBuilder();
		if (str.contains(string)) {
			for (int i = 0; i < s1.length; i++) {
				if (s1[i].equals(string)) {
					continue;
				}
				sb.append(s1[i] +" ");
				
			}
		}
		System.out.println("New string is : " + sb);
	}
}
