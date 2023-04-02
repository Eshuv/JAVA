
public class Question3 {
	public static void stockProfit(int arr[]) {
		int max = 0;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				count = 0;
				if(arr[j] > arr[i]) {
					count = arr[j] - arr[i];
					if(count > max) {
						max = count;
					}
				}
			}
		}
		System.out.println(max);
	}
	public static void main(String args[]) {
		int arr[]= {7, 6, 4,  3, 1};
		stockProfit(arr);
	}
}
