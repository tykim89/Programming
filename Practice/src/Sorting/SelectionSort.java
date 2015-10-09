package Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void selectionSort(String[] input){
		
		int[] sort = new int[input.length];
		for(int i=0; i<input.length; i++){
			sort[i] = Integer.parseInt(input[i]);
		}
		
		int minIdx=0;
		for(int i=0; i<sort.length-1; i++){
			minIdx = i;
			
			for(int j=i+1; j<sort.length; j++){
				if(sort[minIdx]>sort[j]){
					minIdx = j;
				}
			}
			int temp = sort[minIdx];
			sort[minIdx] = sort[i];
			sort[i] = temp;
			
			System.out.println(sort[0]+" "+sort[1]+" "+sort[2]+" "+sort[3]+" "+sort[4]);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		
		selectionSort(input);
	}

}
