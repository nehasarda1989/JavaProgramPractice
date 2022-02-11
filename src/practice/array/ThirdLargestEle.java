package practice.array;

public class ThirdLargestEle {
	
	public static void main(String[] args) {
		int [] arr = { 12, 4, 67, 4, 23, 56, 4, 78, 34, 12 };
		int arrayLength = arr.length;
		ThirdLargestEle ele = new ThirdLargestEle();
		ele.getThirdLargestEle(arr, arrayLength);
	}

	private void getThirdLargestEle(int[] arr, int arrayLength) {
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				
				 if(arr[j]<arr[i]) {
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		
		System.out.println("\nThird largest element is : " + arr[arrayLength-3]);
	}
}
