package Etc;

public class compareAndEquals {

	public static void main(String[] args) {

		String str1 = "Hello World";
		String str2 = "Hello World";
		String str3 = new String("Hello World");
		
		System.out.println("1�� : " + str1 == str2);
		System.out.println(str1 == str2);
		System.out.println();
		System.out.println("2�� : " + str1 == str3);
		System.out.println(str1 == str3);
		System.out.println();
		System.out.println("3�� : " + str1.equals(str3));

	}
		
		// �ڹٿ��� == �����ڴ� �޸𸮱��� ���Ѵ�.
		// �ڹٿ��� ���ڿ� �񱳴� equals�� ����.
		// cf) �ڹٽ�ũ��Ʈ���� == �ʹ� �ٸ� �����̹Ƿ� ����.
}
