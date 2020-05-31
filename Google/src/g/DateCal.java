package g;

import java.util.Calendar;
import java.util.Date;

public class DateCal {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 10);
		Date futureDateTime = calendar.getTime();
		System.out.println(futureDateTime);

	}

}
