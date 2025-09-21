import java.util.*;
@FunctionalInterface
interface Test{
	void show();
}
public class AnonymousClass {

	public static void main(String[] args) {
		Test t=new Test()
				{
					public void show()
					{
						System.out.println("Welcome");
					}
				};
				t.show();
	}

}
