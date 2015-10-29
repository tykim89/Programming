package c;

public class CompareParenthesis {
	
	public static void compare(String[] parenthesis){
		
/*		String[] arr = parenthesis.split(" ");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
*/	
	}
	
	public static boolean compareP(String[] parenthesis){
		boolean flag = true;
		
		String[] open = {"[", "{", "(", "<"};
		String[] close = {"]", "}", ")", ">"};
		String A = null;
		String B = null;
		int indexA = 0;
		int indexB = 0;
		
		for(int i=0; i<parenthesis.length; i++){
			
			for(int j=0; j<open.length; j++){
				if(parenthesis[i].equals(close[j])){
					flag = false;
					return flag;
				}
				if(parenthesis[i].equals(open[j])){
					A = open[j];
					B = close[j];
					break;
				}
				
			}
			
			for(int k=i+1; k<parenthesis.length-1; k++){
				if(A.equals(parenthesis[k])){
					indexA = k;
					break;
				}
			}
			for(int k=i+1; k<parenthesis.length-1; k++){
				if(B.equals(parenthesis[k])){
					indexB = k;
					break;
				}
			}
			
			if(indexA > indexB){
				flag = false;
				break;
			}
			
		}
		
		return flag;
	}

	public static void main(String[] args) {
		
/*		String parenthesis;
		Scanner sc = new Scanner(System.in);
		parenthesis = sc.next();
*/		
		String[] parenthesis = {"<", "[", "]", "[", "{", "[", "]", "(", ")", "}", "]", ">"};
		System.out.println(compareP(parenthesis));
		
	}

}
