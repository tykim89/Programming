package samsungCodeGround;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumString {

	public static void main(String[] args) {
		int T;
		char[] str;
		int count;
		boolean flag;
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		for(int test_case=0; test_case<T; test_case++){
			str = sc.next().toCharArray();
			List<String> chgStr = new ArrayList<String>();
			flag = false;
			
			for(int i=0; i<str.length; i++){
				count=0;
				chgStr.add(String.valueOf(str[i]));
				
				for(int j=i+1; j<str.length; j++){
					if(str[i]==str[j]){
						count++;
					}else{
						i+=count;
						break;
					}
					if(j==str.length-1){
						flag = true;
					}
				}
				if(count>=9){
					int x = (count+1)/10;
					int y = (count+1)%10;
					chgStr.add(Integer.toString(x));
					chgStr.add(Integer.toString(y));
				}else{
					chgStr.add(Integer.toString(count+1));
				}
				
				if(flag == true){
					break;
				}
			}
			
			
			System.out.println("#testcase"+T);
			for(int i=0; i<str.length; i++){
				System.out.print(str[i]);
			}
			System.out.print(" "+str.length);
			System.out.println();
			
			if(str.length!=chgStr.size()){
				for(int i=0; i<chgStr.size(); i++){
					System.out.print(chgStr.get(i));
				}
				System.out.print(" "+chgStr.size());
			}else{
				for(int i=0; i<str.length; i++){
					System.out.print(str[i]);
				}
				System.out.print(" "+str.length);
				System.out.println();
			}
			


			
		}
		
	}

}
