package practice.string;

public class RotationalString {
	static String str1 = "abcde";
	String str2 = "deabc";
	String str;

	public static void main(String[] args) {

		RotationalString rotationalString = new RotationalString();
		rotationalString.isRotational(str1);
	}

	private void isRotational(String str) {

		str = str1 + str1;
		if (str.indexOf(str2) != -1) {
			System.out.println("Second string is a rotation of first string");
		} else {
			System.out.println("Second string is not a rotation of first string");
		}
	}
}
