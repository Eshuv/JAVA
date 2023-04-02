import java.util.Arrays;
import java.util.*;

public class SpiralMatrix {
	public static void spiralMatrix(int arr[][]) {
		int top = 0;
		int down = arr.length -1;  // length is l-1
		int left = 0;
		int right = arr[0].length-1;
		int dir = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr[0].length; j++) {
				if(top <= down && left <= right) {
					if(dir == 0) {
						System.out.print(arr[top][j]);
						top++;
					}
					else if(dir == 1) {
						System.out.print(arr[right][j]);
						right--;
					}
					else if(dir == 2) {
						System.out.print(arr[down][down-j]);
						down--;
					}
					else if(dir == 3) {
						System.out.print(arr[i--][left]);
						left++;
					}
				}
			}
			if(dir < 4) {
				dir++;
			}
			else {
				dir = dir%4; 
			}
		}
	}
	public static void main(String args[]) {
		int matrix[][] = {{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12},
							{13,14,15,16}};
		
		spiralMatrix(matrix);
	}
}
