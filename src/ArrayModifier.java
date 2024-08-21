//Write a program to create an integer array and initialize it with values {51, 100, 2, 8 , 45, 7}. Increase the value of all the odd elements of the array and decrease the value of all the even elements of the array.
public class ArrayModifier {
    public static void main(String[] args) {
        int []array={51,100,2,8,45,7};
        System.out.print(" Original array=");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);

            if (array[i]%2==0) {
                array[i] = array[i] - 1;
            }
            else{
                array[i]=array[i]+1;

            }

        }
        System.out.println();
        System.out.print(" modified array = ");

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }

    }
}
