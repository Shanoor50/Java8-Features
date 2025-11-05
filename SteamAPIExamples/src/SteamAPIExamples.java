import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SteamAPIExamples {
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
	}
	
}
