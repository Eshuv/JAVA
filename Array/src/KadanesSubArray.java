import java.util.*;

public class KadanesSubArray {
	public static void kadanes(int arr[]) {
		int max = Integer.MIN_VALUE;
		int currentSum = 0;
		for(int i = 0; i < arr.length; i++) {
			currentSum +7 arr[i];
			if (currentSum < 0) {
				currentSum = 0;
			}
			if(max < currentSum) {
				max = currentSum;
			}
		}
		System.out.println(max);
	}
	public static void main(String args[]) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		kadanes(arr);
	}
}
