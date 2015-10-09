import java.util.Scanner;

public class drawrect {

	public static String viewPort(String[] view1, String[] view2, String[] view3){
		
		int[] view11 = new int[2];
		int[] view22 = new int[2];
		int[] view33 = new int[2];
		for(int i=0; i<view1.length; i++){
			view11[i] = Integer.parseInt(view1[i]);
			view22[i] = Integer.parseInt(view2[i]);
			view33[i] = Integer.parseInt(view3[i]);
		}
		
		int[] xArr = {view11[0], view22[0], view33[0]};
		int[] yArr = {view11[1], view22[1], view33[1]};
		
		int X = 0, Y = 0;
		
		for(int i=0; i<xArr.length; i++){
			int count = 0;
			for(int j=0; j<xArr.length; j++){
				if(xArr[i]==xArr[j]){
					count++;
				}
			}
			if(count==1){
				X = xArr[i];
			}
		}
		
		for(int i=0; i<yArr.length; i++){
			int count = 0;
			for(int j=0; j<yArr.length; j++){
				if(yArr[i]==yArr[j]){
					count++;
				}
			}
			if(count==1){
				Y = yArr[i];
			}
		}
		
		return X + " " + Y;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] result = new String[T];
		
		sc.nextLine();
		if(T<=0){
			System.out.println("1개 이상의 테스트 케이스를 입력해주세요.");
		}else{
			for(int i=0; i<T; i++){
				String[] view1 = sc.nextLine().split(" ");
				String[] view2 = sc.nextLine().split(" ");
				String[] view3 = sc.nextLine().split(" ");
				result[i] = viewPort(view1, view2, view3);
			}
			for(int i=0; i<result.length; i++){
				System.out.println(result[i]);
			}
		}

	}

}
