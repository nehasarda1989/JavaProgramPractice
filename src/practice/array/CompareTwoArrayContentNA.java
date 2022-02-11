package practice.array;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;

public class CompareTwoArrayContentNA {

	public static void main(String[] args) {

		int[] arr1 = { 12, 4, 67, 4, 23, 56, 56, 4, 78, 34, 12 };
		int[] arr2 = { 12, 4, 67, 4, 23, 56, 56, 4, 78, 34, 12 };
		int[] arr3 = { 56, 4, 78, 34, 12, 12, 4, 67, 4, 23, 56 };
		CompareTwoArrayContentNA twoArrayContent = new CompareTwoArrayContentNA();
//		twoArrayContent.compareArrays(arr1, arr2);
//		twoArrayContent.compareArr(arr1, arr2);
//		twoArrayContent.compareArr(arr1, arr3);
		twoArrayContent.checkArrayContent(arr1, arr3);
	}

	private void compareArrays(int[] arr1, int[] arr2) {

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Arrays have same content.");
		} else {
			System.out.println("Arrays are not same.");
		}

	}

	public void compareArr(int[] arr1, int[] arr2) {
		boolean flag = true;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				flag = false;
				System.out.println("Arrays are not equal.");
				break;
			}
		}
		if (flag == true) {
			System.out.println("Arrays are equal.");
		}
	}

	public void compArr(int[] arr1, int[] arr3) {
		boolean flag = true;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr3[i]) {
				flag = false;
				System.out.println("Arrays are not equal.");
				break;
			}
		}
		if (flag == true) {
			System.out.println("Arrays are equal.");
		}
	}

	public void checkArrayContent(int[] arr1, int[] arr3) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		int count = 0;
		// map1
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				count = map.get(arr1[i]);
				map.put(arr1[i], count + 1);
			} else {
				map.put(arr1[i], 1);
			}
		}
		// map2
		for (int i = 0; i < arr1.length; i++) {
			if (map1.containsKey(arr3[i])) {
				count = map1.get(arr3[i]);
				map1.put(arr3[i], count + 1);
			} else {
				map1.put(arr3[i], 1);
			}
		}

		for (java.util.Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() >= 1) {
				System.out.println(e.getKey() + " -- " + e.getValue());
			}
		}

		boolean flag = true;
		for (java.util.Map.Entry<Integer, Integer> e : map1.entrySet()) {
			for (java.util.Map.Entry<Integer, Integer> e1 : map1.entrySet()) {
				if (map.containsKey(map1)) {  // check this logic. Key should be checked one by one
					
					if (e.getValue() != e1.getValue()) {
						flag = false;
					}
				}
			}
		}
		if (flag) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}
	}
}
