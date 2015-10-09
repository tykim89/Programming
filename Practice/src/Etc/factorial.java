package Etc;

import java.util.Scanner;

public class factorial {

	public static int factorial(int n){
		
		if(n>0){
			if(n==1){
				System.out.print(n);
			}else{
				System.out.print(n + " * ");
			}
			return n*factorial(n-1);
		}else{
			System.out.println();
			return 1;
		}
		
/*		if(n==0){
			return 1;
		}else{
			return n*factorial(n);
		}
*/		
	}
	
	public static void main(String[] args) {

		while(true){
			
			System.out.print("N factorial, N을 입력하세요 : ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			if(n==0){
				break;
			}
			
			System.out.println(n + "! = " + factorial(n));
			System.out.println();

		}
		
	}

}
