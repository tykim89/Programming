package samsungCodeGround;

import java.util.Scanner;

public class RoomOfMystery {
	
	//6 *6 이중 배열
	//0,0 
	/*
	 * u : [i-1][j]
	 * d : [i+1][j]
	 * l : [i][j-1]
	 * r : [i][j+1]
	 */
/*	
	public static move(){
		int k=10;
		int sum=0;
		int w=0, h=0;
		for(int i=0;i<k;i++){
			if(u){
				sum += arr[w--][h];
			}
			else if(d){
				sum += arr[w++][h];
			}
			else if(l){
				sum += arr[w][h--];
			}
			else{
				sum += arr[w][h++];
			}
		}
		
	}
*/	
	public static void main(String[] args) throws Exception{
		int T;
		int test_case;
		int N;
		int K;
		int x, y;
		int sum;
		String[] location;
		
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		if(T>50 || T==0) return;
		for(test_case=1; test_case<=T; test_case++){
			N = sc.nextInt();
			K = sc.nextInt();
			if(N>100000 || N==0 || K==300000 || K==0) return;
			
			sc.nextLine();
			location = sc.nextLine().split("");

			x=0;
			y=0;
			sum=1;
			for(int i=0; i<location.length; i++){
				switch(location[i]){
				case "U":
					x--;
					sum += calc(N, x, y);
					break;
				case "D":
					x++;
					sum += calc(N, x, y);
					break;
				case "R":
					y++;
					sum += calc(N, x, y);
					break;
				case "L":
					y--;
					sum += calc(N, x, y);
					break;
				default :
					break;
				}
			}

			
			
			//이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
			System.out.println(sum);
		}

	}
	static int calc(int N, int x, int y){
		int num;
		int diaSeq = x+y+1;
		int m = N*2-1;
		int leastSum = leastSum(x+y, N);
		int i, j;
		int trd;
		
		if(diaSeq<=N){
			if(diaSeq%2==0){
				i=0;
				j=diaSeq-1;
			}else{
				i=diaSeq-1;
				j=0;
			}
		}else{
			if(diaSeq%2==0){
				i=diaSeq-N;
				j=N-1;
			}else{
				i=N-1;
				j=diaSeq-N;
			}
		}
		
		trd = Math.abs(i-x)+1;
		num = leastSum + trd;
		
		return num;
	}
	static int leastSum(int z, int N){
		if(z>0){
			if(N>=z){
				return z+leastSum(z-1, N);
			}else{
				return (N-(z-N))+leastSum(z-1, N);
			}
		}

		return 0;
	}
}
