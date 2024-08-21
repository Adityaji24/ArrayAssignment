//Write a program to create an integer array and initialize it with values {51, 100, 2, 8 , 45, 7}. Print the size of array using length property of array and also calculate and print the sum and average of all the elements of the array.
public class ArraySize {
    public static void main(String[] args) {
        int[]array={51, 100, 2, 8 , 45, 7};
        int size= array.length;
        System.out.println("size of array = " + size);
        int sum=0;

        for (int i = 0; i <=5 ; i++) {
            sum=sum+array[i];

        }
        double avg=(double)sum/5;
        System.out.println("sum of elements = " + sum);
        System.out.println("average of elements = " + avg);
    }
}
