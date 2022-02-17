package practice.string;

public class SwapWithoutTemp {
	
	public static void main(String[] args) {

		String str1 = "Neha";
		String str2 = "Sarda";
		SwapWithoutTemp swapWithoutTemp = new SwapWithoutTemp();
		swapWithoutTemp.swapTheStrings(str1, str2);
	}

	private void swapTheStrings(String str1, String str2) {
		str1 = str1.concat(str2); //NehaSarda
		
		str2 = str1.substring(0, str1.length()-str2.length()); //NehaSarda - Sarda = Neha
		str1 = str1.substring(str2.length());
		System.out.println("Str1 : "+ str1);
		System.out.println("Str2 : "+ str2);
	}

}
