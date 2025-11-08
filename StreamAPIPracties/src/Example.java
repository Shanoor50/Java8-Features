import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<String> list1=List.of("Shanu","Virat","Rahul","Syed","Anushka");
		list1.stream()
				.filter(ele-> ele.toLowerCase().startsWith("s"))
				.forEach(System.out::println);
		
		list1.stream()
				.map(ele->ele.toUpperCase())
				.forEach(System.out::println);
		
		List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 6);
		List<Integer> result=list2.stream()
				.filter(n-> n%2==0)
				.map(n->n*n)
				.collect(Collectors.toList());
		System.out.println(result);
		
		//=============print whose name length  is lessthan 5=================
		List<String> result2=list1.stream()
				.filter(ele->ele.length()<5)
				.collect(Collectors.toList());
		System.out.println(result2);
		
		//============use of map and reduce==========================
		int result3=list2.stream()
				.map(n->n*n)
				.reduce(0,Integer::sum);
		System.out.println(result3);

		int res=list2.stream()
				.map(n->n*n)
				.reduce(0,(a,b)->a+b);
		System.out.println("=>"+res);
		
		int result4=list2.stream()
				.map(n->n*n)
				.reduce(1,Math::multiplyExact);
		System.out.println(result4);
		
		//==============sort the elements==================================
		List<Integer> list3=List.of(3,5,2,4,1,5,4);
		List<Integer> result5=list3.stream()
														 .sorted()
														 .collect(Collectors.toList());
		System.out.println(result5);
		
		List<String> result6=list1.stream()
													.map(ele->ele.toUpperCase())
													 .sorted((a,b)->a.compareTo(b))
													 .collect(Collectors.toList());
		System.out.println(result6);
		
		//=====================to remove duplicates========================
			List<Integer> result7=list3.stream()
															.sorted()
															.distinct()
															.collect(Collectors.toList());
			System.out.println(result7);
			
			//=========================print only dupliacte numbers=======================
			List<Integer> result8=list3.stream()
															 .filter(n->Collections.frequency(list3, n)>1)
															 .distinct()
															 .collect(Collectors.toList());
			System.out.println(result8);
			
			//==================to restrict the number of elements=================================
			List<Integer> result9=list3.stream()
															 .limit(3)
															 .collect(Collectors.toList());
			System.out.println(result9);					
			
			//============================to skip first few elements=================================
			List<Integer> result10=list3.stream()
															   .skip(2)
															   .collect(Collectors.toList());
			System.out.println(result10);
			
			
		
	}
}
