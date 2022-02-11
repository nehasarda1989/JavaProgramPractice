package practice.array;

public class FindLargestSum {

	public static void main(String[] args) {

		int[] arr = { 1, 9, 5, 4 };
		FindLargestSum findLargestSum = new FindLargestSum();
		findLargestSum.getlargestSum(arr);
	}

	private void getlargestSum(int[] arr) {
		int temp, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + (arr[i]*i);
		}
		
		System.out.println("Largest sum is : " + sum);
	}
}
