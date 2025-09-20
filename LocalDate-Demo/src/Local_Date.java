import java.time.*;
public class Local_Date {
	public static void main(String[] args) {
		LocalDate time1=LocalDate.now();
		System.out.println(time1);
		LocalDate time2=time1.plusDays(5);//This doesn’t modify time1. It creates a new date object.
		System.out.println(time2);
	}

}
