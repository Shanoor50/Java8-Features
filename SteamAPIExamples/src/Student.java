import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Student {
	int sid;
    String sname;
    String course;
    double fee;

    // Constructor
    public Student(int sid, String sname, String course, double fee) {
        this.sid = sid;
        this.sname = sname;
        this.course = course;
        this.fee = fee;
    }
    
 // toString method to print student details
    @Override
    public String toString() {
        return sid + " - " + sname + " - " + course + " - " + fee;
    }
    
	public static void main(String[] args) {
		
		//1.Creating Stream obj by using Stream Interface Factory method
		Stream<Integer> stream = Stream.of(2,3,4,5,6,7,8); //source
		stream.forEach(ele->System.out.print(ele)); //LE
		//stream.forEach(System.out::println); //MR
		System.out.println();
		
		IntStream stream2 = IntStream.range(2, 11); //range 2 to 10
		stream2.forEach(ele->System.out.print(ele)); //terminal operation
		System.out.println();
		
		//2.Creating Stream obj by using Array Object
		int[] arr= {2,3,4,5,6,7,5,3,9};
		IntStream stream3 = Arrays.stream(arr);
		stream3.forEach(ele->System.out.print(" "+ele));
		System.out.println();
		
		//3.Creating Stream obj by using Collection Object
		List<Integer> list = List.of(2,3,4,5,7,5,3,9);
		Stream<Integer> stream4 = list.stream(); //source
		stream4.forEach(System.out::println); //terminal
		System.out.println();
		
		//Before Java8 Version or old style(imperative approach i.e we are writing if and else)
		for(int num:list) {
			if(num%2==0)
				System.out.println(num);
		}
		System.out.println("=============================");
		
		//After Java8 Version or new style(declarative approach i.e we are not writing if and else ,just we are calling methods it implicitly present that logic)
		Stream<Integer> stream5 = list.stream();
		Stream<Integer> filter = stream5.filter(ele->ele%2==0);
		filter.forEach(System.out::println);
		System.out.println("=============================");

		//Method call chaining style
				list.stream()
						.filter(ele->ele%2==0)
						.forEach(System.out::println);
				System.out.println("=================================");
				
				//retriving only String object
				List<Object> list2 = List.of(1,"a",2,"b",3,"c");
				list2.stream()
						.filter(obj-> obj instanceof String)
						/*.forEach(ele->System.out.println(ele));*/
						.forEach(System.out::println);
				System.out.println("=================================");
				
				//retrive only Integer Obj
				list2.stream()
						.filter(obj-> obj instanceof Integer)
						.forEach(System.out::println);
				System.out.println("===========================");
				
				//retriving only even Integer's
				list2.stream()
						.filter(ele-> ele instanceof Integer)
						.filter(ele-> (int)ele%2==0)
						.forEach(System.out::println);
				System.out.println("===========================");
				
				//retriving only odd Integer's
				list2.stream()
						.filter(ele-> ele instanceof Integer)
						.filter(ele-> (Integer)ele%2!=0)
						.forEach(System.out::println);
				
				//=============Collection with custom objects=========
				List<Student> list3 = List.of(
						new Student(101,"s1","core java",3500),
						new Student(102,"s2","Adv java",4500),
						new Student(103,"s3","Oracle",5500),
						new Student(104,"s4","HTML",7500),
						new Student(105,"s5","core java",6500),
						new Student(106,"s6","HTML",7500),
						new Student(107,"s7","core java",4000)
						);
				
				//================retrive and print all student object==========
				list3.stream()
						.forEach(obj->System.out.println(obj));
				System.out.println("===========================");
				
				//============retrive only core java students==========
				list3.stream()
						//.filter(student-> student.course=="Core java")
						.filter(student-> student.course.equalsIgnoreCase("Core java"))
						.filter(student->student.fee<5000)
							//.filter(student-> student.course.equalsIgnoreCase("Core java") && student.fee<5000)
							.forEach(obj-> System.out.println(obj));
				System.out.println("===========================");

				
				//=====================map()===========================
				list2.stream()										//object type ["a",1,"b",2,"c",3]
						.map(ele-> ele.toString()+5)		//string type ["a5","15","25","c5","35"]
						.forEach(System.out::println);	//o/p:-"a5","15","25","c5","35"
				System.out.println("===========================");

				list2.stream()										//object type ["a",1,"b",2,"c",3]
				.map(ele-> ele.toString()+5)		//string type ["a5","15","25","c5","35"]
				.forEach(ele->System.out.println(ele.toUpperCase()));	//o/p:-"a5","15","25","c5","35"
		System.out.println("===========================");

		
		//===============retrieve only Strings,print them in upper case==============
		list2.stream()																					//object type ["a",1,"b",2,"c",3]
				.filter(ele-> ele instanceof String)										//object type ["a","b","c"] ->we cannot apply toUpperCase method to Object type
				.map(ele-> ele.toString())														//string type ["a","b","c"]
				.forEach(ele->System.out.println(ele.toUpperCase()));
		System.out.println("===========================");
		//=======================retrieve only integers =================
		list2.stream()
				.filter(ele-> ele instanceof Integer)
				.map(ele->(int)ele)
				.forEach(ele->System.out.println(ele+5));
		System.out.println("===========================");

		//=================retrieve each student name and print========================
		list3.stream()
				.map(obj->obj.sname)
				.forEach(ele->System.out.println(ele));
		System.out.println("===========================");

		
		//=================retrieve each student name of core java course========================
				list3.stream()
						.filter(obj-> obj.course.equalsIgnoreCase("core java"))
						.map(obj->obj.sname)
						.forEach(ele->System.out.println(ele));
				System.out.println("===========================");

	}
	
}
