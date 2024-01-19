import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Welcome from Jenkins!!");
		System.out.println(LocalDateTime.now());
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
	}
}