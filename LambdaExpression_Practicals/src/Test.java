interface Fi{
	void m1(int p);
}
interface Fi2{
	void m1(int p,float f);
}
interface Fi3{
	int m1(int p);
}
public class Test {
	//here we are asigned Lambda Expression to FI reference
	//Fi fi1=(int p)->{System.out.println(p);};//compiled successfully bec return type and parameter are matching with FI
	
	//Checking with lower type (byte) compare to int
	//Fi fi2=(byte p)->{System.out.println(p);};//compile time ERROR bec here parameter are not matching with FI(int ->byte)
	
	//Checking with higher type (Long) compare to int
	//Fi fi3=(Long p)->{System.out.println(p);};//ERROR
	
	//Checking with wrapper type
	//Fi fi4=(Integer p)->{System.out.println(p);};//ERROR
	
	//Fi fi5=(int p1,int p2)->{System.out.println(p1+p2);};//ERROR bec parameter List must be same
	
	//Fi fi6=(int p)->{System.out.println(p); return 5;};//compile time ERROR bec here return types are not matching with m1()
		
	//Fi2 fi7=(int p,float f)->{System.out.println(p+f);};//Compile Successfully parameters ,List and return type is matching
	
	//Fi2 fi8=(int p,float f,String s)->{System.out.println(p+f);};//ERROR bec List is not matching
	
	//Fi2 fi9=(float f,int p)->{System.out.println(p+f);};//EROOR bec order is not matching
	
	//Fi2 fi10=(double p,float f)->{System.out.println(p+f);};//ERROR bec type is not matching
	
	//Fi3 fi11=(int p)->{System.out.println(p);return 5;};//Compile Successfully bec para and return type matching
	
	Fi3 fi11=(int p)->{System.out.println(p);return 'a';};//Compile Successfully bec para is matchin and return type is lesser type than int
	
	//Fi3 fi12=(int p)->{System.out.println(p);return 9L;};//ERROR bec para are matching but return type is higher type than int
	
	//Fi3 fi12=(int p)->{System.out.println(p);};//ERROR bec return type is not matching
}
