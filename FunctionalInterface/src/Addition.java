//compiler  consider as a Functional Interface 
//1.effective Functional Interface
/*public interface Addition {
	void add(int a,int b);
}*/

//compiler  not consider as a Functional Interface because two abstruct methods but it compile successfully
/*public interface Addition {
	void add(int a,int b);
	void add(int a,int b,int c);
}*/

//compiler not consider as a Functional Interface it throws compile time ERROR because Functional Interface as only one abstruct method
/*@FunctionalInterface
public interface Addition {
	void add(int a,int b);
	void add(int a,int b,int c);
}*/

//Compiler consider as a Functional Interface bec we are explicitly declare as a @FunctionalInterface which is marked as a FunctionalInterface.if we try to add one more method to this interface compiler throws ERROR
//2.ForceFully FunctionalInterface
@FunctionalInterface
public interface Addition {
	void add(int a,int b);
}

