import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] aa = new String[sc.nextInt()];
		
		int arrSize = aa.length;
		for(int i=0; i<arrSize; i++){
			aa[i] = sc.next();
		}
		
		for(int j=0; j<arrSize; j++){
			System.out.println("Hello, " + aa[j] + "!");
		}
		
	}

}
