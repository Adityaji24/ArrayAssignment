//Write a program to create an integer array by accepting the size of the array from user. Initialize the array by accepting values from user. Find the maximum element from the array and print it on console.
import java.util.Scanner;
public class MaxElementArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            int max = array[0];
            for (int i = 1; i < size; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }

            System.out.println("Maximum element: " + max);
        }
    }



