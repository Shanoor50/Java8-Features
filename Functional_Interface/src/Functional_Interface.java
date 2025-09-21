@FunctionalInterface
interface Test{
	int x=10;
	void show();
	default void print() {
		System.out.println("Default-Method");
	}
	static void display() {
		System.out.println("Static-Method");
	}
}
public class Functional_Interface implements Test
{
	@Override
    public void show() {   // must implement abstract method
        System.out.println("Abstract-Method implemented in class");
    }
	public static void main(String[] args) {
		Functional_Interface obj=new Functional_Interface();
		obj.show();
		obj.print();
		System.out.println(Test.x);
		Test.display();
	}
}
