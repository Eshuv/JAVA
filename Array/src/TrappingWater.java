import java.util.*;
import java.util.Arrays;

public class TrappingWater {
	public static void trappingWater(int arr[]) {
		int lefthigh[] = new int[arr.length];	
		int righthigh[] = new int[arr.length];
		int leftheight = 0;
		int rightheight = 0;
		int water = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(leftheight < arr[i]) {
				leftheight = arr[i];
				lefthigh[i] = leftheight;
			}else {
				lefthigh[i] = leftheight;
			}
		}
		for(int i = arr.length-1; i >=0 ; i--) {
			if(rightheight < arr[i]) {
				rightheight = arr[i];
				righthigh[i] = rightheight;
			}else {
				righthigh[i] = rightheight;
			}
		}
		
		for(int i = 1; i <arr.length-1; i++) {
			if((lefthigh[i] > arr[i]) && (righthigh[i] > arr[i])) {
				if(lefthigh[i] > righthigh[i]) {
					water +=  (righthigh[i] - arr[i]);
				}
				else {
					water += (lefthigh[i] - arr[i]);
				}
			}
		}
		System.out.println(water);
		
	}
	public static void main(String args[]) {
		int arr[] = {1,3,2,6,0,2,5,3};
		trappingWater(arr);
	}
}
