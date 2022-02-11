package practice.array;

public class SmallestElement {
	
	private void getSmallestElement(int[] arr) {
		int small = arr[0];
				
			for(int i = 1; i<arr.length; i++) {
				if (arr[i]<small)
					small = arr[i];
			}
			System.out.println("Smallest number is : " + small);
		
	}
	
	public static void main(String[] args) {
		int [] arr = { 12, 4, 67, 4, 23, 56, 4, 78, 34, 12 };
		SmallestElement element = new SmallestElement();
		element.getSmallestElement(arr);
	}

}
