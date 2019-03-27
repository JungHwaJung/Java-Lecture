package sec14;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
		
		TimeZone tz = TimeZone.getTimeZone("Europe/London");
		Calendar nowUK = Calendar.getInstance(tz);
		System.out.print(nowUK.get(Calendar.MONTH)+1 +"월 ");
		System.out.print(nowUK.get(Calendar.DAY_OF_MONTH) + "일 ");
		System.out.print(nowUK.get(Calendar.HOUR) + "시 ");
		System.out.println(nowUK.get(Calendar.MINUTE) + "분");
	}

}
