
public class MergeSort {
	
	public static void mergeSort(int arr[], int si, int ei) {
		if(si >= ei) {
			return;
		}
		int mid = (si+ei)/2;
		mergeSort(arr, si, mid); //for left part
		mergeSort(arr, mid+1, ei); // for right part
		merge(arr, si, mid, ei);
	}
	
	public static void merge(int arr[], int si, int mid, int ei) {
		int temp[] = new int[ei-si+1];
		int i = si; // left iterator
		int j = mid+1; // right iterator
		int k = 0; // temp array iterator
		
		while(i <= mid && j <= ei) {
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
			
		}
		
		// left part
		while(i <= mid) {
			temp[k++] = arr[i++];
		}
		
		// right part
		while(j <= ei) {
			temp[k++] = arr[j++];
		}
		
		for(k = 0, i = si; k < temp.length; k++, i++) {
			arr[i] = temp[k];
		}
		
		
	}
	
	public static void main(String args[]) {
		int arr[] = {0,5,4,3,2,1};
		int sz = arr.length - 1;
		
		mergeSort(arr, 0, sz);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
