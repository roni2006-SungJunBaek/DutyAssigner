package classfile.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarGenerator {

    /*
     *  - DAY INDEX VALUE -
	 *  DAY_OF_WEEK = 1 : Sunday
	 *  DAY_OF_WEEK = 2 : Monday
	 *  DAY_OF_WEEK = 3 : Tuesday
	 *  DAY_OF_WEEK = 4 : Wednesday
	 *  DAY_OF_WEEK = 5 : Thursday
	 *  DAY_OF_WEEK = 6 : Friday
	 *  DAY_OF_WEEK = 7 : Saturday
	 */

	Calendar calendar;

    //need refactor.
	Date startWeekday;
	Date endWeekday;
	Date startWeekend;
	Date endWeekend;

	public CalendarGenerator() {

	}

    //returns a day index value of the 1st date - @see DAY INDEX VALUE.
	public int getStartDay (int month, int year) {
        Calendar instance = Calendar.getInstance();
        instance.set(year, month - 1, 1);
		return calendar.get(Calendar.DAY_OF_WEEK);
	}

    //get a day index value of the specified date - @see DAY INDEX VALUE.
	public int getDay(int month, int date, int year) {
        Calendar instance = Calendar.getInstance();
        instance.set(year, month - 1, date);
		return instance.get(Calendar.DAY_OF_WEEK);
	}

	//amount of dates in specified month and year - e.g. Feburary will return 28
	public int getMaxDates(int month, int year) {
		Calendar calendarInstance = Calendar.getInstance();
		calendarInstance.set(year, month - 1, 1);
		return calendarInstance.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	public Date dateInfo(int month, int year) {
		calendar = Calendar.getInstance();
		//January : 0 ~ December : 11
		calendar.set(year, month - 1, 1);
		return calendar.getTime();
	}

	public Date dateInfo(int month, int date, int year) {
		calendar = Calendar.getInstance();
		//January : 0 ~ December : 11
		calendar.set(year, month - 1, date);
		return calendar.getTime();
	}

    //Rename HashDoublyLinkedList
	public HashDoublyLinkedList generateCalendar(int month, int year) {
        return null;
	}
}