package practice.array;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates_HashMap {

	public static void main(String[] args) {

		int[] arr = { 12, 4, 67, 4, 23, 56, 56, 4, 78, 34, 12 };
		FindDuplicates_HashMap ascendingOrder = new FindDuplicates_HashMap();
		ascendingOrder.removeDuplicates(arr);
	}

	private void removeDuplicates(int[] newArr) {
		int value = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < newArr.length; i++) {
			if (map.containsKey(newArr[i])) {
				value = map.get(newArr[i]);
				map.put(newArr[i], value + 1);
			} else {
				map.put(newArr[i], 1);
			}
		}
		System.out.println("Array after removing duplicates : ");
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			System.out.println(m.getKey());
		}

		System.out.println("Duplicates elements are : ");
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey());
			}
		}
	}
}