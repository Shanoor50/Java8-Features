//Q.This Example for LocalDate why we can not create Object directly with new keyword
import java.util.*;
class Test
{
    private Test(){//private Constructor we can not create object for private Constructor classes
        System.out.println("Object Created");
    }
    
    //Factory Methods
    public static Test createDemo(){
        return new Test();
    }
}
public class Demo{
    public static void main(String[] args) {
	  //Test d=new Test();// ❌ Not allowed  because  Constructor is private ,i.e private Constructor only called by class
		Test t= Test.createDemo();
	}
}