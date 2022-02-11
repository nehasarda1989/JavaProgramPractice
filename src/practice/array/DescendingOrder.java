package practice.array;

public class DescendingOrder {

	public static void main(String[] args) {
		int[] arr = { 12, 4, 67, 4, 23, 56, 4, 78, 34, 12 };
		DescendingOrder descendingOrder = new DescendingOrder();
		descendingOrder.getDescendentOrder(arr);
	}

	private void getDescendentOrder(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Descending array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
