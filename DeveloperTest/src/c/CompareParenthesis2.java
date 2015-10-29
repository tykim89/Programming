package c;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class CompareParenthesis2 {

	public static void main(String[] args) {
		int T;
		int test_case;
		char[] par;
		boolean flag;
		
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		sc.nextLine();
		for(test_case=1; test_case<=T; test_case++){
			
			String[] input = sc.nextLine().split(" ");
			par = new char[input.length];
			
			for(int i=0; i<input.length; i++){
				par[i] = input[i].charAt(0);
			}
			
			Stack<Character> stk = new Stack<Character>();

			flag = true;
			for(int i=0; i<par.length; i++){
				if(par[i]=='<' || par[i]=='(' || par[i]=='{' || par[i]=='['){
					stk.push(par[i]);
				}else if(par[i]=='>'){
					if(stk.empty()){
						flag = false;
					}else{
						if(stk.peek()=='<'){
							stk.pop();
						}else{
							flag = false;
						}
					}
				}else if(par[i]==')'){
					if(stk.empty()){
						flag = false;
					}else{
						if(stk.peek()=='('){
							stk.pop();
						}else{
							flag = false;
						}
					}
				}else if(par[i]=='}'){
					if(stk.empty()){
						flag = false;
					}else{
						if(stk.peek()=='{'){
							stk.pop();
						}else{
							flag = false;
						}
					}
				}else if(par[i]==']'){
					if(stk.empty()){
						flag = false;
					}else{
						if(stk.peek()=='['){
							stk.pop();
						}else{
							flag = false;
						}
					}

				}
			}
			
			if(!stk.empty()){
				flag = false;
			}
			System.out.println(flag);
		}
		
	}
}
