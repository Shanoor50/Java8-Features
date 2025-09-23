//Supplier Functional Interface
import java.util.function.*;
/*public class SupplierFunctionalInterface {

	public static void main(String[] args) {
		Supplier<Integer> s=new Supplier<>() {
			public Integer get() {
				return 10;
			}
		};
		int x=s.get();
		System.out.println(x);
	}

}*/

//Lambda Expression
public class SupplierFunctionalInterface {

	public static void main(String[] args) {
		Supplier<Integer> s=() ->10;
		int x=s.get();
		System.out.println(x);
	}

}
