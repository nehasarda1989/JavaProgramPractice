package practice.string;

public class FindAllPermutations {
	//yet to do
	public static void main(String[] args) {

		String str = "ABC";
		FindAllPermutations permutations = new FindAllPermutations();
		permutations.getAllPermutations(str);
	}

	private void getAllPermutations(String str) {
		int len = str.length();
		System.out.println("All the permutations of the string are: ");
		generatePermutation(str, 0, len);
	}

	private void generatePermutation(String str, int start, int end) {
		if (start == end - 1)
			System.out.println(str);
		else {
			for (int i = start; i < end; i++) {

			}
		}
	}
}
