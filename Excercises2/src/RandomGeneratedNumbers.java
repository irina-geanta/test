import java.util.ArrayList;
import java.util.Arrays;
/*
First, generate 10 1-100 random numbers, then put them in an array.
Put the numbers from the array greater than or equal to 10 into a list collection and print them to the console.
*/

public class RandomGeneratedNumbers {
    public static void main(String[] args) {
        int[] entireArray = new int[10];
        for (int i = 0; i<10; i++){
            entireArray[i] = (int)Math.floor(Math.random()*(100)+1);
        }
        System.out.println("Array: " + Arrays.toString(entireArray));
        ArrayList arrayList = new ArrayList();

        for (int number : entireArray){
            if (number >= 10){
                arrayList.add(number);
            }
        }
        System.out.println("There are " +arrayList.size() + " elements greater or equat to 10: " + arrayList.toString());
    }
}
