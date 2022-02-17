package practice.string;

public class FindlongestRepeatingSequence {
	public static void main(String[] args) {

		String str = "acbdfghybdf";
		FindlongestRepeatingSequence repeatingSequence = new FindlongestRepeatingSequence();
		repeatingSequence.longestRepeatativeString(str);
	}

	private void longestRepeatativeString(String str) {
		String l = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				String s = findLongSubString(str.substring(i, str.length()), str.substring(j, str.length()));
				if (s.length() > l.length()) {
					l = s;
				}
			}
		}
		System.out.println("Longest repeatative string is : " + l);
	}

	private String findLongSubString(String s1, String s2) {
		int n = s2.length();
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				String sss = s1.substring(0, i);
				return s1.substring(0, i);
			}
		}
		return s1.substring(0, n);
	}
}
