package skillUp;

import java.util.Scanner;

public class NumSquare_1 {

	public static void square(int n, int m){
		if(n>100 || m>100){
			return;
		}
		
		int num=1;
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		square(n, m);
	}

}
