//Write a program to create an integer array and initialize it with values {51, 100, 2, 8 , 45, 7}. Print all the even element of the array.
public class EvenArray {
    public static void main(String[] args) {
        int[]array={51,100,2,8,45,7};
        for (int i =0; i < array.length ; i++) {
            if(array[i]%2==0){
                System.out.println(" even values = " + array[i]);
            }
            
        }
    }
}
