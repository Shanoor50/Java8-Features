//They belong to the object (instance) of the class that implements the interface.
import java.util.*;
/*interface Vehicle{
	default void show() { //Concreste instances method
		System.out.println("Non-Abstract1");
	}
}
class Car implements Vehicle {} // No need to define stop() or implement
public class Methods{ 
	public static void main(String[] args) {
		Vehicle t=new Car();
		t.show();
	}
}*/

//They belong to the interface itself, not to the objects.
interface Vehicle{
	static void info() {
		System.out.println("Non-Abstract2");
	}
}
public class Methods{ 
	public static void main(String[] args) {
		Vehicle.info();
	}
}
