package practice.array;

public class AscendingOrderMultiArray {

	public static void main(String[] args) {

		int[] arr1 = { 12, 4, 67, 34, 12 };
		int[] arr2 = { 6, 90, 42, 4, 23, 89 };
		AscendingOrderMultiArray arr = new AscendingOrderMultiArray();
		arr.getAscendingOrderArrays(arr1, arr2);
	}

	private void getAscendingOrderArrays(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		int var;
		for (int j = 0; j < arr1.length; j++) {
			arr3[j] = arr1[j];
		}
		for (int j = 0; j < arr2.length; j++) {
			arr3[arr1.length+j] = arr2[j];
		}

		System.out.println("Combined ascending array is : ");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = i + 1; j < arr3.length; j++) {
				if (arr3[j] < arr3[i]) {
					var = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = var;
				}
			}
		}

		for (int j = 0; j < arr3.length; j++) {
			System.out.print(arr3[j]+" ");
		}
		
		//Removing duplicates
		for (int i = 0; i < arr3.length; i++) {
			for (int j = i + 1; j < arr3.length; j++) {
				if (arr3[j] == arr3[i]) {
					arr3[j] = 0;
				}
			}
		}
		int[] nArr = new int[arr3.length];
		int m=0;
		for (int i = 0; i < arr3.length; i++) {
			if(arr3[i]!=0) {
				nArr[m++] = arr3[i];
			}
		}
		System.out.println("\n\nArray after removing duplicates : ");
		for(int i =0; i<m;i++) {
			System.out.print(nArr[i]+" ");
		}

	}
}
