interface Test
{
    default void show(){
        System.out.println("Non-Abstruct-Method1");
    }
    static void print(){
        System.out.println("Non-Abstruct-Method2");
    }
}
public class Default_Static_Method implements Test{
	public static void main(String[] args) {
		Test t=new Default_Static_Method();
		t.show();
		Test.print();
	}

}
