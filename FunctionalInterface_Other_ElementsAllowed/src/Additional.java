/*@FunctionalInterface //when we add this annotation then compiler apply all the rules of FuntionalInterface
public interface Additional {
	public void add(int a,int b);
}*/


/*@FunctionalInterface
public interface Additional {
	public void add(int a,int b);
	//public void add(int a,int b,int c); //FUnctionalInterface allow us to create only one method this is not allowed
}*/


//public static final fields/variable are allowed or not ==>yes allowed
/*@FunctionalInterface
public interface Additional {
	public void add(int a,int b);
	//n number of "public static final fields/variable" are allowed
	public static final int a=10; //this is allowed in FunctionInterface
	public static final int b=40;
}*/

//Inner classes are allowed or not
/*@FunctionalInterface
public interface Additional {
	public void add(int a,int b);
	
	//public static final variables
	public static final int a=10;
	public static final int b=40;
	
	//n number of Inner classes are allowed or not==>yes allowed
	public static class A{} //Inner classes are allowed
	public static class B{}
}*/

/*@FunctionalInterface
public interface Additional {
	public void add(int a,int b);
	
	//public static final variables
	public static final int a=10;
	public static final int b=40;
	
	//Inner classes are allowed
	public static class A{} 
	public static class B{}
	
	//n number of public default implement method allowed or not==>yes allowed
	public default void m1() {}//public default implement method allowed
	public default void m2() {}
	
}*/


/*@FunctionalInterface
public interface Additional {
	public void add(int a,int b);
	
	//=>public static final varables and inner class allowed java0.1 onwords
	//public static final variables
	public static final int a=10;
	public static final int b=40;
	
	//Inner classes are allowed
	public static class A{} 
	public static class B{}
	
	//=>default and static impl methods are allow form java*8 Feauter onwords
	//public default implement method allowed
	public default void m1() {}
	public default void m2() {}
	
	//n number of public static implement method allowed or not==>yes allowed
	public static void m3() {}//public static implement method allowed
	public static void m4() {}
	
}*/


@FunctionalInterface
public interface Additional {
	public void add(int a,int b);//our own custom method as abstract method only one allowed(our own one abstract method is allowed)
	
	//=>public static final varables and inner class allowed java0.1 onwords
	//public static final variables
	public static final int a=10;
	public static final int b=40;
	
	//Inner classes are allowed
	public static class A{} 
	public static class B{}
	
	//=>default and static impl methods are allow form java*8 Feauter onwords
	//public default implement method allowed
	public default void m1() {}
	public default void m2() {}
	
	//public static implement method allowed
	public static void m3() {}
	public static void m4() {}
	
	//In Java9 version onword private static and private non-static methods are allowed
	private static void m5() {}//private static allowed
	private void m6() {}//private non-static allowed
	
	//java.lang.Object class methods are allowed or not
	public abstract int hashCode(); //it is one more abstruct method but it is not our own method,it is java.lang.Object class method(it is not custom method,it is predefine method)
	public abstract boolean equals(Object obj);
	
	//am i allowed to create java.lang.Object class methods as a default methods ==>NO bec inside interface java.lang.Object class methods as default methods you cannot create (your are allowed to create only abstract methods, not default mrthods or public static method)
	//but Object class methods are not allowed as default methods in any interface so compiler will throw error for toString method
	/*public default String toString() {
		return "HK";
	}*/
	
	//only abstract methods are allowed
	public abstract String toString() ;
}