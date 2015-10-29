package etc;

public class FizzBuzz {

	public static void main(String[] args) {
		
		int i;
		
		for(i=1; i<=100; i++){
			
			if(i%3==0 && i%5==0){
				System.out.println(i + ", FizzBuzz !");
				continue;
			}
			
			if(i%3==0){
				System.out.println(i + ", Fizz");
				continue;
			}
			
			if(i%5==0){
				System.out.println(i + ", Buzz");
				continue;
			}
		}
		
	}

}