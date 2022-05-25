import java.util.Scanner;

public class FINDMAX {

	static Scanner s = new Scanner(System.in);

    static int[] arrayforming(int number1) {
		int[] array1 = new int[number1];
		System.out.println("enter the elements.");

		for (int i = 0; i < number1; i++) {
			array1[i] = Integer.parseInt(s.nextLine());
		}

		return array1;

	}


    static int maximuxvalue(int[] array1, int number) {
		int n = array1[0];
		for (int i = 1; i < number; i++) {
			if (n < array1[i]) {
				n = array1[i];
			}

		}
		return n;
	}

	

    public void findMaxMum() {
		int number;
		int array1[];

		System.out.println("\nenter the size of array.");
		 number = (Integer.parseInt(s.nextLine())); 

		if (number <= 0) {

			System.out.println("the number is negative.");
		} else {

			array1 = arrayforming(number);
			number = (maximuxvalue(array1, number));
			System.out.println("The maximum value of array is " + number);

		}

	}
    
}
