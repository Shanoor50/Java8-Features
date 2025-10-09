//***********Case1***********
/*@FunctionalInterface
public interface Example {
	void m1();
}

//if the FI already contain one abstract method you cannot create one more abstruct method in your newly driving FI
 //Sample FI contains 2 abstruct methods (m1() and m2())
@FunctionalInterface
interface Sample extends Example{
	void m2();
}*/

//************Case2************
/*@FunctionalInterface
public interface Example {
	void m1();
}

//NO-->ERROR bec this Sample FI inheriting only one abstruct method
//FI contain one abstruct method and multiple default methods 
@FunctionalInterface
interface Sample extends Example{
	public default void m2() {}
}*/


//************Case3**********
/*@FunctionalInterface
public interface Example {
	void m1();
}

//Compile SuccussFully bec this is normal Interface (without annotation)
interface Sample extends Example{
	void m2();
}*/

//**********Case4**********
//Invalide FI bec must contain one abstract method
/*@FunctionalInterface
public interface Example {

}

@FunctionalInterface
interface Sample{
	void m2();
}*/

//********Case5***********
/*interface Example{
	
}

//Compiler compile SuccussFully bec parent FI is not marked as a annotation
 @FunctionalInterface
interface Sample extends Example{
	void m2();
}*/


//**********Case6*************
/*public interface Example {
	void m1();
}

//Not Compile==>ERROR bec Sample FI contains 2 abstruct methods
@FunctionalInterface
interface Sample extends Example{
	void m2();
}*/


//************Case7*************
/*public interface Example {
	void m1();
	void m2();
}

//Not Compile==>ERROR bec Samle FI is inheriting from Example Interface which contains 2 abstruct methods i.e Sample FI also contains 2 abstruct methods
@FunctionalInterface
interface Sample extends Example{
	
}*/

//***************Case8*************
/*@FunctionalInterface
public interface Example1 {
	void m1();
}

@FunctionalInterface
public interface Example2 {
	void m2();
}

@FunctionalInterface
interface Sample extends Example1,Example2{
	
}*/

//***********Case9***************
/*@FunctionalInterface
public interface Example1 {
	void m1();
}

@FunctionalInterface
public interface Example2 {
	void m1();
}

//Complie SuccessFully bec inheriting from 2 parents but 0ne abstruct method only
@FunctionalInterface
interface Sample extends Example1,Example2{
	
}*/


//***********Case10*************(ERROR)
//No abstruct method found in it
/*@FunctionalInterface
public interface Example {
	int hashCode();//this is abstruct method but it is custom abstruct method
}*/


//************Case11**************(Succuss)
@FunctionalInterface
public interface Example{
	void m1();//custom abstruct method
	int hashCode();//implicit abstruct method
}

//Sample FI consider m1() method as custom abstruct method remaining are not custom abstruct methods
@FunctionalInterface
interface Sample extends Example{
	boolean equals(Object obj);//implicit abstruct method
}

