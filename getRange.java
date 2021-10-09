
/*
  Explanation : Given a sorted array, A, with possibly duplicated elements,
find the indices of the first and last occurrences of a target element, x. Return -1 if the target is not found.
 * Example:
Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9
Output: [6,8]

Input: A = [100, 150, 150, 153], target = 150
Output: [1,2]

Input: A = [1,2,3,4,5,6,10], target = 9
Output: [-1, -1]

Input: A = [1, 2, 2, 2, 2, 3, 4, 7, 8, 8], target = 2
OutPut: [1,4]
*/

public class getRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,3,5,7,8,9,9,9,15};
		int target = 9;
		int[] correctAnswer = new int[2];
		correctAnswer = getRange(arr,target);
		System.out.println("[ " + correctAnswer[0] + "," + correctAnswer[1] + " ]");
	}

	public static int[] getRange(int [] array,int target) {
		int[] newArray = {-1,-1};
		for(int i=0; i < array.length;) {

			if(array[i] == target) {

				for(int j=i+1;j< array.length;j++) {

					if(array[i] != array[j]) {

						newArray[0] = i;
						newArray[1] = j-1;
						return newArray;

					}

				}

			} else if(array[i] != target) {
				i++;
			}

		}
		return newArray;
	}
}
