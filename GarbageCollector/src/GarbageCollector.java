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
/*public class GarbageCollector {
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
		//why try block bec sometime we explicitly calling GC by using "System.gc()" but finalize method not called thats why we pausing main thread
		try {
			Thread.sleep(2000); //here we are pausing main thread bec whenever high priority thread like main work completed then JVM ignore low priority threads like GC
		}catch(Exception e){
			
		}
		System.out.println("program ends");
	}
}*/


public class GarbageCollector {

	static int a=0;
    @Override
    protected void finalize() {
        System.out.println(++a +"=>Memory cleared by GC :: " + Thread.currentThread().getName());
    }

    static void m1() {
        GarbageCollector ob4 = new GarbageCollector();//4
        GarbageCollector ob5 = new GarbageCollector();//5
        // ob4 and ob5 become unreferenced when m1() ends
    }

    static GarbageCollector m2() {
        GarbageCollector ob6 = new GarbageCollector();//6
        GarbageCollector ob7 = new GarbageCollector();//7
        return ob7; // ob7 and ob6 becomes unreferenced ob7 because m2() method is not holding
    }

    static GarbageCollector m3() {
        GarbageCollector ob8 = new GarbageCollector();//8
        GarbageCollector ob9 = new GarbageCollector();//9
        return ob9; // only ob8 becomes unreferenced because m3() method is holding ob9
    }
    public static void main(String[] args) throws InterruptedException {
        GarbageCollector ob1 = new GarbageCollector();
        GarbageCollector ob2 = new GarbageCollector();
        GarbageCollector ob3 = new GarbageCollector();

        ob1 = null;              // 1.eligible for GC
        ob2 = ob3;               //2. old object referenced by ob2 is now eligible
        new GarbageCollector();  //3. anonymous object, eligible immediately

        m1();                    // creates 2 more (both eligible after m1 ends)
        m2();                    //m2 not holding it is unreferenced
        GarbageCollector ob10=m3(); //m3() holding it is referenced
        System.out.println("Requesting Garbage Collection...");
        System.gc(); // request GC

        // Give GC enough time to run and finalize
        Thread.sleep(5000);

        System.out.println("Program ends.");
    }
}

