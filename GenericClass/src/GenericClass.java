class Test<T>{
	void display(T a) {
		System.out.println(a);
	}
}
public class GenericClass {

	public static void main(String[] args) {
		Test<Integer> t1=new Test<>();
		t1.display(5);
		Test<Float> t2=new Test<>();
		t2.display(5.00f);
		Test<String> t3=new Test<>();
		t3.display("Welcome");
	}

}
