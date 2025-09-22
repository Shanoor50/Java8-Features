import java.util.function.*;
//predicate Functional Interface
/*public class Demo {

	public static void main(String[] args) {
		Predicate<Integer> p=new Predicate<>()
		{
			public boolean test(Integer a) {
				if(a%2==0)
					return true;
				else
					return false;
			}
		};
		boolean x=p.test(2);
		System.out.println(x);
	}

}*/

//Lambda Expression
public class Demo {

	public static void main(String[] args) {
		Predicate<Integer> p=(Integer a) ->a%2==0;
		boolean x=p.test(2);
		System.out.println(x);
	}

}
