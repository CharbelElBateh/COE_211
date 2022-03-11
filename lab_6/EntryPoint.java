import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        /**
         * Enjoy <3
         */
	Scanner scan = new Scanner(System.in);
	String choice;
	int intchoice=0;
	Boolean loop1 = true;
	Boolean hasInt;
	BasicWeek b1 = new BasicWeek();
	AdvancedWeek a1 = new AdvancedWeek();
	//
	do{
		System.out.println("What service would you like to use?\n[1]: Basic Week visualiser\n[2]: Advanced week visualiser\n[3]: Basic calculator\n[4]: Employee repertoire");
		choice = scan.nextLine();
		intchoice = Integer.parseInt(choice);
		//switch (hasInt) {
		//case true:
			switch(intchoice) {
				case 1:
					loop1 = false;
					break;
				case 2:
					loop1 = false;
					break;
				case 3:
					loop1 = false;
					break;
				case 4:
					loop1 = false;
					break;
				default:
					System.out.println("Please make sure you pick a number between 1 and 4");
			}
		//case false:
		//	System.out.println("Please make sure you pick a number between 1 and 4");
		}while(loop1 = true);
	switch(intchoice){
	case 1: 
		b1.printDays();
		break;
	case 2: 
		a1.printDays();
		break;
	case 3: 
		Calculator c1 = new Calculator();
	case 4:
		Employee e1 = new Employee();
	}	
    }
}