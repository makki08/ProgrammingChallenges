public class Solution {

	public static void main(String[] args) {
		int arr[] =  {1,2,3,4,5};
		
		int numOfEven = 0;
		int numOfOdd = 0;
		int numOfEvenPair = 0;
		
		for  (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				numOfEven++;
			} else {
				numOfOdd++;
			}
		}

		numOfEvenPair = getNumOfPairs(numOfEven) + getNumOfPairs(numOfOdd);
		
		System.out.println(numOfEvenPair);
	}

	private static int getNumOfPairs(int num) {
		return ( num * (num - 1)) / 2;
	}
}
