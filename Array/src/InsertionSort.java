
public class InsertionSort {
	public static void selectionSort(int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(min > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String args[]) {
		int arr[] = {5,4,3,2,1};
		selectionSort(arr);
	}
}
