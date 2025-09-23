//Consumer Functional Interface
/*import java.util.function.*;
public class ConsumerFunctionalInterface {

	public static void main(String[] args) {
		Consumer<Integer> c1=new Consumer<>() {
			public void accept(Integer a) {
				System.out.println(a);
			}
		};
		c1.accept(50);
	}

}*/

//Lambda Expression
import java.util.function.*;
public class ConsumerFunctionalInterface {

	public static void main(String[] args) {
		Consumer<Integer> c1=(Integer a)->System.out.println(a);
		c1.accept(50);
	}

}
