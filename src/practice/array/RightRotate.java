package practice.array;

public class RightRotate {
	public static void main(String[] args) {

		int[] arr = { 12, 4, 67, 49, 23, 56};
		int arrLength = arr.length;
		RightRotate rightRotate = new RightRotate();
		rightRotate.rotateElementsToRight(arr, arrLength);
	}

	private void rotateElementsToRight(int[] arr, int arrLength) {
		
		for (int i = 0; i < 3; i++) {
			int last = arr[arrLength - 1];
			for (int j = arr.length-1; j >0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	} 
}