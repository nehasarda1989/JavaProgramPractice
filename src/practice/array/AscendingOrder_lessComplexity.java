package practice.array;

public class AscendingOrder_lessComplexity {

	public static void main(String[] args) {

		int[] arr = { 12, 4, 67, 4, 23, 56, 56, 4, 78, 34, 12 };
		AscendingOrder_lessComplexity ascendingOrder = new AscendingOrder_lessComplexity();
		ascendingOrder.getAscendingOrderArray(arr);
	}

	private void removeDuplicates(int[] arr) {
		int[] newArr = new int[arr.length];
		int firstElement = arr[0];
		newArr[0] = arr[0];
		int j=1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == firstElement) {
				continue;
			}
			firstElement= arr[i];
			newArr[j++] = arr[i];
		}
		
		for (int i=0; i<j; i++){
            System.out.print (newArr[i]+" ");
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
