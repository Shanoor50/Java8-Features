/*@FunctionalInterface
interface Test{
	void show();
}
public class Demo {
	public static void main(String[] args) {
		Test t=new Test() {
			public void show() {
				System.out.println("Welcome");
			}
		};
		t.show();
	}

}*/

//Lambda Expressions
@FunctionalInterface
interface Test{
	void show();
}
public class Demo {
	public static void main(String[] args) {
		Test t=()->System.out.println("Welcome To Lambda");
		t.show();
	}

}
