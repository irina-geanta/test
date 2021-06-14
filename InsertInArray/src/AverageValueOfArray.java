import java.util.Arrays;
import java.util.Scanner;

// Write a program to compute the average value of an array of integers except the largest and smallest values.

public class AverageValueOfArray {

    public static int min(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int average(int[] array){
        int sum = 0;
        int count = 0;
        for (int i=0; i<array.length; i++){
            if ((array[i] != min(array)) && (array[i] != max(array))){
                sum += array[i];
                count += 1;
            }
        }
        if (count == 0){
            System.out.println("Only 2 numbers present. ");
            return -1;
        }
        return sum/count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        label:
        while(true){
            System.out.println("How many elements has the array: ");
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                int [] initialArray = new int[number];
                for (int i =0; i<number; i++){
                    System.out.println("Please enter element " + (i+1) + " of the array");
                    if (scanner.hasNextInt()){
                        initialArray[i] = scanner.nextInt();
                    } else{
                        System.out.println("Not an int. Existing..");
                        break label;
                    }
                }
                System.out.println("Initial Array: " + Arrays.toString(initialArray));

                System.out.println("Min: " + min(initialArray));
                System.out.println("Max: " + max(initialArray));
                System.out.println("Average excluding min and max: " + average(initialArray));
                System.out.println("Exiting .. ");
                break;

            }else {
                System.out.println("Not an int. Existing");
                break;
            }
        }
        scanner.close();
    }
}
