package samsungCodeGround;

import java.util.Arrays;
import java.util.Scanner;

public class ExamStudy {

	public static void main(String[] args) {
		int T;
        int test_case;
        
		Scanner sc = new Scanner(System.in);
        
		T = sc.nextInt();
		if(T>20 || T==0) return;
		for(test_case = 1; test_case <= T; test_case++) {
			//	이 부분에서 알고리즘 프로그램을 작성하십시오.
			int N = sc.nextInt();
			if(N>200000) return;
			int K = sc.nextInt();
			int[] score = new int[N];
			
			for(int i=0; i<N; i++){
				score[i] = sc.nextInt();
				if(score[i]>101) return;
			}
			Arrays.sort(score);
			
			int sum = 0;
			for(int i=score.length-1; i>=score.length-K; i--){
				sum += score[i];
			}
        

			//	이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
			System.out.println(sum);
		}
	}

}
