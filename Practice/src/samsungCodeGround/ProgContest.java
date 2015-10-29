package samsungCodeGround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProgContest {

	public static void main(String[] args) throws Exception{
		int T;
		int test_case;
		int max = 0;
		int maxIdx = 0;
		
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		if(T>5 || T==0) return;
		for(test_case=1; test_case<=T; test_case++){
			// 알고리즘 작성
			int N = sc.nextInt();
			if(N>300000 || N==0) return;
			
			int[] scoreByCompetArr = new int[N];
			int scoreByCompetArrL = scoreByCompetArr.length;
			
			for(int i=0; i<N; i++){
				scoreByCompetArr[i] = sc.nextInt();
				if(scoreByCompetArr[i]>2000000) return;
			}
			Arrays.sort(scoreByCompetArr);
			

			for(int i=0; i<scoreByCompetArrL; i++){
				scoreByCompetArr[i] = scoreByCompetArr[i]+(N-i);
				if(max < scoreByCompetArr[i]){
					max = scoreByCompetArr[i];
					maxIdx = i;
				}
			}
			
			// 정답 출력
			System.out.println("Case #" + test_case);
			System.out.println(N-maxIdx);
		}
	}

}
