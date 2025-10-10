//JVM not called GC to clean the unreference objs i.e sufienct space is there to create other objects
/*public class GarbageCollector {
 * If the JVM sees that there’s enough memory available, it will ignore.
	public void finalize() {
		System.out.println("Memory cleared::"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		GarbageCollector ob=new GarbageCollector(); //reference object or used object
		new GarbageCollector();//Unreference object or Unused object
		System.out.println("program ends");
	}
}*/

//we can explicitly call GC by using "System.gc()"
public class GarbageCollector {
	@Override
	public void finalize() {
		System.out.println("Memory cleared::"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		GarbageCollector ob1=new GarbageCollector(); //reference object or used object
		GarbageCollector ob2=new GarbageCollector();
		GarbageCollector ob3=new GarbageCollector();
		ob1=null; //ob1 consider as Unreference
		ob2=ob3;//
		new GarbageCollector();//Unreference object or Unused object
		System.gc();// request to run garbage collector but not run bec If the JVM sees that there’s enough memory available, it will ignore the request.
		System.out.println("program ends");
		try {
			Thread.sleep(2000); //here we are pausing main thread bec whenever high priority thread like main work completed then JVM ignore low priority threads like GC
		}catch(Exception e){
			
		}
	}
}
