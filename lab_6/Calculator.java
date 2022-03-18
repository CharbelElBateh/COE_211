import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
	Scanner scan = new Scanner(System.in);

    // Constructor to initialize the calculator
    public Calculator() {
		System.out.print("Input the first number: ");
		int a = scan.nextInt();
		System.out.print("Input the operator: ");
		operator = scan.next();
		System.out.print("Input the second number: ");
		int b = scan.nextInt();
		
		switch (operator){
			case "+" : 
				add(a,b);
				break;
			case "-" :
				subtract(a,b);
				break;
			case "/" :
				divide(a,b);
				break;
			case "*" :
				multiply(a,b);
				break;
			default:
				break;
		}
    }

    public void add(int num1, int num2) {
	int result = num1+num2;
	System.out.println(num1 + "+" + num2 + "=" + result);
    }

    public void subtract(int num1, int num2) {	
	int result = num1-num2;
	System.out.println(num1 + "-" + num2 + "=" + result);

    }

    public void multiply(int num1, int num2) {
        int result = num1*num2;
	System.out.println(num1 + "*" + num2 + "=" + result);
    }

    public void divide(int a, int b) {
       if(a%b == 0) {
		System.out.println( a + "/" + b + "=" + (a/b) );
	} else {
		double e = a/(double)b;
		System.out.println( a + "/" + b + "=" + (a/(double)b) );
	}
    }
}

