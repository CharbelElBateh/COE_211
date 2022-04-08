//Imports
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;  
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{

	//Creating a file
	File file = new File("Expenses.txt");

	//Writes to a file
	FileWriter fw = new FileWriter(file);

	//Prints to the screen from the file
	PrintWriter pw = new PrintWriter(fw);

	//Scanner to get user input
	Scanner scan = new Scanner(System.in);

	//Scanner to read from the file
	Scanner fileScanner = new Scanner(file);

	//Gets all the purchases of the user
	Boolean hasAnotherPurchase = true;

	do{
		//Gets the users name
		System.out.print("Input your name: ");
		String name = new String(scan.nextLine());

		//Gets the users purchase
		System.out.print("What did you purchase? ");
		String product = new String(scan.nextLine());

		//Gets the price of the purchase
		System.out.print("How much did you pay? (in USD) ");
		double price = Double.parseDouble(scan.nextLine());

		//Writes the purchase to the file
		String fullInfo = new String(name+" purchased "+product+" for "+price+" US Dollars.\n");

		for (int i = 0; i<fullInfo.length(); i++)
			fw.write(fullInfo.charAt(i));

		//Flushes the file writer to take new info
		fw.flush();

		//Does user have other purchases?
		System.out.print("Would you like to log another purshase? (y/n) ");
		String answer = new String(scan.nextLine());
	
		if(answer.toLowerCase().matches("y")){
				
			//Keeps the loop going
			hasAnotherPurchase = true;

		}else if (answer.toLowerCase().matches("n")){

			//Breaks the loop
			hasAnotherPurchase = false;

			System.out.println("Get off of ZoodMall!");

			//Does the user want a summary?

			System.out.print("Would you like to read a summary of your purchases? ");
			String answer2 = new String(scan.nextLine());

			//Prints the info from the file
			if(answer2.toLowerCase().matches("y")){

				//Reads from the file
				FileReader fr = new FileReader(file);

				do{
					String data = fileScanner.nextLine();
					System.out.println(data);
				}while(fileScanner.hasNextLine());

					fr.close();

					break;
				}
		}
		
				
	}while(hasAnotherPurchase = true);

	scan.close();
	fileScanner.close();

  }
}
