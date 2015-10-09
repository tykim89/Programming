package Etc;

public class compareAndEquals {

	public static void main(String[] args) {

		String str1 = "Hello World";
		String str2 = "Hello World";
		String str3 = new String("Hello World");
		
		System.out.println("1번 : " + str1 == str2);
		System.out.println(str1 == str2);
		System.out.println();
		System.out.println("2번 : " + str1 == str3);
		System.out.println(str1 == str3);
		System.out.println();
		System.out.println("3번 : " + str1.equals(str3));

	}
		
		// 자바에서 == 연산자는 메모리까지 비교한다.
		// 자바에서 문자열 비교는 equals로 하자.
		// cf) 자바스크립트에서 == 와는 다른 개념이므로 유의.
}
