package practice.array;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = { 12, 4, 67, 4, 23, 56, 4, 78, 34, 12 };
		RemoveDuplicates duplicates = new RemoveDuplicates();
		duplicates.removeDuplicateElements(arr);
	}

	private void removeDuplicateElements(int[] arr) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
				}
			}
		}

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				newArr[j++] = arr[i];
			}
		}
		
		for (int i=0; i<j; i++){  
            arr[i] = newArr[i];  
            System.out.print (" " + arr[i]);
        }  

	}
}
