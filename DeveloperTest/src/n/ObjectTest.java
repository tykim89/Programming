package n;

public class ObjectTest {
	
	int p;
	
	{
		p = 1;
		System.out.println("p �ʱ�ȭ "+p);
	}
	
	static int i;
	static {
		i = 5;
		System.out.println("i �ʱ�ȭ "+i);
	}
	
	public static void objectInstance(int i){
		System.out.println(i);
	}
	
	public ObjectTest(int p) {
		this.p = p;
		System.out.println(p);
	}
	
	public void objPrint(){
		System.out.println("ȣ�� "+p);
	}


	public static void main(String[] args) {
		objectInstance(10);
		ObjectTest objTest = new ObjectTest(20);
		objTest.objPrint();
	}

}
