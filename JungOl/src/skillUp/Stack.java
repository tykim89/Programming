package skillUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack {

	static List<Integer> stackList = new ArrayList<Integer>();
	static List<Object> resultList = new ArrayList<Object>();

	public static List stack(String[] oper){
		// i a = push(a), o = pop(), c = stackCount
		
		int stackCount = stackList.size();
		if("i".equals(oper[0])){ // equals 쓸대는 무조건 확정 문자열이 앞에 있어야 한다.
								//단문자 비교는 무조
			stackList.add(Integer.parseInt(oper[1]));
		}
		if(oper[0].equals("o")){
			int lastIndex = stackList.size()-1;
			if(stackCount==0){
				resultList.add("empty");
			}else{
				int popData = stackList.get(lastIndex);
				stackList.remove(lastIndex);
				resultList.add(popData);
			}
		}
		if(oper[0].equals("c")){
			resultList.add(stackCount);
		}
		
		return resultList;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<0 || N>100) return;
		
		sc.nextLine();
		for(int i=0; i<N; i++){
			String[] oper = sc.nextLine().split(" ");
			stack(oper);
		}
		for(int i=0; i<resultList.size(); i++){
			System.out.println(resultList.get(i));
		}
	}

}
