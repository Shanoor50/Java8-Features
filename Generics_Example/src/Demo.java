import java.util.*;

//Without Generics
/*public class Demo {
	public static void main(String[] args) {
		List list=new ArrayList(); // Raw type
		list.add("Shanoor");
		list.add(50); // No error at compile time
		for(Object obj:list) {
			String s=(String)obj; // Runtime ClassCastException
			System.out.println(s); // Causes ClassCastException at runtime
		}
	}
}*/
//Problem: It conot Check at Compile Time.You can add any type, and it fails at runtime.
//That’s why Generics are designed to catch type errors during compilation itself, to prevent runtime issues.
//So, if Generics didn’t check at compile-time, you’d only find errors at runtime → unsafe, messy, and more crashes,buggy, and less maintainable.
//Generics = Code reusability + Type safety + Compile-time checks.
//1)Type Safety – Avoids ClassCastException at runtime by catching type errors at compile-time.
//2)Code Reusability – Write a class or method once, and use it with different types.
//3)Readability – Clearer code because types are defined explicitly.

//With Generics
/*public class Demo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>(); //Generic Type
		list.add("Shanoor");
		//list.add(50); // Compile Time Error
		for(String s:list) {
			System.out.println(s.toUpperCase());
		}
	}
}*/
//Safer: It check at Compile time.Compiler checks types.

//Generic Class Example:
/*class Test<T> {
	
	private T value;
	
	public void setValue(T value) {
		this.value=value;
	}
	
	public T getValue() {
		return value;
	}
}
	class Demo{
	public static void main(String[] args) {
		Test<Integer> t1=new Test<>();
		t1.setValue(50);
		System.out.println(t1.getValue());
		Test<String> t2=new Test<>();
		t2.setValue("Shanoor");
		System.out.println(t2.getValue());
		Test<Float> t3=new Test<>();
		t3.setValue(50000.0f);
		System.out.println(t3.getValue());
	}
}*/

//Generic Method Example:
class Demo{
	public static <T> void printArray(T[] arr) {
		for(T a:arr) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		Integer[] intArr= {1,2,3};
		String[] charArr= {"A","B","C"};
		
		printArray(intArr);
		printArray(charArr);
	}
}