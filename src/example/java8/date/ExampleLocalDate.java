package example.java8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExampleLocalDate {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		LocalDate dt = LocalDate.parse("23/05/2019", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		int dateRest = Integer.valueOf((date.getDayOfYear() - dt.getDayOfYear()));
		
		
		if (dateRest > 0)
			System.out.println("vous avez passé " + dateRest  + " jours");
	}

}
