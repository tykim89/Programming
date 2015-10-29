package sorting;

import java.util.Scanner;

public class QuickSort {

	static void swap(int[] arr, int firstIdx, int secondIdx){
		int temp = arr[firstIdx];
		arr[firstIdx] = arr[secondIdx];
		arr[secondIdx] = temp;
	}
	
	static int partition(int[] arr, int left, int right){
		int pivot = arr[left];
		int low = left + 1;
		int high = right;
		
		while(low<=high){
			while(pivot>=arr[low] && low<=right)
				low++;
			
			while(pivot<=arr[high] && high>=(left+1))
				high--;
			
			if(low<=high)
				swap(arr, low, high);
		}
		
		swap(arr, left, high);
		return high;
	}
	
	static void quickSort(int[] arr, int left, int right){
		if(left<=right){
			int pivot = partition(arr, left, right);
			
			quickSort(arr, left, pivot-1);
			quickSort(arr, pivot+1, right);
		}
	}
	
	public static void main(String[] args) {
		int[] arr;
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		
		arr = new int[str.length];
		for(int i=0; i<str.length; i++){
			arr[i] = Integer.parseInt(str[i]);
		}
		
		quickSort(arr, 0, arr.length-1);
	}

}
