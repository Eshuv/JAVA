
public class SubArray {
	public static void subArray(int arr[]) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			int start = i;
			for(int j = i; j < arr.length; j++) {
				int end = j;
				sum = 0;
//				System.out.print("(");
				for(int k = start; k <= end; k++) {
//					System.out.print(" " + arr[k] + " ");
					sum = sum + arr[k];
				}
//				System.out.println(")");
			}
			if(max < sum) {
				max= sum;
			}
		}
		System.out.println(max);
	}
	public static void main(String args[]) {
		int arr[] = {2,4,6,8,10};
		
		subArray(arr);
	}
}
