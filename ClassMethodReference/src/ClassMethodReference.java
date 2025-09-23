//Class Method Reference
@FunctionalInterface
interface Test{
	int add(int a,int b);
}
class Demo {
	static int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		Test t=Demo::sum;
		int x=t.add(2,3);
		System.out.println(x);
	}

}
