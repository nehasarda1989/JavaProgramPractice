package practice.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_HashSet {
	public static void main(String[] args) {

		int[] arr = { 12, 4, 67, 4, 23, 56, 56, 4, 78, 34, 12 };
		RemoveDuplicates_HashSet duplicates_HashSet = new RemoveDuplicates_HashSet();
		duplicates_HashSet.removeDuplicates(arr);
	}

	private void removeDuplicates(int[] arr) {
		Set s = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
		System.out.println(s);
	}
}
