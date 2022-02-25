import java.util.Scanner;
public class EntryPoint{
	public static void main(String[] args){
		int i = (int) (Math.random()*10 +1);
		String Fname;
		String Lname;
		int age;
		double salary;
		String info;
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[i];
		int y = i;
		while (i >0) {
			System.out.print("You have "+i+" insertions left \n"+"Please input the employee's first name: ");
			Fname = (String) scan.next();
			System.out.print("Please input the employee's last name: ");
			Lname = (String) scan.next();
			System.out.print("Please input the employee's age: ");
			age = Integer.parseInt(scan.next());
			System.out.print("Please input the employee's salary: ");
			salary = Double.parseDouble(scan.next());
			info = new String("Employee Information: "+Fname+" "+Lname+", "+age+", "+salary);
			System.out.println(info);
			arr[i]=info;
			i--;
		}
		for (int x = 0; x<i; x++){
		System.out.println(arr[x]);
		}
	}
}