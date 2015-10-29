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
			//	�� �κп��� �˰��� ���α׷��� �ۼ��Ͻʽÿ�.
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
        

			//	�� �κп��� ������ ����Ͻʽÿ�.
			System.out.println("Case #" + test_case);
			System.out.println(sum);
		}
	}

}
