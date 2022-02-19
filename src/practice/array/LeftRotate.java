package practice.array;

public class LeftRotate {
	public static void main(String[] args) {

		int[] arr = { 12, 4, 67, 49, 23, 56};
		int arrLength = arr.length;
		LeftRotate leftRotate = new LeftRotate();
		leftRotate.rotateElementsToLeft(arr, arrLength);
	}

	private void rotateElementsToLeft(int[] arr, int arrLength) {
		
		for(int i=0; i<2;i++) {
			int first = arr[0];
			for(int j=0;j<arrLength-1; j++) {
				arr[j]=arr[j+1];
			}
			
			arr[arrLength-1]=first;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
 