//Imports
import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {

        //Objects, Variables && Array initialization
	Scanner scan = new Scanner(System.in);
	int[] ass = new int[5];
	int labAttendance=0;
	int midtermGrade=0;
	int assignmentGrade=0;
	int min = 0;
	double minGoal = 0.0;

        // for loop to get user input & store in array
	for(int i=0; i<ass.length; i++){
		System.out.print("Input the grade of assignement "+(i+1)+" ");
		ass[i]=Integer.parseInt(scan.nextLine());
	}

	//Lab attendances
	System.out.print("Input the number of attended labs ");
	labAttendance = Integer.parseInt(scan.nextLine());

	//Midterm grade
	System.out.print("Input the midterm grade ");
	midtermGrade = Integer.parseInt(scan.nextLine());

        // for loop to iterate over the array 

	for( int i=0; i<ass.length; i++){
		assignmentGrade += ass[i];
	}
	
	// display output to user after calculations
	System.out.println("Assignments (30%): "+ (assignmentGrade*0.3/5));
	System.out.println("Attendance (5%): "+ (labAttendance/7.0 * 5));
	System.out.println("Midterm (30%): "+ midtermGrade * 0.3);

	//Ask the letter grade that the user wants

	System.out.print("Enter the letter grade that you want: ");
	String letterGrade = new String(scan.nextLine());
	
	switch(letterGrade){
		case "A":
			min = 90;
			break;
		case "A-":
			min = 87;
			break;
		case "B+":
			min = 83;
			break;
		case "B":
			min = 80;
			break;
		case "B-":
			min = 77;
			break;
		case "C+":
			min = 73;
			break;
		case "C":
			min = 70;
			break;
		case "C-":
			min = 67;
			break;
		case "D+":
			min = 63;
			break;
		case "D":
			min = 60;
			break;
		case "F":
			min = 59;
			break;
	}
	
	//Calculations
	minGoal = 100 - (assignmentGrade*0.3/5) - (labAttendance/7.0 * 5) - (midtermGrade * 0.3);

	//Output showing minimum grade needed
	System.out.print("You need a minimum of "+(minGoal*0.35)+" on your final to get to your goal.");

    }
}