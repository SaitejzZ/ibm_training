
public class DateCalProblem {

	public static void main(String[] args) {
		int dd, mm, yyyy;
		dd = 28;
		mm = 2;
		yyyy = 2021;

		// logic for leap year
		// year % 4 == 0 and (year % 100 != 0 or year % 400 == 0):

		// logic for checking no of days in a month
							//1  2                            12
		int noOfDays[]= {-1, 31,28,31,30,31,30,31,31,30,31,30,31};
		if(checkLeapYear(yyyy)) {
			noOfDays[2]=29;
		}
		// logic for cal of next date
		//28.2.2020
		System.out.println("dd/mm/yyyy:  "+ dd+"/"+ mm+"/"+ yyyy);
		dd=dd+1;
		if(dd>noOfDays[mm]) {
			dd=1;
			mm++;
			if(mm>12) {
				mm=1;
				yyyy++;
			}
		}
		System.out.println("dd/mm/yyyy:  "+ dd+"/"+ mm+"/"+ yyyy);

	}

	public static boolean checkLeapYear(int yyyy) {
		return (yyyy % 4 == 0 && (yyyy % 100 != 0 || yyyy % 400 == 0)) ? true : false;
	}
}
