//this is for only "int" type
@FunctionalInterface
interface AddInt{
	int add(int a,int b);
}


//this is for only "Long" type
@FunctionalInterface
interface AddLong{
	Long add(Long a,Long b);
}


//this is for only "Double" type
@FunctionalInterface
interface AddDouble{
	double add(double a,double b);
}

//if you want new type then you should create another FI it is bad practies .To OverCome this we have Generics

//this one FI used for multile types(dynamic in nature)
//1.Specifing Parameter Type
@FunctionalInterface
interface Add<T>{
	T add(T a,T b);
}

//1.Specifing a particuler Type
class Person{
	
}
//this FI accept only Person subtype 
@FunctionalInterface
interface Add1<T extends Person>{ //defined boundaries i.e what type of value should accept
	T add(T a,T b);
}