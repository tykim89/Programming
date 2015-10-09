package ProgrammingBook;

public class CompareMax {
	
	public static int compareMax(int[] numArr){
		
		int max;
		int n = numArr.length;
		
		if(n<=0){
			return -1;
		}
		
		max = numArr[0];
		
		for(int i=1; i<n; i++){
			if(max<numArr[i]){
				max = numArr[i];
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		int[] numArr = {3, 1, 2, 5, 8, 1, 3, 0, 9, 4, 6, 11};
		
		System.out.println("ÃÖ´ë °ª : " + compareMax(numArr));
	}

}
