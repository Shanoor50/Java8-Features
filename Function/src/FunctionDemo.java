import java.util.function.*;
//Function(predefined Functioanal Interface)
/*public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer,Integer> f=new Function<>()
		{
		    public Integer apply(Integer a){
		        return a*a*a;
		    }
		};
		int x=f.apply(5);
		System.out.println(x);
	}
}*/

//Lambda Expression
public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer,Integer> f=(Integer a)-> a*a*a;
		int x=f.apply(5);
		System.out.println(x);
	}
}
