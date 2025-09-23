
/*public class Demo {
	public static void main(String[] args) {
		String[] s=new String[5];
		s[1]="syed";
		s[2]="shanoor";
		for(String s2:s) {
			System.out.println(s2.toUpperCase());
		}
		System.out.println(s[0].toUpperCase()); //Error--> java.lang.NullPointerException
	}
}*/

//To OverCome above problem  use Optional Class

import java.util.Optional;

public class Demo {
	public static void main(String[] args) {
		String[] s=new String[5];
		s[1]="syed";
		s[2]="shanoor";
		/*for(String s2:s) {
			Optional<String> o = Optional.ofNullable(s2);
			if(o.isPresent()) {
				System.out.println(s2.toUpperCase());
			}else {
				System.out.println("It Contains null");
			}
		}*/
		Optional<String> o = Optional.ofNullable(s[0]);
		if(o.isPresent()) {
			System.out.println(s[0].toUpperCase());
		}else {
			System.out.println("It Contains null");
		}
	}
}

