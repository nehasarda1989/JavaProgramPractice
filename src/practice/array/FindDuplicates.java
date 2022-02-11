package practice.array;

public class FindDuplicates {
	
	private void printDuplicates(int[] arr) {
		System.out.println("Duplicate elements of array are : " );
		for(int i = 0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(" "+arr[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12, 4, 67, 23, 56, 4, 78, 34, 12};
		FindDuplicates duplicates = new FindDuplicates();
		duplicates.printDuplicates(arr);
	}

}
