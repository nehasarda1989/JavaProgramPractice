package practice.array;

public class CountFrequency {

	private void getFrequency(int[] arr) {

		int[] frq = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = 0;
				}
				frq[i] = count;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println("Array element " + arr[i] + " | " + frq[i] + " times.");
			}
		}
	}

	private void getDuplicatesOnly(int[] arr) {
		int[] frq = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = 0;
				}
				frq[i] = count;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && frq[i]!=1) {
				System.out.println("Duplicate element from the array is : " + arr[i]);
			}
		}
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		int[] arr = { 12, 4, 67, 4, 23, 56, 4, 78, 34, 12 };
		CountFrequency countFrequency = new CountFrequency();
		//countFrequency.getDuplicatesOnly(arr);
		countFrequency.getFrequency(arr);
		
	}
}