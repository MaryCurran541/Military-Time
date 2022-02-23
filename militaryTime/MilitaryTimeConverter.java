package militaryTime;

import java.util.Scanner;

/*
 * Mary Curran Computer Science 3 Assignment 1
 * 
 * program to convert 24 hour military time into 12 hour am pm time. 
 * 
 * 
 * @author Mary Curran
 * @since 8/24/2021
 * @version 1.0
 * */

public class MilitaryTimeConverter {
	
	
	/*
	 * Gets user input of the hour number they want converted and prints out the time table
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a military number to have convered to am-pm time: ");
		
		double convertNumber = input.nextDouble();
		
		double searchTime = milToampm(convertNumber);
		
		if (convertNumber >= 12) {
			System.out.printf("converted time: %.2f pm\n", searchTime); 
				}

			if (convertNumber < 12) {
			System.out.printf("converted time: %.2f am\n", searchTime); 
				}
			
		input.close();
		
		// Table variables starts here 
		final double TABLE_BEGIN = 0; // The table’s first military time
		final double TABLE_END = 23; // The table’s final military time
		final double TABLE_STEP = 1; // Increment between hours in table
		
		double mil; // A military time
		double ampm; // The equivalent ampm time
		
		System.out.println("   TIME CONVERSION   ");
		System.out.println("military        AMPM");
		
		for (mil = TABLE_BEGIN; mil <= TABLE_END; mil += TABLE_STEP)
		{ 
		ampm = milToampm(mil);
		System.out.printf("%6.2f", mil);
		
			if (mil >= 12) {
		System.out.printf("%14.2f pm\n", ampm); 
			}

		if (mil < 12) {
		System.out.printf("%14.2f am\n", ampm); 
			}
		
		}
		
		
	}//end main

	/*
	 * converts the time from military time into am pm time. 
	 * @param t 
	 * 
	 * @precondition 0 <= t	<= 23
	 * 	
	 * @return
	 * 		time converted from military to am-pm time
	 * 
	 * @throws
	 * 		flags if t is outside of the 0-23 range 
	 */
	public static double milToampm(double t) {
		final double MINIMUM_mil = 0;
		final double MID_mil = 12;
		final double MAX_mil = 23;
		
		if (t > MAX_mil)
			throw new IllegalArgumentException("Argument " + t + " is too big.");
		
		if(t <= MINIMUM_mil && t >= MINIMUM_mil)
			return 12 ;
		
		if (t > MID_mil )
			return t - 12;
		
		if (t < MINIMUM_mil)
		throw new IllegalArgumentException("Argument " + t + " is too small.");
		return t;
			
			} // end milToampm

}// end class MilitaryTimeConverter
