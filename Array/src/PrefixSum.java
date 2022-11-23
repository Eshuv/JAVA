import java.util.*;
import java.util.Arrays;

public class PrefixSum {
	public static void prefixSum(int arr[]) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int prefix[] = new int[arr.length];
		
		prefix [0] = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			prefix[i] = prefix[i-1] + arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			int start = i;
			for(int j = i; j < arr.length; j++) {
				int end = j;
				sum = 0;
//				
				sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
			}
			if(max < sum) {
				max= sum;
			}
		}
		System.out.println(max);
	}
	public static void main(String args[]) {
		int arr[] = {2,4,6,8,10};
		
		prefixSum(arr);
	}
}
