package practice.array;

public class ThirdSmallestEle {
	public static void main(String[] args) {
		int[] arr = { 12, 2, 67, 4, 23, 56, 5, 78, 34, 122 };
		int arrayLength = arr.length;
		ThirdSmallestEle ele = new ThirdSmallestEle();
		ele.getThirdSmallestEle(arr, arrayLength);
	}

	private void getThirdSmallestEle(int[] arr, int arrayLength) {
		int smallest = arr[0];
		int temp;
		for (int i = 0; i < arrayLength; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascending array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

		System.out.println("\nThirst smallest number is : " + arr[2]);
	}
}
