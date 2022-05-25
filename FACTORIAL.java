import java.util.Scanner;

public class FACTORIAL {

	static Scanner s = new Scanner(System.in);
    
    static int factorial(int number) {
		if (number == 0) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}

	}

    public void facTorialNumber() {
		int number;
		System.out.println("enter the value to find the factorial.");
		number = (Integer.parseInt(s.nextLine()));

		System.out.println("The factorial of the number " + number + " is " + factorial(number));
	}
}
