package Sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void insertionSort(String[] input){
		
		int[] sort = new int[input.length];
		for(int i=0; i<input.length; i++){
			sort[i] = Integer.parseInt(input[i]);
		}
		
		for(int i=1; i<sort.length; i++){
			int temp = sort[i];
			
			for(int j=0; j<i; j++){
				if(sort[j]>temp){
					temp = sort[j];
					sort[j] = sort[i];
				}
				
				sort[i] = temp;
			}
			
			System.out.println(sort[0]+" "+sort[1]+" "+sort[2]+" "+sort[3]+" "+sort[4]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		
		insertionSort(input);
	}

}
