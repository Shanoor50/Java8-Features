interface F1{
	void m1();
}
interface F2{
	void m2(int x);
}
interface F3{
	void m3(int x,String s);
}
interface F4{
	void m4();
}
interface F5{
	int m5();
}
public class Example {
    public static void main(String[] args) {
       F1 f1 = () -> { System.out.println("LE1"); }; f1.m1();
        
    	F2 f2 = (int x) -> { System.out.println("LE2=>"+x); }; f2.m2(2);
    	F2 f3 = (x) -> { System.out.println("LE3=>"+x); }; f3.m2(2);//if LE is Implementing FI method with parameters ,the parameter type is optimal
    	F2 f4 =  x -> { System.out.println("LE4=>"+x); }; f4.m2(2);//if it only one parameter brackets "( )"are optimal
    	//if you create LE with body(with brackets) is called blocked LE
    	F2 f5 = a -> { System.out.println("LE5=>"+a); }; f5.m2(2);//pararmeter names are your choose
    	//if you create LE with body(without brackets) is called Unblocked LE
    	F2 f6 = a ->  System.out.println("LE6=>"+a);  f6.m2(2);//in LE body writing only one statement curly brackets are optimal
    	
    	
        F3 f7 = (int x, String s) -> System.out.println("LE7::a=>" + x + "  s=>" + s); f7.m3(2, "syed");
        F3 f8 = (x,s) -> System.out.println("LE7::a=>" + x + "  s=>" + s); f8.m3(2, "syed");
        // Lambda with multiple parameters must use parentheses(more than one parameters)
        //F3 f9 = x,s -> System.out.println("LE7::a=>" + x + "  s=>" + s); f9.m3(2, "syed");  //ERROR
        
        //if LE impl method has no statements and more than one statments than body is required
        F4 f10=()->{};
        //F4 f11=()->;//ERROR
        F4 f12=()->{return;};
        //if the LE has return statement then body must need otherwise compile time ERROR
        //F4 f13=()->return;//ERROR
        
        //F5 f14=()->{return;};//ERROR
        F5 f15=()->{System.out.println("LE");return 5;};
        f15.m5();//here we are lossing the value(5)
        int x=f15.m5();//here storing the value in x
        System.out.println(x);
        System.out.println(f15.m5());
        F5 f16=()->{return 8;};
        //F5 f17=()->return 8;//ERROR
        F5 f17=()-> 8;//if a LE with direct literal then compiler implicitly provied return type like F5 f17=()-> 8;==> Convert ==>F5 f17=()-> {return 8;};
       // F5 f18=()->{ 8 };//ERROR bec inside body you cannot use literal directly
    }
}
