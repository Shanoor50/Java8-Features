//Q.This Example for LocalDate why we can not create Object directly with new keyword
import java.util.*;
class Demo
{
    private Demo(){//private Constructor we can not create object for private Constructor classes
        System.out.println("Object Created");
    }
    
    //Factory Methods
    public static Demo createDemo(){
        return new Demo();
    }
}
public class WhyWeNotCreateObjectUsing_new_Keyword{
    public static void main(String[] args) {
	  //Demo d=new Demo();// ❌ Not allowed  because  Constructor is private ,i.e private Constructor only called by class
		Demo d=Demo.createDemo();
	}
}