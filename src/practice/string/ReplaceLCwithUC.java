package practice.string;

public class ReplaceLCwithUC {
	static StringBuffer newStr ;

	public static void main(String[] args) {

		String str = "Great 14353 Power";
		newStr = new StringBuffer(str);
		ReplaceLCwithUC replaceLCwithUC = new ReplaceLCwithUC();
		replaceLCwithUC.chnageToUc(newStr);
	}

	private void chnageToUc(StringBuffer str) {

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));  
			} else if (Character.isUpperCase(str.charAt(i))) {
				 newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("String after case conversion : " + newStr);
	}
}