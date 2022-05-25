import java.util.Scanner;

public class SORTING {

	static Scanner s = new Scanner(System.in);

    static int[] arrayforming(int number) {
		int[] array1 = new int[number];
		System.out.println("enter the elements.");
		for (int i = 0; i < number; i++) {
			array1[i] = Integer.parseInt(s.nextLine());
		}
		return array1;

	}

	static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void printarray(int[] array1,int number)
	{
		for (int i = 0; i < number; i++) {
			System.out.print(array1[i] + " ");

		}

	}
	

	public void sorTingArray() {
		int number;
	    int array1[];

		System.out.println("\nenter the size of array.");
		number = Integer.parseInt(s.nextLine());

		if (number <= 0) {
			System.out.println("the number is negative.");
			
		} else {

			array1 = arrayforming(number);

			quickSort(array1, 0, number - 1);

			System.out.println("The sorted array is.");
			printarray(array1, number);
			
		}
	}

    
}
