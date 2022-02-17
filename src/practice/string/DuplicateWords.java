package practice.string;

public class DuplicateWords {
	public static void main(String[] args) {

		String str = "My name is Neha123!@ neha is My name";
		DuplicateWords duplicateWords = new DuplicateWords();
		duplicateWords.findAllDuplicates(str);
	}

	private void findAllDuplicates(String str) {

		String[] s = str.split(" ");
		int[] frq = new int[s.length];
		
		for (int i = 0; i < s.length; i++) {
			int count = 1;
			for (int j = i + 1; j < s.length; j++) {
				if (s[j].equals(s[i])) {
					count++;
					s[j] = "";
				}
				frq[i] = count;
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i] != "") {
				System.out.println("Array element : " + s[i] + " ----------- " + frq[i] + " times.");
			}
		}
		System.out.println("Only duplicate elements are : " );
		for (int i = 0; i < s.length; i++) {
			if (s[i] != "" && frq[i]>1) {
				System.out.println("Array element : " + s[i] + " ----------- " + frq[i] + " times.");
			}
		}
		System.out.println("Only unique elements are : " );
		for (int i = 0; i < s.length; i++) {
			if (s[i] != "" && frq[i]==1) {
				System.out.println("Array element : " + s[i] + " ----------- " + frq[i] + " times.");
			}
		}
	}
}
