//Method References
@FunctionalInterface
interface Test{
	int add(int a,int b);
}
public class Demo {
	int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		Test t=d::sum;
		int x=t.add(2, 10);
		System.out.println(x);
	}

}
