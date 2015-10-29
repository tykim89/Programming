package samsungCodeGround;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectNumber {

	public static void main(String[] args) throws Exception{
		int T;
		int test_case;
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		for(test_case=1; test_case<=T; test_case++){
			// 이 부분에 알고리즘 프로그램 작성
			int N = sc.nextInt();
			if(N>3000000)return;
			sc.nextLine();
			String[] nArr = sc.nextLine().split(" ");
			int nArrLength = nArr.length;
			if(nArrLength!=N){
				return;
			}
			
			int[] intNumArr = new int[nArrLength];
			for(int i=0; i<nArrLength; i++){
				intNumArr[i] = Integer.parseInt(nArr[i]);
			}
			
			int result;
			if(nArrLength==0){
				result = 0;
			}else if(nArrLength==1){
				result = intNumArr[0];
			}else{
				result = intNumArr[0];
				for(int i=1; i<nArrLength; i++){
					result = result^intNumArr[i];
				}
			}
			
			// 이 부분에 정답 출력
			System.out.println("Case #" + test_case);
			System.out.println(result);
		}
	}

}
