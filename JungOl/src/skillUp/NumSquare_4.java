package skillUp;

import java.util.Scanner;

public class NumSquare_4 {

	public static void square(int n, int m){
		if(n>100 || m>3 || m==0){
			return;
		}
		
		if(m==1){
			int num=1;
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					System.out.print(num+" ");
				}
				num++;
				System.out.println();
			}
		}
		
		if(m==2){
			int num=1;
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(i%2==0){
						System.out.print(num+" ");
						num++;
					}else{
						num--;
						System.out.print(num+" ");
					}
				}
				System.out.println();
			}
		}
		
		if(m==3){
			for(int i=1; i<=n; i++){
				for(int j=1; j<=n; j++){
					if(i==1){
						System.out.print(j+" ");
					}else{
						System.out.print((j*i)+" ");
					}
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		square(n, m);
	}

}
