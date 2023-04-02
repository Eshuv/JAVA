
public class Question1 {
	public static void sameElement(int arr[]) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count > max) {
				max = count;
			}
		}
		if(max > 0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	public static void main(String args[]) {
		int arr[] = {1,2,3,4};
		sameElement(arr);
	}
}
