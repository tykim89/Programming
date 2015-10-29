package skillUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class greatestLeastCommon {

	public static String greatestLeastCommDivisor(String[] num){
		int n = num.length;
		int[] no = new int[n];
		
		for(int i=0; i<n; i++){
			no[i] = Integer.parseInt(num[i]);
		}
		
		int G = no[0];
		int B = no[0];
		for(int i=1; i<n; i++){
			G = greatestComm(G, no[i]);
			B = B*no[i]/greatestComm(B, no[i]);
		}
		
		return Integer.toString(G) + " " + Integer.toString(B);
	}
	
	// 유클리드호제법
	public static int greatestComm(int a, int b){
		int big;
		int small;
		if(a>b){
			big=a;
			small=b;
		}else{
			big=b;
			small=a;
		}
		if(small==0){
			return big;
		}else{
			return greatestComm(small, big%small);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>10 || N<2){
			return;
		}
		
		sc.nextLine();
		String[] num = sc.nextLine().split(" ");
		
		if(num.length!=N){
			System.out.println("N개를 정확히 입력해주세요.");
			return;
		}

		System.out.println(greatestLeastCommDivisor(num));
	}

}
