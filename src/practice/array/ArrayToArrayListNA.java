package practice.array;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayListNA {
	public static void main(String[] args) {

		int[] arr = { 12, 4, 67, 4, 23, 56, 56, 4, 78, 34, 12 };
		ArrayToArrayListNA arrayList = new ArrayToArrayListNA();
		arrayList.convertArrayToArrayList(arr);
	}

	private void convertArrayToArrayList(int[] arr) {

		List<int[]> al = Arrays.asList(arr);
		for(int[] i:al) {
			System.out.println(i.toString());
		}
	}
}
