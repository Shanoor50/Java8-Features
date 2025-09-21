/*@FunctionalInterface
interface Test{
	int add(int a,int b);
}
public class Demo {

	public static void main(String[] args) {
		Test t=new Test() {
			public int add(int a,int b) {
				return a+b;
			}
		};
		int result=t.add(5, 10);
		System.out.println(result);
	}

}*/

//Lambda Expression
/*@FunctionalInterface
interface Test{
	int add(int a,int b);
}
public class Demo {

	public static void main(String[] args) {
		Test t=(int a,int b)->a+b;
		int result=t.add(10, 10);
		System.out.println(result);
	}
}*/

/*@FunctionalInterface
interface Test{
	void add(int a,int b);
}
public class Demo {
	public static void main(String[] args) {
		Test t=new Test() {
			public void add(int a,int b) {
				System.out.println(a+b);
			}
		};
		t.add(1,2);
	}
}*/

//Lambda Expressions
@FunctionalInterface
interface Test{
	void add(int a,int b);
}
public class Demo {
	public static void main(String[] args) {
		Test t=(int a,int b) ->System.out.println(a+b);
		t.add(8,2);
	}
}
