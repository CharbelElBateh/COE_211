public class AdvancedWeek {
    // Initializing variables
    private String day_1 = "Monday";
    private int day_1_index = 1;

	String day_2 = "Tuesday";
	int day_2_index = 2;
	
	String day_3 = "Wednesday";
	int day_3_index = 3;

	String day_4 = "Thursday";
	int day_4_index = 4;

	String day_5 = "Friday";
	int day_5_index = 5;

	String day_6 = "Saturday";
	int day_6_index = 6;

	String day_7 = "Sunday";
	int day_7_index = 7;

    /**
     * Continue filling variables
     */
	AdvancedWeek(){
	}
    // printing out the days
    public void printDays() {
        System.out.println(
	day_1_index + ": " + day_1 + ",\n" +day_2_index + ": " + day_2 + ",\n" +day_3_index + ": " + day_3 + ",\n" +
	day_4_index + ": " + day_4 + ",\n" +
	day_5_index + ": " + day_5 + ",\n" +
	day_6_index + ": " + day_6 + ",\n" +
	day_7_index + ": " + day_7 + "."
	);

    }
}