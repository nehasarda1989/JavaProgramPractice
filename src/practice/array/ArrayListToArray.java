package practice.array;

import java.util.List;
import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		ArrayListToArray listToArray = new ArrayListToArray();
		listToArray.convertArrayListToArray(arr);
	}

	private void convertArrayListToArray(List<Integer> arr) {
		int[] arr1 = new int[arr.size()];

		for (int i = 0; i < arr.size(); i++) {
			arr1[i] = arr.get(i);
			System.out.print(" " + arr1[i]);
		}
	}
}
