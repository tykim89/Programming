package Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void bubbleSort(String[] input){
		
		int[] sort = new int[input.length];
		for(int i=0; i<input.length; i++){
			sort[i] = Integer.parseInt(input[i]);
		}
		
		boolean flag;
		
		for(int i=0; i<sort.length-1; i++){
			flag = false;
			
			for(int j=0; j<sort.length-1; j++){
				if(sort[j]>sort[j+1]){
					flag = true;
					int temp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = temp;
				}
			}
			if(flag==false){
				break;
			}
			System.out.println(sort[0]+" "+sort[1]+" "+sort[2]+" "+sort[3]+" "+sort[4]);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		
		bubbleSort(input);
	}

}
