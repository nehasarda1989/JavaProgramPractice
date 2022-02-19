package practice.array;

public class FindOddEvenNumbers {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 7, -5, 2, 4, 7, 4, 7, 0 };
		FindOddEvenNumbers evenNumbers = new FindOddEvenNumbers();
		evenNumbers.getOddEvenNumbers(arr);
	}

	private void getOddEvenNumbers(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> 0 && arr[i]%2==0) {
				System.out.println(arr[i] + " Number is even.");
			}else if (arr[i]%2==1){
				System.out.println(arr[i] + " Number is odd.");
			}else {
				System.out.println("Number is not integer.");
			}
		}
	}
}