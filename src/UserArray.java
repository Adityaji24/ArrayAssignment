//Write a program to create an integer array to store 5 integers. Accept the five integer values from user and print them on console
import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1));
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
