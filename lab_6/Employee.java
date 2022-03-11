import java.util.Scanner;

public class Employee {
    // Initializing variables
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	private int insertions = (int) (Math.random()*10 +1);
    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);
	System.out.println("You have " + insertions + " insertions left.");
        /**
         * Continue code here to ask for the first name, last name, age, and salary, IN THAT ORDER
         */
	for (int i = 0; i < insertions; i++){
	System.out.println("Please input the employee's first name:");
	firstName = scan.nextLine();
	System.out.println("Please input the employee's last name:");
	lastName = scan.nextLine();
	System.out.println("Please input the employee's age:");
	age = scan.nextInt();
	System.out.println("Please input the employee's monthly salary:");
	salary = scan.nextDouble();
	scan.nextLine();
// Final answer
employee[i] = new Employee(firstName, lastName, age, salary);
	}
	System.out.println("You have " + (insertions - (i +1)) + " insertions left.");
    }
	

    public String toString() {
        // insert logic for toString method
    }
}