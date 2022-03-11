import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
		System.out.print("Input the first number: ");
		int a = scan.nextInt();
		System.out.print("Input the second number: ");
		int b = scan.nextInt();
        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
		System.out.println("What do you want to do?");
		operator = scan.nextChar();
		switch (operator){
			case '+': 
				Calculator.add(a,b);
				break;
			case '-':
				Calculator.substract(a,b);
				break;
			case '/':
				Calculator.divide(a,b);
				break;
			case '*':
				Calculator.multiply(a,b);
				break;
			default:
				break;
		}
    }

    public String add(int a, int b) {
	int result = num1+num2;
	System.out.println(num1 + "+" + num2 + "=" + result);
    }

    public String subtract(int a, int b) {	
	int result = num1-num2;
	System.out.println(num1 + "-" + num2 + "=" + result);

    }

    public String multiply(int a, int b) {
        int result = num1*num2;
	System.out.println(num1 + "*" + num2 + "=" + result);

    }

    public String divide(int a, int b) {
       if(a%b == 0) {
		System.out.println( a + "/" + b + "=" + (a/b) );
	} else {
		double e = a/(double)b;
		System.out.println( a + "/" + b + "=" + (a/(double)b) );
	}
    }
}