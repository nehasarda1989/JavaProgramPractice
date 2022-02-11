package practice.array;

public class FindLargest {
	
	public static void main(String[] args) {
		
		int[] arr = { 12, 4, 67, 4, 23, 56, 4, 78, 34, 12 };
		FindLargest findLargest = new FindLargest();
		findLargest.getLargestElement(arr);
	}

	private void getLargestElement(int[] arr) {
		
		int large = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>large) {
				large = arr[i];
			}
		}
		System.out.println("Largest element is : " + large);
	}

}
