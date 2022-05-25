import java.util.Scanner;

public class FIBONACCI {
	
	static Scanner s = new Scanner(System.in);

    static void fibonacci(int number) {
		int n1 = 0, n2 = 1, n3;
		if (number == 1) {
			System.out.print(n1);
		} else if (number == 2) {
			System.out.print(n1 + " " + n2);
		} else {
			System.out.print(n1 + " " + n2);
			for (int i = 3; i <= number; i++) {
				n3 = n1 + n2;
				System.out.print(" " + n3);
				n1 = n2;
				n2 = n3;
			}

		}

	}

    public void fiBonacciSeries() {
		int number;
		System.out.println("enter the value to find the number of fibonacci series.");
		number = (Integer.parseInt(s.nextLine())); 
		if (number <= 0) {
			System.out.println("the number is negative.");
		} else {
			System.out.print("The fibonacci of the number " + number + " is ");
			fibonacci(number);
		}
	}
    
}
