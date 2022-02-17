package practice.array;

public class AscendingOrder_hashset {

	public static void main(String[] args) {

		int[] arr = { 12, 4, 67, 4, 23, 56, 56, 4, 78, 34, 12 };
		AscendingOrder_hashset ascendingOrder = new AscendingOrder_hashset();
		ascendingOrder.getAscendingOrderArray(arr);
	}

	private void removeDuplicates(int[] arr) {
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
            System.out.print (arr[i]+" ");
        }  

	}

	private void getAscendingOrderArray(int[] newArr) {
		int temp;
		for (int i = 0; i < newArr.length; i++) {
			for (int j = i + 1; j < newArr.length; j++) {
				if (newArr[j] < newArr[i]) {
					temp = newArr[j];
					newArr[j] = newArr[i];
					newArr[i] = temp;
				}
			}
		}
		
		removeDuplicates(newArr);

	}
}
