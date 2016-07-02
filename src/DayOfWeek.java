import java.util.Scanner;

public class DayOfWeek {

	/**
	 * Calculate the day of the week for a particular date.
	 * 
	 * @author	SpudMillions
	 * @since	07/02/2016
	 */
	public static void main(String[] args) {
		
		//set up variables
		Scanner sc = new Scanner(System.in);
		int month;
		int day;
		int year;
		
		//get month/day/year from user
		System.out.print("Enter a month using an int: ");
		month = sc.nextInt();
		System.out.print("Enter a day using an int: ");
		day = sc.nextInt();
		System.out.print("Enter a year using an int: ");
		year = sc.nextInt();
		sc.close();
		
		//use Gauss's method for determining the day of the week
		double m;
		int y;
		int dow; // Sun = 0, ..., Sat = 6
		
		m = (month - 2 + 12) % 12; //calculate month offset, Mar = 1, ..., Feb = 12
		if(month <= 2){
			year--; // year = year -1; year -= 1;
		}
		y = 5 * (year % 4) + 4 * (year % 100) + 6 * (year % 400);
		dow = (day + (int)(2.6*m - 0.2) + y) % 7;
		
		//output
		System.out.println("Day of the week (Sun = 0, ..., Sat = 6) : " + dow);
	}

}
