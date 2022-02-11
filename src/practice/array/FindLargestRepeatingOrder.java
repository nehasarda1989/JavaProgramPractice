package practice.array;

public class FindLargestRepeatingOrder {
	
	public static void main(String[] args) {

		int[] arr = {2, 4, 7, -5, 2, 4, 7, 4, 7, 0};
		FindLargestRepeatingOrder findLargestRepeatingOrder = new FindLargestRepeatingOrder();
		findLargestRepeatingOrder.getLonestRepeatingOrder(arr);
	}

	private void getLonestRepeatingOrder(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
