//Write a program to create an integer array by accepting the size of the array from user. Initialize the array by accepting values from user. Accept searchElement form the user and search for searchElement in the array. If element present in array print found otherwise not found.
//Write a program to create an integer array by accepting the size of the array from user. Initialize the array by accepting values from user. Accept searchElement form the user and search for searchElement in the array. If element present in array print the index on which it is present otherwise print -1.

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter search element: ");
        int searchElement = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (searchElement == array[i]) {
                System.out.println("index = " + i);
                System.out.println("found");
                break;
            }
            else {
                System.out.println("index=-1");
                System.out.println("not found");
                break;
            }
        }


    }
}


