import java.util.Scanner;

public class Employee {
    // Initializing variables
	public String firstName;
	public String lastName;
	public int age;
	public double salary;
	private int insertions = (int) (Math.random()*10 +1);
	public Employee() {
        Scanner scan = new Scanner(System.in);
	System.out.println("You have " + insertions + " insertions left.");

		for (int i = 0; i < insertions; i++){
			System.out.print("Please input the employee's first name:");
			firstName = scan.nextLine();
			this.firstName = firstName;
			System.out.print("Please input the employee's last name:");
			lastName = scan.nextLine();
			this.lastName = lastName;
			System.out.print("Please input the employee's age:");
			age = scan.nextInt();
			this.age = age;
			System.out.print("Please input the employee's monthly salary:");
			salary = scan.nextDouble();
			this.salary = salary;
			scan.nextLine();
			System.out.println("You have " + (insertions - (i +1)) + " insertions left.");
		}
	}

    public String toString() {
        return "Employee information: "+firstName+" "+lastName+", "+age+", "+salary;
    }
}