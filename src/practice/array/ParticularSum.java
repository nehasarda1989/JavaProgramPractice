package practice.array;

public class ParticularSum {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 7, -5, 3, -10, 16};
		ParticularSum particularSum = new ParticularSum();
		particularSum.getTripleNumberSum(arr);
	}

	private void getTripleNumberSum(int[] arr) {
		int sum = 1;
		int newSum = 0;
		int reqNum;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				newSum = arr[i] + arr[j];
				reqNum = (newSum - sum) * -1;
				System.out.println("reqNum : " + reqNum);
				
				for(int k = j+1; k<arr.length; k++) {
					if(arr[k] == reqNum) {
						System.out.println("The required number is : " + arr[k]);
						System.out.println("All three numbers are : " + arr[i] +" "+ arr[j] +" "+ arr[k]);
					}
				}
			}
		}
	}
}
