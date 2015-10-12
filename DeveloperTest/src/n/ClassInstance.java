package n;

public class ClassInstance {
	
	String name;
	
	public ClassInstance(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public static void main(String[] args) {
		ClassInstance user = new ClassInstance("James");
		System.out.println("User �̸�1 : "+user.getName());
		foo(user);
		System.out.println("User �̸�2 : "+user.getName());
	}
	
	public static void foo(ClassInstance user){
		System.out.println("foo �̸�1 : "+user.getName());
		user = new ClassInstance("Tomas");
		System.out.println("foo �̸�2 : "+user.getName());
	}
}

